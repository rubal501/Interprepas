/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Negocio.Controlador.ExamenControlador;
import Negocio.Modelo.Examen;
import Negocio.Modelo.Inciso;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ROOT
 */
public class ExamenAlumno extends javax.swing.JFrame {

    /**
     * Creates new form ExamenAlumno
     */
    public ExamenAlumno() {
        initComponents();
        
        conectarBD();
        grupoBotones.add(radA);
        grupoBotones.add(radB);
        grupoBotones.add(radC);
        grupoBotones.add(radD);    
    }
    
    void conectarBD() {
        Inciso inciso = new Inciso();
        inciso = ExamenControlador.CargarRegistrosBD();
        refrescarEtiquetas(inciso);
    }
    
    void refrescarEtiquetas(Inciso inciso) {
        List<String> respuestas = inciso.getRespuestas();
        lblPregunta.setText(inciso.getPregunta());
        lblA.setText(respuestas.get(0));
        lblB.setText(respuestas.get(1));
        lblC.setText(respuestas.get(2));
        lblD.setText(respuestas.get(3));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblPregunta = new javax.swing.JLabel();
        radA = new javax.swing.JRadioButton();
        radB = new javax.swing.JRadioButton();
        radC = new javax.swing.JRadioButton();
        radD = new javax.swing.JRadioButton();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        lblD = new javax.swing.JLabel();
        buttAnterior = new javax.swing.JButton();
        buttSiguiente = new javax.swing.JButton();
        buttRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setText("Examen");

        lblPregunta.setText("Pregunta");

        radA.setText("a)");
        radA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radAActionPerformed(evt);
            }
        });

        radB.setText("b)");

        radC.setText("c)");

        radD.setText("d)");

        lblA.setText("Respuesta 'a'");

        lblB.setText("Respuesta 'b'");

        lblC.setText("Respuesta 'c'");

        lblD.setText("Respuesta 'd'");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPregunta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblB))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblA))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblC))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblD)))))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPregunta)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radA)
                    .addComponent(lblA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radB)
                    .addComponent(lblB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radC)
                    .addComponent(lblC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radD)
                    .addComponent(lblD))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttAnterior.setText("<-");
        buttAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttAnteriorActionPerformed(evt);
            }
        });

        buttSiguiente.setText("->");
        buttSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttSiguienteActionPerformed(evt);
            }
        });

        buttRegresar.setText("Regresar");
        buttRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(buttAnterior)
                .addGap(64, 64, 64)
                .addComponent(buttRegresar)
                .addGap(64, 64, 64)
                .addComponent(buttSiguiente)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttAnterior)
                    .addComponent(buttSiguiente)
                    .addComponent(buttRegresar))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radAActionPerformed

    private void buttRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttRegresarActionPerformed
        this.dispose();
        PanelCreacionExamen ventana = new PanelCreacionExamen();
        ventana.setVisible(true);
    }//GEN-LAST:event_buttRegresarActionPerformed

    private void buttAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttAnteriorActionPerformed
        Inciso inciso = ExamenControlador.AnteriorBD();
        refrescarEtiquetas(inciso);
    }//GEN-LAST:event_buttAnteriorActionPerformed

    private void buttSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttSiguienteActionPerformed
        Inciso inciso = ExamenControlador.SiguienteBD();
        refrescarEtiquetas(inciso);
    }//GEN-LAST:event_buttSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(ExamenAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamenAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamenAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamenAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamenAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttAnterior;
    private javax.swing.JButton buttRegresar;
    private javax.swing.JButton buttSiguiente;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblD;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JRadioButton radA;
    private javax.swing.JRadioButton radB;
    private javax.swing.JRadioButton radC;
    private javax.swing.JRadioButton radD;
    // End of variables declaration//GEN-END:variables
}
