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

    private ArrayList<Ticket> listaTickets = new ArrayList<>();
    private int id = 1;

    public TicketInterfaceImpl() throws RemoteException {
    }

    @Override
    public void EnviarTicket(Ticket t) throws RemoteException {
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
    public ArrayList<Ticket> RecibirTicket() throws RemoteException {
        return listaTickets;
        //return new dice que es una copia
    }

}
