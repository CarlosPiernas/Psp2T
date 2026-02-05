/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.incidenciasservidor;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public interface TicketInterface extends Remote{
    
    void EnviarTicket(Ticket t) throws RemoteException; 
    ArrayList<Ticket> RecibirTicket() throws RemoteException;
    
}
