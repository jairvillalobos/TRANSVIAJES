package models;

import models.Client;
/**
 *
 * @author jair
 */
public class Project {
    private String nomProyecto;
    private String descripcion;
    private String actividades;
    private String presuPuesto;
    private String fechInicio;
    private String fechFinal;
    private Client cliente;

    public Project() {
    }
        
    public Project(String nomProyecto, String descripcion, String actividades, String presuPuesto, String fechInicio, String fechFinal, Client cliente) {
        this.nomProyecto = nomProyecto;
        this.descripcion = descripcion;
        this.actividades = actividades;
        this.presuPuesto = presuPuesto;
        this.fechInicio = fechInicio;
        this.fechFinal = fechFinal;
        this.cliente = cliente;
    }
    
    

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public String getNomProyecto() {
        return nomProyecto;
    }

    public void setNomProyecto(String nomProyecto) {
        this.nomProyecto = nomProyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getPresuPuesto() {
        return presuPuesto;
    }

    public void setPresuPuesto(String presuPuesto) {
        this.presuPuesto = presuPuesto;
    }

    public String getFechInicio() {
        return fechInicio;
    }

    public void setFechInicio(String fechInicio) {
        this.fechInicio = fechInicio;
    }

    public String getFechFinal() {
        return fechFinal;
    }

    public void setFechFinal(String fechFinal) {
        this.fechFinal = fechFinal;
    }
    
}
