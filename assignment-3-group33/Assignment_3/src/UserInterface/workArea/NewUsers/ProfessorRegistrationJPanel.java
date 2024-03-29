/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.workArea.NewUsers;

import Business.Business;
import Business.Course.ProfessorCourses;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.ProfessorDirectory;
import Business.Profiles.ProfessorProfile;
import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Darshil Shah
 */
public class ProfessorRegistrationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorRegistrationJPanel
     */
    Business business;
    JPanel workAreaPanel;
    public ProfessorRegistrationJPanel(JPanel workAreaPanel, Business business) {
        initComponents();
        this.workAreaPanel = workAreaPanel;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProfessorName = new javax.swing.JLabel();
        txtProfessorName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        lblProfessorRegistration = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 153, 255));

        lblProfessorName.setForeground(new java.awt.Color(255, 255, 255));
        lblProfessorName.setText("Professor Name");

        txtProfessorName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtProfessorName.setAutoscrolls(false);
        txtProfessorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfessorNameActionPerformed(evt);
            }
        });

        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Username");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");

        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnSignup.setText("Sign up");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        lblProfessorRegistration.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblProfessorRegistration.setForeground(new java.awt.Color(255, 255, 255));
        lblProfessorRegistration.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProfessorRegistration.setText("Professor Registration");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblProfessorRegistration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtUsername))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblProfessorRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfessorName)
                    .addComponent(txtProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtProfessorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfessorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfessorNameActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String name = txtProfessorName.getText();
        if(username.equals("")){
           JOptionPane.showMessageDialog(null,"Please create username");
           return;
        }
        if(password.equals((""))){
           JOptionPane.showMessageDialog(null,"Please create password");
           return; 
        }
        if(name.equals("")){
           JOptionPane.showMessageDialog(null,"Please enter your name");
           return;
        }        
        UserAccountDirectory userAccountList = business.getUserAccountList();
        UserAccount userAccount = userAccountList.searchUserAccount(username);
        if(userAccount == null){
            PersonDirectory personList = business.getPersonList();
            Person person = personList.addPerson(name);
            ProfessorDirectory professorList = business.getProfessorList();
            ProfessorProfile professor = professorList.addProfessor(person);
            userAccount = userAccountList.addProfessorAccount(professor,username,password);
            ProfessorCourses profCourses = business.getProfCoursesList().addProfessorCourses(professor);
            System.out.println("Professor Details: ");
            System.out.println("Professor Username: "+ userAccount.getUsername());
            System.out.println("Professor Password: "+ userAccount.getPassword());
            System.out.println("Professor Role: "+ professor.getRole());
            System.out.println("Professor id: "+ person.getPersonId());
            System.out.println("Professor name: "+person.getPersonName());
            System.out.println();
            JOptionPane.showMessageDialog(null,"Professor Added successfully.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Username already exists");
        }
    }//GEN-LAST:event_btnSignupActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProfessorName;
    private javax.swing.JLabel lblProfessorRegistration;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtProfessorName;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
