/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.RoleSalon;

/**
 *
 * @author anky
 */
public class WorkAreaSalonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaSalonJPanel
     */
    public WorkAreaSalonJPanel() {
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

        organizationjLabel = new javax.swing.JLabel();
        valuejLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestjTable = new javax.swing.JTable();
        assignjButton = new javax.swing.JButton();
        processjButton = new javax.swing.JButton();
        declinejButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        organizationjLabel.setText("Organization");
        add(organizationjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        valuejLabel.setText("<value>");
        add(valuejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        workRequestjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Reciever", "Status"
            }
        ));
        jScrollPane1.setViewportView(workRequestjTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 138));

        assignjButton.setBackground(new java.awt.Color(163, 206, 215));
        assignjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assignjButton.setText("Assign");
        assignjButton.setBorder(null);
        assignjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignjButtonActionPerformed(evt);
            }
        });
        add(assignjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 98, 30));

        processjButton.setBackground(new java.awt.Color(163, 206, 215));
        processjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        processjButton.setText("Process");
        processjButton.setBorder(null);
        add(processjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 350, 110, 30));

        declinejButton.setBackground(new java.awt.Color(163, 206, 215));
        declinejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        declinejButton.setText("Decline");
        declinejButton.setBorder(null);
        add(declinejButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 94, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/spa_img.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void assignjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assignjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignjButton;
    private javax.swing.JButton declinejButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel organizationjLabel;
    private javax.swing.JButton processjButton;
    private javax.swing.JLabel valuejLabel;
    private javax.swing.JTable workRequestjTable;
    // End of variables declaration//GEN-END:variables
}
