/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLKho;

/**
 *
 * @author win
 */
public class QL_kho1 extends javax.swing.JPanel {

    /**
     * Creates new form QL_kho1
     */
    public QL_kho1() {
        initComponents();
        LoadPanel(1);
    }
 QL_SanPham2 sp;
    Ql_kiemke1 kiemke;
public void LoadPanel(int i){
    panel.removeAll();;
    switch(i){
        case 1:
            if(sp==null){
                sp= new QL_SanPham2();
            }
            panel.add(sp);
            break;
        case 2:
            if(kiemke==null){
                kiemke= new Ql_kiemke1();
            }
            panel.add(kiemke);
            break;
            default:
                break;
    }
    panel.updateUI();// thêm vào 1 biểu đồ thị JSrollPane
} 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        lblmuasanpham9 = new javax.swing.JButton();
        lblkiemke9 = new javax.swing.JButton();
        panel = new javax.swing.JPanel();

        jPanel11.setBackground(new java.awt.Color(102, 255, 51));

        lblmuasanpham9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblmuasanpham9.setText("Mua Sản Phẩm");
        lblmuasanpham9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblmuasanpham9ActionPerformed(evt);
            }
        });

        lblkiemke9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblkiemke9.setText("Kiểm Kê");
        lblkiemke9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblkiemke9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmuasanpham9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(lblkiemke9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(lblmuasanpham9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(lblkiemke9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );

        panel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblmuasanpham9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblmuasanpham9ActionPerformed
        LoadPanel(1);
    }//GEN-LAST:event_lblmuasanpham9ActionPerformed

    private void lblkiemke9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblkiemke9ActionPerformed
        LoadPanel(2);
    }//GEN-LAST:event_lblkiemke9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel11;
    private javax.swing.JButton lblkiemke9;
    private javax.swing.JButton lblmuasanpham9;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}