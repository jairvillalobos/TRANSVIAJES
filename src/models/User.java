package models;

public class User {
    private String tipoId;
    private String nomuser;
    private String celular;
    private String Identificacion;

    public User(String nomuser, String celular, String Identificacion,String tipoId) {
        this.tipoId = tipoId;
        this.nomuser = nomuser;
        this.celular = celular;
        this.Identificacion = Identificacion;
    }
     
    public User (){
    
    }

    public String getNomuser() {
        return nomuser;
    }


    public void setNomuser(String nomuser) {
        this.nomuser = nomuser;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }


    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }
    
    
}

