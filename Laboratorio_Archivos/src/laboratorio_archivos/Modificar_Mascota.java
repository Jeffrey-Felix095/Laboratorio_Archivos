/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeffrey Felix
 */
public class Modificar_Mascota extends javax.swing.JFrame {

    String[][] M;
    int n;

    public Modificar_Mascota() {
        initComponents();
        String[] column = {"Cedula", "Nombre del perro", "Raza", "Color", "Fecha de nacimiento"};
        DefaultTableModel model = new DefaultTableModel(column, 0);
        tablaModificarM.setModel(model);
        TomarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lolo = new javax.swing.JLabel();
        txtColor_MM = new javax.swing.JTextField();
        txtRaza_MM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaModificarM = new javax.swing.JTable();
        txtNombreP_MM = new javax.swing.JTextField();
        txtCedula_MC = new javax.swing.JTextField();
        btnModificar_Cliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNombrePB = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        JCFechaNN = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lolo.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lolo.setText("Datos de Mascotas");

        tablaModificarM.setAutoCreateColumnsFromModel(false);
        tablaModificarM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaModificarM);

        txtCedula_MC.setEditable(false);

        btnModificar_Cliente.setText("Modificar");
        btnModificar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar_ClienteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Nombre del perro:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Raza del perro:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Color del perro: ");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cedula del dueño:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Fecha de Nacimento del perro: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Nombre del perro:");

        jButton3.setText("←");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lolo)
                        .addGap(257, 257, 257))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JCFechaNN, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRaza_MM, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCedula_MC, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNombreP_MM)
                                            .addComponent(txtColor_MM, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(275, 275, 275)
                                        .addComponent(btnModificar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(258, 258, 258)))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombrePB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(163, 163, 163))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lolo)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombrePB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCedula_MC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombreP_MM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtRaza_MM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtColor_MM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(JCFechaNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar_ClienteActionPerformed
        for (int i = 0; i < n; i++) {
            if (M[i][1].compareTo(txtNombrePB.getText()) == 0) {
                M[i][1] = txtNombreP_MM.getText();
                M[i][2] = txtRaza_MM.getText();
                M[i][3] = txtColor_MM.getText();
                String dia = Integer.toString(JCFechaNN.getCalendar().get(Calendar.DAY_OF_MONTH));
                String mes = Integer.toString(JCFechaNN.getCalendar().get(Calendar.MONTH));
                String año = Integer.toString(JCFechaNN.getCalendar().get(Calendar.YEAR));
                String fecha = dia + "/" + mes + "/" + año;
                System.out.println(fecha);
                M[i][4] = fecha;
            }
        }
        try {
            limpiar();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modificar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        Guardar();
        Actualizar();
        TomarDatos();
        DefaultTableModel model = (DefaultTableModel) tablaModificarM.getModel();
        for (int i = 0; i < n; i++) {
            if (M[i][1].compareTo(txtNombrePB.getText()) == 0) {
                String[] FILA = {M[i][0], M[i][1], M[i][2], M[i][3], M[i][4]};
                model.addRow(FILA);
                tablaModificarM.setModel(model);
            }
        }
        dispose();
    }//GEN-LAST:event_btnModificar_ClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TomarDatos();
        DefaultTableModel model = (DefaultTableModel) tablaModificarM.getModel();
        for (int i = 0; i < n; i++) {
            if (M[i][1].compareTo(txtNombrePB.getText()) == 0) {
                plasmar(i);
                String[] FILA = {M[i][0], M[i][1], M[i][2], M[i][3], M[i][4]};
                model.addRow(FILA);
                tablaModificarM.setModel(model);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    void plasmar(int i) {
        txtCedula_MC.setText(M[i][0]);
        txtNombreP_MM.setText(M[i][1]);
        txtRaza_MM.setText(M[i][2]);
        txtColor_MM.setText(M[i][3]);
    }

    void Actualizar() {
        DefaultTableModel Model = (DefaultTableModel) tablaModificarM.getModel();
        Model.setRowCount(0);
        for (int i = 0; i < n; i++) {
            String[] v = {M[i][0], M[i][1], M[i][2], M[i][3], M[i][4]};
            Model.addRow(v);
            tablaModificarM.setModel(Model);
        }
    }

    void limpiar() throws FileNotFoundException {
        File x = new File("");
        File mascotas = new File("Mascotas.txt");
        try {
            FileWriter fw = new FileWriter(mascotas);
            if (fw != null) {
                fw.close();
            }
            if (mascotas.delete()) {
                System.out.println("El archivo fue eliminado");
                mascotas.createNewFile();
            } else {
                System.out.println("El archivo no se puede borrar");
            }

        } catch (IOException ex) {
            Logger.getLogger(Modificar_Mascota.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    int ContarDatos() {
        File x = new File("");
        File mascotas = new File("Mascotas.txt");
        FileReader fw;
        int cont = 0;
        try {
            fw = new FileReader(mascotas);
            BufferedReader br = new BufferedReader(fw);
            String lector;
            while ((lector = br.readLine()) != null) {
                cont++;

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz_Cliente.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Cliente.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return cont;
    }

    void TomarDatos() {
        System.out.println("HOLA");
        n = ContarDatos();
        M = new String[n][5];
        File x = new File("");
        File mascotas = new File("Mascotas.txt");
        FileReader fw;
        try {
            fw = new FileReader(mascotas);
            BufferedReader br = new BufferedReader(fw);
            String lector;
            int fila = 0;
            while ((lector = br.readLine()) != null) {
                String dato = "";
                int cont = 0;
                for (int i = 0; i < lector.length(); i++) {
                    if (lector.substring(i, i + 1).compareTo(";") != 0) {
                        dato = dato.concat(lector.substring(i, i + 1));
                    } else {
                        switch (cont) {
                            case 0:
                                M[fila][0] = dato;
                                break;
                            case 1:
                                M[fila][1] = dato;
                                break;
                            case 2:
                                M[fila][2] = dato;
                                break;
                            case 3:
                                M[fila][3] = dato;
                                break;
                            default:
                                M[fila][4] = dato;
                                break;
                        }
                        cont++;
                        dato = "";
                    }
                }
                fila++;
            }
            EscribirDatos();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz_Cliente.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Cliente.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    void Guardar() {
        File x = new File("");
        File mascotas = new File("Mascotas.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(mascotas, true);
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < n; i++) {
                pw.print(M[i][0] + ";" + M[i][1] + ";" + M[i][2] + ";" + M[i][3] + ";" + M[i][4] + ";");
                pw.println();
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(rootPane, "El archivo se guardo");
        txtCedula_MC.setText("");
        txtNombreP_MM.setText("");
        txtRaza_MM.setText("");
        txtColor_MM.setText("");
    }

    void EscribirDatos() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(M[i][j] + " -- ");
            }
            System.out.println("");
        }
    }

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
            java.util.logging.Logger.getLogger(Modificar_Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_Mascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_Mascota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser JCFechaNN;
    private javax.swing.JButton btnModificar_Cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lolo;
    private javax.swing.JTable tablaModificarM;
    private javax.swing.JTextField txtCedula_MC;
    private javax.swing.JTextField txtColor_MM;
    private javax.swing.JTextField txtNombrePB;
    private javax.swing.JTextField txtNombreP_MM;
    private javax.swing.JTextField txtRaza_MM;
    // End of variables declaration//GEN-END:variables
}
