/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Negocio.Controlador.Conexion;
import Negocio.Controlador.ExamenControlador;
import Negocio.Modelo.Inciso;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author ROOT
 */
public class PanelCreacionExamen extends javax.swing.JFrame {

    List<JTextField> camposDeTexto;

    /**
     * Creates new form PanelCreacionExamen
     */
    public PanelCreacionExamen() {
        initComponents();

        camposDeTexto = new ArrayList<JTextField>();
        camposDeTexto.add(txtPregunta);
        camposDeTexto.add(txtPrimeraRespuesta);
        camposDeTexto.add(txtSegundaRespuesta);
        camposDeTexto.add(txtTerceraRespuesta);
        camposDeTexto.add(txtCuartaRespuesta);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblSegundaRespuesta = new javax.swing.JLabel();
        lblPrimeraRespuesta = new javax.swing.JLabel();
        lblCuartaRespuesta = new javax.swing.JLabel();
        txtPregunta = new javax.swing.JTextField();
        lblTerceraRespuesta = new javax.swing.JLabel();
        txtPrimeraRespuesta = new javax.swing.JTextField();
        txtSegundaRespuesta = new javax.swing.JTextField();
        txtCuartaRespuesta = new javax.swing.JTextField();
        lblRespuestaCorrecta = new javax.swing.JLabel();
        txtTerceraRespuesta = new javax.swing.JTextField();
        cmbRespuestaCorrecta = new javax.swing.JComboBox<>();
        lblTextoPregunta = new javax.swing.JLabel();
        buttContestar = new javax.swing.JButton();
        buttAgregarInciso = new javax.swing.JButton();
        buttSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbAsignatura = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblGrado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setToolTipText("");

        lblSegundaRespuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSegundaRespuesta.setText("b)");

        lblPrimeraRespuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrimeraRespuesta.setText("a)");

        lblCuartaRespuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCuartaRespuesta.setText("d)");

        txtPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreguntaActionPerformed(evt);
            }
        });

        lblTerceraRespuesta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTerceraRespuesta.setText("c)");

        lblRespuestaCorrecta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRespuestaCorrecta.setText("Respuesta correcta");

        txtTerceraRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerceraRespuestaActionPerformed(evt);
            }
        });

        cmbRespuestaCorrecta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "a", "b", "c", "d" }));
        cmbRespuestaCorrecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRespuestaCorrectaActionPerformed(evt);
            }
        });

        lblTextoPregunta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTextoPregunta.setText("Pregunta: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblRespuestaCorrecta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbRespuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTextoPregunta)
                    .addComponent(lblPrimeraRespuesta)
                    .addComponent(lblSegundaRespuesta)
                    .addComponent(lblTerceraRespuesta)
                    .addComponent(lblCuartaRespuesta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPregunta)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrimeraRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSegundaRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTerceraRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCuartaRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 42, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTextoPregunta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrimeraRespuesta)
                    .addComponent(txtPrimeraRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSegundaRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundaRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTerceraRespuesta)
                    .addComponent(txtTerceraRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuartaRespuesta)
                    .addComponent(txtCuartaRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRespuestaCorrecta)
                    .addComponent(cmbRespuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        buttContestar.setText("Contestar");
        buttContestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttContestarActionPerformed(evt);
            }
        });

        buttAgregarInciso.setText("Agregar");
        buttAgregarInciso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttAgregarIncisoActionPerformed(evt);
            }
        });

        buttSalir.setText("Salir");
        buttSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setText("Creacion de Examen");

        jLabel2.setText("Asignatura:");

        cmbAsignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "1400 - Matemáticas IV", "1401 - Geografía", "1402 - Historia Universal", "1500 - Matemáticas V", "1501 - Biología", "1502 - Historia de México", "1600 - Matemáticas VI", "1601 - Derecho", "1602 - Química" }));
        cmbAsignatura.setToolTipText("");
        cmbAsignatura.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbAsignaturaItemStateChanged(evt);
            }
        });

        jLabel3.setText("Grado:");

        lblGrado.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblGrado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttContestar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttAgregarInciso)
                        .addGap(91, 91, 91)
                        .addComponent(buttSalir)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblGrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttAgregarInciso)
                    .addComponent(buttContestar)
                    .addComponent(buttSalir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttSalirActionPerformed
        for (JTextField campoDeTexto : camposDeTexto) {
            if (!campoDeTexto.getText().equals("")) {
                int respuestaMensaje = JOptionPane.showConfirmDialog(null, "Se detectaron cambios pendientes. ¿Continuar sin guardar los cambios actuales?", "Cambios detectados", JOptionPane.YES_NO_OPTION);
                if (respuestaMensaje == JOptionPane.YES_OPTION) {
                    this.dispose();
                } else {
                    return;
                }
            }
        }

        int respuestaMensaje = JOptionPane.showConfirmDialog(null, "¿Salir del programa?", "Confirmar salida", JOptionPane.YES_NO_OPTION);
        if (respuestaMensaje == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_buttSalirActionPerformed

    private void buttAgregarIncisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttAgregarIncisoActionPerformed
        //si falta alguna cosa por llenar
        for (JTextField campoDeTexto : camposDeTexto) {
            if (campoDeTexto.getText().equals("") || cmbAsignatura.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Faltan campos por llenar.");
                return;
            }
        }

        //si el formato del elemento seleccionado de cmbAsignatura es correcto
        char grado;
        String claveAsignatura;
        String asignatura;

        asignatura = (String) cmbAsignatura.getSelectedItem();
        grado = asignatura.charAt(1);
        List<String> respuestas = new ArrayList<String>();
        lblGrado.setText(String.valueOf(grado - 48));

        String pregunta = txtPregunta.getText();
        int respuestaCorrecta = cmbRespuestaCorrecta.getSelectedIndex();

        respuestas.add(txtPrimeraRespuesta.getText());
        respuestas.add(txtSegundaRespuesta.getText());
        respuestas.add(txtTerceraRespuesta.getText());
        respuestas.add(txtCuartaRespuesta.getText());

        claveAsignatura = asignatura.substring(0, 4);

        try {
            Inciso inciso = new Inciso(pregunta, grado, respuestaCorrecta, respuestas, claveAsignatura);

            ExamenControlador.GuardarRegistroBD(inciso);
            JOptionPane.showMessageDialog(null, "Se ha agregado correctamente al inciso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el inciso debido a un error interno, intentelo más tarde");
        }
//        Alejandro cree que esta aprte funciona para enviar errores que especificamente
//        esten relacionados a la base de datos

        for (JTextField campoDeTexto : camposDeTexto) {
            campoDeTexto.setText("");
        }
    }//GEN-LAST:event_buttAgregarIncisoActionPerformed

    private void cmbRespuestaCorrectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRespuestaCorrectaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRespuestaCorrectaActionPerformed

    private void txtTerceraRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerceraRespuestaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTerceraRespuestaActionPerformed

    private void txtPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreguntaActionPerformed

    private void buttContestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttContestarActionPerformed
        for (JTextField campoDeTexto : camposDeTexto) {
            if (!campoDeTexto.getText().equals("")) {
                int respuestaMensaje = JOptionPane.showConfirmDialog(null, "Se detectaron cambios pendientes. ¿Continuar sin guardar los cambios actuales?", "Cambios detectados", JOptionPane.YES_NO_OPTION);
                if (respuestaMensaje == JOptionPane.YES_OPTION) {
                    break;
                } else {
                    return;
                }
            }
        }

        this.dispose();
        ExamenAlumno ventana = new ExamenAlumno();
        ventana.setVisible(true);
    }//GEN-LAST:event_buttContestarActionPerformed

    private void cmbAsignaturaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbAsignaturaItemStateChanged
        String asignatura = (String) cmbAsignatura.getSelectedItem();
        char grado = asignatura.charAt(1);
        if ((int) grado != 45) {
            lblGrado.setText(String.valueOf(grado - 48));
        } else {
            lblGrado.setText("--");
        }
    }//GEN-LAST:event_cmbAsignaturaItemStateChanged

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
            java.util.logging.Logger.getLogger(PanelCreacionExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelCreacionExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelCreacionExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelCreacionExamen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelCreacionExamen().setVisible(true);
            }
        });

        try {
            Conexion.crearConexion();
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("a");
        }
        /*
        try {
            Conexion.ejecutarSQL("insert into incisos values(\"1114\", \"preg\","
                                 + "\"r1\", \"r2\", \"r3\", \"r4\", \"1\", "
                                 + "\"6\", \"1402\")");
        } catch (SQLException ex) {
            System.out.println("z");
        }*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttAgregarInciso;
    private javax.swing.JButton buttContestar;
    private javax.swing.JButton buttSalir;
    private javax.swing.JComboBox<String> cmbAsignatura;
    private javax.swing.JComboBox<String> cmbRespuestaCorrecta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCuartaRespuesta;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblPrimeraRespuesta;
    private javax.swing.JLabel lblRespuestaCorrecta;
    private javax.swing.JLabel lblSegundaRespuesta;
    private javax.swing.JLabel lblTerceraRespuesta;
    private javax.swing.JLabel lblTextoPregunta;
    private javax.swing.JTextField txtCuartaRespuesta;
    private javax.swing.JTextField txtPregunta;
    private javax.swing.JTextField txtPrimeraRespuesta;
    private javax.swing.JTextField txtSegundaRespuesta;
    private javax.swing.JTextField txtTerceraRespuesta;
    // End of variables declaration//GEN-END:variables
}
