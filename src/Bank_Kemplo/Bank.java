/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank_Kemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author erlangga
 */
public class Bank extends javax.swing.JFrame {

    int hasil, masukan;
    int pin = 8787;
    int gagal = 0;
    String angka = "";
    int saldo = 50000;

    /**
     * Creates new form Bank
     */
    public Bank() {
        initComponents();

        btn1.setVisible(true);
        btn2.setVisible(true);
        btn3.setVisible(true);
        btn4.setVisible(true);
        btn5.setVisible(true);
        btn6.setVisible(true);
        btn7.setVisible(true);
        btn8.setVisible(true);
        btn9.setVisible(true);
        btn0.setVisible(true);
        btn00.setVisible(true);
        btncc.setVisible(true);
        btnok.setVisible(true);
        
        tampil.setText("Masukkan Kata Sandi");
        transaksi.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        isi = new javax.swing.JTextField();
        tampil = new javax.swing.JLabel();
        transaksi = new javax.swing.JComboBox<>();
        btnok = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btncc = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("BANK BERSAMA KITA KEMPLO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(84, 10, 280, 30);

        isi.setEditable(false);
        jPanel1.add(isi);
        isi.setBounds(110, 110, 230, 90);

        tampil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(tampil);
        tampil.setBounds(80, 60, 280, 40);

        transaksi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Transaksi --", "Cek Saldo", "Setor Tunai", "Tarik Tunai" }));
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        jPanel1.add(transaksi);
        transaksi.setBounds(110, 220, 230, 30);

        btnok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnok.setText("OK TOK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        jPanel1.add(btnok);
        btnok.setBounds(230, 260, 110, 60);

        btn7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7);
        btn7.setBounds(110, 320, 70, 60);

        btn4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);
        btn4.setBounds(110, 380, 70, 60);

        btn0.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0);
        btn0.setBounds(110, 500, 160, 60);

        btn5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);
        btn5.setBounds(190, 380, 70, 60);

        btn8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);
        btn8.setBounds(190, 320, 70, 60);

        btn9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);
        btn9.setBounds(270, 320, 70, 60);

        btn6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);
        btn6.setBounds(270, 380, 70, 60);

        btn00.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn00.setText("00");
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        jPanel1.add(btn00);
        btn00.setBounds(270, 500, 70, 60);

        btncc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btncc.setText("CLEAR");
        btncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnccActionPerformed(evt);
            }
        });
        jPanel1.add(btncc);
        btncc.setBounds(110, 260, 110, 60);

        btn1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(110, 440, 70, 60);

        btn2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);
        btn2.setBounds(190, 440, 70, 60);

        btn3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);
        btn3.setBounds(270, 440, 70, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        pin = Integer.parseInt(isi.getText().toString());
        gagal += 1;

        if (pin == 8787) {
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn4.setVisible(true);
            btn5.setVisible(true);
            btn6.setVisible(true);
            btn7.setVisible(true);
            btn8.setVisible(true);
            btn9.setVisible(true);
            btn0.setVisible(true);
            btn00.setVisible(true);
            btncc.setVisible(true);
            btnok.setVisible(true);
           
            tampil.setText(" ");
            transaksi.setVisible(true);
            isi.setText(" ");
            angka = " ";
        } else if (gagal == 3) {
            btn1.setVisible(true);
            btn2.setVisible(true);
            btn3.setVisible(true);
            btn4.setVisible(true);
            btn5.setVisible(true);
            btn6.setVisible(true);
            btn7.setVisible(true);
            btn8.setVisible(true);
            btn9.setVisible(true);
            btn0.setVisible(true);
            btn00.setVisible(true);
            btncc.setVisible(true);
            btnok.setVisible(true);
           
            tampil.setText("Masukkan kata sandi dengan benar");
            transaksi.setVisible(false);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnokActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        angka += "0";
        isi.setText(angka);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        angka += "00";
        isi.setText(angka);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        angka += "1";
        isi.setText(angka);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        angka += "2";
        isi.setText(angka);        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        angka += "3";
        isi.setText(angka);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        angka += "4";
        isi.setText(angka);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        angka += "5";
        isi.setText(angka);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        angka += "6";
        isi.setText(angka);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        angka += "7";
        isi.setText(angka);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        angka += "8";
        isi.setText(angka);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        angka += "9";
        isi.setText(angka);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnccActionPerformed
        isi.setText(" ");
        angka = "";
        // TODO add your handling code here:
    }//GEN-LAST:event_btnccActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        setTransaksi();
        // TODO add your handling code here:
    }//GEN-LAST:event_transaksiActionPerformed

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
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btncc;
    private javax.swing.JButton btnok;
    private javax.swing.JTextField isi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tampil;
    private javax.swing.JComboBox<String> transaksi;
    // End of variables declaration//GEN-END:variables

    private void setTransaksi() {
        if (transaksi.getSelectedItem().equals("-- Pilih Transaksi --")) {
            tampil.setText(" ");
            isi.setText(" ");
        } else if (transaksi.getSelectedItem().equals("Cek Saldo")) {
            
            tampil.setText("Jumlah Saldo Anda Sebesar");
            hasil = saldo;
            saldo = hasil;
            isi.setText("" + saldo);
        } else if (transaksi.getSelectedItem().equals("Setor Tunai")) {
            isi.setText(" ");
            tampil.setText(" ");
            masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah uang yang ingin disetor"));
            hasil = saldo + masukan;
            saldo = hasil;
            if(btnok.isValid()){
                
                tampil.setText("Saldo Anda Sekarang");
            isi.setText(""+saldo);
            }
            

        } else if (transaksi.getSelectedItem().equals("Tarik Tunai")) {
            isi.setText(" ");
            tampil.setText(" ");
            masukan = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah uang yang ingin diambil"));
            hasil = saldo - masukan;
            saldo = hasil;
            if(btnok.isValid()){
                tampil.setText("Saldo Anda Sekarang");
                JOptionPane.showMessageDialog(null,"Jumlah Uang yang Diambil adalah "+masukan);
 


            isi.setText(""+saldo);
            }
        }
    }
}
