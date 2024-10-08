/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Admin;


import Control.Doctor_RegisterController2;
import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
/**
 *
 * @author Deshan Asanka
 */
public class Add_Doctor extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Add_Doctor() {
        initComponents();
        setBackground(new Color(1.0f,1.0f,1.0f,0.8f));   
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelRound2 = new Design.PanelRound();
        panelRound1 = new Design.PanelRound();
        username = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        id = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        NIC = new javax.swing.JTextField();
        roomno = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        specialization = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clear");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(410, 590, 90, 40);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel7.setText("Doctor ID :");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 130, 130, 30);

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel16.setText("Gender :");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel16);
        jLabel16.setBounds(200, 230, 100, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADD");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(740, 590, 120, 40);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CANCEL");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(550, 590, 120, 40);

        panelRound2.setBackground(new java.awt.Color(193, 193, 193));
        panelRound2.setRoundBottomLeft(15);
        panelRound2.setRoundBottomRight(15);
        panelRound2.setRoundTopLeft(15);
        panelRound2.setRoundTopRight(15);
        getContentPane().add(panelRound2);
        panelRound2.setBounds(550, 590, 120, 40);

        panelRound1.setBackground(new java.awt.Color(15, 225, 111));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);
        getContentPane().add(panelRound1);
        panelRound1.setBounds(740, 590, 120, 40);

        username.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(380, 490, 260, 30);

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel17.setText("Password :");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel17);
        jLabel17.setBounds(200, 540, 110, 30);

        password.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        password.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(password);
        password.setBounds(380, 540, 260, 36);

        id.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        id.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id);
        id.setBounds(380, 130, 380, 30);

        year.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        year.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearKeyPressed(evt);
            }
        });
        getContentPane().add(year);
        year.setBounds(900, 340, 120, 30);

        name.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(380, 180, 640, 30);

        contactno.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        contactno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        contactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnoActionPerformed(evt);
            }
        });
        contactno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactnoKeyPressed(evt);
            }
        });
        getContentPane().add(contactno);
        contactno.setBounds(380, 390, 260, 30);

        NIC.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        NIC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(NIC);
        NIC.setBounds(380, 290, 260, 30);

        roomno.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        roomno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(roomno);
        roomno.setBounds(380, 440, 260, 30);

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        male.setText("Male");
        male.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        getContentPane().add(male);
        male.setBounds(380, 230, 110, 30);

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        female.setText("Female");
        female.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(female);
        female.setBounds(590, 230, 160, 30);

        specialization.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        specialization.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anesthesia", "Animal Welfare", "Behavior", "Dentistry", "Dermatology", "Oncology", "Microbiology", "Nutrition", "Ophthalmology", "Pathology", "Radiology", "Surgery", "Theriogenology" }));
        specialization.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(specialization);
        specialization.setBounds(380, 340, 260, 30);

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel14.setText("Username :");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(200, 490, 120, 30);

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel12.setText("Contact No:");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(200, 390, 130, 30);

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel13.setText("Room No :");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(200, 440, 110, 30);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel11.setText("Years of Experience :");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel11);
        jLabel11.setBounds(680, 340, 210, 30);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel10.setText("Specialization :");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(200, 340, 170, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel9.setText("NIC N0 :");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(200, 290, 100, 30);

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel8.setText("Doctor Name :");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 180, 150, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Image/ADD POP1.png"))); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 1200, 675);

        setSize(new java.awt.Dimension(1200, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void contactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnoActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
       // new pop_pass().setVisible(true);
        /*String user_name = null; 
        new AD_Doctor_Details(user_name).setVisible(true);
        
        super.dispose();*/
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
String gender = null;
if (male.isSelected()) {
gender = "Male" ; 
} else if (female.isSelected()){
gender = "Female";
}

String special = specialization.getSelectedItem().toString();
if (id.getText().trim().isEmpty() || username.getText().trim().isEmpty()||password.getText().trim().isEmpty() ){
                 JOptionPane.showMessageDialog(null,"Add all the credentials", "Error" , JOptionPane.ERROR_MESSAGE);}
             else{
     
                 Doctor_RegisterController2.Form(id.getText(), name.getText(),gender, NIC.getText(),special,year.getText(), contactno.getText(), roomno.getText(),username.getText(),password.getText());

this.setVisible(false);
             }
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    id.setText("");
    name.setText("");
    NIC.setText("");
    year.setText("");
    contactno.setText("");
    roomno.setText("");
    username.setText("");
    password.setText("");
    male.setSelected(true);
    specialization.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void yearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyPressed
      char c = evt.getKeyChar();
if(Character.isLetter(c)){
  year.setEditable(false);
   JOptionPane.showMessageDialog(null, "Please Enter Numbers only", "Error",JOptionPane.ERROR_MESSAGE);
  //contactno.setText("Please Enter Numbers only");
}
else
{
  year.setEditable(true);   
}          // TODO add your handling code here:
    }//GEN-LAST:event_yearKeyPressed

    private void contactnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactnoKeyPressed
             char c = evt.getKeyChar();
if(Character.isLetter(c)){
  contactno.setEditable(false);
   JOptionPane.showMessageDialog(null, "Please Enter Numbers only", "Error",JOptionPane.ERROR_MESSAGE);
  //contactno.setText("Please Enter Numbers only");
}
else
{
  contactno.setEditable(true);   
}  
    }//GEN-LAST:event_contactnoKeyPressed

    /**
     * @param args the command line arguments
     */
    
public void clearField(){
id.setText("");
name.setText("");
NIC.setText("");
year.setText("");
contactno.setText("");
roomno.setText("");
username.setText("");
password.setText("");
male.setSelected(true);}
    
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
            java.util.logging.Logger.getLogger(Add_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NIC;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField contactno;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private Design.PanelRound panelRound1;
    private Design.PanelRound panelRound2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField roomno;
    private javax.swing.JComboBox<String> specialization;
    private javax.swing.JTextField username;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
