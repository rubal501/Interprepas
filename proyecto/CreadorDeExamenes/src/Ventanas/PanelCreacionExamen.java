/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Negocio.Controlador.ExamenControlador;
import Negocio.Modelo.Inciso;
import java.util.List;
import java.util.ArrayList;

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
        buttRegresar = new javax.swing.JButton();
        buttAgregarInciso = new javax.swing.JButton();
        buttFinalizarCreacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        buttRegresar.setText("Regresar");

        buttAgregarInciso.setText("Agregar");
        buttAgregarInciso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttAgregarIncisoActionPerformed(evt);
            }
        });

        buttFinalizarCreacion.setText("Finalizar");
        buttFinalizarCreacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttFinalizarCreacionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setText("Creacion de Examen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1)))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttRegresar)
                .addGap(32, 32, 32)
                .addComponent(buttAgregarInciso)
                .addGap(32, 32, 32)
                .addComponent(buttFinalizarCreacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttFinalizarCreacion)
                    .addComponent(buttRegresar)
                    .addComponent(buttAgregarInciso))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttFinalizarCreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttFinalizarCreacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttFinalizarCreacionActionPerformed

    private void buttAgregarIncisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttAgregarIncisoActionPerformed
        for (JTextField campoDeTexto : camposDeTexto) {
            if (campoDeTexto.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Llena el formulario antes de continuar");
                return;
            }
        }
        
        String pregunta = txtPregunta.getText();
        List<String> respuestas = new ArrayList<String>();
        int respuestaCorrecta = cmbRespuestaCorrecta.getSelectedIndex();
        
        respuestas.add(txtPrimeraRespuesta.getText());
        respuestas.add(txtSegundaRespuesta.getText());
        respuestas.add(txtTerceraRespuesta.getText());
        respuestas.add(txtCuartaRespuesta.getText());
        
        Inciso inciso = new Inciso (pregunta, respuestaCorrecta, respuestas);
        ExamenControlador.GuardarRegistro(inciso);
        
        for (JTextField campoDeTexto : camposDeTexto)
            campoDeTexto.setText("");
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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttAgregarInciso;
    private javax.swing.JButton buttFinalizarCreacion;
    private javax.swing.JButton buttRegresar;
    private javax.swing.JComboBox<String> cmbRespuestaCorrecta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCuartaRespuesta;
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
