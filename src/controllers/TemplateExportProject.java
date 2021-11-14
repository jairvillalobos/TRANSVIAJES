/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import com.itextpdf.text.BadElementException;
import models.Project;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jair
 */
public class TemplateExportProject {
    
    String nombreProyecto;
    String fecha;
    String rutaImagen;
    List<Project> proyectos;
    //String cedula;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    public TemplateExportProject (String nombreProyecto,
            String fecha,
            String rutaImagen,
            List<Project> proyectos)
            //String cedula)
    {
        this.nombreProyecto = nombreProyecto;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        this.proyectos = proyectos;
        //this.cedula = cedula;
        documento = new Document();
        titulo  = new Paragraph(" Datos de Proyecto");        
    }        
    
     TemplateExportProject(String jair, String villalobos, String string, String homejairDescargaslogopng) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
    public void crearPlantillaProject(String nombreArchivo){
        try {
              
            archivo = new FileOutputStream(nombreArchivo + ".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);

            Image image = null;
            try {
                image =  Image.getInstance(rutaImagen);//carga imagen
                image.scaleAbsolute(150, 100);//cambia tamaño
                image.setAbsolutePosition(415, 750);//coloca imagen en la posicion
                
            } catch (BadElementException | IOException e) {
            }
            
            documento.add(image);//agrega la imagen al documento
            
            documento.add(titulo);
            
            documento.add(new Paragraph("Nombre de Proyecto: " + nombreProyecto));
            
            documento.add(Chunk.NEWLINE);
            
            Paragraph texto = new Paragraph("Nuevo nombre" +
            "Introduzca un nombre descriptivo para el proyecto." +
            "La longitud máxima es de 120 caracteres." +
            "Nueva descripción" +
            "opcional" +
            "Especifique cualquier información general adicional que desee registrar acerca del proyecto." +
            "Tipo de proyecto" +
            "Seleccione el tipo de proyecto adecuado en la lista desplegable." +
            "Las etiquetas y la terminología utilizada en Proyectos dependen del tipo de proyecto que seleccione. Si desea obtener más información, consulte Flujos de trabajo y tipos de proyectos." +
            "Estado" +
            "Seleccione el estado apropiado para clasificar el proyecto para fines de administración del flujo de trabajo o reportes." +
            "Si desea obtener más información, consulte Configuración de los estados de los proyectos." +
            "Fecha de inicio del trabajo de campo:	Seleccione la fecha programada para el inicio de su proyecto." +
            "Finalización del objetivo:Seleccione la fecha programada para la finalización de su proyecto." +
            "Horas presupuestadas\n" +"opcional" +
            "Especifique la cantidad total de horas que se asignaron para el proyecto.");
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);
            
            documento.add(Chunk.NEWLINE);
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.setWidthPercentage(100);
            PdfPCell descript = new PdfPCell(new Phrase("Descripción"));
            descript.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell presu = new PdfPCell(new Phrase("Presupuesto"));
            presu.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell activi = new PdfPCell(new Phrase("Actividades"));
            activi.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell fechini = new PdfPCell(new Phrase("Fecha Inicial"));
            fechini.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell fechfi = new PdfPCell(new Phrase("Fecha de Cierre"));
            fechfi.setBackgroundColor(BaseColor.ORANGE);
            
            tabla.addCell(descript);
            tabla.addCell(presu);
            tabla.addCell(activi);
            tabla.addCell(fechini);
            tabla.addCell(fechfi);  
            
            for(Project proyect: this.proyectos){
                tabla.addCell(proyect.getDescripcion());                
                tabla.addCell(proyect.getPresuPuesto());
                tabla.addCell(proyect.getActividades());
                tabla.addCell(proyect.getFechInicio());
                tabla.addCell(proyect.getFechFinal());
            }
            documento.add(new Paragraph("Fecha: " + fecha));
            documento.add(Chunk.NEWLINE);
            documento.add(tabla);          
            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo PDF se a creado correctamente!");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch(DocumentException e){
            System.err.println(e.getMessage());
        }
        
    }

    void crearPlantillaProject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
