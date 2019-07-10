/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JformQuanLy;

import JformBanHang.BanHang;

/**
 *
 * @author hao
 */
public class QuanLy extends javax.swing.JPanel {
QLTaiKhoan qltk;
QLBan qlb;
QL_Menu qlmn;
QL_NhanVien1 qlnv;
    /**
     * Creates new form QuanLy
     */
    public QuanLy() {
        initComponents();
    }
    public void reloadPanel(int i) {
        jpQuanLy.removeAll();
        switch (i) {
            case 1:
                if (qltk == null) {
                    qltk = new QLTaiKhoan();
                }
                jpQuanLy.add(qltk);
                break;
                case 2:
                if (qlb == null) {
                    qlb = new QLBan();
                }
                jpQuanLy.add(qlb);
                break;
                case 3:
                if (qlmn == null) {
                    qlmn = new QL_Menu();
                }
                jpQuanLy.add(qlmn);
                break;
                case 4:
                if (qlnv == null) {
                    qlnv = new QL_NhanVien1();
                }
                jpQuanLy.add(qlnv);
                break;
        }
        jpQuanLy.updateUI();
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
        btnQLTaiKhoan = new javax.swing.JButton();
        btnQLMenu = new javax.swing.JButton();
        btnQLBan = new javax.swing.JButton();
        btnQLMenu1 = new javax.swing.JButton();
        jpQuanLy = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btnQLTaiKhoan.setBackground(new java.awt.Color(255, 204, 204));
        btnQLTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnQLTaiKhoan.setIcon(new javax.swing.ImageIcon("C:\\Users\\HOME\\Documents\\NetBeansProjects\\DAM1\\src\\Icons\\qltaikhoan.png")); // NOI18N
        btnQLTaiKhoan.setText("QL Tài Khoản");
        btnQLTaiKhoan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLTaiKhoan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTaiKhoanActionPerformed(evt);
            }
        });

        btnQLMenu.setBackground(new java.awt.Color(204, 255, 204));
        btnQLMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQLMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\HOME\\Documents\\NetBeansProjects\\DAM1\\src\\Icons\\nhanvien.png")); // NOI18N
        btnQLMenu.setText("QL Nhân Viên");
        btnQLMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnQLMenu.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnQLMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMenuActionPerformed(evt);
            }
        });

        btnQLBan.setBackground(new java.awt.Color(204, 255, 204));
        btnQLBan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQLBan.setIcon(new javax.swing.ImageIcon("C:\\Users\\HOME\\Documents\\NetBeansProjects\\DAM1\\src\\Icons\\qlBan.png")); // NOI18N
        btnQLBan.setText("QL Bàn");
        btnQLBan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnQLBan.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnQLBan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLBan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLBanActionPerformed(evt);
            }
        });

        btnQLMenu1.setBackground(new java.awt.Color(204, 255, 204));
        btnQLMenu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQLMenu1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HOME\\Documents\\NetBeansProjects\\DAM1\\src\\Icons\\menu.png")); // NOI18N
        btnQLMenu1.setText("QL Menu");
        btnQLMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnQLMenu1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnQLMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLMenu1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLMenu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQLMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(btnQLBan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQLMenu1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnQLTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLBan, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQLMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jpQuanLy.setBorder(new javax.swing.border.MatteBorder(null));
        jpQuanLy.setLayout(new java.awt.BorderLayout());
        jpQuanLy.add(jLabel1, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpQuanLy, javax.swing.GroupLayout.DEFAULT_SIZE, 1153, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpQuanLy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTaiKhoanActionPerformed
        // TODO add your handling code here:
        reloadPanel(1);
    }//GEN-LAST:event_btnQLTaiKhoanActionPerformed

    private void btnQLMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMenuActionPerformed
        // TODO add your handling code here:
        reloadPanel(4);
    }//GEN-LAST:event_btnQLMenuActionPerformed

    private void btnQLBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLBanActionPerformed
        // TODO add your handling code here:
        reloadPanel(2);
    }//GEN-LAST:event_btnQLBanActionPerformed

    private void btnQLMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLMenu1ActionPerformed
        // TODO add your handling code here:
        reloadPanel(3);
    }//GEN-LAST:event_btnQLMenu1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLBan;
    private javax.swing.JButton btnQLMenu;
    private javax.swing.JButton btnQLMenu1;
    private javax.swing.JButton btnQLTaiKhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpQuanLy;
    // End of variables declaration//GEN-END:variables
}