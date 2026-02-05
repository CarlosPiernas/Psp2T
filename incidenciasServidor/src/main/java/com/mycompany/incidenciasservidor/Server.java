/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.incidenciasservidor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Alumno
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException {
        Registry reg = LocateRegistry.createRegistry(1099);
        System.setProperty("java.rmi.server.hostname", "10.194.64.38");//Linea que permite identificar al servidor en la red
        reg.rebind("TicketService", (Remote) new TicketInterfaceImpl());
        System.out.println("Servidor RMI activo en 1099");

    }

}
