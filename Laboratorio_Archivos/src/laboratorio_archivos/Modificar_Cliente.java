/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio_archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey Felix
 */
public class Modificar_Cliente extends javax.swing.JFrame {

    int cedula = Cliente.Cedula();

    public Modificar_Cliente() {
        initComponents();
        mostrarDatos(cedula);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre_AC = new javax.swing.JTextField();
        txtCedula_MC = new javax.swing.JTextField();
        btnModificar_Cliente = new javax.swing.JButton();
        txtCorreo_AC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lolo = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono_AC = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnModificar_Cliente.setText("Modificar");
        btnModificar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar_ClienteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Telefono:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Direccion:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cedula:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Correo:");

        lolo.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        lolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lolo.setText("Datos personales");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefono_AC))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDireccion)
                            .addComponent(txtCorreo_AC, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre_AC)
                            .addComponent(txtCedula_MC))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lolo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnModificar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lolo)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCedula_MC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre_AC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTelefono_AC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCorreo_AC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnModificar_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar_ClienteActionPerformed

        try {
            limpiar();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        guardar();

    }//GEN-LAST:event_btnModificar_ClienteActionPerformed
    void limpiar() throws FileNotFoundException {
        File x = new File("");
        File clientes = new File("Clientes.txt");
        try {
            FileWriter fw = new FileWriter(clientes);
            if (fw != null) {
                fw.close();
            }
            if (clientes.delete()) {
                System.out.println("El archivo fue eliminado");
                clientes.createNewFile();
            } else {
                System.out.println("El archivo no se puede borrar");
            }

        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void guardar() {
        File x = new File("");
        File Clientes = new File("Clientes.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(Clientes, true);
            PrintWriter pw = new PrintWriter(fw);
            int cedulaa = Integer.parseInt(txtCedula_MC.getText());
            String nombre = txtNombre_AC.getText();
            int telefono = Integer.parseInt(txtTelefono_AC.getText());
            String direccion = txtDireccion.getText();
            String correo = txtCorreo_AC.getText();
            pw.print(cedulaa + ";" + nombre + ";" + telefono + ";" + direccion + ";" + correo);
            pw.println();
            txtCedula_MC.setText(Integer.toString(cedulaa));
            txtNombre_AC.setText(nombre);
            txtTelefono_AC.setText(Integer.toString(cedulaa));
            txtDireccion.setText(direccion);
            txtCorreo_AC.setText(correo);
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

    public Boolean mostrarDatos(int cedulaIngresada) {
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
                    txtCedula_MC.setText(Integer.toString(idPersona));
                    txtNombre_AC.setText(nombre);
                    txtTelefono_AC.setText(Integer.toString(telefono));
                    txtDireccion.setText(direccion);
                    txtCorreo_AC.setText(correo);
                    return true;
                }

            }//fin while
        } catch (IOException e) {
            System.out.println("Error");
        }
        return false;
    }

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
            java.util.logging.Logger.getLogger(Modificar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar_Cliente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lolo;
    private javax.swing.JTextField txtCedula_MC;
    private javax.swing.JTextField txtCorreo_AC;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre_AC;
    private javax.swing.JTextField txtTelefono_AC;
    // End of variables declaration//GEN-END:variables
}
