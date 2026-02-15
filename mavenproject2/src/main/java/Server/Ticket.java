/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import java.io.Serializable;

/**
 *
 * @author Carlos
 */
public class Ticket implements Serializable {

    // Es el numero de version utilizado, ayuda al servidor a corroborar que el ticket es el mismo que tiene guardado
    private static final long serialVersionUID = 1L;

    private int id;
    private final String cliente;
    private final String descripcion;
    private final String prioridad;
    private String estado;
    private String tecnico;
    private final int tipo;

    // Constructor para inicializar los datos básicos de una incidencia
    public Ticket(String cliente, String descripcion, String prioridad, int tipo) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = "PENDIENTE";
        this.tipo = tipo;
    }

    //GETTERS Y SETTERS
    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getTipo() {
        return tipo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    // Convierte el objeto en un array para mostrarlo fácilmente en las tablas JTable
    public Object[] toArray() {
        return new Object[]{id, cliente, prioridad, estado, tecnico};
    }
}
