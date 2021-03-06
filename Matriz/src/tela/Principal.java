/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import classe.MatrizDeInteiros;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Principal extends javax.swing.JFrame {

    private MatrizDeInteiros construtor;

    public Principal() {
        initComponents();
        setResizable(false);
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

        jBPreenche = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAResultado = new javax.swing.JTextArea();
        jBSoma = new javax.swing.JButton();
        jBPosicao = new javax.swing.JButton();
        jBSomaLinha = new javax.swing.JButton();
        jBSomaColuna = new javax.swing.JButton();
        jBTransposta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBPreenche.setText("Preenche");
        jBPreenche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPreencheActionPerformed(evt);
            }
        });

        jTAResultado.setColumns(20);
        jTAResultado.setRows(5);
        jTAResultado.setTabSize(1);
        jScrollPane1.setViewportView(jTAResultado);

        jBSoma.setText("Somar Matriz");
        jBSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomaActionPerformed(evt);
            }
        });

        jBPosicao.setText("Retorna Posição");
        jBPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPosicaoActionPerformed(evt);
            }
        });

        jBSomaLinha.setText("Soma Linha");
        jBSomaLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomaLinhaActionPerformed(evt);
            }
        });

        jBSomaColuna.setText("Soma Coluna");
        jBSomaColuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomaColunaActionPerformed(evt);
            }
        });

        jBTransposta.setText("Transposta");
        jBTransposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTranspostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBSomaLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPreenche, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSoma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPosicao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSomaColuna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBTransposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBPreenche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSoma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPosicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSomaLinha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSomaColuna)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBTransposta))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBPreencheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPreencheActionPerformed
        construtor = new MatrizDeInteiros(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o tamanho de linhas ")), Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o tamanho de colunas")));
        construtor.adicionaMatriz();
        jTAResultado.setText(construtor.dados());

    }//GEN-LAST:event_jBPreencheActionPerformed

    private void jBSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomaActionPerformed
        jTAResultado.setText(construtor.dados() + "\nA soma dos valores é :" + construtor.somarMatriz());
    }//GEN-LAST:event_jBSomaActionPerformed

    private void jBPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPosicaoActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual número deseja procurar?"));
        int matrizResp[][] = construtor.returnPos(numero);
        String resultado = "";
        for (int l = 0; l < matrizResp.length; l++) {
            for (int c = 0; c < matrizResp[l].length; c++) {
                resultado += matrizResp[l][c] + " ";
            }
            resultado += "\n";
        }

        jTAResultado.setText(jTAResultado.getText() + "\nRetorne Posição \n" + resultado);
    }//GEN-LAST:event_jBPosicaoActionPerformed

    private void jBSomaLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomaLinhaActionPerformed
        int[] resp = construtor.somaLinha();
        StringBuilder resposta = new StringBuilder("Soma das linhas:\n");
        for (int linhas = 0; linhas < resp.length; linhas++) {
            resposta.append(resp[linhas] + "\n");
        }
        jTAResultado.setText(jTAResultado.getText()+ "\n" +resposta.toString());
        
    }//GEN-LAST:event_jBSomaLinhaActionPerformed

    private void jBSomaColunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomaColunaActionPerformed
        int[] resp = construtor.somaColuna();
        StringBuilder resposta = new StringBuilder("Soma das linhas:\n");
        for (int colunas = 0; colunas < resp.length; colunas++) {
            resposta.append(resp[colunas]+"\t" );
        }
        jTAResultado.setText(jTAResultado.getText()+resposta.toString());
        
    }//GEN-LAST:event_jBSomaColunaActionPerformed

    private void jBTranspostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTranspostaActionPerformed
        int resp[][] = construtor.testar();
        StringBuilder output = new StringBuilder("Transposta:\n");
        for(int l = 0; l < resp.length; l++){
            for(int c = 0; c < resp[l].length; c++){
                output.append(resp[l][c] + " ");
            }
            output.append("\n");
        }
        jTAResultado.setText(jTAResultado.getText() + "\n" + output.toString());
    }//GEN-LAST:event_jBTranspostaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBPosicao;
    private javax.swing.JButton jBPreenche;
    private javax.swing.JButton jBSoma;
    private javax.swing.JButton jBSomaColuna;
    private javax.swing.JButton jBSomaLinha;
    private javax.swing.JButton jBTransposta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAResultado;
    // End of variables declaration//GEN-END:variables
}
