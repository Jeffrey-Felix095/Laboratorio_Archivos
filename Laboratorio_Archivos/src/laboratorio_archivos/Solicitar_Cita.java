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
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeffrey Felix
 */
public class Solicitar_Cita extends javax.swing.JFrame {

    int cedula = Cliente.Cedula();
    int consulta = 0;
    int control = 0;
    int desparasitacion = 0;
    int vacunacion = 0;
    int guarderia = 0;
    int radiologia = 0;
    int baño = 0;
    String fecha = "";
    String hora = "";

    public Solicitar_Cita() {
        initComponents();
        datosDueño(cedula);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        JDFechaC = new com.toedter.calendar.JDateChooser();
        jcbHora = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agendar cita");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 260, 45));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel2.setText("Cedula de dueño: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 191, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel3.setText("Servicio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jcbServicio.setFont(new java.awt.Font("Segoe Print", 0, 13)); // NOI18N
        jcbServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta", "Control", "Desparasitación", "Vacunación", "Guardería", "Radiología", "Baño" }));
        getContentPane().add(jcbServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 413, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel4.setText("Nombre de dueño: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 191, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre de la mascota: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel6.setText("Fecha:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtCedulaD_AG.setEditable(false);
        getContentPane().add(txtCedulaD_AG, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 294, -1));

        txtNombreD_AG.setEditable(false);
        getContentPane().add(txtNombreD_AG, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 294, -1));
        getContentPane().add(txtNombreP_AG, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 269, -1));

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setText("AGENDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 203, 48));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel7.setText("Hora:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        jButton3.setText("←");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        JDFechaC.setDateFormatString("dd/MM/yyyy");
        getContentPane().add(JDFechaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 146, -1));

        jcbHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00", "12:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM" }));
        getContentPane().add(jcbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 218, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PasaleWE.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 250, 330));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoBlanco.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 740, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Agendar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    void Agendar() {

        if (txtNombreP_AG.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos");
        } else if (MascotaExiste(txtNombreP_AG.getText())) {
            File x = new File("C:\\Veterinaria_PerrosPET");
            String Dir = "C:\\Veterinaria_PerrosPET";
            File agenda = new File(Dir, "Agenda.txt");
            FileWriter fw = null;
            if (!agenda.exists()) { //No existe el archivo
                x.mkdir();
                try {
                    agenda.createNewFile();
                } catch (IOException ex) {
                    System.out.println("Error");
                }
            }

            String dia = "";
            String mes = "";
            String año = "";
            try {
                fw = new FileWriter(agenda, true);
                PrintWriter pw = new PrintWriter(fw);
                int cedula = Integer.parseInt(txtCedulaD_AG.getText());
                String nombre = txtNombreD_AG.getText();
                String nombrePerro = txtNombreP_AG.getText();
                String Servicio = (String) jcbServicio.getSelectedItem();
                try {
                    dia = Integer.toString(JDFechaC.getCalendar().get(Calendar.DAY_OF_MONTH));
                    mes = Integer.toString(JDFechaC.getCalendar().get(Calendar.MONTH) + 1);
                    año = Integer.toString(JDFechaC.getCalendar().get(Calendar.YEAR));
                    fecha = dia + "/" + mes + "/" + año;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Debe elegir una fecha");
                }
                hora = (String) jcbHora.getSelectedItem();
                String Estado = "En espera";
                double Valor = 0;
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
                if (txtNombreP_AG.getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos");
                } else {
                    if (!fecha.equals("")) {
                        if (disponibilidadHorario(fecha, hora)) {
                            int diaActual = LocalDate.now().getDayOfMonth();
                            int mesActual = LocalDate.now().getMonthValue();
                            int AAActual = LocalDate.now().getYear();
                            if (AAActual < Integer.parseInt(año)) {
                                pw.print(cedula + ";" + nombre + ";" + nombrePerro + ";" + Servicio + ";" + fecha + ";" + hora + ";" + Estado + ";" + Valor + ";");
                                pw.println();
                                JOptionPane.showMessageDialog(rootPane, "Se agendo correctamente");
                            } else if (mesActual < Integer.parseInt(mes)) {
                                pw.print(cedula + ";" + nombre + ";" + nombrePerro + ";" + Servicio + ";" + fecha + ";" + hora + ";" + Estado + ";" + Valor + ";");
                                pw.println();
                                JOptionPane.showMessageDialog(rootPane, "Se agendo correctamente");
                            } else if (diaActual <= Integer.parseInt(dia)) {
                                pw.print(cedula + ";" + nombre + ";" + nombrePerro + ";" + Servicio + ";" + fecha + ";" + hora + ";" + Estado + ";" + Valor + ";");
                                pw.println();
                                JOptionPane.showMessageDialog(rootPane, "Se agendo correctamente");
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Fecha invalida");
                            }
                        }

                    }
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
            if (!txtNombreP_AG.getText().equals("") && !fecha.equals("")) {
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "La mascota NO existe");
        }
    }

    public Boolean disponibilidadHorario(String fecha, String hora) {
        String ruta = "C:\\Veterinaria_PerrosPET"; // ruta para el archivo
        String fileName = "Agenda.txt"; // nombre
        File archivo = new File(ruta, fileName); // instancia el archivo

        try (Scanner sc = new Scanner(archivo)) {
            boolean disponible = true;
            String nombreDia = String.valueOf(JDFechaC.getDate()).substring(0, 3);
            while (sc.hasNextLine() && disponible == true) {
                String linea = sc.nextLine();
                String data[] = linea.split(";");
                int idPersona = Integer.parseInt(data[0]);
                String fechaCita = data[4];
                String horaCita = data[5];

                // comparar idBuscar con idPersona
                /*comprar y retornar
        		return data[2]*/
                if (fechaCita.equals(fecha) && horaCita.equals(hora)) {
                    disponible = false;
                    JOptionPane.showMessageDialog(null, "Por favor elija otra hora, esta ya esta reservada");
                    return false;
                }
            }//fin while
            if (nombreDia.equals("Sun") || nombreDia.equals("Sat")) {
                JOptionPane.showMessageDialog(null, "Los dias sabado y domingo los veterinarios no trabajan");
                return false;
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        return true;
    }

    public Boolean datosDueño(int cedulaIngresada) {
        String ruta = "C:\\Veterinaria_PerrosPET"; // ruta para el archivo
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

    public Boolean MascotaExiste(String m) {
        String ruta = "C:\\Veterinaria_PerrosPET"; // ruta para el archivo
        String fileName = "Mascotas.txt"; // nombre
        File archivo = new File(ruta, fileName); // instancia el archivo

        try (Scanner sc = new Scanner(archivo)) {
            boolean encontrado = false;
            while (sc.hasNextLine() && encontrado == false) {
                String linea = sc.nextLine();
                String data[] = linea.split(";");
                String nombre = data[1];
                // comparar idBuscar con idPersona
                /*comprar y retornar
		return data[2]*/
                if (m.equals(nombre)) {
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
    private com.toedter.calendar.JDateChooser JDFechaC;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcbHora;
    private javax.swing.JComboBox<String> jcbServicio;
    private javax.swing.JTextField txtCedulaD_AG;
    private javax.swing.JTextField txtNombreD_AG;
    private javax.swing.JTextField txtNombreP_AG;
    // End of variables declaration//GEN-END:variables
}
