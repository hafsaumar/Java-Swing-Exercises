/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.uta;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.TransferHandler;

/**
 *
 * @author Hafsa Umar
 */
public class People extends javax.swing.JFrame {

    private List<Person> people;
    private int peopleSize;
    private int current;
    /**
     * Creates new form People
     */
    public People() {
        initComponents();
        new DropTarget(fnameTextbox, new DropTargetAdapter() {
            @Override
            public void drop(DropTargetDropEvent dtde) {
                if(dtde.isDataFlavorSupported(DataFlavor.stringFlavor)){
                    dtde.acceptDrop(TransferHandler.COPY);
                    try {
                        String n = (String) dtde.getTransferable().getTransferData(DataFlavor.stringFlavor);
                        fnameTextbox.setText(n);
                        people.get(current).setFirstName(n);
                    } catch (UnsupportedFlavorException ex) {
                        Logger.getLogger(People.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(People.class.getName()).log(Level.SEVERE, null, ex);
                    }
                                    
                }
                else 
                    dtde.rejectDrop();
            }
        });
        
        new DropTarget(lnameTextbox, new DropTargetAdapter() {
            @Override
            public void drop(DropTargetDropEvent dtde) {
                if(dtde.isDataFlavorSupported(DataFlavor.stringFlavor)){
                    dtde.acceptDrop(TransferHandler.COPY);
                    try {
                        String n = (String) dtde.getTransferable().getTransferData(DataFlavor.stringFlavor);
                        lnameTextbox.setText(n);
                        people.get(current).setLastName(n);
                    } catch (UnsupportedFlavorException ex) {
                        Logger.getLogger(People.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(People.class.getName()).log(Level.SEVERE, null, ex);
                    }
                                    
                }
                else 
                    dtde.rejectDrop();
            }
        });
        
        new DropTarget(btownTextbox, new DropTargetAdapter() {
            @Override
            public void drop(DropTargetDropEvent dtde) {
                if(dtde.isDataFlavorSupported(DataFlavor.stringFlavor)){
                    dtde.acceptDrop(TransferHandler.COPY);
                    try {
                        String n = (String) dtde.getTransferable().getTransferData(DataFlavor.stringFlavor);
                        btownTextbox.setText(n);
                        people.get(current).setBirthTown(n);
                    } catch (UnsupportedFlavorException ex) {
                        Logger.getLogger(People.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(People.class.getName()).log(Level.SEVERE, null, ex);
                    }
                                    
                }
                else 
                    dtde.rejectDrop();
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fnameEditButton = new javax.swing.JButton();
        lnameEditButton = new javax.swing.JButton();
        btownEditButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mstatusLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mstatusTextbox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mstatusAddButton = new javax.swing.JButton();
        fnameTextbox = new javax.swing.JTextField();
        lnameTextbox = new javax.swing.JTextField();
        btownTextbox = new javax.swing.JTextField();
        byearSpinner = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ldataMenu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        nextMenu = new javax.swing.JMenuItem();
        prevMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fnameEditButton.setText("Edit");
        fnameEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameEditButtonActionPerformed(evt);
            }
        });

        lnameEditButton.setText("Edit");
        lnameEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameEditButtonActionPerformed(evt);
            }
        });

        btownEditButton.setText("Edit");
        btownEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btownEditButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        mstatusLabel.setText("Marital Status");
        mstatusLabel.setOpaque(true);

        jLabel3.setText("Birth Town");

        mstatusTextbox.setEditable(false);

        jLabel4.setText("Birth Year");

        mstatusAddButton.setText("Edit");
        mstatusAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mstatusAddButtonActionPerformed(evt);
            }
        });

        fnameTextbox.setEditable(false);
        fnameTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameTextboxActionPerformed(evt);
            }
        });

        lnameTextbox.setEditable(false);

        btownTextbox.setEditable(false);
        btownTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btownTextboxActionPerformed(evt);
            }
        });

        byearSpinner.setModel(new javax.swing.SpinnerNumberModel(1990, null, 2017, 1));
        byearSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                byearSpinnerStateChanged(evt);
            }
        });

        jMenu1.setMnemonic('f');
        jMenu1.setText("File");

        ldataMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        ldataMenu.setText("Load Data");
        ldataMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ldataMenuActionPerformed(evt);
            }
        });
        jMenu1.add(ldataMenu);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setMnemonic('v');
        jMenu2.setText("View");

        nextMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        nextMenu.setText("Next");
        nextMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextMenuActionPerformed(evt);
            }
        });
        jMenu2.add(nextMenu);

        prevMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        prevMenu.setText("Previous");
        prevMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevMenuActionPerformed(evt);
            }
        });
        jMenu2.add(prevMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mstatusLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mstatusTextbox))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fnameTextbox, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(lnameTextbox)
                                    .addComponent(btownTextbox)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(byearSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnameEditButton)
                    .addComponent(fnameEditButton)
                    .addComponent(btownEditButton)
                    .addComponent(mstatusAddButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fnameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnameEditButton))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lnameTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lnameEditButton))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btownTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btownEditButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(byearSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mstatusLabel)
                    .addComponent(mstatusTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mstatusAddButton))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnameEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameEditButtonActionPerformed
        String firstName = JOptionPane.showInputDialog(this, "Please input First Name", "Edit", JOptionPane.OK_CANCEL_OPTION);
        people.get(current).setFirstName(firstName);
        fnameTextbox.setText(firstName);
    }//GEN-LAST:event_fnameEditButtonActionPerformed

    private void lnameEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameEditButtonActionPerformed
        String lastName = JOptionPane.showInputDialog(this, "Please input Last Name", "Edit", JOptionPane.OK_CANCEL_OPTION);
        people.get(current).setLastName(lastName);
        lnameTextbox.setText(lastName);
    }//GEN-LAST:event_lnameEditButtonActionPerformed

    private void btownEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btownEditButtonActionPerformed
        String birthTown = JOptionPane.showInputDialog(this, "Please input Birth Town", "Edit", JOptionPane.OK_CANCEL_OPTION);
        people.get(current).setBirthTown(birthTown);
        btownTextbox.setText(birthTown);
    }//GEN-LAST:event_btownEditButtonActionPerformed

    private void mstatusAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mstatusAddButtonActionPerformed
        String maritalStatus = String.valueOf(JOptionPane.showInputDialog(this, "Please Enter Marital Status", "Input", JOptionPane.QUESTION_MESSAGE, null, Person.MaritalStatus.values(), Person.MaritalStatus.SINGLE));
        mstatusTextbox.setText(String.valueOf(Person.MaritalStatus.valueOf(maritalStatus)));
        people.get(current).setMaritalStatus(Person.MaritalStatus.valueOf(maritalStatus));
    }//GEN-LAST:event_mstatusAddButtonActionPerformed

    private void fnameTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameTextboxActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_fnameTextboxActionPerformed

    private void btownTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btownTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btownTextboxActionPerformed

    private void initializeFileData() {
        ClassLoader cl = getClass().getClassLoader();
        InputStream textStream = cl.getResourceAsStream("fi/uta/res/people.txt");
        people = Person.loadPersons(textStream);
        System.out.println(people.size());
        people.forEach((p) -> {
            System.out.println(p);
        });
        peopleSize = people.size();
        current = -1;
    }

    private void displayNextRowData() {
        if (current != (peopleSize - 1)) {
            current++;
            fnameTextbox.setText(people.get(current).getFirstName());
            lnameTextbox.setText(people.get(current).getLastName());
            byearSpinner.setValue(people.get(current).getBirthYear());
            btownTextbox.setText(people.get(current).getBirthTown());
            mstatusTextbox.setText(String.valueOf(people.get(current).getMaritalStatus()));
        } else {
            JOptionPane.showMessageDialog(this, "No more people, Load Again to Continue", "Stop", JOptionPane.CANCEL_OPTION);
        }
    }

    private void displayPreviousRowData() {
        if (current > 0 && current < peopleSize) {
            current--;
            fnameTextbox.setText(people.get(current).getFirstName());
            lnameTextbox.setText(people.get(current).getLastName());
            byearSpinner.setValue(people.get(current).getBirthYear());
            btownTextbox.setText(people.get(current).getBirthTown());
            mstatusTextbox.setText(String.valueOf(people.get(current).getMaritalStatus()));
        } else {
            JOptionPane.showMessageDialog(this, "No more people, Load Again to Continue", "Stop", JOptionPane.CANCEL_OPTION);
        }
    }
    
    private void ldataMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ldataMenuActionPerformed

        initializeFileData();
        displayNextRowData();
    }//GEN-LAST:event_ldataMenuActionPerformed

    private void closingFormConfirmation() {
        int exitOption = JOptionPane.showConfirmDialog(this, "You will Loose all the updated Data! Are you sure you want to Exit?", "Sure?", JOptionPane.YES_NO_OPTION);
        if (exitOption == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        closingFormConfirmation();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void nextMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextMenuActionPerformed
        displayNextRowData();
    }//GEN-LAST:event_nextMenuActionPerformed

    private void prevMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevMenuActionPerformed
        displayPreviousRowData();
    }//GEN-LAST:event_prevMenuActionPerformed

    private void byearSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_byearSpinnerStateChanged
        people.get(current).setBirthYear((Integer) (byearSpinner.getValue()));
    }//GEN-LAST:event_byearSpinnerStateChanged

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
            java.util.logging.Logger.getLogger(People.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(People.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(People.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(People.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new People().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btownEditButton;
    private javax.swing.JTextField btownTextbox;
    private javax.swing.JSpinner byearSpinner;
    private javax.swing.JButton fnameEditButton;
    private javax.swing.JTextField fnameTextbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem ldataMenu;
    private javax.swing.JButton lnameEditButton;
    private javax.swing.JTextField lnameTextbox;
    private javax.swing.JButton mstatusAddButton;
    private javax.swing.JLabel mstatusLabel;
    private javax.swing.JTextField mstatusTextbox;
    private javax.swing.JMenuItem nextMenu;
    private javax.swing.JMenuItem prevMenu;
    // End of variables declaration//GEN-END:variables
}
