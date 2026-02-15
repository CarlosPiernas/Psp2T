/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Server;

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
        // crea el registro rmi en el puerto 1099
        Registry reg = LocateRegistry.createRegistry(1099);
        System.out.println("Registro creado en puerto 1099.");
        //System.setProperty("java.rmi.server.hostname","10.194.64.43");//Linea que permite identificar al servidor en la red
        // instancia el objeto remoto
        reg.rebind("TicketService", (Remote) new TicketInterfaceImpl());
        System.out.println("Servidor RMI activo en 1099");

    }

}
