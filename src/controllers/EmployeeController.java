/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import models.Employee;
/**
 *
 * @author jair
 */
public class EmployeeController {
    
        
    static ArrayList<Employee> employeeList = new ArrayList<>();
    
    public static void aggNewEmployee(Employee epy){
       employeeList.add(epy);
    }
    
    public static Employee findEmployee(String nombre){
        
        for(Employee x:employeeList){
            if(x.getNomEmpleado().matches(nombre)){
                return x;
            }
        }      
        return null;
    }

    public static ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public static Employee updateEmployee(Employee empleado) {
        for(int i=0;i < employeeList.size() ; i++) {
            if(employeeList.get(i).getNomEmpleado().matches(empleado.getNomEmpleado())){
                employeeList.get(i).setCelular(empleado.getCelular());
                employeeList.get(i).setEmail(empleado.getEmail());
                employeeList.get(i).setTiempoLaboarado(empleado.getTiempoLaboarado());
                employeeList.get(i).setProfesion(empleado.getProfesion());
                return employeeList.get(i);
            }
        }      
        
        return null;
    }
    

    
    
}
