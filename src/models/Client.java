package models;

/**
 *
 * @author jair
 */
public class Client extends User {
    
    public Client (){
    
    }
    
    public Client (String nomuser, String celular, String Identificacion,String tipoId){
        super(nomuser,celular,Identificacion,tipoId);
    }
}
