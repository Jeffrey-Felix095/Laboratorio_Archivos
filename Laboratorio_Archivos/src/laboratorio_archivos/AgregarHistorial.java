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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeffrey Felix
 */
public class AgregarHistorial extends javax.swing.JFrame {

    String f, h;

    public AgregarHistorial() {
        initComponents();
        actualizarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        TablaAgendaV = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrescripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCedulaD = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaAgendaV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaAgendaV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAgendaVMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaAgendaV);

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        jScrollPane1.setViewportView(txtDiagnostico);

        txtPrescripcion.setColumns(20);
        txtPrescripcion.setRows(5);
        jScrollPane2.setViewportView(txtPrescripcion);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prescripción");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Diagnostico");

        txtNombreP.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Nombre del perro:");

        txtCedulaD.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cedula del dueño:");

        jButton1.setText("Crear historial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Crear historial clinico ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Seleccione una cita:");

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.setText("←");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(263, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtCedulaD, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(71, 71, 71)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(86, 86, 86)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(187, 187, 187)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addContainerGap()))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(273, 273, 273))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(526, 526, 526)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtNombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtCedulaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Interface_Veterinario pantalla_interface = new Interface_Veterinario();
        pantalla_interface.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void TablaAgendaVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAgendaVMouseClicked
        int fila = TablaAgendaV.getSelectedRow();
        if (fila == -.1) {

        } else {
            int idDueño = Integer.parseInt((String) TablaAgendaV.getValueAt(fila, 0).toString());
            String nombreD = (String) TablaAgendaV.getValueAt(fila, 1);
            String nombrePerro = (String) TablaAgendaV.getValueAt(fila, 2);
            String servicio = (String) TablaAgendaV.getValueAt(fila, 3);
            String fechaC = (String) TablaAgendaV.getValueAt(fila, 4);
            String horaC = (String) TablaAgendaV.getValueAt(fila, 5);
            f = (String) TablaAgendaV.getValueAt(fila, 4);
            h = (String) TablaAgendaV.getValueAt(fila, 5);
            String estado = (String) TablaAgendaV.getValueAt(fila, 6);
            double valor = Double.parseDouble((String) TablaAgendaV.getValueAt(fila, 7).toString());
            txtCedulaD.setText("" + idDueño);
            txtNombreP.setText(nombrePerro);
        }
    }//GEN-LAST:event_TablaAgendaVMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        crearHistorial();
        cruceAgenda(f, h);
        actualizarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    void crearHistorial() {
        File x = new File("");
        File historial = new File("Historiales.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(historial, true);
            PrintWriter pw = new PrintWriter(fw);
            int cedula = 0;
            try {
                cedula = Integer.parseInt(txtCedulaD.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Debe rellenar la cedula solo con numeros");
            }
            String nombre = txtNombreP.getText();
            String diagnostico = txtDiagnostico.getText();
            String prescripcion = txtPrescripcion.getText();
            if (cedula != 0) {
                pw.print(cedula + ";" + nombre + ";" + diagnostico + ";" + prescripcion + ";");
                pw.println();
                JOptionPane.showMessageDialog(rootPane, "El archivo se guardo");
                txtCedulaD.setText("");
                txtNombreP.setText("");
                txtDiagnostico.setText("");
                txtPrescripcion.setText("");
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
    }

    void cruceAgenda(String fechaC, String horaC) {
        pasarDatosAgendaACambios(fechaC, horaC);
        try {
            limpiarAgenda();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modificar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        pasarDatosCambiosAAgenda();
        try {
            limpiarCambios();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modificar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void limpiarAgenda() throws FileNotFoundException {
        File x = new File("");
        File agenda = new File("Agenda.txt");
        try {
            FileWriter fw = new FileWriter(agenda);
            if (fw != null) {
                fw.close();
            }
            if (agenda.delete()) {
                System.out.println("El archivo fue eliminado");
                agenda.createNewFile();
            } else {
                System.out.println("El archivo agenda no se puede borrar");
            }

        } catch (IOException ex) {
            Logger.getLogger(AgregarHistorial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void limpiarCambios() throws FileNotFoundException {
        File x = new File("");
        File cambios = new File("Cambios.txt");
        try {
            FileWriter fw = new FileWriter(cambios);
            if (fw != null) {
                fw.close();
            }
            if (cambios.delete()) {
                System.out.println("El archivo fue eliminado");
                cambios.createNewFile();
            } else {
                System.out.println("El archivo cambios no se puede borrar");
            }

        } catch (IOException ex) {
            Logger.getLogger(AgregarHistorial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void pasarDatosAgendaACambios(String fechaC, String horaC) {
        String ruta = "C:\\Users\\Jeffrey Felix\\Documents\\GitHub\\Laboratorio_Archivos\\Laboratorio_Archivos"; // ruta para el archivo
        String fileName = "Agenda.txt"; // nombre
        File archivo = new File(ruta, fileName); // instancia el archivo
        File x = new File("");
        File cambio = new File("Cambios.txt");
        FileWriter fw = null;

        try (Scanner sc = new Scanner(archivo)) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String data[] = linea.split(";");
                int idPersona = Integer.parseInt(data[0]);
                String nombre = data[1];
                String nombrePerro = data[2];
                String servicio = data[3];
                String fecha = data[4];
                String hora = data[5];
                String estado;
                if (fechaC.equals(fecha) && horaC.equals(hora)) {
                    estado = "Atendida";
                } else {
                    estado = data[6];
                }
                double valor = Double.parseDouble(data[7]);
                // comparar idBuscar con idPersona
                /*comprar y retornar
		return data[2]*/

                try {
                    fw = new FileWriter(cambio, true);
                    PrintWriter pw = new PrintWriter(fw);
                    pw.print(idPersona + ";" + nombre + ";" + nombrePerro + ";" + servicio + ";" + fecha + ";" + hora + ";" + estado + ";" + valor + ";");
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
            }//fin while
            JOptionPane.showMessageDialog(rootPane, "El archivo se doblado");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    void pasarDatosCambiosAAgenda() {
        String ruta = "C:\\Users\\Jeffrey Felix\\Documents\\GitHub\\Laboratorio_Archivos\\Laboratorio_Archivos"; // ruta para el archivo
        String fileName = "Cambios.txt"; // nombre
        File archivo = new File(ruta, fileName); // instancia el archivo
        File x = new File("");
        File agenda = new File("Agenda.txt");
        FileWriter fw = null;

        try (Scanner sc = new Scanner(archivo)) {
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String data[] = linea.split(";");
                int idPersona = Integer.parseInt(data[0]);
                String nombre = data[1];
                String nombrePerro = data[2];
                String servicio = data[3];
                String fecha = data[4];
                String hora = data[5];
                String estado = data[6];
                double valor = Double.parseDouble(data[7]);
                // comparar idBuscar con idPersona
                /*comprar y retornar
		return data[2]*/

                try {
                    fw = new FileWriter(agenda, true);
                    PrintWriter pw = new PrintWriter(fw);
                    pw.print(idPersona + ";" + nombre + ";" + nombrePerro + ";" + servicio + ";" + fecha + ";" + hora + ";" + estado + ";" + valor + ";");
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

            }//fin while
            JOptionPane.showMessageDialog(rootPane, "El archivo se Cruzo corectamente");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    void actualizarTabla() {
        String[] columnas = {"Cedula del dueño", "Nombre del dueño", "Nombre del perro", "Servicio", "Fecha de la cita", "Hora", "Estado", "Valor de se   rvicio"};
        DefaultTableModel model2 = new DefaultTableModel(columnas, 0);
        TablaAgendaV.setModel(model2);
        MostrarCitas();
    }

    void MostrarCitas() {
        DefaultTableModel model = (DefaultTableModel) TablaAgendaV.getModel();
        File x = new File("");
        File agenda = new File("Agenda.txt");
        FileReader fw;
        try {
            fw = new FileReader(agenda);
            BufferedReader br = new BufferedReader(fw);
            String lector;
            while ((lector = br.readLine()) != null) {
                System.out.println(lector);
                String dato = "";
                int cedulaDueño = 0;
                String nombreDueño = "";
                String nombrePerro = "";
                String servicio = "";
                String fechaCita = "";
                String hora = "";
                String estado = "";
                double valor = 0;

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
                                nombreDueño = dato;
                                break;
                            case 2:
                                nombrePerro = dato;
                                break;
                            case 3:
                                servicio = dato;
                                break;
                            case 4:
                                fechaCita = dato;
                                break;
                            case 5:
                                hora = dato;
                                break;
                            case 6:
                                estado = dato;
                                break;
                            case 7:
                                valor = Double.parseDouble(dato);
                                break;
                        }
                        cont++;
                        dato = "";
                    }
                }
                if (estado.equals("En espera")) {
                    String Datos[] = {String.valueOf(cedulaDueño), nombreDueño, nombrePerro, servicio, fechaCita, hora, estado, String.valueOf(valor)};
                    model.addRow(Datos);
                    TablaAgendaV.setModel(model);
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
            java.util.logging.Logger.getLogger(AgregarHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarHistorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarHistorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaAgendaV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtCedulaD;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextArea txtPrescripcion;
    // End of variables declaration//GEN-END:variables
}
