/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import business.Account;
import business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laksh
 */
public class ManageAccountJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private AccountDirectory accountDirectory;

    /**
     * Creates new form ManageAccountJPanel
     */
    
    ManageAccountJPanel(JPanel userProcessContainer, AccountDirectory accountDirectory) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
         this.accountDirectory = accountDirectory;
         populateTable();
       
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
        tblAccounts = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        txtDeleteAccount = new javax.swing.JButton();
        txtAccountNumber = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        tblAccounts.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        tblAccounts.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tblAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bank Name", "Routing Number", "Account Number", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAccounts.setGridColor(new java.awt.Color(204, 204, 255));
        tblAccounts.setShowGrid(true);
        jScrollPane1.setViewportView(tblAccounts);
        if (tblAccounts.getColumnModel().getColumnCount() > 0) {
            tblAccounts.getColumnModel().getColumn(0).setResizable(false);
            tblAccounts.getColumnModel().getColumn(1).setResizable(false);
            tblAccounts.getColumnModel().getColumn(2).setResizable(false);
            tblAccounts.getColumnModel().getColumn(3).setResizable(false);
        }

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnViewDetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewDetails.setText("VIEW DETAILS");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        txtDeleteAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDeleteAccount.setText("DELETE ACCOUNT");
        txtDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeleteAccountActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("BACK");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnViewDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDeleteAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack)))
                .addContainerGap(364, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        Account result = accountDirectory.searchAccount(txtAccountNumber.getText());
        if(result == null){
             JOptionPane.showMessageDialog(null, "Account Number does not exist!", "Information", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else
        {
        ViewAccountJPanel panel = new ViewAccountJPanel(userProcessContainer, result);
        userProcessContainer.add("ViewAccountJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);   
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAccounts.getSelectedRow();
        if(selectedRow<0){
        JOptionPane.showMessageDialog(null, "Please select a row from the table!", "Warning", JOptionPane.WARNING_MESSAGE);
        }  
        else{
            Account account = (Account)tblAccounts.getValueAt(selectedRow,0);
            ViewAccountJPanel panel = new ViewAccountJPanel(userProcessContainer, account);
            userProcessContainer.add("ViewAccountJPanel", panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } 
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void txtDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeleteAccountActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAccounts.getSelectedRow();
        if(selectedRow>=0){
           int dialogButton = JOptionPane.YES_NO_OPTION;
           int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the account details?","Warning",dialogButton );
           if(dialogResult == JOptionPane.YES_OPTION){
               Account account = (Account) tblAccounts.getValueAt(selectedRow,0);
               accountDirectory.deleteAccount(account);
               populateTable();
           }
        }
        else{
            JOptionPane.showMessageDialog(null, "Please select a row from the table!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtDeleteAccountActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAccounts;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JButton txtDeleteAccount;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
       DefaultTableModel dtm = (DefaultTableModel) tblAccounts.getModel();
       dtm.setRowCount(0);
       for(Account account : accountDirectory.getAccountList()){
           Object[] row = new Object[4];
           row[0]= account;
           row[1]=account.getRoutingNumber();
           row[2]=account.getAccountNumber();
           row[3]=account.getBalance();
           dtm.addRow(row);
       }
    }
}
