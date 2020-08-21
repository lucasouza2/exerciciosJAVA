
package Tela;

import Jogo.JogoDaForca;
import Jogo.Palavra;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Tela extends javax.swing.JFrame {
    
    JogoDaForca jogo = new JogoDaForca();

    Random random = new Random();
    int erros=6;
    Palavra classe=jogo.sorteiaPalavra();
    String palavra= classe.getTextoDaPalavra();
    String[] palavraVetor= jogo.codificaPalavra(palavra);
    String palavraCodificada="";
    String dica= classe.getDica();
    String letrasUsadas="";
    ImageIcon imagemForca;
    
    
    public Tela() {
        initComponents();
        setLocationRelativeTo(null);
        jLPalavra.setText(jogo.transcrevePalavra(palavraVetor));
        jLDicas.setText(dica);
        imagemForca= new ImageIcon(getClass().getResource("forca.jpg"));
        ImageIcon botao = new ImageIcon(getClass().getResource("logotipo.jpg"));
        jBJogar.setIcon(botao);
        jLFoto.setIcon(imagemForca);
        jLErros.setText(String.valueOf(erros));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBJogar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLPalavra = new javax.swing.JLabel();
        jLLetras = new javax.swing.JLabel();
        jLDicas = new javax.swing.JLabel();
        jLErros = new javax.swing.JLabel();
        jLFoto = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBJogar.setText("jButton1");
        jBJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBJogarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 51, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Palavra:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Letras Usadas:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Erros Restantes:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Dica:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLErros, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDicas, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLDicas, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLErros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jBJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBJogar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicia(){
        erros=6;
        Palavra classe=jogo.sorteiaPalavra();
        String palavra= classe.getTextoDaPalavra();
        String[] palavraVetor= jogo.codificaPalavra(palavra);
        String palavraCodificada="";
        String dica= classe.getDica();
        String letrasUsadas="";
        ImageIcon imagemForca;
        jLLetras.setText(letrasUsadas);
        jLPalavra.setText(jogo.transcrevePalavra(palavraVetor));
        jLDicas.setText(dica);
        imagemForca= new ImageIcon(getClass().getResource("forca.jpg"));
        ImageIcon botao = new ImageIcon(getClass().getResource("logotipo.jpg"));
        jBJogar.setIcon(botao);
        jLFoto.setIcon(imagemForca);
        jLErros.setText(String.valueOf(erros));
    }
    
    
    private void jBJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBJogarActionPerformed
        
        char letraEscolhida =  JOptionPane.showInputDialog(this, "Informe uma letra:","Jogo da Forca",1).charAt(0);
        for(int i=0;i<letrasUsadas.length();i++){
            while(letrasUsadas.charAt(i)==letraEscolhida){
                JOptionPane.showMessageDialog(this,"Você já tentou essa letra!","Jogo da Forca",1);
                letraEscolhida=JOptionPane.showInputDialog(this, "Informe uma letra:","Jogo da Forca",1).charAt(0);
                i=-1;
            }
        }
        if(jogo.verificaLetra(letraEscolhida, palavra)==true){
            JOptionPane.showMessageDialog(this,"A palavra secreta não contém essa letra!","Jogo da Forca",1);
            letrasUsadas+=letraEscolhida+"-";
            jLLetras.setText(letrasUsadas);
            erros--;
            jLErros.setText(String.valueOf(erros));
            switch(erros){
                case 5:
                    imagemForca = new ImageIcon(getClass().getResource("forca2.jpg"));
                    jLFoto.setIcon(imagemForca);
                    break;
                case 4:
                    imagemForca = new ImageIcon(getClass().getResource("forca3.jpg"));
                    jLFoto.setIcon(imagemForca);
                    break;
                case 3:
                    imagemForca = new ImageIcon(getClass().getResource("forca4.jpg"));
                    jLFoto.setIcon(imagemForca);
                    break;
                case 2:
                    imagemForca = new ImageIcon(getClass().getResource("forca5.jpg"));
                    jLFoto.setIcon(imagemForca);
                    break;
                case 1:
                    imagemForca = new ImageIcon(getClass().getResource("forca6.jpg"));
                    jLFoto.setIcon(imagemForca);
                    break;
                case 0:
                    imagemForca = new ImageIcon(getClass().getResource("forca7.jpg"));
                    jLFoto.setIcon(imagemForca);
                    JOptionPane.showMessageDialog(this,"Você perdeu!","Jogo da Forca",1);
                    inicia();
                    break;
            }
                
        } else{
            palavraVetor=jogo.atualizaPalavra(palavra,palavraVetor,letraEscolhida);
            jLPalavra.setText(jogo.transcrevePalavra(palavraVetor));
            if(jogo.transcrevePalavra(palavraVetor).indexOf("_")==-1){
                JOptionPane.showMessageDialog(this,"Parabéns, você acertou a palavra!","Jogo da Forca",1);
                inicia();
            }
        }
    }//GEN-LAST:event_jBJogarActionPerformed

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
    private javax.swing.JButton jBJogar;
    private javax.swing.JLabel jLDicas;
    private javax.swing.JLabel jLErros;
    private javax.swing.JLabel jLFoto;
    private javax.swing.JLabel jLLetras;
    private javax.swing.JLabel jLPalavra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
