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
    private int id = 1;

    public TicketInterfaceImpl() throws RemoteException {
    }

    @Override
    public synchronized void EnviarTicket(Ticket t) throws RemoteException {
        t.setId(id);
        id++;
        if (t.getTipo() == 0) {
            t.setTecnico("Paco");
        } else {
            t.setTecnico("Ramón");
        }
        listaTickets.add(t);
        System.out.println("Ticket recibido");
    }

    @Override
    public synchronized ArrayList<Ticket> RecibirTicket() throws RemoteException {
        return new ArrayList<>(listaTickets);
    }

    @Override
    public synchronized void ActualizarTicket(Ticket t) throws RemoteException {
        for (int i = 0; i < listaTickets.size(); i++) {
            if (listaTickets.get(i).getId() == t.getId()) {
                listaTickets.set(i, t);
            }
        }
    }

}
