/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Pharmacist;


import View.Admin.*;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
/**
 *
 * @author Deshan Asanka
 */
public class Delete_Drug_pop1 extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    public Delete_Drug_pop1() {
        initComponents();
        setBackground(new Color(1.0f,1.0f,1.0f,0.4f));   
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

        Idtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JLabel();
        panelRound1 = new Design.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        Idtxt.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdtxtActionPerformed(evt);
            }
        });
        getContentPane().add(Idtxt);
        Idtxt.setBounds(470, 300, 190, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/icons8_back_arrow_25px.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(390, 390, 30, 30);

        DeleteBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteBtn.setText("DELETE");
        DeleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        getContentPane().add(DeleteBtn);
        DeleteBtn.setBounds(510, 360, 120, 40);

        panelRound1.setBackground(new java.awt.Color(39, 212, 59));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);
        getContentPane().add(panelRound1);
        panelRound1.setBounds(510, 360, 120, 40);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter ID :");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 270, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/pop-01.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 160, 420, 290);

        setSize(new java.awt.Dimension(1200, 675));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IdtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdtxtActionPerformed

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
if (Idtxt.getText().trim().isEmpty()){
                 JOptionPane.showMessageDialog(null,"Add ID NO", "Error" , JOptionPane.ERROR_MESSAGE);}
             else{
                String Id = Idtxt.getText(); 
new Delete_Drug_pop2(Id).setVisible(true);
super.dispose();
             }
        
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

        super.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Delete_Drug_pop1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Drug_pop1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Drug_pop1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Drug_pop1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Drug_pop1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DeleteBtn;
    private javax.swing.JTextField Idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private Design.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
