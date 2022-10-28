/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ExercicioInterface;

import javax.swing.JOptionPane;


public class Ex03JoKenPo extends javax.swing.JFrame {


    public Ex03JoKenPo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pedra, Papel ou Tesoura?");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Pedra");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Papel");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Tesoura");

        jButton1.setText("CONFIRMAR JOGADA");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton1))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static int randInt(int min, int max) {
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int valorIA = randInt(0, 2);

        int valorUsuario = 999;
        boolean buttonSelected = jRadioButton1.isSelected();
        if (buttonSelected == true) {
            valorUsuario = 0;
        }
        buttonSelected = jRadioButton2.isSelected();
        if (buttonSelected == true) {
            valorUsuario = 1;
        }
        buttonSelected = jRadioButton3.isSelected();
        if (buttonSelected == true) {
            valorUsuario = 2;
        }
        // EMPATE
        if( valorUsuario == 0 && valorIA == 0){
             JOptionPane.showMessageDialog(rootPane, "EMPATE!");
        }else
        if( valorUsuario == 1 && valorIA == 1){
             JOptionPane.showMessageDialog(rootPane, "EMPATE!");
        }else
        if( valorUsuario == 2 && valorIA == 2){
             JOptionPane.showMessageDialog(rootPane, "EMPATE!");
        }else
        // VALOR USUARIO WINS
        if( valorUsuario == 0 && valorIA == 2){
             JOptionPane.showMessageDialog(rootPane, "USUARIO WINS!");
        }else
        if( valorUsuario == 1 && valorIA == 0){
             JOptionPane.showMessageDialog(rootPane, "USUARIO WINS!");
        }else
        if( valorUsuario == 2 && valorIA == 1){
             JOptionPane.showMessageDialog(rootPane, "USUARIO WINS!");
        }else{
             JOptionPane.showMessageDialog(rootPane, "I.A WINS!");
        }
        // VALOR I.A WINS
        


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ex03JoKenPo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ex03JoKenPo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ex03JoKenPo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ex03JoKenPo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ex03JoKenPo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
