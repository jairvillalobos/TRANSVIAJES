package models;

/**
 *
 * @author jair
 */
public class UserAdmin extends User{
    private String usuario;
    private String clave;
    
    
    public UserAdmin() {
        super(null,null, null,null);
    }
         
    public UserAdmin(String nomuser, String celular, String Identificacion,String tipoId) {
      super(nomuser, celular, Identificacion,tipoId);
    }

    public UserAdmin(String usuario, String clave) {
      this.usuario = usuario;
      this.clave = clave;
    }

    public UserAdmin(String usuario,String clave,
      String nomuser, String celular, String Identificacion,String tipoId) {
      super(nomuser, celular, Identificacion,tipoId);
      this.usuario = usuario;
      this.clave = clave;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
     
    
    
}
