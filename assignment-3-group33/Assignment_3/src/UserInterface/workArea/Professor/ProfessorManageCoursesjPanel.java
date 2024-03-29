package UserInterface.workArea.Professor;


import Business.Business;
import Business.Course.Course;
import Business.Course.CourseDirectory;
import Business.Course.CourseSemester;
import Business.Course.ProfessorCourses;
import Business.Course.StudentBrowseCourses;
import Business.Course.StudentBrowseCoursesDirectory;
import Business.Person.Person;
import Business.UserAccounts.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Chiranjit Banerjee
 */
public class ProfessorManageCoursesjPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfessorManageCoursesjPanel
     */
     JPanel workAreaPanel;
     UserAccount userAccount;
     CourseDirectory courseList;
     Business business;
     ProfessorCourses profCourses;
     StudentBrowseCoursesDirectory studentBrowseCourseList;
     
    //public ArrayList<Course> professorCourseList;

    public ProfessorManageCoursesjPanel(JPanel workAreaPanel, UserAccount userAccount, Business business) {
        initComponents();
        this.workAreaPanel = workAreaPanel;
        this.userAccount = userAccount;
        this.business = business;
        this.courseList= business.getCourseList();
        //System.out.println(userAccount.getProfessorProfile().getPerson().getPersonId());
        this.profCourses = business.getProfCoursesList().findProfessorCourses(userAccount.getProfessorProfile().getPerson().getPersonId());
        this.studentBrowseCourseList = business.getStudentBrowseCoursesList();
        //this.professorCourseList = new ArrayList<Course>();
        populateOptionsTable();
        populateSelectedTable();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOptions = new javax.swing.JTable();
        btnADD = new javax.swing.JButton();
        btnDELETE = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSelected = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblCourseCatalog = new javax.swing.JLabel();
        combtnSemester = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 153, 255));

        tblOptions.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tblOptions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COURSE ID", "COURSE NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOptions);
        if (tblOptions.getColumnModel().getColumnCount() > 0) {
            tblOptions.getColumnModel().getColumn(0).setResizable(false);
            tblOptions.getColumnModel().getColumn(1).setResizable(false);
        }

        btnADD.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnADD.setText("ADD");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        btnDELETE.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDELETE.setText("DELETE");
        btnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEActionPerformed(evt);
            }
        });

        tblSelected.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        tblSelected.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COURSE ID", "COURSE NAME", "SEMSTER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSelected);
        if (tblSelected.getColumnModel().getColumnCount() > 0) {
            tblSelected.getColumnModel().getColumn(0).setResizable(false);
            tblSelected.getColumnModel().getColumn(1).setResizable(false);
            tblSelected.getColumnModel().getColumn(2).setResizable(false);
        }

        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCourseCatalog.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCourseCatalog.setForeground(new java.awt.Color(255, 255, 255));
        lblCourseCatalog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCourseCatalog.setText("Course Catalog");

        combtnSemester.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        combtnSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Spring 2024", "Summer 2024", "Fall 2024", "Spring 2025" }));
        combtnSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combtnSemesterActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(btnBack)
                            .addGap(112, 112, 112)
                            .addComponent(btnADD, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(131, 131, 131)
                            .addComponent(btnDELETE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combtnSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lblCourseCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnADD, btnDELETE});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblCourseCatalog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADD, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack)
                    .addComponent(btnDELETE)
                    .addComponent(combtnSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addGap(0, 125, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnADD, btnBack, btnDELETE});

    }// </editor-fold>//GEN-END:initComponents

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblOptions.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select course from Course Catalog to add");
            return;
        }
        DefaultTableModel tableModel = (DefaultTableModel) tblOptions.getModel();
        Course course = (Course)tableModel.getValueAt(selectedRowIndex,0);
       //userAccount.getProfessorProfile().getCourseList().addCourse(course);
       String semester = combtnSemester.getSelectedItem().toString();
       if(profCourses.findCourseSemester(course, semester)== null){
        CourseSemester courseSemester = profCourses.addCourseSemester(course,semester);
        StudentBrowseCourses studentBrowseCourses = studentBrowseCourseList.addProfessorCourse(userAccount.getProfessorProfile(), courseSemester);
        populateSelectedTable();
         
       }
       else{
          JOptionPane.showMessageDialog(this,"Course: "+course.getCourseName()+" for Semester: "+semester+" already added to list"); 
       }
    }//GEN-LAST:event_btnADDActionPerformed

    private void btnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblSelected.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this,"Please select row from Course Catalog to delete");
            return;
        }
        
        DefaultTableModel tableModel = (DefaultTableModel) tblSelected.getModel();
        CourseSemester courseSemester = (CourseSemester) tableModel.getValueAt(selectedRowIndex, 0);
        profCourses.deleteCourseSemester(courseSemester);
        studentBrowseCourseList.removeProfessorCourses(profCourses.getProfProfile(),courseSemester.getCourse());
        populateSelectedTable();
    }//GEN-LAST:event_btnDELETEActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workAreaPanel.remove(this);
        CardLayout layout = (CardLayout)workAreaPanel.getLayout();
        layout.previous(workAreaPanel);

    }//GEN-LAST:event_btnBackActionPerformed

    private void combtnSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combtnSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combtnSemesterActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Course list saved.");
        return;
    }//GEN-LAST:event_btnSaveActionPerformed
 private void populateOptionsTable() {
       DefaultTableModel dtm = (DefaultTableModel) tblOptions.getModel();
       dtm.setRowCount(0);
       for(Course course: courseList.getCourseList()){
           Object[] row = new Object[2];
           row[0] = course;
           row[1]= course.getCourseName();
           dtm.addRow(row);
       }
 }
 
private void populateSelectedTable(){
       DefaultTableModel dtm = (DefaultTableModel) tblSelected.getModel();
       dtm.setRowCount(0);
       for(CourseSemester courseSemester: profCourses.getProfCourseList()){
           Object[] row = new Object[3];
           row[0] = courseSemester;
           row[1]= courseSemester.getCourse().getCourseName();
           row[2] = courseSemester.getSemester();
           dtm.addRow(row);
       }
} 



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDELETE;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> combtnSemester;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCourseCatalog;
    private javax.swing.JTable tblOptions;
    private javax.swing.JTable tblSelected;
    // End of variables declaration//GEN-END:variables
}

