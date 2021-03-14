/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey Felix
 */
public class Solicitar_Cita extends javax.swing.JFrame {

    int cedula = Cliente.Cedula();

    public Solicitar_Cita() {
        initComponents();
        datosDueño(cedula);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbServicio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCedulaD_AG = new javax.swing.JTextField();
        txtNombreD_AG = new javax.swing.JTextField();
        txtNombreP_AG = new javax.swing.JTextField();
        txtFechaC_AG = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtValorEstimado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agendar cita");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel2.setText("Cedula de dueño: ");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel3.setText("Servicio:");

        jcbServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta", "Control", "Desparasitación", "Vacunación", "Guardería", "Radiología", "Baño" }));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel4.setText("Nombre de dueño: ");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre de la mascota: ");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel6.setText("Fecha:");

        txtCedulaD_AG.setEditable(false);

        txtNombreD_AG.setEditable(false);

        jButton1.setText("AGENDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtValorEstimado.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel7.setText("Valor estimado:");

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
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbServicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedulaD_AG, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(txtNombreD_AG)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreP_AG))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaC_AG, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorEstimado, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedulaD_AG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreD_AG))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreP_AG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFechaC_AG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtValorEstimado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Agendar();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    void Agendar() {
        File x = new File("");
        File Agenda = new File("Agenda.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(Agenda, true);
            PrintWriter pw = new PrintWriter(fw);
            int cedula = Integer.parseInt(txtCedulaD_AG.getText());
            String nombre = txtNombreD_AG.getText();
            String nombrePerro = txtNombreP_AG.getText();
            String Servicio = (String) jcbServicio.getSelectedItem();
            String Fecha = txtFechaC_AG.getText();
            String Estado = "En espera";
            String Veterinario = "Pendiente";
            double Valor=0;
            if (Servicio.equals("Consulta")) {
                Valor = 60000;
            }
            if (Servicio.equals("Control")) {
                Valor = 10000;
            }
            if (Servicio.equals("Desparasitación")) {
                Valor = 40000;
            }
            if (Servicio.equals("Vacunación")) {
                Valor = 35000;
            }
            if (Servicio.equals("Guardería")) {
                Valor = 35000;
            }
            if (Servicio.equals("Radiología")) {
                Valor = 100000;
            }
            if (Servicio.equals("Baño")) {
                Valor = 25000;
            }
            pw.print(cedula + ";" + nombre + ";" + nombrePerro + ";" + Servicio + ";" + Fecha + ";" + Estado + ";" + Veterinario + ";" + Valor + ";");
            pw.println();
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

    }

    public Boolean datosDueño(int cedulaIngresada) {
        String ruta = "C:\\Users\\Jeffrey Felix\\Documents\\GitHub\\Laboratorio_Archivos\\Laboratorio_Archivos"; // ruta para el archivo
        String fileName = "Clientes.txt"; // nombre
        File archivo = new File(ruta, fileName); // instancia el archivo

        try (Scanner sc = new Scanner(archivo)) {
            boolean encontrado = false;
            while (sc.hasNextLine() && encontrado == false) {
                String linea = sc.nextLine();
                String data[] = linea.split(";");
                int idPersona = Integer.parseInt(data[0]);
                String nombre = data[1];
                int telefono = Integer.parseInt(data[2]);
                String direccion = data[3];
                String correo = data[4];
                // comparar idBuscar con idPersona
                /*comprar y retornar
		return data[2]*/
                if (cedulaIngresada == idPersona) {
                    txtCedulaD_AG.setText(Integer.toString(idPersona));
                    txtNombreD_AG.setText(nombre);
                    return true;
                }

            }//fin while
        } catch (IOException e) {
            System.out.println("Error");
        }
        return false;
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
            java.util.logging.Logger.getLogger(Solicitar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Solicitar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Solicitar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Solicitar_Cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Solicitar_Cita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JComboBox<String> jcbServicio;
    private javax.swing.JTextField txtCedulaD_AG;
    private javax.swing.JTextField txtFechaC_AG;
    private javax.swing.JTextField txtNombreD_AG;
    private javax.swing.JTextField txtNombreP_AG;
    private javax.swing.JTextField txtValorEstimado;
    // End of variables declaration//GEN-END:variables
}
