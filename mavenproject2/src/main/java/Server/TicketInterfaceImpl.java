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

    private static String tecnico;
    private static int id = 1;
    private static ArrayList<String[]> lista = new ArrayList<>();

    ;
    public TicketInterfaceImpl() throws RemoteException {

    }

    @Override
    public void EnviarTicket(String[] d) throws RemoteException {
        System.out.println("Servidor recibió el ticket");
        if (d[3].equalsIgnoreCase("hardware")) {
            tecnico = "paco";
        } else {
            tecnico = "ramon";
        }
        String[] a = {String.valueOf(id), d[0], d[1], "Pendiente", tecnico};
        lista.add(a);
        id++;
    }

    @Override
    public ArrayList<String[]> RecibirTicket() throws RemoteException {
        return lista;
    }

}
