/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import models.UserAdmin;
import java.util.ArrayList;

/**
 *
 * @author jair
 */
public class UserAdminController {
    
    //almecena en una lista los usrios creados
    private ArrayList<UserAdmin> listUserAdmin = new ArrayList<>();
    
    public UserAdminController(){
    
    }
    
    //crear usuario Amdin
    public void AggAdmin(UserAdmin ua){
        listUserAdmin.add(ua);
    }
    
    //eleiminar usaurio Admin
    public void boraAdmin(UserAdmin eua){
        listUserAdmin.remove(eua);
    }
   
    public ArrayList<UserAdmin> getListAmin(){
        return listUserAdmin;
    }
   
    public void setListAdmin(ArrayList<UserAdmin> listUserAdmin) {
        this.listUserAdmin = listUserAdmin;
    }
    
    //listar usuario admin
    public UserAdmin ConsultUserAdmin(String user){
        for(UserAdmin x:listUserAdmin){
            if(x.getUsuario().equalsIgnoreCase(user)){
                return x;
            }
        }
        return null;
    }
    
}


