/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.c2.p39.reto4.view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import utp.misiontic2022.c2.p39.reto4.controller.ControllerRequerimientos;
import utp.misiontic2022.c2.p39.reto4.model.vo.Proyecto;

/**
 *
 * @author HP
 */
public class JFrameProyectos extends javax.swing.JFrame {

    /**
     * Creates new form JFrameProyectos
     */
    public JFrameProyectos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePro = new javax.swing.JTable();
        btnConsultar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Proyectos");
        jLabel1.setToolTipText("");

        jScrollPane2.setBackground(new java.awt.Color(0, 153, 153));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));

        jTablePro.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jTablePro.setForeground(new java.awt.Color(0, 0, 0));
        jTablePro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePro.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTableProAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTablePro);

        btnConsultar1.setBackground(new java.awt.Color(0, 153, 153));
        btnConsultar1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnConsultar1.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar1.setText("Regresar");
        btnConsultar1.setFocusPainted(false);
        btnConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(btnConsultar1))
                        .addGap(0, 538, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultar1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTableProAncestorAdded
        String[] columnNombre = {"ID_Proyecto", "Fecha_Inicio", "Constructora", "Numero_Banos", "Numero_Habitaciones", "Banco_Vinculado", "Porcentaje_Cuota_Inicial", "Ciudad", "Clasificacion", "Acabados", "Serial", "ID_Tipo", "ID_Lider"};
        ControllerRequerimientos controller = new ControllerRequerimientos();
        ArrayList<Proyecto> listaProyectos;
        try {
            listaProyectos = controller.consultarProyectos();
            Object[][] datos = new Object[listaProyectos.size()][columnNombre.length];
            int index = 0;
            for (Proyecto req : listaProyectos) {
                datos[index][0] = req.getIdProyecto();
                datos[index][1] = req.getFechaInicio();
                datos[index][2] = req.getConstructora();
                datos[index][3] = req.getNumeroBanos();
                datos[index][4] = req.getNumeroHabitaciones();
                datos[index][5] = req.getBancoVinculado();
                datos[index][6] = req.getPorcentajeCuotaInicial();
                datos[index][7] = req.getCiudad();
                datos[index][8] = req.getClasificacion();
                datos[index][9] = req.getAcabados();
                datos[index][10] = req.getSerial();
                datos[index][11] = req.getIdTipo();
                datos[index][12] = req.getIdLider();
                index += 1;
            }
            DefaultTableModel modelT = new DefaultTableModel(datos, columnNombre);
            jTablePro.setModel(modelT);

        } catch (SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jTableProAncestorAdded

    private void btnConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultar1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnConsultar1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePro;
    // End of variables declaration//GEN-END:variables
}
