
package gui;

import classes.Matriz;
import javax.swing.JOptionPane;

public class Tela extends javax.swing.JFrame {
    Matriz MA = null;
    Matriz MB = null;
    
    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldQuantLinhasA = new javax.swing.JTextField();
        jTextFieldQuantColunasA = new javax.swing.JTextField();
        jButtonCriarA = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldQuantLinhasB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldQuantColunasB = new javax.swing.JTextField();
        jButtonCriarB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaidaB = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSaidaA = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButtonSoma = new javax.swing.JButton();
        jButtonSub = new javax.swing.JButton();
        jButtonTransposta = new javax.swing.JButton();
        jComboBoxMatriz = new javax.swing.JComboBox<>();
        jButtonIdentidade = new javax.swing.JButton();
        jButtonSimetrica = new javax.swing.JButton();
        jButtonEqual = new javax.swing.JButton();
        jButtonProdEsc = new javax.swing.JButton();
        jSpinnerEscalar = new javax.swing.JSpinner();
        jButtonProdMat = new javax.swing.JButton();
        jButtonOrtogonal = new javax.swing.JButton();
        jButtonPermut = new javax.swing.JButton();
        jButtonApagaMatriz = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Matriz A");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 20, 80, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matriz B");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(820, 20, 73, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantidade de linhas:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 60, 170, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantidade de colunas:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 110, 170, 17);
        getContentPane().add(jTextFieldQuantLinhasA);
        jTextFieldQuantLinhasA.setBounds(190, 50, 80, 30);
        getContentPane().add(jTextFieldQuantColunasA);
        jTextFieldQuantColunasA.setBounds(190, 100, 80, 30);

        jButtonCriarA.setText("CRIAR");
        jButtonCriarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarAActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCriarA);
        jButtonCriarA.setBounds(105, 170, 90, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantidade de linhas:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(720, 60, 160, 17);
        getContentPane().add(jTextFieldQuantLinhasB);
        jTextFieldQuantLinhasB.setBounds(900, 50, 80, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantidade de colunas:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(720, 110, 170, 17);
        getContentPane().add(jTextFieldQuantColunasB);
        jTextFieldQuantColunasB.setBounds(900, 100, 80, 30);

        jButtonCriarB.setText("CRIAR");
        jButtonCriarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarBActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCriarB);
        jButtonCriarB.setBounds(810, 170, 90, 23);

        jTextAreaSaidaB.setColumns(20);
        jTextAreaSaidaB.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSaidaB);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(726, 250, 240, 147);

        jTextAreaSaidaA.setColumns(20);
        jTextAreaSaidaA.setRows(5);
        jScrollPane2.setViewportView(jTextAreaSaidaA);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 250, 240, 147);

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jScrollPane3.setViewportView(jTextAreaResultado);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(400, 390, 240, 147);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Matriz resultante");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(444, 360, 160, 22);

        jButtonSoma.setText("+");
        jButtonSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSoma);
        jButtonSoma.setBounds(460, 10, 41, 23);

        jButtonSub.setText("-");
        jButtonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSub);
        jButtonSub.setBounds(540, 10, 41, 23);

        jButtonTransposta.setText("Transposta");
        jButtonTransposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTranspostaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTransposta);
        jButtonTransposta.setBounds(450, 40, 140, 23);

        jComboBoxMatriz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matriz A", "Matriz B" }));
        getContentPane().add(jComboBoxMatriz);
        jComboBoxMatriz.setBounds(470, 320, 110, 20);

        jButtonIdentidade.setText("Identidade");
        jButtonIdentidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIdentidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIdentidade);
        jButtonIdentidade.setBounds(460, 70, 120, 23);

        jButtonSimetrica.setText("Simétrica");
        jButtonSimetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimetricaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSimetrica);
        jButtonSimetrica.setBounds(460, 100, 120, 23);

        jButtonEqual.setText("Iguais ou diferentes");
        jButtonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEqualActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEqual);
        jButtonEqual.setBounds(450, 130, 140, 23);

        jButtonProdEsc.setText("Produto por escalar");
        jButtonProdEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdEscActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProdEsc);
        jButtonProdEsc.setBounds(400, 160, 160, 23);

        jSpinnerEscalar.setModel(new javax.swing.SpinnerNumberModel());
        getContentPane().add(jSpinnerEscalar);
        jSpinnerEscalar.setBounds(570, 160, 70, 30);

        jButtonProdMat.setText("Produto matricial");
        jButtonProdMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdMatActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProdMat);
        jButtonProdMat.setBounds(450, 200, 140, 23);

        jButtonOrtogonal.setText("Ortogonal");
        jButtonOrtogonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrtogonalActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOrtogonal);
        jButtonOrtogonal.setBounds(480, 230, 90, 23);

        jButtonPermut.setText("Permutação");
        jButtonPermut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPermutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPermut);
        jButtonPermut.setBounds(470, 260, 110, 23);

        jButtonApagaMatriz.setText("Apagar Matriz");
        jButtonApagaMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagaMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonApagaMatriz);
        jButtonApagaMatriz.setBounds(470, 290, 110, 23);

        jButtonSair.setText("SAIR");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(20, 520, 73, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/matrix.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(-9, -5, 1020, 580);

        setSize(new java.awt.Dimension(1010, 597));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCriarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarBActionPerformed
        try {
            int qLinhas = Integer.parseInt(jTextFieldQuantLinhasB.getText());
            int qColunas = Integer.parseInt(jTextFieldQuantColunasB.getText());
            MB = new Matriz(qLinhas, qColunas);
            for (int i = 0; i < qLinhas; i++) {
                for (int j = 0; j < qColunas; j++) {
                    String str = "Matriz MB [" + i + "][" + j + "]";
                    int elemento = Integer.parseInt(JOptionPane.showInputDialog(str));
                    MB.setElemento(i, j, elemento);
                }
            }
            jTextAreaSaidaB.setText(MB.getMatriz());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonCriarBActionPerformed

    private void jButtonCriarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarAActionPerformed
        try {
            int qLinhas = Integer.parseInt(jTextFieldQuantLinhasA.getText());
            int qColunas = Integer.parseInt(jTextFieldQuantColunasA.getText());
            MA = new Matriz(qLinhas, qColunas);
            for (int i = 0; i < qLinhas; i++) {
                for (int j = 0; j < qColunas; j++) {
                    String str = "Matriz MA [" + i + "][" + j + "]";
                    int elemento = Integer.parseInt(JOptionPane.showInputDialog(str));
                    MA.setElemento(i, j, elemento);
                }
            }
            jTextAreaSaidaA.setText(MA.getMatriz());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonCriarAActionPerformed

    private void jButtonSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomaActionPerformed
        try {
            Matriz result = MA.soma(MB);
            jTextAreaResultado.setText(result.getMatriz());
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonSomaActionPerformed

    private void jButtonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubActionPerformed
        try{
            jTextAreaResultado.setText(MA.subtrai(MB).getMatriz());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }        
    }//GEN-LAST:event_jButtonSubActionPerformed

    private void jButtonTranspostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTranspostaActionPerformed
        try {
            if (jComboBoxMatriz.getSelectedIndex() == 0) {
                jTextAreaResultado.setText(MA.transposta().getMatriz());
            }
            else {
                jTextAreaResultado.setText(MB.transposta().getMatriz());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonTranspostaActionPerformed

    private void jButtonIdentidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIdentidadeActionPerformed
        try {
            String str = "";
            if (jComboBoxMatriz.getSelectedIndex() == 0) {
                str = MA.getMatriz();
                str += "\n";
                if (MA.isIdent()) {
                    str += "É identidade";
                }
                else {
                    str += "Não é identidade";
                }
            }
            else {
                str = MB.getMatriz();
                str += "\n";
                if (MB.isIdent()) {
                    str += "É identidade";
                }
                else {
                    str += "Não é identidade";
                }
            }
            jTextAreaResultado.setText(str);
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonIdentidadeActionPerformed

    private void jButtonSimetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimetricaActionPerformed
        try {
            String str = "";
            if (jComboBoxMatriz.getSelectedIndex() == 0) {
                str = MA.getMatriz();
                str += "\n";
                if (MA.isSimet()) {
                    str += "É simétrica";
                }
                else {
                    str += "Não é simétrica";
                }
            }
            else {
                str = MB.getMatriz();
                str += "\n";
                if (MB.isSimet()) {
                    str += "É simétrica";
                }
                else {
                    str += "Não é simétrica";
                }
            }
            jTextAreaResultado.setText(str);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonSimetricaActionPerformed

    private void jButtonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEqualActionPerformed
        try {
            if (MA.isEqual(MB)) {
                jTextAreaResultado.setText("Matrizes iguais");
            }
            else {
                jTextAreaResultado.setText("Matrizes diferentes");
            }
        }
        catch (Exception e) {
            jTextAreaResultado.setText("Matrizes diferentes");
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonEqualActionPerformed

    private void jButtonProdEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdEscActionPerformed
        try {
            if (jComboBoxMatriz.getSelectedIndex() == 0) {
                jTextAreaResultado.setText(MA.prodEscalar(jSpinnerEscalar.getValue().toString()).getMatriz());
            }
            else {
                jTextAreaResultado.setText(MB.prodEscalar(jSpinnerEscalar.getValue().toString()).getMatriz());
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonProdEscActionPerformed

    private void jButtonProdMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdMatActionPerformed
        try {
            jTextAreaResultado.setText(MA.prodMatriz(MB).getMatriz());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonProdMatActionPerformed

    private void jButtonOrtogonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrtogonalActionPerformed
        try {
            String str = "";
            if (jComboBoxMatriz.getSelectedIndex() == 0) {
                str = MA.getMatriz();
                str += "\n";
                if (MA.isOrtog()) {
                    str += "É ortogonal";
                }
                else {
                    str += "Não é ortogonal";
                }
            }
            else {
                str = MB.getMatriz();
                str += "\n";
                if (MB.isOrtog()) {
                    str += "É ortogonal";
                }
                else {
                    str += "Não é ortogonal";
                }
            }
            jTextAreaResultado.setText(str);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonOrtogonalActionPerformed

    private void jButtonPermutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPermutActionPerformed
        try {
            String str = "";
            if (jComboBoxMatriz.getSelectedIndex() == 0) {
                str = MA.getMatriz();
                str += "\n";
                if (MA.isPermut()) {
                    str += "É de permutação";
                }
                else {
                    str += "Não é de permutação";
                }
            }
            else {
                str = MB.getMatriz();
                str += "\n";
                if (MB.isPermut()) {
                    str += "É de permutação";
                }
                else {
                    str += "Não é de permutação";
                }
            }
            jTextAreaResultado.setText(str);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonPermutActionPerformed

    private void jButtonApagaMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagaMatrizActionPerformed
       try {
            if (jComboBoxMatriz.getSelectedIndex() == 0) {
                MA.apaga();
                jTextFieldQuantLinhasA.setText("");
                jTextFieldQuantColunasA.setText("");
                jTextAreaSaidaA.setText("");
            }
            else {
                MB.apaga();
                jTextFieldQuantLinhasB.setText("");
                jTextFieldQuantColunasB.setText("");
                jTextAreaSaidaB.setText("");
            }
            jTextAreaResultado.setText("");
       }
       catch (NullPointerException e) {
           JOptionPane.showMessageDialog(rootPane, e.getMessage());
       }
    }//GEN-LAST:event_jButtonApagaMatrizActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

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
    private javax.swing.JButton jButtonApagaMatriz;
    private javax.swing.JButton jButtonCriarA;
    private javax.swing.JButton jButtonCriarB;
    private javax.swing.JButton jButtonEqual;
    private javax.swing.JButton jButtonIdentidade;
    private javax.swing.JButton jButtonOrtogonal;
    private javax.swing.JButton jButtonPermut;
    private javax.swing.JButton jButtonProdEsc;
    private javax.swing.JButton jButtonProdMat;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSimetrica;
    private javax.swing.JButton jButtonSoma;
    private javax.swing.JButton jButtonSub;
    private javax.swing.JButton jButtonTransposta;
    private javax.swing.JComboBox<String> jComboBoxMatriz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinnerEscalar;
    private javax.swing.JTextArea jTextAreaResultado;
    private javax.swing.JTextArea jTextAreaSaidaA;
    private javax.swing.JTextArea jTextAreaSaidaB;
    private javax.swing.JTextField jTextFieldQuantColunasA;
    private javax.swing.JTextField jTextFieldQuantColunasB;
    private javax.swing.JTextField jTextFieldQuantLinhasA;
    private javax.swing.JTextField jTextFieldQuantLinhasB;
    // End of variables declaration//GEN-END:variables
}
