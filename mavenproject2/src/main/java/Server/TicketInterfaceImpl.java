/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Alumno
 */
public class TicketInterfaceImpl extends UnicastRemoteObject implements TicketInterface{
    private static String nombre, descripcion, prioridad, tipo;
    public TicketInterfaceImpl() throws RemoteException {
        
    }

    @Override
    public void EnviarTicket(String[] d) throws RemoteException {
        System.out.println("Servidor recibió el ticket");
        nombre = d[0];
        descripcion = d[1];
        prioridad = d[2];
        tipo = d[3];
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d[3]);
    }

    @Override
    public String[] RecibirTicket() throws RemoteException {
        String[] d = {nombre,descripcion,prioridad,tipo};
        return d;
    }

    

}

