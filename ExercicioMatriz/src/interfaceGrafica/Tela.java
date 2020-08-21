package interfaceGrafica;

import classes.MatrizDeInteiros;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 * @author angel
 */
public class Tela extends javax.swing.JFrame {

    private MatrizDeInteiros matriz;
    private int linhas, colunas;

    public Tela() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Manipulação de matriz em java");
        jBDiagPrincipal.setEnabled(false);
        jBDiagSecundaria.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDLinhas = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jTFTamanhoLinhas = new javax.swing.JTextField();
        jBPadraoLinhas = new javax.swing.JButton();
        jBConfirmarLinhas = new javax.swing.JButton();
        jDColunas = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jTFTamanhoColunas = new javax.swing.JTextField();
        jBPadraoColunas = new javax.swing.JButton();
        jBConfirmarColunas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAMatriz = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jBExibirMatriz = new javax.swing.JButton();
        jBNovaMatriz = new javax.swing.JButton();
        jBRandom = new javax.swing.JButton();
        jBEncontrar = new javax.swing.JButton();
        jBSomar = new javax.swing.JButton();
        jBSomarLinhas = new javax.swing.JButton();
        jBSomarColunas = new javax.swing.JButton();
        jBMatrizTransposta = new javax.swing.JButton();
        jBDiagPrincipal = new javax.swing.JButton();
        jBDiagSecundaria = new javax.swing.JButton();
        jBTrocar = new javax.swing.JButton();
        jBPares = new javax.swing.JButton();
        jBMaior = new javax.swing.JButton();
        jBSubstituir = new javax.swing.JButton();
        jBSimetrica = new javax.swing.JButton();
        jBSubtrair = new javax.swing.JButton();
        jBImpares = new javax.swing.JButton();
        jBMultiplicar = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Digite o tamanho de linhas desejado:");

        jTFTamanhoLinhas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFTamanhoLinhas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFTamanhoLinhasKeyPressed(evt);
            }
        });

        jBPadraoLinhas.setText("Padrão (5)");
        jBPadraoLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPadraoLinhasActionPerformed(evt);
            }
        });

        jBConfirmarLinhas.setText("Confirmar");
        jBConfirmarLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarLinhasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDLinhasLayout = new javax.swing.GroupLayout(jDLinhas.getContentPane());
        jDLinhas.getContentPane().setLayout(jDLinhasLayout);
        jDLinhasLayout.setHorizontalGroup(
            jDLinhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDLinhasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDLinhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTFTamanhoLinhas)
                    .addGroup(jDLinhasLayout.createSequentialGroup()
                        .addComponent(jBConfirmarLinhas)
                        .addGap(122, 122, 122)
                        .addComponent(jBPadraoLinhas))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDLinhasLayout.setVerticalGroup(
            jDLinhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDLinhasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFTamanhoLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDLinhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPadraoLinhas)
                    .addComponent(jBConfirmarLinhas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Digite o tamanho de colunas desejado:");

        jTFTamanhoColunas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTFTamanhoColunas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTFTamanhoColunasKeyPressed(evt);
            }
        });

        jBPadraoColunas.setText("Padrão (5)");
        jBPadraoColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPadraoColunasActionPerformed(evt);
            }
        });

        jBConfirmarColunas.setText("Confirmar");
        jBConfirmarColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarColunasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDColunasLayout = new javax.swing.GroupLayout(jDColunas.getContentPane());
        jDColunas.getContentPane().setLayout(jDColunasLayout);
        jDColunasLayout.setHorizontalGroup(
            jDColunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDColunasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDColunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTFTamanhoColunas)
                    .addGroup(jDColunasLayout.createSequentialGroup()
                        .addComponent(jBConfirmarColunas)
                        .addGap(122, 122, 122)
                        .addComponent(jBPadraoColunas))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDColunasLayout.setVerticalGroup(
            jDColunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDColunasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFTamanhoColunas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDColunasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPadraoColunas)
                    .addComponent(jBConfirmarColunas)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createTitledBorder(null, "MATRIZ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jTAMatriz.setColumns(20);
        jTAMatriz.setRows(5);
        jTAMatriz.setTabSize(3);
        jScrollPane1.setViewportView(jTAMatriz);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBExibirMatriz.setText("Exibe matriz");
        jBExibirMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExibirMatrizActionPerformed(evt);
            }
        });

        jBNovaMatriz.setText("Nova matriz");
        jBNovaMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovaMatrizActionPerformed(evt);
            }
        });

        jBRandom.setText("Completar Aleatório");
        jBRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRandomActionPerformed(evt);
            }
        });

        jBEncontrar.setText("Encontrar valor na matriz");
        jBEncontrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEncontrarActionPerformed(evt);
            }
        });

        jBSomar.setText("Somar matriz");
        jBSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomarActionPerformed(evt);
            }
        });

        jBSomarLinhas.setText("Somar linhas");
        jBSomarLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomarLinhasActionPerformed(evt);
            }
        });

        jBSomarColunas.setText("Somar colunas");
        jBSomarColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomarColunasActionPerformed(evt);
            }
        });

        jBMatrizTransposta.setText("Matriz transposta");
        jBMatrizTransposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMatrizTranspostaActionPerformed(evt);
            }
        });

        jBDiagPrincipal.setText("Diagonal principal");
        jBDiagPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDiagPrincipalActionPerformed(evt);
            }
        });

        jBDiagSecundaria.setText("Diagonal secundária");
        jBDiagSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDiagSecundariaActionPerformed(evt);
            }
        });

        jBTrocar.setText("Trocar primeira linha com última linha");
        jBTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTrocarActionPerformed(evt);
            }
        });

        jBPares.setText("Valores pares");
        jBPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBParesActionPerformed(evt);
            }
        });

        jBMaior.setText("Maior valor");
        jBMaior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMaiorActionPerformed(evt);
            }
        });

        jBSubstituir.setText("Trocar para -1 impares e para 1 par");
        jBSubstituir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubstituirActionPerformed(evt);
            }
        });

        jBSimetrica.setText("Matriz é simétrica?");
        jBSimetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSimetricaActionPerformed(evt);
            }
        });

        jBSubtrair.setText("Subtrair matriz pela transposta dela ");
        jBSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubtrairActionPerformed(evt);
            }
        });

        jBImpares.setText("Valores Impares");
        jBImpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImparesActionPerformed(evt);
            }
        });

        jBMultiplicar.setText("Multiplicar Matriz");
        jBMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMultiplicarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBMatrizTransposta)
                            .addComponent(jBDiagPrincipal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBDiagSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jBSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBRandom)
                            .addComponent(jBSimetrica)
                            .addComponent(jBSubstituir)
                            .addComponent(jBTrocar)
                            .addComponent(jBSomarColunas)
                            .addComponent(jBSomarLinhas)
                            .addComponent(jBSomar)
                            .addComponent(jBEncontrar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBPares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBImpares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBMaior)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBExibirMatriz)
                    .addComponent(jBNovaMatriz)
                    .addComponent(jBMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBExibirMatriz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBNovaMatriz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRandom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEncontrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSomar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSomarLinhas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSomarColunas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMatrizTransposta)
                    .addComponent(jBSubtrair))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jBTrocar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBPares)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBImpares, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBMaior)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSubstituir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSimetrica))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBDiagSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBDiagPrincipal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBMultiplicar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBExibirMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExibirMatrizActionPerformed
        jTAMatriz.setText("Matriz:\n" + matriz.toString());
    }//GEN-LAST:event_jBExibirMatrizActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jDialogLinhas();
        jTFTamanhoLinhas.requestFocusInWindow();
        jDialogColunas();
        jTFTamanhoColunas.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void jTFTamanhoLinhasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTamanhoLinhasKeyPressed
        validaCampo(evt);
    }//GEN-LAST:event_jTFTamanhoLinhasKeyPressed

    private void jBPadraoLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPadraoLinhasActionPerformed
        linhas = 5;
        jDLinhas.setVisible(false);
    }//GEN-LAST:event_jBPadraoLinhasActionPerformed

    private void jBConfirmarLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarLinhasActionPerformed
        String valor = jTFTamanhoLinhas.getText().trim();
        if (valor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite algum número!", "Aviso", 0);
            jTFTamanhoLinhas.requestFocusInWindow();
            return;
        } else if (Integer.parseInt(valor) <= 0) {
            JOptionPane.showMessageDialog(this, "Digite algum número maior que zero!", "Aviso", 0);
            jTFTamanhoLinhas.requestFocusInWindow();
            return;
        }
        linhas = Integer.parseInt(jTFTamanhoLinhas.getText());
        jTFTamanhoLinhas.setText(null);
        jDLinhas.setVisible(false);
    }//GEN-LAST:event_jBConfirmarLinhasActionPerformed

    private void jTFTamanhoColunasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTamanhoColunasKeyPressed
        validaCampo(evt);
    }//GEN-LAST:event_jTFTamanhoColunasKeyPressed

    private void jBPadraoColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPadraoColunasActionPerformed
        colunas = 5;
        jDColunas.setVisible(false);
        instanciar();
    }//GEN-LAST:event_jBPadraoColunasActionPerformed

    private void jBConfirmarColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarColunasActionPerformed
        String valor = jTFTamanhoColunas.getText().trim();
        if (valor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite algum número!", "Aviso", 0);
            jTFTamanhoColunas.requestFocusInWindow();
            return;
        } else if (Integer.parseInt(valor) <= 0) {
            JOptionPane.showMessageDialog(this, "Digite algum número maior que zero!", "Aviso", 0);
            jTFTamanhoColunas.requestFocusInWindow();
            return;
        }
        colunas = Integer.parseInt(jTFTamanhoColunas.getText());
        jTFTamanhoColunas.setText(null);
        jDColunas.setVisible(false);
        instanciar();
    }//GEN-LAST:event_jBConfirmarColunasActionPerformed

    private void jBRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRandomActionPerformed
        matriz.completarRandom();
        jTAMatriz.setText("Matriz:\n" + matriz.toString());
        jBRandom.setEnabled(false);
    }//GEN-LAST:event_jBRandomActionPerformed

    private void jBNovaMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovaMatrizActionPerformed

        jBRandom.setEnabled(true);
        jBDiagPrincipal.setEnabled(false);
        jBDiagSecundaria.setEnabled(false);
        jDialogLinhas();
        jTFTamanhoLinhas.requestFocusInWindow();
        jDialogColunas();
        jTFTamanhoColunas.requestFocusInWindow();

    }//GEN-LAST:event_jBNovaMatrizActionPerformed

    private void jBSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomarActionPerformed
        jTAMatriz.setText(matriz.toString() + "\n\n" + "Resultado da soma: " + matriz.somarMatriz());
    }//GEN-LAST:event_jBSomarActionPerformed

    private void jBEncontrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEncontrarActionPerformed
        String valor = JOptionPane.showInputDialog(this, "Valor a ser procurado: ", "Busca", 1).trim();
        if (valor == null) {
            return;
        }
        if (valor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite algum valor.", "Erro", 0);
            return;
        }
        try {
            Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite somente números.", "Erro", 0);
            return;
        }
        int valorInt = Integer.parseInt(valor);
        if (matriz.contarNumeros(valorInt) == 0) {
            jTAMatriz.setText("Nenhum número encontrado.");
        } else {
            jTAMatriz.setText("Matriz: \n" + matriz.toString() + "\n\nL\tC\n" + matriz.imprimeMatriz(matriz.encontrarNaMatriz(valorInt)));
        }

    }//GEN-LAST:event_jBEncontrarActionPerformed

    private void jBSomarLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomarLinhasActionPerformed
        StringBuilder resultado = new StringBuilder("");
        int[] vetor = matriz.somarCadaLinha();
        for (int i = 0; i < vetor.length; i++) {
            resultado.append("Linha: ").append(i).append(" Soma: ").append(vetor[i]).append("\n");
        }
        jTAMatriz.setText(matriz.toString() + "\n\n" + resultado);
    }//GEN-LAST:event_jBSomarLinhasActionPerformed

    private void jBSomarColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomarColunasActionPerformed
        StringBuilder resultado = new StringBuilder("");
        int[] vetor = matriz.somarCadaColuna();
        for (int i = 0; i < vetor.length; i++) {
            resultado.append("Coluna: ").append(i).append(" Soma: ").append(vetor[i]).append("\n");
        }
        jTAMatriz.setText(matriz.toString() + "\n\n" + resultado);
    }//GEN-LAST:event_jBSomarColunasActionPerformed

    private void jBMatrizTranspostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMatrizTranspostaActionPerformed
        jTAMatriz.setText("Matriz original: \n" + matriz.toString() + "\n\n"
                + "Matriz transposta: \n" + matriz.imprimeMatriz(matriz.matrizTransposta()));
    }//GEN-LAST:event_jBMatrizTranspostaActionPerformed

    private void jBDiagPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDiagPrincipalActionPerformed
        jTAMatriz.setText("Matriz original: \n" + matriz.toString() + "\n\nDiagonal principal:\n" + matriz.imprimeVetor(matriz.diagonalPrincipal()));
    }//GEN-LAST:event_jBDiagPrincipalActionPerformed

    private void jBDiagSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDiagSecundariaActionPerformed
        jTAMatriz.setText("Matriz original: \n" + matriz.toString() + "\n\nDiagonal secundária:\n" + matriz.imprimeVetor(matriz.diagonalSecundaria()));
    }//GEN-LAST:event_jBDiagSecundariaActionPerformed

    private void jBTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTrocarActionPerformed
        jTAMatriz.setText("Matriz original: \n" + matriz.toString() + "\n\nMatriz trocada:\n" + matriz.imprimeMatriz(matriz.trocarLinhas()));
    }//GEN-LAST:event_jBTrocarActionPerformed

    private void jBParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBParesActionPerformed
        jTAMatriz.setText("Matriz original: \n" + matriz.toString() + "\n\nPares:\n" + matriz.imprimeVetor(matriz.retornarPares()));
    }//GEN-LAST:event_jBParesActionPerformed

    private void jBMaiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMaiorActionPerformed
        jTAMatriz.setText("Matriz original: \n" + matriz.toString() + "\n\nMaior valor:" + matriz.retornarMaiorValor());
    }//GEN-LAST:event_jBMaiorActionPerformed

    private void jBSubstituirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubstituirActionPerformed
        jTAMatriz.setText("Matriz original: \n" + matriz.toString() + "\n\nNova matriz: \n" + matriz.imprimeMatriz(matriz.substituir()));
    }//GEN-LAST:event_jBSubstituirActionPerformed

    private void jBSimetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSimetricaActionPerformed
        String matris = "A matriz " + (matriz.matrizQuadrada() ? "é quadrada" : "não é quadrada") + "!\n";
        if (matriz.matrizQuadrada()) {
            matris += "A matriz " + (matriz.matrizSimetrica() ? "é simétrica" : "não é simétrica" + "!");
        }
        jTAMatriz.setText("Matriz original: \n" + matriz.toString() + "\n\n" + matris);

    }//GEN-LAST:event_jBSimetricaActionPerformed

    private void jBSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubtrairActionPerformed
        jTAMatriz.setText(matriz.toString() + "\n\n" + "Matriz Transposta: \n" + matriz.imprimeMatriz(matriz.matrizTransposta()) + "\n" + "Resultado Matriz original\n menos a Transposta dela : \n" + matriz.imprimeMatriz(matriz.subMatrizTramp(matriz.matrizTransposta())));
    }//GEN-LAST:event_jBSubtrairActionPerformed

    private void jBImparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImparesActionPerformed
        jTAMatriz.setText("Matriz original: \n" + matriz.toString() + "\n\nImpares:\n" + matriz.imprimeVetor(matriz.retornarImpares()));
    }//GEN-LAST:event_jBImparesActionPerformed

    private void jBMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMultiplicarActionPerformed
        String linha = JOptionPane.showInputDialog(null, "digite o tamanho da matriz");
        if (linha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite algum número!", "Aviso", 0);
            return;
        }
        int lin;
        try {
            lin = Integer.parseInt(linha);
        } catch (NumberFormatException a) {
            JOptionPane.showMessageDialog(null, "informe um valor valido");
            return;
        }
        String coluna = JOptionPane.showInputDialog(null, "digite o tamanho da matriz");
        if (coluna.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite algum número!", "Aviso", 0);
            return;
        }
        int col;
        try {
            col = Integer.parseInt(coluna);
        } catch (NumberFormatException a) {
            JOptionPane.showMessageDialog(null, "informe um valor valido");
            return;
        }
        if (matriz.getColunas() != lin) {
            JOptionPane.showMessageDialog(null,"O numero de colunas deve ser igual o de linhas");
            return;
        }
        
        int[][] matrizRa=matriz.matrizRandom(lin, col);
        jTAMatriz.setText(
                "Matriz original: \n" + matriz.toString() + "\n\nMatriz a ser multiplicada: \n" + matriz.imprimeMatriz(matrizRa) + "\n\nMatriz Multiplicada: \n" + matriz.imprimeMatriz(matriz.multiplicaMatriz(matrizRa)));
    }//GEN-LAST:event_jBMultiplicarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Tela().setVisible(true);
        });
        /*
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
         */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConfirmarColunas;
    private javax.swing.JButton jBConfirmarLinhas;
    private javax.swing.JButton jBDiagPrincipal;
    private javax.swing.JButton jBDiagSecundaria;
    private javax.swing.JButton jBEncontrar;
    private javax.swing.JButton jBExibirMatriz;
    private javax.swing.JButton jBImpares;
    private javax.swing.JButton jBMaior;
    private javax.swing.JButton jBMatrizTransposta;
    private javax.swing.JButton jBMultiplicar;
    private javax.swing.JButton jBNovaMatriz;
    private javax.swing.JButton jBPadraoColunas;
    private javax.swing.JButton jBPadraoLinhas;
    private javax.swing.JButton jBPares;
    private javax.swing.JButton jBRandom;
    private javax.swing.JButton jBSimetrica;
    private javax.swing.JButton jBSomar;
    private javax.swing.JButton jBSomarColunas;
    private javax.swing.JButton jBSomarLinhas;
    private javax.swing.JButton jBSubstituir;
    private javax.swing.JButton jBSubtrair;
    private javax.swing.JButton jBTrocar;
    private javax.swing.JDialog jDColunas;
    private javax.swing.JDialog jDLinhas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTAMatriz;
    private javax.swing.JTextField jTFTamanhoColunas;
    private javax.swing.JTextField jTFTamanhoLinhas;
    // End of variables declaration//GEN-END:variables

    private void jDialogColunas() {
        jDColunas.setSize(325, 140);
        jDColunas.setLocationRelativeTo(this);
        jDColunas.setModal(true);
        jDColunas.setTitle("Colunas");
        jDColunas.setResizable(false);
        jDColunas.setDefaultCloseOperation(0);
        jDColunas.setVisible(true);
    }

    private void jDialogLinhas() {
        jDLinhas.setSize(325, 140);
        jDLinhas.setLocationRelativeTo(this);
        jDLinhas.setModal(true);
        jDLinhas.setTitle("Linhas");
        jDLinhas.setResizable(false);
        jDLinhas.setDefaultCloseOperation(0);
        jDLinhas.setVisible(true);
    }

    private void validaCampo(KeyEvent evt) {
        char tecla = evt.getKeyChar();
        if (!Character.isDigit(tecla) && tecla != '.' && tecla != '-' && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE && evt.getKeyChar() != KeyEvent.VK_DELETE) {
            evt.consume();
        }
    }

    private void instanciar() {
        matriz = new MatrizDeInteiros(linhas, colunas);
        if (matriz.matrizQuadrada()) {
            jBDiagPrincipal.setEnabled(true);
            jBDiagSecundaria.setEnabled(true);

        }
        jBEncontrar.setEnabled(true);
        jBExibirMatriz.setEnabled(true);
        jBMaior.setEnabled(true);
        jBSimetrica.setEnabled(false);
        jBSomar.setEnabled(true);
        jBSomarColunas.setEnabled(true);
        jBSomarLinhas.setEnabled(true);
        jBTrocar.setEnabled(true);
        jBImpares.setEnabled(true);
        jBMatrizTransposta.setEnabled(true);
        jBSubtrair.setEnabled(true);
        jBDiagPrincipal.setEnabled(false);
        jBDiagSecundaria.setEnabled(false);
        jBPares.setEnabled(true);
        jBSubstituir.setEnabled(true);
        jBMultiplicar.setEnabled(true);

    }
}
