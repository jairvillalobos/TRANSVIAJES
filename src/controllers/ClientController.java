package controllers;

import java.util.ArrayList;
import models.Client;

public class ClientController {
    
   static ArrayList<Client> clientList = new ArrayList<>();
    
    public static void aggNewClient(Client clt){
       clientList.add(clt);
    }
    
/*
    //com este metodo removemos un cliente 
    
    public static void RemoveCliente(Client ct){
        clientList.remove(ct);
    }
*/
    
    public static ArrayList<Client> getListClient(){
        return clientList;
    }
    
    public static Client findCliente(String id){
        
        for(Client x:clientList){
            if(x.getIdentificacion().matches(id)){
                return x;
            }
        }      
        return null;
    }
    
    public static Client updateClient(Client cliente) {
        for(int i=0;i < clientList.size() ; i++) {
            if(clientList.get(i).getIdentificacion().matches(cliente.getIdentificacion())){
                clientList.get(i).setNomuser(cliente.getNomuser());
                clientList.get(i).setCelular(cliente.getCelular());
                clientList.get(i).setTipoId(cliente.getTipoId());
                return clientList.get(i);
            }
        }      
        return null;
    }

}
