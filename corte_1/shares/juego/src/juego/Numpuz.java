/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Random;
import java.util.Stack;
import javax.swing.*;

/**
 *
 * @author Windows 11
 */
public class Numpuz extends javax.swing.JFrame {
int aleatorio[]=new int [8];
    /**
     * Creates new form Numpuz
     */
    public Numpuz() {
        initComponents();
        this.setLocationRelativeTo(null);
        numero();
        jButton1.setText(String.valueOf(aleatorio[0]));
        jButton2.setText(String.valueOf(aleatorio[1]));
        jButton3.setText(String.valueOf(aleatorio[2]));
        jButton4.setText(String.valueOf(aleatorio[3]));
        jButton5.setText(String.valueOf(aleatorio[4]));
        jButton6.setText(String.valueOf(aleatorio[5]));
        jButton7.setText(String.valueOf(aleatorio[6]));
        jButton8.setText(String.valueOf(aleatorio[7]));
        
       
    }
    
  
    
    public void ver(JButton b1,JButton b2,JButton b3){
        if(b1.getText()!=""){
            if(b2.getText()==""){
                b2.setText(b1.getText());
                b1.setText("");
            }else if(b3.getText()==""){
                b3.setText(b1.getText());
                b1.setText("");
            }
        }
        verificarFinalizacion(); 
    }
     public void ver(JButton b1,JButton b2,JButton b3,JButton b4){
        if(b1.getText()!=""){
            if(b2.getText()==""){
                b2.setText(b1.getText());
                b1.setText("");
               }else if(b3.getText()==""){
                b3.setText(b1.getText());
                b1.setText("");
             } else if(b4.getText()==""){
                b4.setText(b1.getText());
                b1.setText("");
        }
      }
        verificarFinalizacion(); 
     }
      public void ver(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5){
        if(b1.getText()!=""){
            if(b2.getText()==""){
                b2.setText(b1.getText());
                b1.setText("");
            } if(b3.getText()==""){
                b3.setText(b1.getText());
                b1.setText("");
             }else if(b4.getText()==""){
                b4.setText(b1.getText());
                b1.setText("");
        } else if(b5.getText()==""){
                b5.setText(b1.getText());
                b1.setText("");
        }
         
        }
           verificarFinalizacion();
    }
public void numero(){
    Stack <Integer> numero = new Stack<Integer>();
    Random rnd = new Random();
    int alea;
    
    for (int i=0;i<8;i++){
        alea=rnd.nextInt(8)+1;
        while(numero.contains(alea)){
            alea= rnd.nextInt(8)+1;
        }
        numero.push(alea);
        aleatorio[i]=alea;
        System.out.println(aleatorio[i]);
    }
    
}
 private void verificarFinalizacion() {
         String[] ordenCorrecto = {"1", "2", "3", "4", "5", "6", "7", "8"};
        JButton[] botones = {jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8};

        for (int i = 0; i < botones.length; i++) {
            if (!botones[i].getText().equals(ordenCorrecto[i])) {
                return; 
            }
        }

        JOptionPane.showMessageDialog(this, "¡Felicidades, has terminado!");
        System.exit(0); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(210, 180, 140));
        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, 90));

        jButton8.setBackground(new java.awt.Color(210, 180, 140));
        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 80, 90));

        jButton9.setBackground(new java.awt.Color(210, 180, 140));
        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 80, 90));

        jButton4.setBackground(new java.awt.Color(210, 180, 140));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 90));

        jButton5.setBackground(new java.awt.Color(210, 180, 140));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 80, 90));

        jButton6.setBackground(new java.awt.Color(210, 180, 140));
        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 80, 90));

        jButton1.setBackground(new java.awt.Color(210, 180, 140));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 90));

        jButton2.setBackground(new java.awt.Color(210, 180, 140));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 80, 90));

        jButton3.setBackground(new java.awt.Color(210, 180, 140));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 80, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1ef486a24dd55567a11479379f02a2f3.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 240, 270));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wood-textures-1920x1080-abstract-textures-hd-art-wallpaper-preview.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      ver(jButton1,jButton2,jButton4);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ver(jButton2,jButton1,jButton3,jButton5); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         ver(jButton6,jButton3,jButton9,jButton5);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      ver(jButton7,jButton8,jButton4);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       ver(jButton3,jButton2,jButton6);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     ver(jButton9,jButton8,jButton6);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          ver(jButton4,jButton1,jButton7,jButton5);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         ver(jButton8,jButton7,jButton9,jButton5);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       ver(jButton5,jButton4,jButton6,jButton8,jButton2); 
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Numpuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Numpuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Numpuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Numpuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Numpuz().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
