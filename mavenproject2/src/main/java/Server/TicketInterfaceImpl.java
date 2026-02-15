/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class TicketInterfaceImpl extends UnicastRemoteObject implements TicketInterface {

    private final ArrayList<Ticket> listaTickets = new ArrayList<>();
    private final ArrayList<Ticket> listaHistorial = new ArrayList<>();
    private int id = 1;

    public TicketInterfaceImpl() throws RemoteException {
    }

    @Override
    public synchronized void EnviarTicket(Ticket t) throws RemoteException {
        // Asigna ID y técnico automáticamente según el tipo de incidencia
        t.setId(id);
        id++;
        if (t.getTipo() == 0) {
            t.setTecnico("Carlos"); //hardware
        } else {
            t.setTecnico("Driss"); //software
        }
        listaTickets.add(t);
        System.out.println("Ticket recibido");
    }

    @Override
    public synchronized ArrayList<Ticket> RecibirTicket() throws RemoteException {
        //Devuelve una copia de la lista de tickets activos
        return new ArrayList<>(listaTickets);

    }

    @Override
    public synchronized void ActualizarTicket(Ticket t) throws RemoteException {
        // Busca el ticket por ID y actualiza su estado o lo mueve al historial si está resuelto
        for (int i = 0; i < listaTickets.size(); i++) {
            if (listaTickets.get(i).getId() == t.getId()) {
                if (t.getEstado().equalsIgnoreCase("RESUELTO")) {
                    listaHistorial.add(t); 
                    listaTickets.remove(i); 
                } else {
                    listaTickets.set(i, t);
                }
            }
        }
    }

    @Override
    public synchronized ArrayList<Ticket> RecibirHistorial() throws RemoteException {
         //Devuelve una copia de la lista de tickets resueltos
        return new ArrayList<>(listaHistorial);
    }

}
