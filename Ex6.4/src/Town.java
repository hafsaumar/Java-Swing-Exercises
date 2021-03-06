
import javax.swing.JList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hafsa Umar
 */
public class Town extends javax.swing.JFrame {

    /**
     * Creates new form Town
     */
    private Modal modal = new Modal();

    public Town() {
        initComponents();
        townList.setModel(modal);
        editDialog.pack();
        viewDialog.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editDialog = new javax.swing.JDialog();
        editnameTextBox1 = new javax.swing.JTextField();
        editcountryTextBox1 = new javax.swing.JTextField();
        editpopulationTextBox1 = new javax.swing.JTextField();
        edityearTextBox1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        viewDialog = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        viewnameLabel = new javax.swing.JLabel();
        viewcountryLabel = new javax.swing.JLabel();
        viewpopulationLabel = new javax.swing.JLabel();
        viewyearLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        nameTextBox = new javax.swing.JTextField();
        countryTextBox = new javax.swing.JTextField();
        populationTextBox = new javax.swing.JTextField();
        yearTextBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        townList = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();

        editnameTextBox1.setFocusCycleRoot(true);
        editnameTextBox1.setNextFocusableComponent(countryTextBox);
        editnameTextBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editnameTextBox1ActionPerformed(evt);
            }
        });

        editcountryTextBox1.setNextFocusableComponent(populationTextBox);

        editpopulationTextBox1.setNextFocusableComponent(yearTextBox);

        edityearTextBox1.setNextFocusableComponent(addButton);

        jLabel7.setText("Name of the Town");

        jLabel8.setText("Country");

        jLabel9.setText("Population");

        jLabel10.setText("Year Established");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Update Town Information");

        javax.swing.GroupLayout editDialogLayout = new javax.swing.GroupLayout(editDialog.getContentPane());
        editDialog.getContentPane().setLayout(editDialogLayout);
        editDialogLayout.setHorizontalGroup(
            editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editDialogLayout.createSequentialGroup()
                .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editDialogLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(updateButton))
                    .addGroup(editDialogLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel11)))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(editDialogLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addGap(60, 60, 60)
                    .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editcountryTextBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editnameTextBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edityearTextBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editpopulationTextBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        editDialogLayout.setVerticalGroup(
            editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addContainerGap())
            .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(editDialogLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editnameTextBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editcountryTextBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGap(18, 18, 18)
                    .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editpopulationTextBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGap(18, 18, 18)
                    .addGroup(editDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edityearTextBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        jLabel12.setText("Name of the Town");

        jLabel13.setText("Country");

        jLabel14.setText("Population");

        jLabel15.setText("Year Established");

        viewnameLabel.setText("jLabel16");

        viewcountryLabel.setText("jLabel17");

        viewpopulationLabel.setText("jLabel18");

        viewyearLabel.setText("jLabel19");

        backButton.setText("back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewDialogLayout = new javax.swing.GroupLayout(viewDialog.getContentPane());
        viewDialog.getContentPane().setLayout(viewDialogLayout);
        viewDialogLayout.setHorizontalGroup(
            viewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDialogLayout.createSequentialGroup()
                .addGroup(viewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewDialogLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(viewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(75, 75, 75)
                        .addGroup(viewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewcountryLabel)
                            .addComponent(viewnameLabel)
                            .addComponent(viewpopulationLabel)
                            .addComponent(viewyearLabel)))
                    .addGroup(viewDialogLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 108, Short.MAX_VALUE))
        );
        viewDialogLayout.setVerticalGroup(
            viewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDialogLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(viewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(viewnameLabel))
                .addGap(18, 18, 18)
                .addGroup(viewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(viewcountryLabel))
                .addGap(18, 18, 18)
                .addGroup(viewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(viewpopulationLabel))
                .addGap(18, 18, 18)
                .addGroup(viewDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(viewyearLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(33, 33, 33))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameTextBox.setFocusCycleRoot(true);
        nameTextBox.setNextFocusableComponent(countryTextBox);
        nameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextBoxActionPerformed(evt);
            }
        });

        countryTextBox.setNextFocusableComponent(populationTextBox);

        populationTextBox.setNextFocusableComponent(yearTextBox);

        yearTextBox.setNextFocusableComponent(addButton);

        jLabel1.setText("Name of the Town");

        jLabel2.setText("Country");

        jLabel3.setText("Population");

        jLabel4.setText("Year Established");

        addButton.setText("Add Town Information");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Please Fill in the Town information to add a Town");

        townList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                townListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(townList);

        jLabel6.setText("List Of Towns");

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countryTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yearTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(populationTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addButton))))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(editButton)
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countryTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(populationTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextBoxActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String name = nameTextBox.getText();
        String country = countryTextBox.getText();
        int pop = Integer.valueOf(populationTextBox.getText());
        int year = Integer.valueOf(yearTextBox.getText());
        modal.createTown(name, country, pop, year);
        System.out.println(modal.getSize());
        resetTextBoxes();
        townList.updateUI();
    }//GEN-LAST:event_addButtonActionPerformed

    private void editnameTextBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editnameTextBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editnameTextBox1ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        editDialog.setVisible(false);
        modal.updateTown(townList.getSelectedIndex(), editnameTextBox1.getText(), editcountryTextBox1.getText(), Integer.valueOf(editpopulationTextBox1.getText()), Integer.valueOf(edityearTextBox1.getText()));
        townList.updateUI();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if(townList.getSelectedIndex()> -1){
        editDialog.setVisible(true);
        editnameTextBox1.setText((modal.getTown(townList.getSelectedIndex())).getName());
        editcountryTextBox1.setText((modal.getTown(townList.getSelectedIndex())).getCountry());
        editpopulationTextBox1.setText(String.valueOf((modal.getTown(townList.getSelectedIndex())).getPopulation()));
        edityearTextBox1.setText(String.valueOf(modal.getTown(townList.getSelectedIndex()).getYearEstablished()));}
        else
            JOptionPane.showMessageDialog(this, "Please Select the Town from the List you want to Edit", "Error!", JOptionPane.CANCEL_OPTION);
    }//GEN-LAST:event_editButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        viewDialog.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void townListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_townListMouseClicked
        if (evt.getClickCount() == 2) {
            viewnameLabel.setText(modal.getTown(townList.getSelectedIndex()).getName());
            viewcountryLabel.setText(modal.getTown(townList.getSelectedIndex()).getCountry());
            viewpopulationLabel.setText(String.valueOf(modal.getTown(townList.getSelectedIndex()).getPopulation()));
            viewyearLabel.setText(String.valueOf(modal.getTown(townList.getSelectedIndex()).getYearEstablished()));
            viewDialog.setVisible(true);
        }
    }//GEN-LAST:event_townListMouseClicked

    private void resetTextBoxes() {
        nameTextBox.setText("");
        countryTextBox.setText("");
        populationTextBox.setText("");
        yearTextBox.setText("");
    }

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
            java.util.logging.Logger.getLogger(Town.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Town.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Town.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Town.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Town().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField countryTextBox;
    private javax.swing.JButton editButton;
    private javax.swing.JDialog editDialog;
    private javax.swing.JTextField editcountryTextBox1;
    private javax.swing.JTextField editnameTextBox1;
    private javax.swing.JTextField editpopulationTextBox1;
    private javax.swing.JTextField edityearTextBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextBox;
    private javax.swing.JTextField populationTextBox;
    private javax.swing.JList<String> townList;
    private javax.swing.JButton updateButton;
    private javax.swing.JDialog viewDialog;
    private javax.swing.JLabel viewcountryLabel;
    private javax.swing.JLabel viewnameLabel;
    private javax.swing.JLabel viewpopulationLabel;
    private javax.swing.JLabel viewyearLabel;
    private javax.swing.JTextField yearTextBox;
    // End of variables declaration//GEN-END:variables
}
