/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public interface TicketInterface extends Remote{
    //método para que el cliente envíe una incidencia al servidor
    void EnviarTicket(Ticket t) throws RemoteException; 
    //método para que el cliente envíe una incidencia al servidor
    ArrayList<Ticket> RecibirTicket() throws RemoteException;
    //metodo para obtener la lista de incidencias ya resueltas
    ArrayList<Ticket> RecibirHistorial() throws RemoteException;
    //metodo para actualizar el estado de un ticket existente
    void ActualizarTicket(Ticket t) throws RemoteException;
    
}
