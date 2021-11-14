package models;

public class Employee {
    
    private String nomEmpleado;
    private String email;
    private String celular;
    private String profesion;
    private String tiempoLaboarado;

    public Employee() {
    }

    public Employee(String nomEmpleado, String email, String celular, String profesion, String tiempoLaboarado) {
        this.nomEmpleado = nomEmpleado;
        this.email = email;
        this.celular = celular;
        this.profesion = profesion;
        this.tiempoLaboarado = tiempoLaboarado;
    }
    
    public String getNomEmpleado() {
        return nomEmpleado;
    }

    public void setNomEmpleado(String nomEmpleado) {
        this.nomEmpleado = nomEmpleado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTiempoLaboarado() {
        return tiempoLaboarado;
    }

    public void setTiempoLaboarado(String tiempoLaboarado) {
        this.tiempoLaboarado = tiempoLaboarado;
    }
    
    
    
}
