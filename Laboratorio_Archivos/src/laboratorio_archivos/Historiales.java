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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeffrey Felix
 */
public class Historiales extends javax.swing.JFrame {

    /**
     * Creates new form Historiales
     */
    public Historiales() {
        initComponents();
        String[] columnas = {"Cedula del dueño", "Nombre del perro","Fecha de la cita", "Servicio",  "Diagnostico", "Prescripcion"};
        DefaultTableModel model2 = new DefaultTableModel(columnas, 0);
        TablaHistoriales.setModel(model2);
        MostrarCitas();
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
        TablaHistoriales = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPrescripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCedulaD = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFechaCita = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtServicio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaHistoriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaHistoriales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaHistorialesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaHistoriales);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 148, 802, 181));

        txtDiagnostico.setEditable(false);
        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        jScrollPane2.setViewportView(txtDiagnostico);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 328, 131));

        txtPrescripcion.setEditable(false);
        txtPrescripcion.setColumns(20);
        txtPrescripcion.setRows(5);
        jScrollPane3.setViewportView(txtPrescripcion);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 328, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prescripción");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 206, 37));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Diagnostico");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, 206, 37));

        txtNombreP.setEditable(false);
        getContentPane().add(txtNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 204, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Nombre del perro:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 400, -1, -1));

        txtCedulaD.setEditable(false);
        getContentPane().add(txtCedulaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 190, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cedula del dueño:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        txtFechaCita.setEditable(false);
        getContentPane().add(txtFechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 204, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Fecha de la Cita:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, -1));

        txtServicio.setEditable(false);
        getContentPane().add(txtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 205, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Tipo de servicio: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.setText("←");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 20, 135, 46));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Historiales Clinicos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 13, 379, 54));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Introduzca cedula del cliente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 76, 206, 27));

        txtBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 79, 192, -1));

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 78, -1, -1));

        jButton2.setText("Mostrar Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 108, 209, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoBlanco.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 0, 940, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Interface_Veterinario pantalla_interface = new Interface_Veterinario();
        pantalla_interface.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void TablaHistorialesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaHistorialesMouseClicked
        int fila = TablaHistoriales.getSelectedRow();
        if (fila == -.1) {

        } else {
            int idDueño = Integer.parseInt((String) TablaHistoriales.getValueAt(fila, 0).toString());
            String nombrePerro = (String) TablaHistoriales.getValueAt(fila, 1);
            String fechaC = (String) TablaHistoriales.getValueAt(fila, 2);
            String servicio = (String) TablaHistoriales.getValueAt(fila, 3);
            String diagnostico = (String) TablaHistoriales.getValueAt(fila, 4);
            String prescripcion = (String) TablaHistoriales.getValueAt(fila, 5);
            txtCedulaD.setText("" + idDueño);
            txtNombreP.setText(nombrePerro);
            txtFechaCita.setText(fechaC);
            txtServicio.setText(servicio);
            txtDiagnostico.setText(diagnostico);
            txtPrescripcion.setText(prescripcion);
        }
    }//GEN-LAST:event_TablaHistorialesMouseClicked

    private void txtBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarClienteActionPerformed

    }//GEN-LAST:event_txtBuscarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] columnas = {"Cedula del dueño", "Nombre del perro","Fecha de la cita", "Servicio",  "Diagnostico", "Prescripcion"};
        DefaultTableModel model2 = new DefaultTableModel(columnas, 0);
        TablaHistoriales.setModel(model2);
        MostrarCitas(Integer.parseInt(txtBuscarCliente.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         String[] columnas = {"Cedula del dueño", "Nombre del perro","Fecha de la cita", "Servicio",  "Diagnostico", "Prescripcion"};
        DefaultTableModel model2 = new DefaultTableModel(columnas, 0);
        TablaHistoriales.setModel(model2);
        MostrarCitas();
    }//GEN-LAST:event_jButton2ActionPerformed

    void MostrarCitas() {
        DefaultTableModel model = (DefaultTableModel) TablaHistoriales.getModel();
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File historial = new File(Dir, "Historiales.txt");
        if (!historial.exists()) { //No existe el archivo
            x.mkdir();
            try {
                historial.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
        FileReader fw;
        try {
            fw = new FileReader(historial);
            BufferedReader br = new BufferedReader(fw);
            String lector;
            while ((lector = br.readLine()) != null) {
                System.out.println(lector);
                String dato = "";
                int cedulaDueño = 0;
                String nombrePerro = "";
                String fechaCita = "";
                String servicio = "";
                String diagnostico = "";
                String prescripcion = "";

                int cont = 0;
                for (int i = 0; i < lector.length(); i++) {
                    if (lector.substring(i, i + 1).compareTo(";") != 0) {
                        dato = dato.concat(lector.substring(i, i + 1));
                    } else {
                        switch (cont) {
                            case 0:
                                cedulaDueño = Integer.valueOf(dato);
                                break;
                            case 1:
                                nombrePerro = dato;
                                break;
                            case 2:
                                fechaCita = dato;
                                break;
                            case 3:
                                servicio = dato;
                                break;
                            case 4:
                                diagnostico = dato;
                                break;
                            case 5:
                                prescripcion = dato;
                                break;
                        }
                        cont++;
                        dato = "";
                    }
                }
                String Datos[] = {String.valueOf(cedulaDueño), nombrePerro, fechaCita, servicio, diagnostico, prescripcion};
                model.addRow(Datos);
                TablaHistoriales.setModel(model);

//                System.out.println(cliente.getCedula());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    void MostrarCitas(int id) {
        DefaultTableModel model = (DefaultTableModel) TablaHistoriales.getModel();
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File historial = new File(Dir, "Historiales.txt");
        if (!historial.exists()) { //No existe el archivo
            x.mkdir();
            try {
                historial.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
        FileReader fw;
        try {
            fw = new FileReader(historial);
            BufferedReader br = new BufferedReader(fw);
            String lector;
            while ((lector = br.readLine()) != null) {
                System.out.println(lector);
                String dato = "";
                int cedulaDueño = 0;
                String nombrePerro = "";
                String fechaCita = "";
                String servicio = "";
                String diagnostico = "";
                String prescripcion = "";

                int cont = 0;
                for (int i = 0; i < lector.length(); i++) {
                    if (lector.substring(i, i + 1).compareTo(";") != 0) {
                        dato = dato.concat(lector.substring(i, i + 1));
                    } else {
                        switch (cont) {
                            case 0:
                                cedulaDueño = Integer.valueOf(dato);
                                break;
                            case 1:
                                nombrePerro = dato;
                                break;
                            case 2:
                                fechaCita = dato;
                                break;
                            case 3:
                                servicio = dato;
                                break;
                            case 4:
                                diagnostico = dato;
                                break;
                            case 5:
                                prescripcion = dato;
                                break;
                        }
                        cont++;
                        dato = "";
                    }
                }
                if(id==cedulaDueño){
                String Datos[] = {String.valueOf(cedulaDueño), nombrePerro, fechaCita, servicio, diagnostico, prescripcion};
                model.addRow(Datos);
                TablaHistoriales.setModel(model);
                }
//                System.out.println(cliente.getCedula());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            java.util.logging.Logger.getLogger(Historiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historiales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historiales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaHistoriales;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtCedulaD;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtFechaCita;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextArea txtPrescripcion;
    private javax.swing.JTextField txtServicio;
    // End of variables declaration//GEN-END:variables
}
