/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jubayir.evidence;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MD. JUBAYIR HOSSAIN
 */
public class EvidenceFinal extends javax.swing.JFrame {

    /**
     * Creates new form EvidenceFinal
     */
    public EvidenceFinal() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        rMale = new javax.swing.JRadioButton();
        rFemale = new javax.swing.JRadioButton();
        chkReading = new javax.swing.JCheckBox();
        chkWriting = new javax.swing.JCheckBox();
        chkCodding = new javax.swing.JCheckBox();
        cmbRound = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMsg = new javax.swing.JTextArea();
        btnSubmitt = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnResetTable = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lblDisplay = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Students Registration Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(496, 496, 496)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        btnSubmit.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setText("ID");

        jLabel3.setText("Name");

        jLabel4.setText("E-mail");

        jLabel5.setText("Password");

        jLabel6.setText("Gender");

        jLabel7.setText("Hobby");

        jLabel8.setText("Round");

        jLabel9.setText("Address");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        rMale.setText("Male");

        rFemale.setText("Female");

        chkReading.setText("Reading");

        chkWriting.setText("Writing");

        chkCodding.setText("chkCodding");

        cmbRound.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Round", "Round-35", "Round-36", "Round-37" }));

        tMsg.setColumns(20);
        tMsg.setRows(5);
        jScrollPane1.setViewportView(tMsg);

        btnSubmitt.setText("Submit");
        btnSubmitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmittActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnResetTable.setText("Reset Table");
        btnResetTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetTableActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnRead.setText("Read From Table");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnSubmitLayout = new javax.swing.GroupLayout(btnSubmit);
        btnSubmit.setLayout(btnSubmitLayout);
        btnSubmitLayout.setHorizontalGroup(
            btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSubmitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnSubmitLayout.createSequentialGroup()
                        .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(115, 115, 115)
                        .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbRound, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtId)
                            .addComponent(txtName)
                            .addComponent(txtMail)
                            .addGroup(btnSubmitLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtPass))
                            .addGroup(btnSubmitLayout.createSequentialGroup()
                                .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(btnSubmitLayout.createSequentialGroup()
                                        .addComponent(chkReading)
                                        .addGap(34, 34, 34)
                                        .addComponent(chkWriting)
                                        .addGap(54, 54, 54)
                                        .addComponent(chkCodding))
                                    .addGroup(btnSubmitLayout.createSequentialGroup()
                                        .addComponent(rMale)
                                        .addGap(68, 68, 68)
                                        .addComponent(rFemale))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 30, Short.MAX_VALUE))))
                    .addGroup(btnSubmitLayout.createSequentialGroup()
                        .addComponent(btnSubmitt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReset)
                        .addGap(88, 88, 88)
                        .addComponent(btnResetTable)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit)))
                .addContainerGap())
            .addGroup(btnSubmitLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(btnRead)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnSubmitLayout.setVerticalGroup(
            btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSubmitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(btnSubmitLayout.createSequentialGroup()
                        .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rMale)
                        .addComponent(rFemale)))
                .addGap(18, 18, 18)
                .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(chkReading)
                    .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkWriting)
                        .addComponent(chkCodding)))
                .addGap(18, 18, 18)
                .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cmbRound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(btnSubmitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmitt)
                    .addComponent(btnExit)
                    .addComponent(btnResetTable)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(btnRead)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        lblDisplay.setBackground(new java.awt.Color(204, 0, 204));
        lblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "E-mail", "Password", "Gender", "Hobby", "Round", "Message"
            }
        ));
        jScrollPane2.setViewportView(lblDisplay);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSubmittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmittActionPerformed
        // TODO add your handling code here:
        String id = "", name = "", email = "", password = "", gender = "", hobby = "", round = "", msg = "";
        
        id = txtId.getText();
        name = txtName.getText();
        email = txtMail.getText();
        password = txtPass.getText();
        
        if (rMale.isSelected()) {
            gender = rMale.getText();
        }
        if (rFemale.isSelected()) {
            gender = rFemale.getText();
        }
        
        if (chkReading.isSelected()) {
            hobby += chkReading.getText() + " ";
        }
        if (chkWriting.isSelected()) {
            hobby += chkWriting.getText() + " ";
        }
        if (chkCodding.isSelected()) {
            hobby += chkCodding.getText() + " ";
        }
        round = cmbRound.getItemAt(cmbRound.getSelectedIndex());
        msg = tMsg.getText();
        
        Student student = new Student(Integer.parseInt(id), name, email, password, gender, hobby, round, msg);
        List<Student> students = new ArrayList<>();
        students.add(student);
        
        DefaultTableModel model = (DefaultTableModel) lblDisplay.getModel();
        Object[] row = new Object[8];
        
        for (int i = 0; i < students.size(); i++) {
            row[0] = students.get(i).getId();
            row[1] = students.get(i).getName();
            row[2] = students.get(i).getEmail();
            row[3] = students.get(i).getPassword();
            row[4] = students.get(i).getGender();
            row[5] = students.get(i).getHobby();
            row[6] = students.get(i).getRound();
            row[7] = students.get(i).getMsg();
            model.addRow(row);
            
            try {
                Utils.writeToFile("jubayir", students);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Your data are adding in table");
            }
        }
    }//GEN-LAST:event_btnSubmittActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
        txtName.setText("");
        txtMail.setText("");
        txtPass.setText("");
        
        rMale.setSelected(true);
        chkReading.setSelected(false);
        chkWriting.setSelected(false);
        chkCodding.setSelected(false);
        cmbRound.setSelectedIndex(0);
        tMsg.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnResetTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetTableActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) lblDisplay.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnResetTableActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        // TODO add your handling code here:
        String columns[] = {"ID", "Name", "E-mail", "Password", "Gender", "Hobby", "Round", "Message"};
        
        DefaultTableModel tableModel = new DefaultTableModel(0, 8);
        tableModel.setColumnIdentifiers(columns);
        lblDisplay.setModel(tableModel);
        Utils.displayForm("jubayir", tableModel);
    }//GEN-LAST:event_btnReadActionPerformed

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
            java.util.logging.Logger.getLogger(EvidenceFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EvidenceFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EvidenceFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EvidenceFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvidenceFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResetTable;
    private javax.swing.JPanel btnSubmit;
    private javax.swing.JButton btnSubmitt;
    private javax.swing.JCheckBox chkCodding;
    private javax.swing.JCheckBox chkReading;
    private javax.swing.JCheckBox chkWriting;
    private javax.swing.JComboBox<String> cmbRound;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lblDisplay;
    private javax.swing.JRadioButton rFemale;
    private javax.swing.JRadioButton rMale;
    private javax.swing.JTextArea tMsg;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
