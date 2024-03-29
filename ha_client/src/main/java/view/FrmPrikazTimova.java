/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.Controller;
import domain.Tim;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.components.ModelTabeleTim;

/**
 *
 * @author Jelena
 */
public class FrmPrikazTimova extends javax.swing.JDialog {

    /**
     * Creates new form FrmPrikazTimova
     */
    public FrmPrikazTimova(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        prepareView();
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
        txtNazivTima = new javax.swing.JTextField();
        btnPretrazi = new javax.swing.JButton();
        btnOcistiPretragu = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTim = new javax.swing.JTable();
        BtnIzmeniTim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pretrazi tim po nazivu"));

        jLabel1.setText("Naziv tima:");

        btnPretrazi.setBackground(new java.awt.Color(69, 86, 40));
        btnPretrazi.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnPretrazi.setForeground(new java.awt.Color(255, 255, 255));
        btnPretrazi.setText("Pretraži");
        btnPretrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretraziActionPerformed(evt);
            }
        });

        btnOcistiPretragu.setBackground(new java.awt.Color(69, 86, 40));
        btnOcistiPretragu.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        btnOcistiPretragu.setForeground(new java.awt.Color(255, 255, 255));
        btnOcistiPretragu.setText("Očisti pretragu");
        btnOcistiPretragu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcistiPretraguActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOcistiPretragu, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPretrazi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(txtNazivTima)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNazivTima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPretrazi)
                    .addComponent(btnOcistiPretragu)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Pregled timova"));

        tblTim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTim);

        BtnIzmeniTim.setBackground(new java.awt.Color(69, 86, 40));
        BtnIzmeniTim.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        BtnIzmeniTim.setForeground(new java.awt.Color(255, 255, 255));
        BtnIzmeniTim.setText("Izmeni");
        BtnIzmeniTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIzmeniTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnIzmeniTim, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnIzmeniTim)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPretraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretraziActionPerformed
        ModelTabeleTim mtt = (ModelTabeleTim) tblTim.getModel();
        String naziv = txtNazivTima.getText().trim();
        Tim tim = new  Tim();
        tim.setNaziv(naziv);
        List<Tim> result = new ArrayList<>();
        try {
            result = Controller.getInstance().nadjiTim(tim);
            mtt.setListaTimova(result);
            mtt.fireTableDataChanged();
            JOptionPane.showMessageDialog(this, "Sistem je našao tim po zadatoj vrednosti.", "Info", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Sistem ne može da nadje divljač po zadatoj vrednosti.", JOptionPane.ERROR_MESSAGE);
        }
        btnPretrazi.setSelected(true);
    }//GEN-LAST:event_btnPretraziActionPerformed

    private void BtnIzmeniTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIzmeniTimActionPerformed
        int red = tblTim.getSelectedRow();
        if (red != -1) {
            ModelTabeleTim mtt = (ModelTabeleTim) tblTim.getModel();
            Tim tim = mtt.vratiIzabraniTim(red);
            FrmIzmeniTim formaZaIzmenuTima = new FrmIzmeniTim((FrmPocetna) this.getParent(), true);
            formaZaIzmenuTima.setTim(tim);
            formaZaIzmenuTima.setModelTabele(tblTim.getModel());
            formaZaIzmenuTima.setLocationRelativeTo(null);
            JOptionPane.showMessageDialog(this, "Sistem je učitao tim.", "Učitavanje tima", JOptionPane.INFORMATION_MESSAGE);
            formaZaIzmenuTima.setVisible(true);
        }
    }//GEN-LAST:event_BtnIzmeniTimActionPerformed

    private void btnOcistiPretraguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcistiPretraguActionPerformed
        txtNazivTima.setText("");
        prepareView();
    }//GEN-LAST:event_btnOcistiPretraguActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIzmeniTim;
    private javax.swing.JButton btnOcistiPretragu;
    private javax.swing.JButton btnPretrazi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTim;
    private javax.swing.JTextField txtNazivTima;
    // End of variables declaration//GEN-END:variables

    private void prepareView() {
        try {
            List<Tim> listaTimova = Controller.getInstance().ucitajListuTimova();
            ModelTabeleTim mtt = new ModelTabeleTim(listaTimova);
            tblTim.setModel(mtt);
        } catch (Exception ex) {
            Logger.getLogger(FrmPrikazTimova.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
