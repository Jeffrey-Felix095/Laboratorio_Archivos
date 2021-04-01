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
public class Modificar_Cliente extends javax.swing.JFrame {

    int cedula = Cliente.Cedula();
    String[][] M;
    int n;
    String[][] MA;
    int nA;

    public Modificar_Cliente() {
        initComponents();
        mostrarDatos(cedula);
        String[] column = {"Cedula", "Nombre", "Telefono", "Direccion", "Correo"};
        DefaultTableModel model = new DefaultTableModel(column, 0);
        tablaModificar.setModel(model);
        TomarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        txtNombre_MC = new javax.swing.JTextField();
        txtCedula_MC = new javax.swing.JTextField();
        btnModificar_Cliente = new javax.swing.JButton();
        txtCorreo_MC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lolo = new javax.swing.JLabel();
        txtDireccion_MC = new javax.swing.JTextField();
        txtTelefono_MC = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaModificar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("←");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtNombre_MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 191, 190, -1));

        txtCedula_MC.setEditable(false);
        getContentPane().add(txtCedula_MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 191, 190, -1));

        btnModificar_Cliente.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnModificar_Cliente.setText("Modificar");
        btnModificar_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar_ClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 310, 185, 58));
        getContentPane().add(txtCorreo_MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 275, 187, -1));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel7.setText("Nombre:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 189, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel8.setText("Telefono:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 231, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel10.setText("Direccion:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 231, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel11.setText("Cedula:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 189, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Correo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 273, -1, -1));

        lolo.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        lolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lolo.setText("Datos personales");
        getContentPane().add(lolo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));
        getContentPane().add(txtDireccion_MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 233, 187, -1));
        getContentPane().add(txtTelefono_MC, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 233, 187, -1));

        tablaModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaModificar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 75, -1, 96));

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setText("Cargar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 109, -1, -1));

        jButton3.setText("←");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/91522.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 180, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoBlanco.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 690, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificar_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar_ClienteActionPerformed
        boolean valido = false;
        for (int i = 0; i < n; i++) {
            if (M[i][0].compareTo(txtCedula_MC.getText()) == 0) {
                M[i][1] = txtNombre_MC.getText();
                M[i][2] = txtTelefono_MC.getText();
                try {
                    int telefono = Integer.parseInt(M[i][2]);
                    valido = true;
                } catch (Exception e) {
                    if (!txtNombre_MC.getText().equals("") || !txtDireccion_MC.getText().equals("") || !txtCorreo_MC.getText().equals("")) {
                        JOptionPane.showMessageDialog(rootPane, "El telefono deben ser solo numeros");

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos");
                    }
                }
                M[i][3] = txtDireccion_MC.getText();
                M[i][4] = txtCorreo_MC.getText();
            }
        }
        if (valido == true && (!txtNombre_MC.getText().equals("") || !txtDireccion_MC.getText().equals("") || !txtCorreo_MC.getText().equals(""))) {
            try {
                limpiar();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Modificar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            Guardar();
            Actualizar();
            actualizarAgenda();
            TomarDatos();
            DefaultTableModel model = (DefaultTableModel) tablaModificar.getModel();
            for (int i = 0; i < n; i++) {
                if (M[i][0].compareTo(txtCedula_MC.getText()) == 0) {
                    String[] FILA = {M[i][0], M[i][1], M[i][2], M[i][3], M[i][4]};
                    model.addRow(FILA);
                    tablaModificar.setModel(model);
                }
            }
            dispose();
        } else {
            if (valido == true) {
                JOptionPane.showMessageDialog(rootPane, "Debe rellenar todos los campos");
            }
        }

    }//GEN-LAST:event_btnModificar_ClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TomarDatos();
        DefaultTableModel model = (DefaultTableModel) tablaModificar.getModel();
        for (int i = 0; i < n; i++) {
            if (M[i][0].compareTo(txtCedula_MC.getText()) == 0) {
                String[] FILA = {M[i][0], M[i][1], M[i][2], M[i][3], M[i][4]};
                model.addRow(FILA);
                tablaModificar.setModel(model);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cliente pantalla_Cliente = new Cliente();
        pantalla_Cliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public Boolean mostrarDatos(int cedulaIngresada) {
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
                    txtCedula_MC.setText(Integer.toString(idPersona));
                    txtNombre_MC.setText(nombre);
                    txtTelefono_MC.setText(Integer.toString(telefono));
                    txtDireccion_MC.setText(direccion);
                    txtCorreo_MC.setText(correo);
                    return true;
                }

            }//fin while
        } catch (IOException e) {
            System.out.println("Error");
        }
        return false;
    }

    void actualizarAgenda() {
        pasarDatosAgendaACambios(txtNombre_MC.getText(), Integer.parseInt(txtCedula_MC.getText()));
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

    void pasarDatosAgendaACambios(String nombreA, int id) {
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
                String nombre;
                if (id == idPersona) {
                    nombre = nombreA;
                } else {
                    nombre = data[1];
                }
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

    
    
    void Actualizar() {
        DefaultTableModel Model = (DefaultTableModel) tablaModificar.getModel();
        Model.setRowCount(0);
        for (int i = 0; i < n; i++) {
            String[] v = {M[i][0], M[i][1], M[i][2], M[i][3], M[i][4]};
            Model.addRow(v);
            tablaModificar.setModel(Model);
        }
    }

    void limpiar() throws FileNotFoundException {
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File cliente = new File(Dir, "Clientes.txt");
        if (!cliente.exists()) { //No existe el archivo
            x.mkdir();
            try {
                cliente.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
        try {
            FileWriter fw = new FileWriter(cliente);
            if (fw != null) {
                fw.close();
            }
            if (cliente.delete()) {
                System.out.println("El archivo fue eliminado");
                cliente.createNewFile();
            } else {
                System.out.println("El archivo no se puede borrar");
            }

        } catch (IOException ex) {
            Logger.getLogger(Modificar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    int ContarDatos() {
        File x = new File("C:\\Veterinaria_PerrosPET");
        String Dir = "C:\\Veterinaria_PerrosPET";
        File Clientes = new File(Dir, "Clientes.txt");
        if (!Clientes.exists()) { //No existe el archivo
            x.mkdir();
            try {
                Clientes.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
        FileReader fw;
        int cont = 0;
        try {
            fw = new FileReader(Clientes);
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
        File Clientes = new File(Dir, "Clientes.txt");
        if (!Clientes.exists()) { //No existe el archivo
            x.mkdir();
            try {
                Clientes.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
        FileReader fw;
        try {
            fw = new FileReader(Clientes);
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
        File Clientes = new File(Dir, "Clientes.txt");
        if (!Clientes.exists()) { //No existe el archivo
            x.mkdir();
            try {
                Clientes.createNewFile();
            } catch (IOException ex) {
                System.out.println("Error");
            }
        }
        FileWriter fw = null;
        try {
            fw = new FileWriter(Clientes, true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lolo;
    private javax.swing.JTable tablaModificar;
    private javax.swing.JTextField txtCedula_MC;
    private javax.swing.JTextField txtCorreo_MC;
    private javax.swing.JTextField txtDireccion_MC;
    private javax.swing.JTextField txtNombre_MC;
    private javax.swing.JTextField txtTelefono_MC;
    // End of variables declaration//GEN-END:variables
}
