/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import constants.ServerConstants;
import domain.Zaposleni;
import java.awt.Color;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import threads.ClientThread;
import threads.ServerThread;

/**
 *
 * @author Jelena
 */
public class FrmMainServer extends javax.swing.JFrame {

    ServerThread serverThread;

    /**
     * Creates new form FrmServer
     */
    public FrmMainServer() {
        initComponents();
        btnZaustavi.setEnabled(false);
        this.setLocationRelativeTo(null);
        prepareView();
        ClientThread prijavljeniZaposleni = new ClientThread(this);
        prijavljeniZaposleni.start();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblZaposleni = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIzmeniKonfiguraciju = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDatabaseUrl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDatabaseUsername = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnPokreni = new javax.swing.JButton();
        btnZaustavi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblAktivnostServera = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Server"));

        tblZaposleni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ime", "Prezime"
            }
        ));
        jScrollPane1.setViewportView(tblZaposleni);

        jLabel1.setText("Prijavljeni zaposleni:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(69, 86, 40));
        jLabel3.setText("Database URL:");

        txtDatabaseUrl.setText("database url");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(69, 86, 40));
        jLabel5.setText("Database username");

        txtDatabaseUsername.setText("database username");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIzmeniKonfiguraciju, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDatabaseUrl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDatabaseUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDatabaseUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDatabaseUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnIzmeniKonfiguraciju))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        btnPokreni.setBackground(new java.awt.Color(69, 86, 40));
        btnPokreni.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnPokreni.setForeground(new java.awt.Color(255, 255, 255));
        btnPokreni.setText("Pokreni server");
        btnPokreni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPokreniActionPerformed(evt);
            }
        });

        btnZaustavi.setBackground(new java.awt.Color(69, 86, 40));
        btnZaustavi.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnZaustavi.setForeground(new java.awt.Color(255, 255, 255));
        btnZaustavi.setText("Zaustavi server");
        btnZaustavi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZaustaviActionPerformed(evt);
            }
        });

        jLabel2.setText("Status servera:");

        lblAktivnostServera.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnPokreni, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnZaustavi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblAktivnostServera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblAktivnostServera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPokreni)
                    .addComponent(btnZaustavi)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPokreniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPokreniActionPerformed
        if (txtDatabaseUrl.getText() != null && !txtDatabaseUrl.getText().trim().isEmpty()) {
            if (serverThread == null || !serverThread.isAlive()) {
                try {
                    serverThread = new ServerThread(this);
                    serverThread.start();
                    System.err.println("Server je POKRENUT!");
                    lblAktivnostServera.setForeground(Color.GREEN);
                    lblAktivnostServera.setText("Server je pokrenut.");
                    btnPokreni.setEnabled(false);
                    btnZaustavi.setEnabled(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Unesite odgovarajuce podatke za konekciju.", "Konekcija ka bazom nije iskonfigurisana", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnPokreniActionPerformed

    private void btnZaustaviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZaustaviActionPerformed
        if (serverThread.isAlive() && serverThread.getServerSocket() != null && serverThread.getServerSocket().isBound()) {
            try {
                serverThread.stopAllThreads();
                serverThread.getServerSocket().close();

                btnPokreni.setEnabled(true);
                btnZaustavi.setEnabled(false);
                lblAktivnostServera.setForeground(Color.RED);
                lblAktivnostServera.setText("Server je ZAUSTAVLJEN.");
                DefaultTableModel model = (DefaultTableModel) tblZaposleni.getModel();
                model.setRowCount(0);

            } catch (Exception ex) {
                System.err.println("Greška prilikom zaustavljana servera!");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnZaustaviActionPerformed

    private void btnIzmeniKonfiguracijuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniKonfiguracijuActionPerformed
        // TODO add your handling code here:
        FrmIzmenaDBKonfiguracije konfigForma = new FrmIzmenaDBKonfiguracije(this, true);
        konfigForma.setLocationRelativeTo(null);
        konfigForma.setVisible(true);
    }//GEN-LAST:event_btnIzmeniKonfiguracijuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmeniKonfiguraciju;
    private javax.swing.JButton btnPokreni;
    private javax.swing.JButton btnZaustavi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAktivnostServera;
    private javax.swing.JTable tblZaposleni;
    private javax.swing.JLabel txtDatabaseUrl;
    private javax.swing.JLabel txtDatabaseUsername;
    // End of variables declaration//GEN-END:variables

    public void prepareView() {
        DefaultTableModel model = (DefaultTableModel) tblZaposleni.getModel();
        if (serverThread == null || !serverThread.isAlive()) {
            model.setRowCount(0);
            model.fireTableDataChanged();
        } else {
            model.setRowCount(0);
            List<Zaposleni> zaposleni = serverThread.vratiPrijavljeneZaposlene();
            for (Zaposleni z : zaposleni) {
                if (z != null) {
                    Object[] red = new Object[]{z.getIme(), z.getPrezime(), z.getUsername()};
                    model.addRow(red);
                }
            }
            model.fireTableDataChanged();
        }
        fillCurrentDatabaseConfig();
    }

    private void fillCurrentDatabaseConfig() {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(ServerConstants.CONFIG_FILE));
            txtDatabaseUrl.setText(properties.getProperty("url"));
            txtDatabaseUsername.setText(properties.getProperty("user"));
        } catch (Exception ex) {
            txtDatabaseUrl.setText("No properties file founded!");
            txtDatabaseUsername.setText("No properties file founded!");
            Logger.getLogger(FrmMainServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
