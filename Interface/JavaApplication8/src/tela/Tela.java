/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import Interface.Circulo;
import Interface.ConjuntoFormasGeometricas;
import Interface.Quadrado;
import Interface.Retangulo;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Tela extends javax.swing.JFrame {

    private ConjuntoFormasGeometricas conj;

    public Tela() {
        initComponents();
        conj = new ConjuntoFormasGeometricas();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTOpcoes = new javax.swing.JTabbedPane();
        jPQuadrado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTLado = new javax.swing.JTextField();
        jPCirculo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTRaio = new javax.swing.JTextField();
        jPRetangulo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTBase = new javax.swing.JTextField();
        jTAltura = new javax.swing.JTextField();
        jBAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lado:");

        jTLado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTLadoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPQuadradoLayout = new javax.swing.GroupLayout(jPQuadrado);
        jPQuadrado.setLayout(jPQuadradoLayout);
        jPQuadradoLayout.setHorizontalGroup(
            jPQuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPQuadradoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTLado, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 205, Short.MAX_VALUE))
        );
        jPQuadradoLayout.setVerticalGroup(
            jPQuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPQuadradoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPQuadradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTLado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTOpcoes.addTab("Quadrado", jPQuadrado);

        jLabel2.setText("Raio:");

        jTRaio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTRaioActionPerformed(evt);
            }
        });
        jTRaio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTRaioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPCirculoLayout = new javax.swing.GroupLayout(jPCirculo);
        jPCirculo.setLayout(jPCirculoLayout);
        jPCirculoLayout.setHorizontalGroup(
            jPCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCirculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTRaio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPCirculoLayout.setVerticalGroup(
            jPCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCirculoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPCirculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTRaio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTOpcoes.addTab("Circulo", jPCirculo);

        jLabel3.setText("Base:");

        jLabel4.setText("Altura:");

        jTBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTBaseKeyPressed(evt);
            }
        });

        jTAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAlturaActionPerformed(evt);
            }
        });
        jTAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTAlturaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPRetanguloLayout = new javax.swing.GroupLayout(jPRetangulo);
        jPRetangulo.setLayout(jPRetanguloLayout);
        jPRetanguloLayout.setHorizontalGroup(
            jPRetanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRetanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTBase, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPRetanguloLayout.setVerticalGroup(
            jPRetanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRetanguloLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPRetanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTOpcoes.addTab("Retangulo", jPRetangulo);

        jBAdd.setText("Add");
        jBAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddActionPerformed(evt);
            }
        });

        jTResultado.setColumns(20);
        jTResultado.setRows(5);
        jTResultado.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado:"));
        jScrollPane1.setViewportView(jTResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTOpcoes)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jBAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTRaioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTRaioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTRaioActionPerformed

    private void jTAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAlturaActionPerformed

    private void jBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddActionPerformed
        if (jTOpcoes.getSelectedIndex() == 0) {
            if (jTLado.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha o lado do quadrado", "Aviso", 0);
                jTLado.setText(null);
                jTLado.requestFocusInWindow();
                return;
            }
            conj.add(new Quadrado(Float.parseFloat(jTLado.getText().trim())));
            jTLado.setText(null);
            jTLado.requestFocusInWindow();
        } else if (jTOpcoes.getSelectedIndex() == 1) {
            if (jTRaio.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha o Raio", "Aviso", 0);
                jTRaio.setText(null);
                jTRaio.requestFocusInWindow();
                return;
            }
            conj.add(new Circulo(Float.parseFloat(jTRaio.getText().trim())));
            jTRaio.setText(null);
            jTRaio.requestFocusInWindow();
        } else if (jTOpcoes.getSelectedIndex() == 2) {
            if (jTBase.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha a Base do Retangulo", "Aviso", 0);
                jTBase.setText(null);
                jTBase.requestFocusInWindow();
                return;
            }

            if (jTAltura.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha a Altura do Retangulo", "Aviso", 0);
                jTAltura.setText(null);
                jTAltura.requestFocusInWindow();
                return;
            }
            conj.add(new Retangulo(Float.parseFloat(jTBase.getText().trim()), Float.parseFloat(jTAltura.getText().trim())));
            jTBase.setText(null);
            jTAltura.setText(null);
            jTBase.requestFocusInWindow();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma Forma Geometrica", "Aviso", 0);
            return;
        }
        jTResultado.setText(conj.dadosFormasGeometricas());
    }//GEN-LAST:event_jBAddActionPerformed

    private void jTBaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTBaseKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTAltura.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTBaseKeyPressed

    private void jTAlturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTAlturaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           jBAdd.doClick();
                   
        }
    }//GEN-LAST:event_jTAlturaKeyPressed

    private void jTRaioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTRaioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           jBAdd.doClick();}
    }//GEN-LAST:event_jTRaioKeyPressed

    private void jTLadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTLadoKeyPressed
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           jBAdd.doClick();}
    }//GEN-LAST:event_jTLadoKeyPressed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPCirculo;
    private javax.swing.JPanel jPQuadrado;
    private javax.swing.JPanel jPRetangulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAltura;
    private javax.swing.JTextField jTBase;
    private javax.swing.JTextField jTLado;
    private javax.swing.JTabbedPane jTOpcoes;
    private javax.swing.JTextField jTRaio;
    private javax.swing.JTextArea jTResultado;
    // End of variables declaration//GEN-END:variables
}