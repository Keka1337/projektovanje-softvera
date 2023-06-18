/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import constants.ServerConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Jelena
 */
public class FrmIzmenaDBKonfiguracije extends javax.swing.JDialog {

    /**
     * Creates new form FrmIzmenaDBKonfiguracije
     */
    public FrmIzmenaDBKonfiguracije(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        srediFormu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnIzmeniKonfiguraciju = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDatabaseUrl = new javax.swing.JTextField();
        txtDatabaseUsername = new javax.swing.JTextField();
        btnIzmeniKonfiguraciju1 = new javax.swing.JButton();
        txtDatabasePassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Konfiguracija"));

        btnIzmeniKonfiguraciju.setBackground(new java.awt.Color(69, 86, 40));
        btnIzmeniKonfiguraciju.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnIzmeniKonfiguraciju.setForeground(new java.awt.Color(255, 255, 255));
        btnIzmeniKonfiguraciju.setText("Izmeni konfiguraciju");
        btnIzmeniKonfiguraciju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniKonfiguracijuActionPerformed(evt);
            }
        });

        jLabel3.setText("url:");

        jLabel5.setText("username:");

        jLabel7.setText("password:");

        btnIzmeniKonfiguraciju1.setBackground(new java.awt.Color(69, 86, 40));
        btnIzmeniKonfiguraciju1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnIzmeniKonfiguraciju1.setForeground(new java.awt.Color(255, 255, 255));
        btnIzmeniKonfiguraciju1.setText("Odustani");

        txtDatabasePassword.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDatabaseUrl))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDatabaseUsername)
                            .addComponent(txtDatabasePassword)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIzmeniKonfiguraciju1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIzmeniKonfiguraciju, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDatabaseUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatabaseUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDatabasePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIzmeniKonfiguraciju)
                    .addComponent(btnIzmeniKonfiguraciju1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzmeniKonfiguracijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniKonfiguracijuActionPerformed
        // TODO add your handling code here:
        try {
            String user = txtDatabaseUsername.getText().trim();
            String password = String.valueOf(txtDatabasePassword.getText().trim());
            String url = txtDatabaseUrl.getText().trim();

            if (url.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Polje za url baze podataka ne sme biti prazno!",
                        "GREŠKA", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Properties properties = new Properties();
            properties.load(new FileInputStream(ServerConstants.CONFIG_FILE));
            properties.setProperty(ServerConstants.DB_URL, url);
            properties.setProperty(ServerConstants.DB_USER, user);
            properties.setProperty(ServerConstants.DB_PASSWORD, password);
            properties.store(new FileOutputStream(ServerConstants.CONFIG_FILE), null);
            JOptionPane.showMessageDialog(this, "Kredencijali za pristup bazi podataka su uspešno izmenjeni!");
            this.dispose();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnIzmeniKonfiguracijuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmeniKonfiguraciju;
    private javax.swing.JButton btnIzmeniKonfiguraciju1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtDatabasePassword;
    private javax.swing.JTextField txtDatabaseUrl;
    private javax.swing.JTextField txtDatabaseUsername;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(ServerConstants.CONFIG_FILE));
            txtDatabaseUrl.setText(properties.getProperty("url"));
            txtDatabaseUsername.setText(properties.getProperty("user"));
            txtDatabasePassword.setText(properties.getProperty("password"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    
}
