/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.EmpDet;

/**
 *
 * @author verma
 */
public class createProfile extends javax.swing.JPanel {

    /**
     * Creates new form createProfile
     */
    EmpDet emp;
    public createProfile(EmpDet emp) {
        initComponents();
        varName1.setName("Name");
        varId1.setName("id");
        varAge1.setName("age");
        varGender1.setName("gender");
        varDate1.setName("date");
        varLevel1.setName("level");
        varInfo1.setName("info");
        varTitle1.setName("title");
        varPhone1.setName("phone");
        varMail1.setName("mail");
        
        
        this.emp = emp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        varLevel = new javax.swing.JLabel();
        varInfo1 = new javax.swing.JTextField();
        varInfo = new javax.swing.JLabel();
        varTitle1 = new javax.swing.JTextField();
        varTitle = new javax.swing.JLabel();
        varPhone1 = new javax.swing.JTextField();
        varPhone = new javax.swing.JLabel();
        varMail1 = new javax.swing.JTextField();
        varMail = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        varName1 = new javax.swing.JTextField();
        btnUploadPhoto = new javax.swing.JButton();
        varId1 = new javax.swing.JTextField();
        varAge1 = new javax.swing.JTextField();
        varGender1 = new javax.swing.JTextField();
        varDate1 = new javax.swing.JTextField();
        varLevel1 = new javax.swing.JTextField();
        varName = new javax.swing.JLabel();
        varId = new javax.swing.JLabel();
        varAge = new javax.swing.JLabel();
        varGender = new javax.swing.JLabel();
        varDate = new javax.swing.JLabel();

        varLevel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varLevel.setText("Level:");

        varInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varInfo.setText("Team Info:");

        varTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varTitle.setText("Position Title:");

        varPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varPhone.setText("Phone:");

        varMail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        varMail.setText("E-Mail:");

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUploadPhoto.setText("ADD PHOTO");
        btnUploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadPhotoActionPerformed(evt);
            }
        });

        varId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varId1ActionPerformed(evt);
            }
        });

        varLevel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varLevel1ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(varId, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addComponent(varName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(varAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(varGender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(varDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(varLevel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(varInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(varMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(varPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(varTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(varName1)
                            .addComponent(varId1)
                            .addComponent(varAge1)
                            .addComponent(varGender1)
                            .addComponent(varDate1)
                            .addComponent(varLevel1)
                            .addComponent(varInfo1)
                            .addComponent(varTitle1)
                            .addComponent(varPhone1)
                            .addComponent(varMail1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addComponent(btnUploadPhoto))
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addComponent(varDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUploadPhoto))
                        .addGap(18, 18, 18)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varPhone)
                    .addComponent(varPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varMail)
                    .addComponent(varMail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnAdd)
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        JTextField[] VARIABLE_CONSTANTS = {varName1,varId1,varAge1,varGender1,varDate1,varLevel1,varInfo1,varTitle1,varPhone1,varMail1};
        boolean validated = false;
        for(JTextField field: VARIABLE_CONSTANTS){
            if(!validateData(field)){
                validated = false;
                break;
            }
            else{
                validated = true;
                System.out.println("Validated");
            }
        }
        
          
        if(validated){
        emp=emp.addnewemp();
        emp.setName(varName1.getText());
        emp.setId(varId1.getText());
        emp.setAge(varAge1.getText());
        emp.setGender(varGender1.getText());
        emp.setDate(varDate1.getText());
        emp.setLevel(varLevel1.getText());
        emp.setTeam_info(varInfo1.getText());
        emp.setTitle(varTitle1.getText());
        emp.setNum(varPhone1.getText());
        emp.setMail(varMail1.getText());
        
        JOptionPane.showMessageDialog(this,"Employee added successfuly");
        
        }

            

        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser fileUploader = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "JPG & GIF Images", "jpg", "gif");
        fileUploader.setFileFilter(filter);
        fileUploader.setDialogTitle("Choose Your Biometric ID");
        fileUploader.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnval = fileUploader.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION)
        {
            File uploadedFile = fileUploader.getSelectedFile();
            BufferedImage bufferedImageObj;
            try {
                bufferedImageObj = ImageIO.read(uploadedFile);
                ByteArrayOutputStream byteArrayOs = new ByteArrayOutputStream();
                ImageIO.write(bufferedImageObj, "jpg", byteArrayOs);
                byte[] photoBytes = byteArrayOs.toByteArray();
                emp.setPhoto(photoBytes);
                JOptionPane.showMessageDialog(fileUploader, "Photo Uploaded Successfully");
            } catch(IOException e) {
               e.printStackTrace();
               JOptionPane.showMessageDialog(fileUploader, "Error while uploading Photo");
            }
        }

    }//GEN-LAST:event_btnUploadPhotoActionPerformed

    private void varId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varId1ActionPerformed

    private void varLevel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varLevel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varLevel1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnUploadPhoto;
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
    // End of variables declaration//GEN-END:variables
    public boolean validateData(JComponent input) {
        String name = input.getName();
        String errorMsg="";
        boolean raiseError = false;
        String text = ((JTextField) input).getText().trim();
        if (text == null || text.isEmpty()) {
            raiseError = true;
            errorMsg = String.format("Please enter a value. The value for %s cannot be empty", name);

        }
        else{
            switch (name) {
                case "Name":
                    if(!text.matches("^[a-zA-z]+$")){
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }   break;
                
                case "cellno":
                    if(!text.matches("^[0-9]{10}")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }   break;
                case "level":
                    if(!text.matches("^[0-9]{2}")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s of 9 digits", name);
                    }   break;
                
                case "teaminfo":
                    if(!text.matches("^[a-zA-z]+$")){
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }   break;
                case "postitle":
                    if(!text.matches("^[a-zA-z]+$")){
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }   break;
                case "age":
                    if(!text.matches("^[0-9]{2}")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }   break;
                case "empid":
                    if(!text.matches("^[0-9]{2}")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }   break;
                case "gender":
                    if(!text.matches("^[a-zA-z]+$")){
                        raiseError = true;
                        errorMsg = String.format("Please enter valid values for %s", name);
                    }   break;
                
                
                case "sdate":
                    if(!text.matches("^((0[0-9]||1[0-2])/[0-2][0-9]||3[0-1])/([0-9][0-9])?[0-9][0-9]$")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s with the format MM/DD/YYYY", name);
                    }   break;
                
                case "email":
                    if(!text.matches("^(.+)@(.+)$")){
                        raiseError = true;
                        errorMsg = String.format("Please enter a valid %s", name);
                    }   break;
                default:
                    break;
            }
        }
        if (raiseError){
            JOptionPane.showMessageDialog(this, errorMsg);
            return false;
        }
        return true;
    }
}