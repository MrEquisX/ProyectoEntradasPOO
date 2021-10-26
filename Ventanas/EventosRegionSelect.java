/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import CODIGO.CSVCode;
import CODIGO.Eventos;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ignac
 */
public class EventosRegionSelect extends javax.swing.JFrame {

    /**
     * Creates new form EventosRegionSelect
     */
    public EventosRegionSelect(String idRegion) throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarDatos(idRegion);
    }
    
    //TABLA PARA MOSTRAR DATOS DE EVENTOS EN LA REGION SELECCIONADA
    public void MostrarDatos(String idRegion) throws Exception{
        DefaultTableModel tDatos = new DefaultTableModel();
        tDatos.addColumn("IdEvento");
        tDatos.addColumn("Nombre");
        tDatos.addColumn("Fecha_Evento");
        TablaEventos_Region.setModel(tDatos);
        
        String [] datos = new String [3];
        
        try{
            ArrayList<Eventos> lista = new ArrayList();
            lista = CSVCode.cargarEventos();
            //System.out.println("IDREGION : " +idRegion);
            for (Eventos item : lista){ 
               if(idRegion.equals(item.getIdRegion())) {
                   //System.out.println(item.getIdRegion());
               
                   datos[0] = Integer.toString(item.getIdEventos());
                   datos[1] = item.getName();
                   datos[2] = item.getFecha_Evento();
                   tDatos.addRow(datos);
                }
            }
            TablaEventos_Region.setModel(tDatos);            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEventos_Region = new javax.swing.JTable();
        Atras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaEventos_Region.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaEventos_Region.setEnabled(false);
        jScrollPane1.setViewportView(TablaEventos_Region);

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Atras)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Atras, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        // TODO add your handling code here:
        JFrame_INICIO aux = null;
        try {
            aux = new JFrame_INICIO();
        } catch (Exception ex) {
            Logger.getLogger(EventosRegionSelect.class.getName()).log(Level.SEVERE, null, ex);
        }
        aux.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AtrasActionPerformed

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
            java.util.logging.Logger.getLogger(EventosRegionSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventosRegionSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventosRegionSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventosRegionSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EventosRegionSelect("0").setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(EventosRegionSelect.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JTable TablaEventos_Region;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}