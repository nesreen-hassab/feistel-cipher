/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feistel_cipher;

/**
 *
 * @author nesreen
 */
public class feisrel_jframe extends javax.swing.JFrame {

    /**
     * Creates new form feisrel_jframe
     */
    public feisrel_jframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        encript = new javax.swing.JButton();
        decript = new javax.swing.JButton();
        combo = new javax.swing.JComboBox<>();
        round = new javax.swing.JTextField();
        key = new javax.swing.JTextField();
        plaintext = new javax.swing.JTextField();
        cipher = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        encript.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        encript.setText("encript");
        encript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptActionPerformed(evt);
            }
        });

        decript.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        decript.setText("decript");
        decript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decriptActionPerformed(evt);
            }
        });

        combo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select type function", "OR function", "AND function", "" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });

        round.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        round.setText("number of rounds ");

        key.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        key.setText("key ");

        plaintext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        plaintext.setText("plaintext");
        plaintext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plaintextActionPerformed(evt);
            }
        });

        cipher.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cipher.setText("cipher");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("chooce type of function ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plaintext, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(key, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cipher, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(round, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(decript, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(encript, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combo, 0, 158, Short.MAX_VALUE))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(round, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(key, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(plaintext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cipher, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(encript, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(decript, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void plaintextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plaintextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plaintextActionPerformed

    private void encriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptActionPerformed
        // TODO add your handling code here:
        
        String plain =plaintext.getText();
        String k=key.getText();
        int r=Integer.parseInt(round.getText());
        
        if (combo.getSelectedIndex()==1)
        {
           String oop=Feistel_cipher.encript_or_function(plain, k, r);
           cipher.setText(oop);
        }
        else if(combo.getSelectedIndex()==2)
        {
           String oop=Feistel_cipher.encript_and_function(plain, k, r);
           cipher.setText(oop);
        }
    }//GEN-LAST:event_encriptActionPerformed

    private void decriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decriptActionPerformed
        // TODO add your handling code here:
        String c =cipher.getText();
        String k=key.getText();
        int r =Integer.parseInt(round.getText());
        
        if (combo.getSelectedIndex()==1)
        {
           String oop=Feistel_cipher.decript_or_function(c, k, r);
           plaintext.setText(oop);
        }
        else if(combo.getSelectedIndex()==2)
        {
           String oop=Feistel_cipher.decript_and_function(c, k, r);
           plaintext.setText(oop);
        }
    }//GEN-LAST:event_decriptActionPerformed

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
            java.util.logging.Logger.getLogger(feisrel_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feisrel_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feisrel_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feisrel_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feisrel_jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cipher;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton decript;
    private javax.swing.JButton encript;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField key;
    private javax.swing.JTextField plaintext;
    private javax.swing.JTextField round;
    // End of variables declaration//GEN-END:variables
}