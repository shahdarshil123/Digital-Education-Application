/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.workArea.Student;

import Business.Business;
import Business.UserAccounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author anusreemohanan
 */
public class StudentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentWorkAreaJPanel
     */
    JPanel workAreaPanel;
    UserAccount userAccount;
    Business business;
    public StudentWorkAreaJPanel(JPanel workAreaPanel, UserAccount userAccount,Business business) {
        initComponents();
        this.workAreaPanel = workAreaPanel;
        this.userAccount = userAccount;
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

        lbStudentWorkArea = new javax.swing.JLabel();
        btnStudentProfile = new javax.swing.JButton();
        btnStudentRegCourse = new javax.swing.JButton();
        btnTranscripts = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 153, 255));

        lbStudentWorkArea.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbStudentWorkArea.setForeground(new java.awt.Color(255, 255, 255));
        lbStudentWorkArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbStudentWorkArea.setText("Student Portal");

        btnStudentProfile.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnStudentProfile.setText("My Profile");
        btnStudentProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentProfileActionPerformed(evt);
            }
        });

        btnStudentRegCourse.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnStudentRegCourse.setText("My Courses");
        btnStudentRegCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentRegCourseActionPerformed(evt);
            }
        });

        btnTranscripts.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnTranscripts.setText("Coursework");
        btnTranscripts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranscriptsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbStudentWorkArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnStudentProfile)
                .addGap(130, 130, 130)
                .addComponent(btnStudentRegCourse)
                .addGap(124, 124, 124)
                .addComponent(btnTranscripts)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbStudentWorkArea, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStudentProfile)
                    .addComponent(btnStudentRegCourse)
                    .addComponent(btnTranscripts))
                .addContainerGap(577, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentProfileActionPerformed
        // TODO add your handling code here:
        StudentProfileJPanel studentProfilePanel = new StudentProfileJPanel(workAreaPanel,userAccount);
        workAreaPanel.add("StudentProfileJPanel",studentProfilePanel);
        CardLayout layout = (CardLayout) workAreaPanel.getLayout();
        layout.next(workAreaPanel);        
    }//GEN-LAST:event_btnStudentProfileActionPerformed

    private void btnStudentRegCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentRegCourseActionPerformed
        // TODO add your handling code here:
        StudentRegisteredCoursesJPanel studentRegisteredCoursesPanel = new StudentRegisteredCoursesJPanel(workAreaPanel,userAccount,business);
        workAreaPanel.add("StudentRegisteredCoursesJPanel",studentRegisteredCoursesPanel);
        CardLayout layout = (CardLayout) workAreaPanel.getLayout();
        layout.next(workAreaPanel);  
    }//GEN-LAST:event_btnStudentRegCourseActionPerformed

    private void btnTranscriptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranscriptsActionPerformed
        // TODO add your handling code here:
        StudentCourseworkJPanel studentCourseworkPanel = new StudentCourseworkJPanel( workAreaPanel,userAccount, business);
        workAreaPanel.add("StudentCourseworkJPanel",studentCourseworkPanel);
        CardLayout layout = (CardLayout) workAreaPanel.getLayout();
        layout.next(workAreaPanel);         
        
    }//GEN-LAST:event_btnTranscriptsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStudentProfile;
    private javax.swing.JButton btnStudentRegCourse;
    private javax.swing.JButton btnTranscripts;
    private javax.swing.JLabel lbStudentWorkArea;
    // End of variables declaration//GEN-END:variables
}
