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
public class Interface_Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Interface_Administrador
     */
    public Interface_Administrador() {
        initComponents();
        String[] columnas = {"Cedula del dueño", "Nombre del dueño", "Nombre del perro", "Servicio", "Fecha de la cita", "Hora", "Estado", "Valor de servicio"};
        DefaultTableModel model2 = new DefaultTableModel(columnas, 0);
        TablaCitasE.setModel(model2);
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

        btnNuevoCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCitasE = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtMascotaBus = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtCedulaD_AG = new javax.swing.JTextField();
        txtNombreD_AG = new javax.swing.JTextField();
        txtNombreP_AG = new javax.swing.JTextField();
        txtValorEstimado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtServicio = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtFechaC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNuevoCliente.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        btnNuevoCliente.setText("Nuevo veterinario");
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, -1, -1));

        TablaCitasE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaCitasE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCitasEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaCitasE);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 125, 706, 190));

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        jButton1.setText("Buscar Mascota");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 82, -1, -1));
        getContentPane().add(txtMascotaBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 83, 186, -1));

        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton2.setText("Confimar cita");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, 180, 69));

        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton3.setText("Eliminar cita");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 170, 69));

        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton4.setText("Facturar cita");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 200, 69));

        txtCedulaD_AG.setEditable(false);
        getContentPane().add(txtCedulaD_AG, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 329, 294, -1));

        txtNombreD_AG.setEditable(false);
        getContentPane().add(txtNombreD_AG, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 369, 294, -1));

        txtNombreP_AG.setEditable(false);
        getContentPane().add(txtNombreP_AG, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 420, 267, -1));

        txtValorEstimado.setEditable(false);
        getContentPane().add(txtValorEstimado, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 519, 145, -1));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel7.setText("Valor estimado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 512, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel8.setText("Hora:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 455, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel2.setText("Cedula de dueño: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 322, 191, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel3.setText("Servicio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 455, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel4.setText("Nombre de dueño: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 362, 191, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre de la mascota: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 413, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel6.setText("Fecha:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 455, -1, -1));

        txtServicio.setEditable(false);
        getContentPane().add(txtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 462, 221, -1));

        txtHora.setEditable(false);
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 462, 107, -1));

        txtFechaC.setEditable(false);
        getContentPane().add(txtFechaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 462, 107, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrador");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 13, 351, 62));

        jButton5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton5.setText("Ver agenda completa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 240, 69));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel9.setText("Estado:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 512, -1, -1));

        txtEstado.setEditable(false);
        getContentPane().add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 519, 211, -1));

        jButton6.setFont(new java.awt.Font("Segoe Print", 1, 13)); // NOI18N
        jButton6.setText("Cargar todas las citas pendientes");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.setText("←");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 17, 135, 46));

        jButton7.setText("Facturas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 120, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoBlanco.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 850, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AgendaCompleta pantalla_AgendaGeneral = new AgendaCompleta();
        pantalla_AgendaGeneral.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void TablaCitasEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCitasEMouseClicked
        int fila = TablaCitasE.getSelectedRow();
        if (fila == -.1) {

        } else {
            int idDueño = Integer.parseInt((String) TablaCitasE.getValueAt(fila, 0).toString());
            String nombreD = (String) TablaCitasE.getValueAt(fila, 1);
            String nombrePerro = (String) TablaCitasE.getValueAt(fila, 2);
            String servicio = (String) TablaCitasE.getValueAt(fila, 3);
            String fechaC = (String) TablaCitasE.getValueAt(fila, 4);
            String horaC = (String) TablaCitasE.getValueAt(fila, 5);
            String estado = (String) TablaCitasE.getValueAt(fila, 6);
            double valor = Double.parseDouble((String) TablaCitasE.getValueAt(fila, 7).toString());
            txtCedulaD_AG.setText("" + idDueño);
            txtNombreD_AG.setText(nombreD);
            txtNombreP_AG.setText(nombrePerro);
            txtValorEstimado.setText("" + valor);
            txtFechaC.setText(fechaC);
            txtServicio.setText(servicio);
            txtHora.setText(horaC);
            txtEstado.setText(estado);
        }
    }//GEN-LAST:event_TablaCitasEMouseClicked

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed
        Agregar_Veterinario pantalla_NuevoVete = new Agregar_Veterinario();
        pantalla_NuevoVete.setVisible(true);
    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Facturar pantalla_Facturar = new Facturar();
        pantalla_Facturar.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String[] columnas = {"Cedula del dueño", "Nombre del dueño", "Nombre del perro", "Servicio", "Fecha de la cita", "Hora", "Estado", "Valor de servicio"};
        DefaultTableModel model2 = new DefaultTableModel(columnas, 0);
        TablaCitasE.setModel(model2);
        MostrarCitasEspecifico(txtMascotaBus.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String[] columnas = {"Cedula del dueño", "Nombre del dueño", "Nombre del perro", "Servicio", "Fecha de la cita", "Hora", "Estado", "Valor de servicio"};
        DefaultTableModel model2 = new DefaultTableModel(columnas, 0);
        TablaCitasE.setModel(model2);
        MostrarCitas();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cruceAgenda(txtFechaC.getText(), txtHora.getText());
        String[] columnas = {"Cedula del dueño", "Nombre del dueño", "Nombre del perro", "Servicio", "Fecha de la cita", "Hora", "Estado", "Valor de servicio"};
        DefaultTableModel model2 = new DefaultTableModel(columnas, 0);
        TablaCitasE.setModel(model2);
        MostrarCitas();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cruceAgendaEliminacion(txtFechaC.getText(), txtHora.getText());
        String[] columnas = {"Cedula del dueño", "Nombre del dueño", "Nombre del perro", "Servicio", "Fecha de la cita", "Hora", "Estado", "Valor de servicio"};
        DefaultTableModel model2 = new DefaultTableModel(columnas, 0);
        TablaCitasE.setModel(model2);
        MostrarCitas();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Administrador pantalla_Administrador = new Administrador();
        pantalla_Administrador.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       Facturas pantalla = new Facturas();
       pantalla.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed
    void MostrarCitasEspecifico(String nombreMascota) {
        DefaultTableModel model = (DefaultTableModel) TablaCitasE.getModel();
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File agenda = new File(Dir, "Agenda.txt");
        if (!agenda.exists()) { //No existe el archivo
            x.mkdir();
            try {
                agenda.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
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
                if (estado.equals("En espera") && nombrePerro.equals(nombreMascota)) {
                    String Datos[] = {String.valueOf(cedulaDueño), nombreDueño, nombrePerro, servicio, fechaCita, hora, estado, String.valueOf(valor)};
                    model.addRow(Datos);
                    TablaCitasE.setModel(model);
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void MostrarCitas() {
        DefaultTableModel model = (DefaultTableModel) TablaCitasE.getModel();
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File agenda = new File(Dir, "Agenda.txt");
        if (!agenda.exists()) { //No existe el archivo
            x.mkdir();
            try {
                agenda.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
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
                    TablaCitasE.setModel(model);
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Cliente.class.getName()).log(Level.SEVERE, null, ex);
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

    void cruceAgendaEliminacion(String fechaC, String horaC) {
        pasarDatosAgendaACambiosEliminarCita(fechaC, horaC);
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

    void pasarDatosAgendaACambios(String fechaC, String horaC) {
        String ruta = "C:\\Veterinaria_PerrosPET"; // ruta para el archivo
        String fileName = "Agenda.txt"; // nombre
        File archivo = new File(ruta, fileName); // instancia el archivo
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File cambio = new File(Dir, "Cambios.txt");
        if (!cambio.exists()) { //No existe el archivo
            x.mkdir();
            try {
                cambio.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
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
                    estado = "Confirmada";
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

    void pasarDatosAgendaACambiosEliminarCita(String fechaC, String horaC) {
        String ruta = "C:\\Veterinaria_PerrosPET"; // ruta para el archivo
        String fileName = "Agenda.txt"; // nombre
        File archivo = new File(ruta, fileName); // instancia el archivo
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File cambio = new File(Dir, "Cambios.txt");
        if (!cambio.exists()) { //No existe el archivo
            x.mkdir();
            try {
                cambio.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
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
                    if (fechaC.equals(fecha) && horaC.equals(hora)) {

                    } else {
                        fw = new FileWriter(cambio, true);
                        PrintWriter pw = new PrintWriter(fw);
                        pw.print(idPersona + ";" + nombre + ";" + nombrePerro + ";" + servicio + ";" + fecha + ";" + hora + ";" + estado + ";" + valor + ";");
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
            }//fin while
            JOptionPane.showMessageDialog(rootPane, "El archivo se doblado");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    void limpiarAgenda() throws FileNotFoundException {
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File agenda = new File(Dir, "Agenda.txt");
        if (!agenda.exists()) { //No existe el archivo
            x.mkdir();
            try {
                agenda.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
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

    void pasarDatosCambiosAAgenda() {
        String ruta = "C:\\Veterinaria_PerrosPET"; // ruta para el archivo
        String fileName = "Cambios.txt"; // nombre
        File archivo = new File(ruta, fileName); // instancia el archivo
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File agenda = new File(Dir, "Agenda.txt");
        if (!agenda.exists()) { //No existe el archivo
            x.mkdir();
            try {
                agenda.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
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

    void limpiarCambios() throws FileNotFoundException {
         File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File cambios = new File(Dir, "Cambios.txt");
        if (!cambios.exists()) { //No existe el archivo
            x.mkdir();
            try {
                cambios.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
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
            java.util.logging.Logger.getLogger(Interface_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCitasE;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCedulaD_AG;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechaC;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMascotaBus;
    private javax.swing.JTextField txtNombreD_AG;
    private javax.swing.JTextField txtNombreP_AG;
    private javax.swing.JTextField txtServicio;
    private javax.swing.JTextField txtValorEstimado;
    // End of variables declaration//GEN-END:variables
}
