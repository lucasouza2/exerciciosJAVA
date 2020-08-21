package telas;

import classes.ArrayDeNumeros;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
//Atributos

    private ArrayDeNumeros conjunto;

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        conjunto = new ArrayDeNumeros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFNumero = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBAdiciona = new javax.swing.JButton();
        jBInverter = new javax.swing.JButton();
        jBSoma = new javax.swing.JButton();
        jBPreencher = new javax.swing.JButton();
        jBMaiormenor = new javax.swing.JButton();
        jBIndice = new javax.swing.JButton();
        jBTrocar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AppArray");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor:"));

        jLabel1.setText("Número:");

        jTFNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Operações"));

        jBAdiciona.setText("Adiciona");
        jBAdiciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionaActionPerformed(evt);
            }
        });

        jBInverter.setText("Inverter");
        jBInverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInverterActionPerformed(evt);
            }
        });

        jBSoma.setText("Soma");
        jBSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomaActionPerformed(evt);
            }
        });

        jBPreencher.setText("Preencher");
        jBPreencher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPreencherActionPerformed(evt);
            }
        });

        jBMaiormenor.setText("Ordem Crescente");
        jBMaiormenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMaiormenorActionPerformed(evt);
            }
        });

        jBIndice.setText("Indice");
        jBIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIndiceActionPerformed(evt);
            }
        });

        jBTrocar.setText("Trocar");
        jBTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTrocarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBTrocar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBIndice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBMaiormenor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPreencher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBSoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAdiciona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBInverter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBAdiciona)
                .addGap(13, 13, 13)
                .addComponent(jBPreencher, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBSoma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBInverter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBMaiormenor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBIndice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBTrocar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado:"));

        jTFResultado.setColumns(20);
        jTFResultado.setRows(5);
        jTFResultado.setTabSize(3);
        jScrollPane1.setViewportView(jTFResultado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNumeroActionPerformed

    private void jBAdicionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionaActionPerformed
        if (jTFNumero.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe o valor", "Aviso", JOptionPane.WARNING_MESSAGE);
            jTFNumero.setText(null);
            jTFNumero.requestFocusInWindow();
            return;
        }
        if (!conjunto.add(Integer.parseInt(jTFNumero.getText()))) {
            JOptionPane.showMessageDialog(this, "Espaço insuficiente!!!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
        jTFResultado.setText(conjunto.dados());
        jTFNumero.setText(null);
        jTFNumero.requestFocusInWindow();
    }//GEN-LAST:event_jBAdicionaActionPerformed

    private void jBInverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInverterActionPerformed
        conjunto.invertenumeros();
        jTFResultado.setText(conjunto.dados());
    }//GEN-LAST:event_jBInverterActionPerformed

    private void jBSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomaActionPerformed
        conjunto.soma();
        jTFResultado.setText(conjunto.dados());
    }//GEN-LAST:event_jBSomaActionPerformed

    private void jBPreencherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPreencherActionPerformed
        conjunto.adicionaAle();
        jTFResultado.setText(conjunto.dados());
    }//GEN-LAST:event_jBPreencherActionPerformed

    private void jBMaiormenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMaiormenorActionPerformed
        conjunto.menorMaior();
        jTFResultado.setText(conjunto.dados());
    }//GEN-LAST:event_jBMaiormenorActionPerformed

    private void jBIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIndiceActionPerformed
        String num = JOptionPane.showInputDialog(null, "Informe o numero desejado", "Indice", 0);
        String resultado = " ";
        
        if (num.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um numero", "ERRO", 0);
        } else if (conjunto.indice(Integer.parseInt(num))==0) {
            JOptionPane.showMessageDialog(null, "NÃO CONSTA O NUMERO INFORMADO!", "ERRO", 0);
        } else {
            int numC = Integer.parseInt(num);
            for (int i = 0; i < conjunto.procurar(numC).length; i++) {
                resultado += conjunto.procurar(numC)[i] + "\t";
            }
            jTFResultado.setText(conjunto.dados() + "\n\n" + "posição" + "\n" + resultado);
        }
    }//GEN-LAST:event_jBIndiceActionPerformed

    private void jBTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTrocarActionPerformed
        int numeroAtrocar = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero que deseja trocar","Aviso",0));
        
        
    }//GEN-LAST:event_jBTrocarActionPerformed

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
    private javax.swing.JButton jBAdiciona;
    private javax.swing.JButton jBIndice;
    private javax.swing.JButton jBInverter;
    private javax.swing.JButton jBMaiormenor;
    private javax.swing.JButton jBPreencher;
    private javax.swing.JButton jBSoma;
    private javax.swing.JButton jBTrocar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextArea jTFResultado;
    // End of variables declaration//GEN-END:variables
}
