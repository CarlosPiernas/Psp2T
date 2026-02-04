/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Server;

import java.lang.reflect.Array;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public interface TicketInterface extends Remote{
    
    void EnviarTicket(String[] d) throws RemoteException; 
    ArrayList<String[]> RecibirTicket() throws RemoteException;
    
}
