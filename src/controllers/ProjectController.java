package controllers;

import static controllers.ClientController.clientList;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import models.Client;
import models.Project;

public class ProjectController {
    
    static ArrayList<Project> projectList = new ArrayList<>();
    
    public static void aggNewProject(Project pjt){
       projectList.add(pjt);
    }

 /*   public static void removeProject(Project p){
        projectList.remove(p);
    } */
    
//    public static Project search_Id_PersonProject(String identify){
//        for(Project x :projectList ){
//            if(x.getCliente().getIdentificacion().matches(identify)){
//                return x; 
//            }
//        }
//        return null;
//    }
//    
//    
//    public static ArrayList<Project> Id_Projects( String identify ){
//       return((ArrayList<Project>)projectList.stream().filter(p -> p.getCliente().getIdentificacion().equals(identify) )
//         .collect(Collectors.toList())) ;
//    }
//    
    public static Project findProyect(String nombreProject){
  
        for(Project x:projectList){
            if(x.getNomProyecto().matches(nombreProject)){
                return x;
            }
        }      
        return null;
    }
    
    
//    public int PosProject(String nompr ){
//        int pos = 0;
//        for(Project x:projectList){
//            if(x.getNomProyecto().equals(nompr)){
//                return pos;
//            }
//            pos++;    
//            }
//            JOptionPane.showMessageDialog(null,
//            "No Hay Elementos En El Array","ERROR 404",JOptionPane.ERROR_MESSAGE);
//            return pos;
//    }
    
    public static ArrayList<Project> getAllRecurse(){
        return projectList;
    }
    
    public static Project updateProject(Project proyecto) {
        for(int i=0;i < projectList.size() ; i++) {
            if(projectList.get(i).getNomProyecto().matches(proyecto.getNomProyecto())){
                projectList.get(i).setDescripcion(proyecto.getDescripcion());
                projectList.get(i).setActividades(proyecto.getActividades());
                projectList.get(i).setPresuPuesto(proyecto.getPresuPuesto());
                projectList.get(i).setFechInicio(proyecto.getFechInicio());
                projectList.get(i).setFechFinal(proyecto.getFechFinal());
                return projectList.get(i);
            }
        }      
        return null;
    }
    

    
}
