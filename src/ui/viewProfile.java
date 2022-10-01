/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.EmpDet;

/**
 *
 * @author verma
 */
public class viewProfile extends javax.swing.JPanel {

    /**
     * Creates new form viewProfile
     */
    EmpDet emp;
    public viewProfile(EmpDet emp) {
        initComponents();
        this.emp = emp;
        displayUserProfile();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        varGender1 = new javax.swing.JTextField();
        varDate1 = new javax.swing.JTextField();
        varName = new javax.swing.JLabel();
        varId = new javax.swing.JLabel();
        varAge = new javax.swing.JLabel();
        varGender = new javax.swing.JLabel();
        varDate = new javax.swing.JLabel();
        varMail = new javax.swing.JLabel();
        varLevel1 = new javax.swing.JTextField();
        varInfo1 = new javax.swing.JTextField();
        varTitle1 = new javax.swing.JTextField();
        varLevel = new javax.swing.JLabel();
        varInfo = new javax.swing.JLabel();
        varTitle = new javax.swing.JLabel();
        varPhone1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        varPhone = new javax.swing.JLabel();
        varMail1 = new javax.swing.JTextField();
        btnView1 = new javax.swing.JButton();
        varUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        searchName = new javax.swing.JTextField();
        varName1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        varId1 = new javax.swing.JTextField();
        varAge1 = new javax.swing.JTextField();
        viewPhoto = new javax.swing.JButton();

        varName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varName.setText("Name:");

        varId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varId.setText("Employee Id:");

        varAge.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varAge.setText("Age:");

        varGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varGender.setText("Gender:");

        varDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varDate.setText("Start Date:");

        varMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varMail.setText("E-Mail:");

        varLevel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varLevel.setText("Level:");

        varInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varInfo.setText("Team Info:");

        varTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varTitle.setText("Position Title:");

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Emp ID", "Age", "Gender", "Start Date", "Level", "Team", "Title", "Phone", "E-Mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmp);

        varPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varPhone.setText("Phone:");

        varMail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varMail1ActionPerformed(evt);
            }
        });

        btnView1.setText("VIEW");
        btnView1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnView1ActionPerformed(evt);
            }
        });

        varUpdate.setText("UPDATE");
        varUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        searchName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchNameKeyReleased(evt);
            }
        });

        varName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varName1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Search:");

        varId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varId1ActionPerformed(evt);
            }
        });

        viewPhoto.setText("VIEW PHOTO");
        viewPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(varId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(varName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(varAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(varGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(varDate, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(varId1)
                                    .addComponent(varAge1)
                                    .addComponent(varGender1)
                                    .addComponent(varName1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(varDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(varLevel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(varInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(varMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(varPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(varTitle, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(varLevel1)
                            .addComponent(varInfo1)
                            .addComponent(varTitle1)
                            .addComponent(varPhone1)
                            .addComponent(varMail1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(varUpdate)
                                .addGap(39, 39, 39))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnView1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDelete))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(viewPhoto)
                                        .addGap(25, 25, 25)))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchName, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView1)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(varUpdate)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(varLevel)
                                                    .addComponent(varLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(varInfo))
                                            .addComponent(varInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(varTitle)
                                            .addComponent(varTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(varPhone))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(varPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(viewPhoto)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(varMail)
                                    .addComponent(varMail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(varName)
                                    .addComponent(varName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(varId)
                                    .addComponent(varId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(varAge)
                                    .addComponent(varAge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(varGender)
                                    .addComponent(varGender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(varDate)
                                    .addComponent(varDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void varMail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varMail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varMail1ActionPerformed

    private void btnView1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnView1ActionPerformed
        // TODO add your handling code here:
        int selectRowView=tblEmp.getSelectedRow();
        if(selectRowView<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a valid row");
            return;
        }
        DefaultTableModel model=(DefaultTableModel) tblEmp.getModel();

        varName1.setText(model.getValueAt(selectRowView,0).toString());
        varId1.setText(model.getValueAt(selectRowView,1).toString());
        varAge1.setText(model.getValueAt(selectRowView,2).toString());
        varGender1.setText(model.getValueAt(selectRowView,3).toString());
        varDate1.setText(model.getValueAt(selectRowView,4).toString());
        varLevel1.setText(model.getValueAt(selectRowView,5).toString());
        varInfo1.setText(model.getValueAt(selectRowView,6).toString());
        varTitle1.setText(model.getValueAt(selectRowView,7).toString());
        varPhone1.setText(model.getValueAt(selectRowView,8).toString());
        varMail1.setText(model.getValueAt(selectRowView,9).toString());

    }//GEN-LAST:event_btnView1ActionPerformed

    private void varUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varUpdateActionPerformed
        // TODO add your handling code here:
        int selectRowView=tblEmp.getSelectedRow();
        if(selectRowView<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a valid row");
            return;
        }
        DefaultTableModel model=(DefaultTableModel) tblEmp.getModel();

        varName1.setText(model.getValueAt(selectRowView,0).toString());
        varId1.setText(model.getValueAt(selectRowView,1).toString());
        varAge1.setText(model.getValueAt(selectRowView,2).toString());
        varGender1.setText(model.getValueAt(selectRowView,3).toString());
        varDate1.setText(model.getValueAt(selectRowView,4).toString());
        varLevel1.setText(model.getValueAt(selectRowView,5).toString());
        varInfo1.setText(model.getValueAt(selectRowView,6).toString());
        varTitle1.setText(model.getValueAt(selectRowView,7).toString());
        varPhone1.setText(model.getValueAt(selectRowView,8).toString());
        varMail1.setText(model.getValueAt(selectRowView,9).toString());

        model.setValueAt(varName1.getText(),tblEmp.getSelectedRow(),0);
        model.setValueAt(varId1.getText(),tblEmp.getSelectedRow(),1);
        model.setValueAt(varAge1.getText(),tblEmp.getSelectedRow(),2);
        model.setValueAt(varGender1.getText(),tblEmp.getSelectedRow(),3);
        model.setValueAt(varDate1.getText(),tblEmp.getSelectedRow(),4);
        model.setValueAt(varLevel1.getText(),tblEmp.getSelectedRow(),5);
        model.setValueAt(varInfo1.getText(),tblEmp.getSelectedRow(),6);
        model.setValueAt(varTitle1.getText(),tblEmp.getSelectedRow(),7);
        model.setValueAt(varPhone1.getText(),tblEmp.getSelectedRow(),8);
        model.setValueAt(varMail1.getText(),tblEmp.getSelectedRow(),9);
    }//GEN-LAST:event_varUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int varCurrRow=tblEmp.getSelectedRow();

        if(varCurrRow<0)
        {
            JOptionPane.showMessageDialog(this,"Please select a valid row");
            return;
        }
        DefaultTableModel model=(DefaultTableModel) tblEmp.getModel();
        
        int selectRow=tblEmp.getSelectedRow();
        model.removeRow(selectRow);
        JOptionPane.showMessageDialog(this,"Successfuly deleted");

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void searchNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchNameKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel) tblEmp.getModel();
        String search=searchName.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
        tblEmp.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));

    }//GEN-LAST:event_searchNameKeyReleased

    private void varName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varName1ActionPerformed

    private void varId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varId1ActionPerformed

    private void viewPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPhotoActionPerformed
        // TODO add your handling code here:
        try{
            BufferedImage photo = ImageIO.read(new ByteArrayInputStream(emp.getPhoto()));
            JFrame viewImgFrame = new JFrame();
            ImageIcon icon = new ImageIcon(photo);
            JLabel label = new JLabel(icon);
            viewImgFrame.add(label);
            viewImgFrame.pack();
            viewImgFrame.setVisible(true);
        }catch (IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(viewPhoto, "Error while displaying Image");
        }
    }//GEN-LAST:event_viewPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchName;
    private javax.swing.JTable tblEmp;
    private javax.swing.JLabel varAge;
    private javax.swing.JTextField varAge1;
    private javax.swing.JLabel varDate;
    private javax.swing.JTextField varDate1;
    private javax.swing.JLabel varGender;
    private javax.swing.JTextField varGender1;
    private javax.swing.JLabel varId;
    private javax.swing.JTextField varId1;
    private javax.swing.JLabel varInfo;
    private javax.swing.JTextField varInfo1;
    private javax.swing.JLabel varLevel;
    private javax.swing.JTextField varLevel1;
    private javax.swing.JLabel varMail;
    private javax.swing.JTextField varMail1;
    private javax.swing.JLabel varName;
    private javax.swing.JTextField varName1;
    private javax.swing.JLabel varPhone;
    private javax.swing.JTextField varPhone1;
    private javax.swing.JLabel varTitle;
    private javax.swing.JTextField varTitle1;
    private javax.swing.JButton varUpdate;
    private javax.swing.JButton viewPhoto;
    // End of variables declaration//GEN-END:variables
    private void displayUserProfile() {
        DefaultTableModel model=(DefaultTableModel) tblEmp.getModel();
        model.setRowCount(0);
        for(EmpDet e:emp.getArr()){
        String[] row=new String[10];
        row[0]=e.getName();
        row[1]=e.getId();
        row[2]=e.getAge();
        row[3]=e.getGender();
        row[4]=e.getDate();
        row[5]=e.getLevel();
        row[6]=e.getTeam_info();
        row[7]=e.getTitle();
        row[8]=e.getNum();
        row[9]=e.getMail();
        
        model.addRow(row);
        }
    }
}