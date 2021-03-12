/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileempresa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Uninorte
 */
public class ShowDatos extends javax.swing.JFrame {

    /**
     * Creates new form ShowDatos
     */
    public ShowDatos() {
        initComponents();
        String[] column = {"Nombre", "Salario", "Fecha"};
        DefaultTableModel model = new DefaultTableModel(column, 0);
        TablaDatos.setModel(model);
        MostrarDatos();
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
        TablaDatos = new javax.swing.JTable();
        btneditar = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaDatos);

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });

        btnborrar.setText("Borrar");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btneditar)
                    .addComponent(btnborrar)
                    .addComponent(btnActualizar)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btneditar)
                .addGap(18, 18, 18)
                .addComponent(btnborrar)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        try {
            limpiar();
            Actualizar();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ShowDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        Editar ed = new Editar();
        ed.setVisible(true);
    }//GEN-LAST:event_btneditarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        Actualizar();
        MostrarDatos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(ShowDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowDatos().setVisible(true);
            }
        });
    }

    void limpiar() throws FileNotFoundException {
        File x = new File("");
        File empresa = new File("empresa.txt");
        try {
            FileWriter fw = new FileWriter(empresa);
            if (fw != null) {
                fw.close();
            }
            if (empresa.delete()) {
                System.out.println("El archivo fue eliminado");
                empresa.createNewFile();
            } else {
                System.out.println("El archivo no se puede borrar");
            }

        } catch (IOException ex) {
            Logger.getLogger(Editar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void Actualizar() {
        DefaultTableModel Model = (DefaultTableModel) TablaDatos.getModel();
        Model.setRowCount(0);
        TablaDatos.setModel(Model);
    }

    void MostrarDatos() {
        DefaultTableModel model = (DefaultTableModel) TablaDatos.getModel();
        File x = new File("");
        File empresa = new File("empresa.txt");
        FileReader fw;
        try {
            fw = new FileReader(empresa);
            BufferedReader br = new BufferedReader(fw);
            String lector;
            while ((lector = br.readLine()) != null) {
                System.out.println(lector);
                String dato = "";
                String nombre = "", fecha = "";
                int salario = 0;
                int cont = 0;
                for (int i = 0; i < lector.length(); i++) {
                    if (lector.substring(i, i + 1).compareTo(";") != 0) {
                        dato = dato.concat(lector.substring(i, i + 1));
                    } else {
                        switch (cont) {
                            case 0:
                                nombre = dato;
                                break;
                            case 1:
                                salario = Integer.valueOf(dato);
                                break;
                            default:
                                fecha = dato;
                                break;
                        }
                        cont++;
                        dato = "";
                    }
                }
                String Datos[] = {nombre, String.valueOf(salario), fecha};
                model.addRow(Datos);
                TablaDatos.setModel(model);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btneditar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
