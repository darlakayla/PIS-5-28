/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author HP
 */
public class newResident extends javax.swing.JInternalFrame {

    /**
     * Creates new form newResident
     */
    public newResident() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
        Color navcolor= new Color(255,102,102);
        Color headcolor= new Color(255,153,153);
        Color bodycolor = new Color(255,204,204);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        save = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        insert = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        display = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Last Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 240, 130, 30);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("First Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 280, 130, 30);

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Middle Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 320, 130, 30);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Gender:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 360, 130, 30);

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Status:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 400, 130, 30);

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel14.setText("Contact:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(450, 390, 150, 30);

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel13.setText("Email:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(450, 350, 150, 30);

        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel10.setText("Address:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(450, 240, 120, 30);

        jTextField3.setBackground(new java.awt.Color(255, 153, 153));
        jTextField3.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(170, 280, 250, 30);

        jTextField4.setBackground(new java.awt.Color(255, 153, 153));
        jTextField4.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField4);
        jTextField4.setBounds(170, 320, 250, 30);

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 153, 153));
        jTextField9.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField9);
        jTextField9.setBounds(170, 240, 250, 30);

        jTextField14.setBackground(new java.awt.Color(255, 153, 153));
        jTextField14.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField14);
        jTextField14.setBounds(570, 350, 260, 30);

        jTextField15.setBackground(new java.awt.Color(255, 153, 153));
        jTextField15.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField15);
        jTextField15.setBounds(570, 390, 260, 30);

        jComboBox1.setBackground(new java.awt.Color(255, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorced", "Separated", "Widowed" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(170, 400, 250, 30);

        save.setBackground(new java.awt.Color(255, 153, 153));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        save.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("SAVE");
        save.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel1.add(save);
        save.setBounds(760, 440, 90, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(580, 240, 250, 96);

        jTextField5.setBackground(new java.awt.Color(255, 153, 153));
        jTextField5.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(170, 440, 250, 30);

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 0, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Birthdate:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 440, 130, 30);

        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 10, 850, 180);

        jRadioButton1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jRadioButton1.setText("Female");
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(290, 360, 130, 30);

        jRadioButton2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jRadioButton2.setText("Male");
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(170, 360, 110, 30);

        insert.setBackground(new java.awt.Color(255, 153, 153));
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertMouseExited(evt);
            }
        });
        insert.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("INSERT");
        insert.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(insert);
        insert.setBounds(120, 200, 120, 30);

        update.setBackground(new java.awt.Color(255, 153, 153));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("UPDATE");
        update.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(update);
        update.setBounds(250, 200, 120, 30);

        delete.setBackground(new java.awt.Color(255, 153, 153));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("DELETE");
        delete.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(delete);
        delete.setBounds(380, 200, 120, 30);

        clear.setBackground(new java.awt.Color(255, 153, 153));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });
        clear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("CLEAR");
        clear.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(clear);
        clear.setBounds(510, 200, 120, 30);

        display.setBackground(new java.awt.Color(255, 153, 153));
        display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                displayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                displayMouseExited(evt);
            }
        });
        display.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("DISPLAY");
        display.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 30));

        jPanel1.add(display);
        display.setBounds(650, 200, 130, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
        save.setBackground(navcolor);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setBackground(headcolor);
    }//GEN-LAST:event_saveMouseExited

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
       
    }//GEN-LAST:event_saveMouseClicked

    private void insertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseEntered
        insert.setBackground(navcolor);
    }//GEN-LAST:event_insertMouseEntered

    private void insertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseExited
        insert.setBackground(headcolor);
    }//GEN-LAST:event_insertMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(navcolor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(headcolor);
    }//GEN-LAST:event_updateMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        delete.setBackground(navcolor);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        delete.setBackground(headcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        clear.setBackground(navcolor);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        clear.setBackground(headcolor);
    }//GEN-LAST:event_clearMouseExited

    private void displayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseEntered
        display.setBackground(navcolor);
    }//GEN-LAST:event_displayMouseEntered

    private void displayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseExited
        display.setBackground(headcolor);
    }//GEN-LAST:event_displayMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel clear;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel display;
    private javax.swing.JPanel insert;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel save;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
