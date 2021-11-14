/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.EmployeeController;
import models.Employee;

/**
 *
 * @author jair
 */
public class EmployeeRegisterForm extends javax.swing.JFrame {

    Employee empleado;
    public EmployeeRegisterForm() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public EmployeeRegisterForm(String nombre) {
        initComponents();
        setLocationRelativeTo(null);
        this.empleado = EmployeeController.findEmployee(nombre);
        this.loadData();
    }
    
    public void loadData() {
        
        txtnomcompleto.setText(this.empleado.getNomEmpleado());
        txtnomcompleto.setEditable(false);
        txtemail.setText(this.empleado.getEmail());
        txtcelular.setText(this.empleado.getCelular());
        txtprofesión.setText(this.empleado.getProfesion());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtnomcompleto = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        combotipoID = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtprofesión = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tiempo Laborado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 160, 20));

        jLabel4.setText("Nombre Completo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, 20));
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 390, 40));
        jPanel1.add(txtnomcompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 390, 40));
        jPanel1.add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 390, 40));

        jButton1.setBackground(new java.awt.Color(190, 0, 43));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 210, 50));

        combotipoID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1  año", "2 años", "3 a 5 años", "5 a 15 años", "6 meses", "1 mes" }));
        combotipoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotipoIDActionPerformed(evt);
            }
        });
        jPanel1.add(combotipoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 240, 40));

        jLabel6.setBackground(new java.awt.Color(190, 0, 43));
        jLabel6.setForeground(new java.awt.Color(190, 0, 43));
        jLabel6.setText("REGISTRO DE EMPLEADO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jButton3.setBackground(new java.awt.Color(190, 0, 43));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 110, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow-back-1-icon.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel8.setText("Celular");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 20));
        jPanel1.add(txtprofesión, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 390, 40));

        jLabel9.setText("Profesión");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combotipoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotipoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combotipoIDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
        EmployeeGestion epyg =new EmployeeGestion();
        epyg.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(this.empleado != null) {
           
            this.empleado.setEmail(txtemail.getText());
            this.empleado.setCelular(txtcelular.getText());
            this.empleado.setProfesion(txtprofesión.getText());
            this.empleado.setTiempoLaboarado(combotipoID.getSelectedItem().toString());
            EmployeeController.updateEmployee(empleado);
            
        } else {
            
            this.empleado = new Employee();
            this.empleado.setNomEmpleado(txtnomcompleto.getText());
            this.empleado.setEmail(txtemail.getText());
            this.empleado.setCelular(txtcelular.getText());
            this.empleado.setProfesion(txtprofesión.getText());
            this.empleado.setTiempoLaboarado(combotipoID.getSelectedItem().toString());
            EmployeeController.aggNewEmployee(this.empleado);
            
        }
        
        dispose();
        EmployeeGestion epyg =new EmployeeGestion();
        epyg.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeRegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combotipoID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnomcompleto;
    private javax.swing.JTextField txtprofesión;
    // End of variables declaration//GEN-END:variables
}
