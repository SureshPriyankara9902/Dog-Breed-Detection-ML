/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.Admin.Admin_Login;
import View.Doctor.Doctor_Login;
import View.Pharmacist.Pharmacist_Login;
import View.Receptionist.Receptionist_Login;
import java.awt.geom.RoundRectangle2D;
/**
 *
 * @author Deshan Asanka
 */
public class Login_user_type extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login_user_type() {
        initComponents();
        
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 35, 35));
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
        DrPet = new javax.swing.JLabel();
        Login_TextField = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        User_Type1 = new javax.swing.JLabel();
        User_Type2 = new javax.swing.JLabel();
        User_Type3 = new javax.swing.JLabel();
        AdminBtn = new javax.swing.JLabel();
        DoctorBtn = new javax.swing.JLabel();
        PharmacistBtn = new javax.swing.JLabel();
        ReciptionistBtn = new javax.swing.JLabel();
        Cross = new javax.swing.JLabel();
        User_Type = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(null);

        DrPet.setFont(new java.awt.Font("Calibri", 1, 45)); // NOI18N
        DrPet.setForeground(new java.awt.Color(0, 204, 51));
        DrPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/full w logo.png"))); // NOI18N
        jPanel1.add(DrPet);
        DrPet.setBounds(20, 20, 220, 80);

        Login_TextField.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        Login_TextField.setForeground(new java.awt.Color(0, 153, 102));
        Login_TextField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Login_TextField.setText("Login As");
        jPanel1.add(Login_TextField);
        Login_TextField.setBounds(50, 110, 770, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/rr.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 110, 840, 50);

        User_Type1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        User_Type1.setForeground(new java.awt.Color(255, 255, 255));
        User_Type1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User_Type1.setText("Doctor");
        jPanel1.add(User_Type1);
        User_Type1.setBounds(290, 320, 120, 30);

        User_Type2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        User_Type2.setForeground(new java.awt.Color(255, 255, 255));
        User_Type2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User_Type2.setText("Pharmacist");
        jPanel1.add(User_Type2);
        User_Type2.setBounds(470, 320, 120, 30);

        User_Type3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        User_Type3.setForeground(new java.awt.Color(255, 255, 255));
        User_Type3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User_Type3.setText("Receptionist");
        jPanel1.add(User_Type3);
        User_Type3.setBounds(650, 320, 130, 30);

        AdminBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/1Admin2.png"))); // NOI18N
        AdminBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminBtnMouseClicked(evt);
            }
        });
        jPanel1.add(AdminBtn);
        AdminBtn.setBounds(130, 210, 80, 80);

        DoctorBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DoctorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/1Doctor2.png"))); // NOI18N
        DoctorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DoctorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoctorBtnMouseClicked(evt);
            }
        });
        jPanel1.add(DoctorBtn);
        DoctorBtn.setBounds(300, 200, 100, 100);

        PharmacistBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PharmacistBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/1Pharmacist2.png"))); // NOI18N
        PharmacistBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PharmacistBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PharmacistBtnMouseClicked(evt);
            }
        });
        jPanel1.add(PharmacistBtn);
        PharmacistBtn.setBounds(490, 200, 80, 100);

        ReciptionistBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReciptionistBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/1Receptionist2.png"))); // NOI18N
        ReciptionistBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReciptionistBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReciptionistBtnMouseClicked(evt);
            }
        });
        jPanel1.add(ReciptionistBtn);
        ReciptionistBtn.setBounds(670, 210, 80, 80);

        Cross.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cross.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/Cross.png"))); // NOI18N
        Cross.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cross.setPreferredSize(new java.awt.Dimension(25, 25));
        Cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrossMouseClicked(evt);
            }
        });
        jPanel1.add(Cross);
        Cross.setBounds(840, 10, 30, 30);

        User_Type.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        User_Type.setForeground(new java.awt.Color(255, 255, 255));
        User_Type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User_Type.setText("Admin");
        jPanel1.add(User_Type);
        User_Type.setBounds(120, 320, 100, 30);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/login type-01-01.png"))); // NOI18N
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(Back);
        Back.setBounds(0, 0, 880, 495);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(880, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CrossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrossMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CrossMouseClicked

    private void AdminBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminBtnMouseClicked
       new Admin_Login().setVisible(true); 
     super.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_AdminBtnMouseClicked

    private void DoctorBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoctorBtnMouseClicked
        new Doctor_Login().setVisible(true); 
     super.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_DoctorBtnMouseClicked

    private void PharmacistBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PharmacistBtnMouseClicked
        new Pharmacist_Login().setVisible(true); 
     super.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_PharmacistBtnMouseClicked

    private void ReciptionistBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReciptionistBtnMouseClicked
        new Receptionist_Login().setVisible(true); 
     super.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_ReciptionistBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Login_user_type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_user_type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_user_type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_user_type.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_user_type().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminBtn;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Cross;
    private javax.swing.JLabel DoctorBtn;
    private javax.swing.JLabel DrPet;
    private javax.swing.JLabel Login_TextField;
    private javax.swing.JLabel PharmacistBtn;
    private javax.swing.JLabel ReciptionistBtn;
    private javax.swing.JLabel User_Type;
    private javax.swing.JLabel User_Type1;
    private javax.swing.JLabel User_Type2;
    private javax.swing.JLabel User_Type3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
