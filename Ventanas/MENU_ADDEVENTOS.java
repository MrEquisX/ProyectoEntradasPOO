/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import CODIGO.CSVCode;
import CODIGO.ComboItems;
import CODIGO.Eventos;
import CODIGO.Region;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ignac
 */
public class MENU_ADDEVENTOS extends javax.swing.JFrame {
    TableRowSorter trs;
    DefaultTableModel tDatos = new DefaultTableModel();
    String accion = "nuevo";
    
    //ALLEVENTOS = GRILLA
    
    /**
     * Creates new form MENU_ADDEVENTOS
     */
    public MENU_ADDEVENTOS() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarDatos_Eventos();
        
        DefaultComboBoxModel model = new DefaultComboBoxModel();
                    
        //METODOS DE COMBOBOX MENU---------------------
        jComboBox1.removeAllItems();
        ArrayList<Region> lista = new ArrayList();
        lista = CSVCode.cargarRegiones();
        
        for (Region item : lista){
         //System.out.println(item.getNombre());
          model.addElement(new ComboItems(item.getNombre(), item.getId()));
        }
        jComboBox1.setModel(model); 
    }
    
    public void MostrarDatos_Eventos() throws Exception{
        
        tDatos.addColumn("IdEvento");
        tDatos.addColumn("Nombre");
        tDatos.addColumn("Fecha_Evento");
        AllEventos.setModel(tDatos);
        
        String [] datos = new String [3];
        
        try{
            ArrayList<Eventos> lista = new ArrayList();
            lista = CSVCode.cargarEventos();
            
            for (Eventos item : lista){
                datos[0] = Integer.toString(item.getIdEventos());
                datos[1] = item.getName();
                datos[2] = item.getFecha_Evento();
                tDatos.addRow(datos);
            }
            AllEventos.setModel(tDatos);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "No hay eventos en la data base");
        }
           
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        ATRAS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        INPUTNOMBRE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        INPUTFECHA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CANCELAR = new javax.swing.JButton();
        GUARDAR = new javax.swing.JButton();
        EDITAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        NUEVO = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();
        TablaEventos = new javax.swing.JScrollPane();
        AllEventos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 230, 60));

        ATRAS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ATRAS.setText("ATRÁS");
        ATRAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ATRASActionPerformed(evt);
            }
        });
        getContentPane().add(ATRAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 40));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("MENÚ ADMIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 300, 60));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("SELECCIONAR REGION DEL EVENTO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 60));

        INPUTNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INPUTNOMBREActionPerformed(evt);
            }
        });
        getContentPane().add(INPUTNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 230, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("INGRESAR FECHA DEL EVENTO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 260, 40));

        INPUTFECHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INPUTFECHAActionPerformed(evt);
            }
        });
        getContentPane().add(INPUTFECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 230, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("INGRESAR NOMBRE DEL EVENTO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 260, 40));

        CANCELAR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        CANCELAR.setText("CANCELAR");
        CANCELAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELARActionPerformed(evt);
            }
        });
        getContentPane().add(CANCELAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 110, 40));

        GUARDAR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        GUARDAR.setText("GUARDAR");
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });
        getContentPane().add(GUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 110, 60));

        EDITAR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        EDITAR.setText("EDITAR");
        EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARActionPerformed(evt);
            }
        });
        getContentPane().add(EDITAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 110, 40));

        ELIMINAR.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });
        getContentPane().add(ELIMINAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 110, 40));

        NUEVO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NUEVO.setText("NUEVO");
        NUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVOActionPerformed(evt);
            }
        });
        getContentPane().add(NUEVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 120, 40));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/27496.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 450));

        AllEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaEventos.setViewportView(AllEventos);

        getContentPane().add(TablaEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 280, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void ATRASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ATRASActionPerformed
        MENU_ADMIN aux = new MENU_ADMIN();
        aux.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ATRASActionPerformed

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
        // TODO add your handling code here:
        Object item = jComboBox1.getSelectedItem();
        String [] datos = new String [3];
        String idRegion = ((ComboItems)item).getValue();        
        //System.out.println(idRegion);
        //------------------------------------------------        
        //System.out.println(INPUTNOMBRE.getText());
        //------------------------------------------------
        //System.out.println(INPUTFECHA.getText());
        //------------------------------------------------
        CSVCode miBD= new CSVCode(0," ");
        
        if (this.accion=="nuevo"){
            try {
                int result = miBD.newEvento(INPUTNOMBRE.getText(),INPUTFECHA.getText(),idRegion);
                if (result>0){
                    JOptionPane.showMessageDialog(this, "Guardado con exito");
                    datos[0] = Integer.toString(result);
                    datos[1] = INPUTNOMBRE.getText();
                    datos[2] = INPUTFECHA.getText();
                    tDatos.addRow(datos);
                }else
                    JOptionPane.showMessageDialog(this, "Error al guardar");
            } catch (IOException ex) {
                Logger.getLogger(MENU_ADDEVENTOS.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(MENU_ADDEVENTOS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(this.accion=="editar"){
            //System.out.println("estoy en editar");
            int fila = AllEventos.getSelectedRow();
            //System.out.println(tDatos.getValueAt(fila, 0));
            //System.out.println(INPUTNOMBRE.getText());
            //System.out.println(INPUTFECHA.getText());
            tDatos.setValueAt(INPUTNOMBRE.getText(), fila, 1);
            tDatos.setValueAt(INPUTFECHA.getText(), fila, 2);
            
            String idEventoStr = (String) tDatos.getValueAt(fila, 0);
            int idEvento = Integer.parseInt(idEventoStr);
            try {
                miBD.editEventos(idEvento,INPUTNOMBRE.getText(),INPUTFECHA.getText());
            } catch (Exception ex) {
                Logger.getLogger(MENU_ADDEVENTOS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
        
    }//GEN-LAST:event_GUARDARActionPerformed

    private void INPUTNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INPUTNOMBREActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_INPUTNOMBREActionPerformed

    private void INPUTFECHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INPUTFECHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INPUTFECHAActionPerformed

    private void CANCELARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELARActionPerformed
        // TODO add your handling code here:
        JFrame_PORTADA aux = null;
        try {
            aux = new JFrame_PORTADA();
        } catch (Exception ex) {
            Logger.getLogger(MENU_ADDEVENTOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        aux.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CANCELARActionPerformed

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed
        // TODO add your handling code here:
        String [] datos = new String [3];
        CSVCode miBD = new CSVCode(0," ");
        int fila = AllEventos.getSelectedRow();
        this.accion= "editar";
        //System.out.println(tDatos.getValueAt(fila, 0));
        //System.out.println(tDatos.getValueAt(fila, 1));
        //System.out.println(tDatos.getValueAt(fila, 2));
        
        INPUTNOMBRE.setText((String) tDatos.getValueAt(fila, 1));
        INPUTFECHA.setText((String) tDatos.getValueAt(fila, 2));       
    }//GEN-LAST:event_EDITARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        // TODO add your handling code here:
        String [] datos = new String [3];
        CSVCode miBD = new CSVCode(0," ");
        int fila = AllEventos.getSelectedRow();
        /*/
        System.out.println(tDatos.getValueAt(fila, 0));
        System.out.println(tDatos.getValueAt(fila, 1));
        System.out.println(tDatos.getValueAt(fila, 2));
        /*/
        String idEventoStr = (String) tDatos.getValueAt(fila, 0);
        int idEvento = Integer.parseInt(idEventoStr);
        if(fila>=0){
            tDatos.removeRow(fila);
            try {
                miBD.removeEventos(idEvento);
            } catch (Exception ex) {
                Logger.getLogger(MENU_ADDEVENTOS.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar un evento en la tabla");
        }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void NUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVOActionPerformed
        // TODO add your handling code here:
        this.accion="nuevo";
        INPUTNOMBRE.setText("");
        INPUTFECHA.setText("");
    }//GEN-LAST:event_NUEVOActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MENU_ADDEVENTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_ADDEVENTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_ADDEVENTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_ADDEVENTOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MENU_ADDEVENTOS().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MENU_ADDEVENTOS.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ATRAS;
    private javax.swing.JTable AllEventos;
    private javax.swing.JButton CANCELAR;
    private javax.swing.JButton EDITAR;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JTextField INPUTFECHA;
    private javax.swing.JTextField INPUTNOMBRE;
    private javax.swing.JButton NUEVO;
    private javax.swing.JScrollPane TablaEventos;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}