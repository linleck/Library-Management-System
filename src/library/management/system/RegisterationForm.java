/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author linleckkyalsin
 */
public class RegisterationForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterationForm
     */
    public RegisterationForm() {
        initComponents();
    }
    
    private String hashPassword(String password) throws NoSuchAlgorithmException {
    // Create a MessageDigest instance for SHA-256
    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    
    // Convert the password string into bytes
    byte[] hashedBytes = digest.digest(password.getBytes());
    
    // Convert the hashed bytes into a hexadecimal string
    StringBuilder hexString = new StringBuilder();
    for (byte b : hashedBytes) {
        hexString.append(String.format("%02x", b));
    }
    
    return hexString.toString(); // return the hashed password
    
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
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        stuName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stuId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contactNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailAdd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        registerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(400, 600));
        Right.setSize(new java.awt.Dimension(400, 600));
        Right.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Baloo Bhai 2", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UIT Library");
        Right.add(jLabel1);
        jLabel1.setBounds(195, 129, 169, 58);

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/linleckkyalsin/Downloads/UIT-Logo-big-2.png")); // NOI18N
        Right.add(jLabel8);
        jLabel8.setBounds(39, 62, 150, 134);

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 600);
        Right.getAccessibleContext().setAccessibleName("");

        Left.setPreferredSize(new java.awt.Dimension(400, 600));
        Left.setSize(new java.awt.Dimension(400, 600));

        jLabel2.setText("Student Name");

        stuName.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        stuName.setForeground(new java.awt.Color(153, 153, 153));
        stuName.setBorder(null);
        stuName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Student ID");

        stuId.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        stuId.setForeground(new java.awt.Color(153, 153, 153));
        stuId.setBorder(null);
        stuId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuIdActionPerformed(evt);
            }
        });

        jLabel4.setText("Contact Number ");

        contactNo.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        contactNo.setBorder(null);
        contactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNoActionPerformed(evt);
            }
        });

        jLabel5.setText("Email Address");

        emailAdd.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        emailAdd.setBorder(null);
        emailAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailAddActionPerformed(evt);
            }
        });

        jLabel6.setText("Password");

        pass.setBorder(null);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        registerBtn.setBackground(new java.awt.Color(0, 102, 102));
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Register");
        registerBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)
                        .addComponent(emailAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(contactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(stuId, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addComponent(stuName)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(stuName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(stuId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(emailAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Register");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stuNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stuNameActionPerformed

    private void stuIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stuIdActionPerformed

    private void contactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNoActionPerformed

    private void emailAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailAddActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        //System.out.println("Register");
        String studentName, studentId, contactNumber, email, password, query, hashedPassword;
        String SUrl, SUser, SPass;
        SUrl = "jdbc:MySQL://localhost:3308/library_database";
        SUser = "root";
        SPass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
            if("".equals(stuName.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Student Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if("".equals(stuId.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Student Id is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if("".equals(contactNo.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Contact Number is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if("".equals(emailAdd.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if("".equals(pass.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Email Address is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                studentName = stuName.getText();
                studentId = stuId.getText();
                contactNumber = contactNo.getText();
                email = emailAdd.getText();
                password = pass.getText();
                hashedPassword = hashPassword(password);
                query = "INSERT INTO student(student_name, student_id, contact_number, email, password)"
                        +"VALUES('"+studentName+"', '"+studentId+"', '"+contactNumber+"', '"+email+"', '"+hashedPassword+"')";
                st.execute(query);
                stuName.setText("");
                stuId.setText("");
                contactNo.setText("");
                emailAdd.setText("");
                pass.setText("");
                showMessageDialog(null, "Registration Successful! Welcome to the Library.");
            }
        } catch(Exception e){
            System.out.println("Error!" + e.getMessage());
        }
    }//GEN-LAST:event_registerBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JTextField contactNo;
    private javax.swing.JTextField emailAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField stuId;
    private javax.swing.JTextField stuName;
    // End of variables declaration//GEN-END:variables
}
