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
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lolo.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lolo.setText("Datos de Mascotas");
        getContentPane().add(lolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));
        getContentPane().add(txtColor_MM, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 272, 190, -1));
        getContentPane().add(txtRaza_MM, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 272, 187, -1));

        tablaModificarM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaModificarM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaModificarMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaModificarM);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 114, 567, 96));
        getContentPane().add(txtNombreP_MM, new org.netbeans.lib.awtextra.AbsoluteConstraints(568, 230, 190, -1));

        txtCedula_MC.setEditable(false);
        getContentPane().add(txtCedula_MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 230, 190, -1));

        btnModificar_Cliente.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnModificar_Cliente.setText("Modificar");
        btnModificar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar_ClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 185, 58));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel7.setText("Nombre del perro:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel8.setText("Raza del perro:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel10.setText("Color del perro: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel11.setText("Cedula del dueño:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel12.setText("Fecha de Nacimento del perro: ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        getContentPane().add(txtNombrePB, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 77, 190, -1));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel9.setText("Nombre del perro:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 75, -1, -1));

        jButton3.setText("←");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));
        getContentPane().add(JCFechaNN, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 151, -1));

        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 192, 58));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MascotaNueva.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 150, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoBlanco.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 780, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar_ClienteActionPerformed
        String fecha = "";
        boolean cerrar = false;
        boolean valido = false;
        for (int i = 0; i < n; i++) {
            if (M[i][1].compareTo(txtNombrePB.getText()) == 0) {
                M[i][1] = txtNombreP_MM.getText();
                M[i][2] = txtRaza_MM.getText();
                M[i][3] = txtColor_MM.getText();
                try {
                    String dia = Integer.toString(JCFechaNN.getCalendar().get(Calendar.DAY_OF_MONTH));
                    String mes = Integer.toString(JCFechaNN.getCalendar().get(Calendar.MONTH));
                    String año = Integer.toString(JCFechaNN.getCalendar().get(Calendar.YEAR));
                    fecha = dia + "/" + mes + "/" + año;
                    M[i][4] = fecha;
                    valido = true;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, "Debe elegir una fecha");
                }
            }
        }
        if (valido == false) {
            JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos");
        } else if (!txtNombreP_MM.getText().equals("") && !txtRaza_MM.getText().equals("") && !txtColor_MM.getText().equals("")) {
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
            cerrar = true;
        }
        if (cerrar == true) {
            actualizarAgenda();
            actualizarHistoriales();
            cerrar = false;
            dispose();
        }
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

    private void tablaModificarMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaModificarMMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaModificarMMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            actualizarAgendaEliminacion();
            actualizarMascotas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una mascota para eliminarla");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

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
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File mascotas = new File(Dir, "Mascotas.txt");
        if (!mascotas.exists()) { //No existe el archivo
            x.mkdir();
            try {
                mascotas.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
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
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File mascotas = new File(Dir, "Mascotas.txt");
        if (!mascotas.exists()) { //No existe el archivo
            x.mkdir();
            try {
                mascotas.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
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
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File mascotas = new File(Dir, "Mascotas.txt");
        if (!mascotas.exists()) { //No existe el archivo
            x.mkdir();
            try {
                mascotas.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
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

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz_Cliente.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Cliente.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    void Guardar() {
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File mascotas = new File(Dir, "Mascotas.txt");
        if (!mascotas.exists()) { //No existe el archivo
            x.mkdir();
            try {
                mascotas.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
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
    }


    void actualizarAgenda() {
        pasarDatosAgendaACambios(txtNombreP_MM.getText(), txtNombrePB.getText());
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

    void actualizarAgendaEliminacion() {
        pasarDatosAgendaACambiosEliminarMascota(txtNombrePB.getText(), Integer.parseInt(txtCedula_MC.getText()));
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

    void actualizarHistoriales() {
        pasarDatosHistorialACambios(txtNombreP_MM.getText(), txtNombrePB.getText());
        try {
            limpiarHistorial();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modificar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        pasarDatosCambiosAHistorial();
        try {
            limpiarCambios();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modificar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void actualizarMascotas() {
        pasarDatosMascotasACambios(txtNombreP_MM.getText(), Integer.parseInt(txtCedula_MC.getText()));
        try {
            limpiarMascotas();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modificar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        pasarDatosCambiosAMascotas();
        try {
            limpiarCambios();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Modificar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void pasarDatosAgendaACambios(String nombreActual, String nombreAnti) {
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
                if (nombrePerro.equals(nombreAnti)) {
                    nombrePerro = nombreActual;
                }
                String servicio = data[3];
                String fecha = data[4];
                String hora = data[5];
                String estado = data[6];
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

    void pasarDatosMascotasACambios(String nombreMascota, int CedulaD) {
        String ruta = "C:\\Veterinaria_PerrosPET"; // ruta para el archivo
        String fileName = "Mascotas.txt"; // nombre
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
                String nombrePerro = data[1];
                String razaPerro = data[2];
                String colorPerro = data[2];
                String fechaNacimiento = data[2];

                // comparar idBuscar con idPersona
                /*comprar y retornar
		return data[2]*/
                try {
                    if (CedulaD == idPersona && nombrePerro.equals(nombreMascota)) {

                    } else {
                        fw = new FileWriter(cambio, true);
                        PrintWriter pw = new PrintWriter(fw);
                        pw.print(idPersona + ";" + nombrePerro + ";" + razaPerro + ";" + colorPerro + ";" + fechaNacimiento + ";");
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

    void pasarDatosCambiosAMascotas() {
        String ruta = "C:\\Veterinaria_PerrosPET"; // ruta para el archivo
        String fileName = "Cambios.txt"; // nombre
        File archivo = new File(ruta, fileName); // instancia el archivo
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File mascotas = new File(Dir, "Mascotas.txt");
        if (!mascotas.exists()) { //No existe el archivo
            x.mkdir();
            try {
                mascotas.createNewFile();
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
                String nombrePerro = data[1];
                String razaPerro = data[2];
                String colorPerro = data[2];
                String fechaNacimiento = data[2];

                // comparar idBuscar con idPersona
                /*comprar y retornar
		return data[2]*/
                try {
                    fw = new FileWriter(mascotas, true);
                    PrintWriter pw = new PrintWriter(fw);
                    pw.print(idPersona + ";" + nombrePerro + ";" + razaPerro + ";" + colorPerro + ";" + fechaNacimiento + ";");
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

    void pasarDatosAgendaACambiosEliminarMascota(String nombreMascota, int cedulaDueño) {
        String ruta = "C:\\Veterinaria_PerrosPET"; // ruta para el archivo
        String fileName = "Agenda.txt"; // nombre
        File archivo = new File(ruta, fileName); // instancia el archivo
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File cambio = new File(Dir, "Cambioss.txt");
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
                    if (nombrePerro.equals(nombreMascota) && idPersona == cedulaDueño) {

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

    void limpiarMascotas() throws FileNotFoundException {
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File mascotas = new File(Dir, "Mascotas.txt");
        if (!mascotas.exists()) { //No existe el archivo
            x.mkdir();
            try {
                mascotas.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
        try {
            FileWriter fw = new FileWriter(mascotas);
            if (fw != null) {
                fw.close();
            }
            if (mascotas.delete()) {
                System.out.println("El archivo fue eliminado");
                mascotas.createNewFile();
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

    void pasarDatosHistorialACambios(String nombreActual, String nombreAnti) {
        String ruta = "C:\\Veterinaria_PerrosPET"; // ruta para el archivo
        String fileName = "Historiales.txt"; // nombre
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
                String nombrePerro = data[1];
                if (nombrePerro.equals(nombreAnti)) {
                    nombrePerro = nombreActual;
                }
                String fecha = data[2];
                String servicio = data[3];
                String diagnostico = data[4];
                String prescripcion = data[5];
                // comparar idBuscar con idPersona
                /*comprar y retornar
		return data[2]*/

                try {
                    fw = new FileWriter(cambio, true);
                    PrintWriter pw = new PrintWriter(fw);
                    pw.print(idPersona + ";" + nombrePerro + ";" + fecha + ";" + servicio + ";" + diagnostico + ";" + prescripcion + ";");
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

    void limpiarHistorial() throws FileNotFoundException {
           File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File historiales = new File(Dir, "Historiales.txt");
        if (!historiales.exists()) { //No existe el archivo
            x.mkdir();
            try {
                historiales.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
        try {
            FileWriter fw = new FileWriter(historiales);
            if (fw != null) {
                fw.close();
            }
            if (historiales.delete()) {
                System.out.println("El archivo fue eliminado");
                historiales.createNewFile();
            } else {
                System.out.println("El archivo agenda no se puede borrar");
            }

        } catch (IOException ex) {
            Logger.getLogger(AgregarHistorial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void pasarDatosCambiosAHistorial() {
        String ruta = "C:\\Veterinaria_PerrosPET"; // ruta para el archivo
        String fileName = "Cambios.txt"; // nombre
        File archivo = new File(ruta, fileName); // instancia el archivo
         File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File historiales = new File(Dir, "Historiales.txt");
        if (!historiales.exists()) { //No existe el archivo
            x.mkdir();
            try {
                historiales.createNewFile();
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
                String nombrePerro = data[1];
                String fecha = data[2];
                String servicio = data[3];
                String diagnostico = data[4];
                String prescripcion = data[5];
                // comparar idBuscar con idPersona
                /*comprar y retornar
		return data[2]*/

                try {
                    fw = new FileWriter(historiales, true);
                    PrintWriter pw = new PrintWriter(fw);
                    pw.print(idPersona + ";" + nombrePerro + ";" + fecha + ";" + servicio + ";" + diagnostico + ";" + prescripcion + ";");
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
