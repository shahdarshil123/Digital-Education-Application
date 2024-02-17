/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.workArea.Student;

import Business.Business;
import Business.Course.StudentBrowseCourses;
import Business.Course.StudentCourses;
import Business.UserAccounts.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author anusreemohanan
 */
public class StudentViewNewCourseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentViewNewCourse
     */
    JPanel workAreaPanel;
    UserAccount userAccount;
    StudentBrowseCourses studentBrowseCourses;
    public StudentViewNewCourseJPanel(JPanel workAreaPanel, UserAccount userAccount, StudentBrowseCourses studentBrowseCourses) {
        initComponents();
        this.workAreaPanel = workAreaPanel;
        this.userAccount = userAccount;
        this.studentBrowseCourses = studentBrowseCourses;
        populateDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewNewCourse = new javax.swing.JLabel();
        lblCourseID = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        lblProfessorName = new javax.swing.JLabel();
        lblRegion = new javax.swing.JLabel();
        lblLanguage = new javax.swing.JLabel();
        lblSpecialization = new javax.swing.JLabel();
        txtCourseID = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        txtProfessorName = new javax.swing.JTextField();
        txtSpecialization = new javax.swing.JTextField();
        txtRegion = new javax.swing.JTextField();
        txtLanguage = new javax.swing.JTextField();
        txtRating = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 153, 255));

        lblViewNewCourse.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblViewNewCourse.setForeground(new java.awt.Color(255, 255, 255));
        lblViewNewCourse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewNewCourse.setText("View New Course Details");

        lblCourseID.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        lblCourseID.setForeground(new java.awt.Color(255, 255, 255));
        lblCourseID.setText("Course ID:");

        lblCourseName.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        lblCourseName.setForeground(new java.awt.Color(255, 255, 255));
        lblCourseName.setText("Course Name:");

        lblRating.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        lblRating.setForeground(new java.awt.Color(255, 255, 255));
        lblRating.setText("Rating:");

        lblProfessorName.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        lblProfessorName.setForeground(new java.awt.Color(255, 255, 255));
        lblProfessorName.setText("Professor Name:");

        lblRegion.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        lblRegion.setForeground(new java.awt.Color(255, 255, 255));
        lblRegion.setText("Region:");

        lblLanguage.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        lblLanguage.setForeground(new java.awt.Color(255, 255, 255));
        lblLanguage.setText("Language:");

        lblSpecialization.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        lblSpecialization.setForeground(new java.awt.Color(255, 255, 255));
        lblSpecialization.setText("Specialization:");

        txtCourseID.setEnabled(false);
        txtCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseIDActionPerformed(evt);
            }
        });

        txtCourseName.setEnabled(false);

        txtProfessorName.setEnabled(false);
        txtProfessorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfessorNameActionPerformed(evt);
            }
        });

        txtSpecialization.setEnabled(false);

        txtRegion.setEnabled(false);

        txtLanguage.setEnabled(false);
        txtLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLanguageActionPerformed(evt);
            }
        });

        txtRating.setEnabled(false);
        txtRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRatingActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblViewNewCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblCourseName)
                                    .addComponent(lblCourseID)
                                    .addComponent(lblProfessorName)
                                    .addComponent(lblSpecialization)
                                    .addComponent(lblRegion)
                                    .addComponent(lblLanguage)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(lblRating)))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 194, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblViewNewCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseID))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCourseName))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProfessorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProfessorName))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSpecialization))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLanguage)
                    .addComponent(txtLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRating)
                    .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCourseID, lblCourseName, lblLanguage, lblProfessorName, lblRating, lblRegion, lblSpecialization, txtCourseID, txtCourseName, txtLanguage, txtProfessorName, txtRating, txtRegion, txtSpecialization});

    }// </editor-fold>//GEN-END:initComponents

    private void txtProfessorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfessorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfessorNameActionPerformed

    private void txtLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLanguageActionPerformed

    private void txtRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRatingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRatingActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workAreaPanel.remove(this);
        CardLayout layout = (CardLayout)workAreaPanel.getLayout();
        layout.previous(workAreaPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblCourseID;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblProfessorName;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblSpecialization;
    private javax.swing.JLabel lblViewNewCourse;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtProfessorName;
    private javax.swing.JTextField txtRating;
    private javax.swing.JTextField txtRegion;
    private javax.swing.JTextField txtSpecialization;
    // End of variables declaration//GEN-END:variables

    private void populateDetails() {
        txtCourseID.setText(Integer.toString(studentBrowseCourses.getCourseSemester().getCourse().getCourseID()));
        txtCourseName.setText(studentBrowseCourses.getCourseSemester().getCourse().getCourseName());
        txtProfessorName.setText(studentBrowseCourses.getProfessor().getPerson().getPersonName());
        txtSpecialization.setText(studentBrowseCourses.getProfessor().getSpecialization());
        txtRegion.setText(studentBrowseCourses.getProfessor().getRegion());
        txtLanguage.setText(studentBrowseCourses.getProfessor().getLanguage());
       txtRating.setText(Double.toString(studentBrowseCourses.getProfessor().getRating()));
    }
}