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
public class AgendaCompleta extends javax.swing.JFrame {

    /**
     * Creates new form AgendaCompleta
     */
    public AgendaCompleta() {
        initComponents();
        String[] columnas = {"Cedula del dueño", "Nombre del dueño", "Nombre del perro", "Servicio", "Fecha de la cita", "Hora", "Estado", "Valor de servicio"};
        DefaultTableModel model2 = new DefaultTableModel(columnas, 0);
        TablaCitas.setModel(model2);
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
        TablaCitas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaCitas);

        jButton1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoBlanco.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 789, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    void MostrarCitas() {
        DefaultTableModel model = (DefaultTableModel) TablaCitas.getModel();
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
                String Datos[] = {String.valueOf(cedulaDueño), nombreDueño, nombrePerro, servicio, fechaCita, hora, estado, String.valueOf(valor)};
                model.addRow(Datos);
                TablaCitas.setModel(model);
//                System.out.println(cliente.getCedula());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_Cliente.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(AgendaCompleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaCompleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaCompleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaCompleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaCompleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaCitas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
