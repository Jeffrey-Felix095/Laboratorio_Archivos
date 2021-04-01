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
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey Felix
 */
public class Agregar_Veterinario extends javax.swing.JFrame {

    /**
     * Creates new form Agregar_Veterinario
     */
    public Agregar_Veterinario() {
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

        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lolo = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono_AC = new javax.swing.JTextField();
        txtNombre_AC = new javax.swing.JTextField();
        txtCedula_AC = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txtCorreo_AC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 130, -1, -1));

        jButton1.setText("←");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel8.setText("Telefono:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 172, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel10.setText("Direccion:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 214, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel11.setText("Cedula:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 88, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel12.setText("Correo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 256, -1, -1));

        lolo.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lolo.setText("Datos personales");
        getContentPane().add(lolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 26, -1, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 216, 187, -1));
        getContentPane().add(txtTelefono_AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 174, 189, -1));
        getContentPane().add(txtNombre_AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 132, 190, -1));
        getContentPane().add(txtCedula_AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 90, 190, -1));

        jButton6.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 298, 185, 58));
        getContentPane().add(txtCorreo_AC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 187, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Veterinario.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 250, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoBlanco.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 460, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (txtCedula_AC.getText().equals("") || txtNombre_AC.getText().equals("") || txtTelefono_AC.getText().equals("") || txtDireccion.getText().equals("") || txtCorreo_AC.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos");
        } else {
            File x = new File("C:\\Veterinaria_PerrosPET");
            String Dir = "C:\\Veterinaria_PerrosPET";
            File Veterinarios = new File(Dir, "Veterinarios.txt");
            FileWriter fw = null;
            if (!Veterinarios.exists()) { //No existe el archivo
                x.mkdir();
                try {
                    Veterinarios.createNewFile();
                } catch (IOException ex) {
                    System.out.println("Error");
                }
            }
            try {
                fw = new FileWriter(Veterinarios, true);
                PrintWriter pw = new PrintWriter(fw);
                int cedula = 0;
                int telefono = 0;
                try {
                    cedula = Integer.parseInt(txtCedula_AC.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Debe rellenar la cedula solo con numeros");
                }
                String nombre = txtNombre_AC.getText();
                try {
                    telefono = Integer.parseInt(txtTelefono_AC.getText());
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Debe rellenar el telefono solo con numeros");
                }
                String direccion = txtDireccion.getText();
                String correo = txtCorreo_AC.getText();
                if (cedula != 0 && telefono != 0) {
                    pw.print(cedula + ";" + nombre + ";" + telefono + ";" + direccion + ";" + correo + ";");
                    pw.println();
                    JOptionPane.showMessageDialog(rootPane, "El archivo se guardo");
                    txtCedula_AC.setText("");
                    txtNombre_AC.setText("");
                    txtTelefono_AC.setText("");
                    txtDireccion.setText("");
                    txtCorreo_AC.setText("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se pudo guardar el archivo");
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
            dispose();

        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_Veterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Veterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Veterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Veterinario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Veterinario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lolo;
    private javax.swing.JTextField txtCedula_AC;
    private javax.swing.JTextField txtCorreo_AC;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre_AC;
    private javax.swing.JTextField txtTelefono_AC;
    // End of variables declaration//GEN-END:variables
}
