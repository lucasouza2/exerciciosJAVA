package tela;

import classes.ManipulaArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alinda
 */
public class TelaManipulaArrayLista extends javax.swing.JFrame {

    private ManipulaArrayList objManipulaArrayList;
    private DefaultListModel listModel;

    public TelaManipulaArrayLista() {
        initComponents();
        setLocationRelativeTo(null);
        objManipulaArrayList = new ManipulaArrayList();
        listModel = new DefaultListModel();
        jListResultado.setModel(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTFInfo = new javax.swing.JTextField();
        jBAdd = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListResultado = new javax.swing.JList();
        jCBResultado = new javax.swing.JComboBox();
        jBDel = new javax.swing.JButton();
        jBGet = new javax.swing.JButton();
        jBArray = new javax.swing.JButton();
        jBClear = new javax.swing.JButton();
        jBOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exemplo de ArrayList");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Texto:");

        jBAdd.setText("Add");
        jBAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado:"));

        jListResultado.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCBResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBDel.setText("Del");
        jBDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDelActionPerformed(evt);
            }
        });

        jBGet.setText("Get");
        jBGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGetActionPerformed(evt);
            }
        });

        jBArray.setText("Array");
        jBArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBArrayActionPerformed(evt);
            }
        });

        jBClear.setText("Clear");
        jBClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClearActionPerformed(evt);
            }
        });

        jBOrdenar.setText("Ordenar");
        jBOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jBAdd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBGet)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBClear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBArray)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBOrdenar)
                            .addGap(61, 61, 61))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBAdd, jBArray, jBDel, jBGet});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAdd)
                    .addComponent(jBDel)
                    .addComponent(jBGet)
                    .addComponent(jBClear)
                    .addComponent(jBArray)
                    .addComponent(jBOrdenar))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddActionPerformed
        objManipulaArrayList.adiciona(jTFInfo.getText());
        listModel.addElement(jTFInfo.getText());
        jTFInfo.setText("");
        jTFInfo.requestFocusInWindow();
        habilita();
    }//GEN-LAST:event_jBAddActionPerformed

    private void jBDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDelActionPerformed
        int ind = jListResultado.getSelectedIndex();
        if (ind != -1) {
            String removido = objManipulaArrayList.remove(ind);
            if (removido != null) {
                JOptionPane.showMessageDialog(this,
                        "Removido= " + removido,
                        "Manipulando ArrayList", 1);
                listModel.removeElement(removido);
                habilita();
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione o texto a ser excluído",
                    "Manipulando ArrayList", 0);
        }
    }//GEN-LAST:event_jBDelActionPerformed


    private void jBGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGetActionPerformed
        int totalElementos = objManipulaArrayList.tam();
        int indice = Integer.parseInt(JOptionPane.showInputDialog(
                this,
                "Informe o índice do elemento a ser pesquisado",
                "Exemplo get", 3));

        if (indice >= 0 && indice < totalElementos) {
            JOptionPane.showMessageDialog(this,
                    "Elemento da posição " + indice
                    + " é " + objManipulaArrayList.getInfoLista(indice),
                    "Exemplo get", 1);
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Informe um índice entre 0 e " + (totalElementos - 1),
                    "Exemplo get", 0);
        }
    }//GEN-LAST:event_jBGetActionPerformed

    private void jBArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBArrayActionPerformed
        jCBResultado.setModel(
                new javax.swing.DefaultComboBoxModel(
                        objManipulaArrayList.getArrayLista()));
    }//GEN-LAST:event_jBArrayActionPerformed

    private void jBClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClearActionPerformed
        objManipulaArrayList.removeTodos();
        jTFInfo.setText("Tamanho da lista após a remoção: "
                + objManipulaArrayList.tam());
        listModel.clear();
        habilita();
        jTFInfo.requestFocusInWindow();
        jCBResultado.removeAllItems();
    }//GEN-LAST:event_jBClearActionPerformed

    private void jBOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrdenarActionPerformed

        Collections.sort(objManipulaArrayList.getLista());

        listModel.clear();
        for (String info : objManipulaArrayList.getLista()) {
            listModel.addElement(info);
        }

    }//GEN-LAST:event_jBOrdenarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        habilita();
        jTFInfo.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void habilita() {
        int tam = objManipulaArrayList.tam();
        jBDel.setEnabled(tam != 0);
        jBGet.setEnabled(tam != 0);
        jBClear.setEnabled(tam != 0);
        jBArray.setEnabled(tam != 0);
        jBOrdenar.setEnabled(tam >= 2);
    }

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
            java.util.logging.Logger.getLogger(TelaManipulaArrayLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaManipulaArrayLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaManipulaArrayLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaManipulaArrayLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaManipulaArrayLista().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdd;
    private javax.swing.JButton jBArray;
    private javax.swing.JButton jBClear;
    private javax.swing.JButton jBDel;
    private javax.swing.JButton jBGet;
    private javax.swing.JButton jBOrdenar;
    private javax.swing.JComboBox jCBResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jListResultado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFInfo;
    // End of variables declaration//GEN-END:variables
}
