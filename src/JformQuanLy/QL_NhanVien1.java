/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JformQuanLy;


import connect.connect_1;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.nv;
import java.util.Date;

/**
 *
 * @author win
 */
public class QL_NhanVien1 extends javax.swing.JPanel {
 String filename = null;
    byte[] preson_image = null;
    String a, b, c;
    connect_1 hd = new connect_1();
    ResultSet rs;
    Statement st;
    private DefaultComboBoxModel cbo = new DefaultComboBoxModel();
    ArrayList<String> arr = new ArrayList<>();
    String ma;
    connect_1 cho = new connect_1();
    String head[] = {"ID", "username", "passwords", "hovaten", "email", "ngaysinh", "gioitinh","sdt","cmnd", "diachi", "lv", "hinh"};
    DefaultTableModel model = new DefaultTableModel(head, 0);
    /**
     * Creates new form QL_NhanVien1
     */
    public QL_NhanVien1() {
        initComponents();
        loaddata();
        ngayhientai();
    }
     private ArrayList<nv> getlist() {
        ArrayList<nv> getlist = new ArrayList<>();
        try {

            Connection conn = hd.getconection();
            String str = "select * from nhanvien";
            st = conn.createStatement();
            rs = st.executeQuery(str);
            nv a;
            while (rs.next()) {
                a = new nv(rs.getInt("id"), rs.getString("username"),
                        rs.getString("passwords"), rs.getString("hovaten"),
                        rs.getString("email"), rs.getString("ngaysinh"), rs.getString("gioitinh"),
                        rs.getString("sdt"), rs.getString("diachi"), rs.getDouble("cmnd"), rs.getInt("lv"), rs.getBytes("hinh"));
                getlist.add(a);
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return getlist;
    }
     public void ngayhientai(){  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        dcngay.setDate(date);
    
     }
 private void loaddata() {
        try {
            model.setRowCount(0);
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=qlcafe";
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();
            String sql = "select * from nhanvien";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Vector row = new Vector();
                row.add(rs.getString(1));
                row.add(rs.getString(2));
                row.add(rs.getString(3));
                row.add(rs.getString(4));
                row.add(rs.getString(5));
                row.add(rs.getString(6));
                row.add(rs.getString(7));
                row.add(rs.getString(8));
                row.add(rs.getString(9));
                row.add(rs.getString(10));
                 row.add(rs.getString(11));
                row.add(rs.getString(12));
                model.addRow(row);
            }
            table.setModel(model);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
  private boolean check() {

        if (txtdangnhap.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Tên Đang Nhập không được để trống");
            txtdangnhap.setBackground(Color.RED);
            txtdangnhap.setText("");
            return false;
        }
        if (txtmatkau.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " Mật Khẩu không được để trống");
            txtmatkau.setBackground(Color.RED);
            txtmatkau.setText("");
            return false;
        }
        if (txtsdt1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "số điện thoại không được để trống");
            txtsdt1.setBackground(Color.RED);
            txtsdt1.setText("");
            return false;
        }
        if (txtemail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "email không được để trống");
            txtemail.setBackground(Color.RED);
            txtemail.setText("");
            return false;
        }
        if (txtdiachi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "địa chỉ không được để trống");
            txtdiachi.setBackground(Color.RED);
            txtdiachi.setText("");
            return false;
        }
        if (!(txtemail.getText()).matches("^[\\w-_\\.]+\\@[\\w&&[^0-9]]+\\.[\\w&&[^0-9]]+$")) {
            JOptionPane.showMessageDialog(this, "Sai định dạng email");
            txtemail.requestFocus();
            txtemail.setBackground(Color.RED);
            txtemail.setText("");
            return false;
        }
        if (txtten.getText().equals("")) {
            JOptionPane.showMessageDialog(null, " Tên không được để trống");
            txtten.setBackground(Color.RED);
            txtten.setText("");
            return false;
        }
        if (txtcmnd.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chứng Minh Nhân Dân không được để trống");
            txtcmnd.setBackground(Color.RED);
            txtcmnd.setText("");
            return false;
        }
        return true;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel40 = new javax.swing.JPanel();
        txtemail = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        txtdangnhap = new javax.swing.JTextField();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        nam = new javax.swing.JRadioButton();
        nu = new javax.swing.JRadioButton();
        hinh = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtsdt1 = new javax.swing.JTextField();
        cbnchon = new javax.swing.JButton();
        txtten = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        txtcmnd = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        nhanvien = new javax.swing.JRadioButton();
        quanly = new javax.swing.JRadioButton();
        dcngay = new com.toedter.calendar.JDateChooser();
        txtmatkau = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextArea();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        setToolTipText("aa");

        jPanel40.setPreferredSize(new java.awt.Dimension(865, 517));

        txtemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtemailMouseClicked(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel134.setText("Email");

        jLabel135.setText("Trang Thái");

        jLabel136.setText("Mật Khẩu");

        txtdangnhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdangnhapMouseClicked(evt);
            }
        });
        txtdangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdangnhapActionPerformed(evt);
            }
        });

        jLabel137.setText("Tên Đang Nhập");

        jLabel138.setText("Số Điện Thoại");

        jLabel139.setText("Giới Tính");

        buttonGroup1.add(nam);
        nam.setSelected(true);
        nam.setText("Nam");
        nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namActionPerformed(evt);
            }
        });

        buttonGroup1.add(nu);
        nu.setText("Nữ");
        nu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuActionPerformed(evt);
            }
        });

        hinh.setBackground(new java.awt.Color(102, 102, 102));
        hinh.setOpaque(true);

        jLabel140.setText("Tên");

        jLabel1.setText("Ngày Sinh");

        txtsdt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsdt1MouseClicked(evt);
            }
        });
        txtsdt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsdt1ActionPerformed(evt);
            }
        });

        cbnchon.setText("ChỌN");
        cbnchon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnchonActionPerformed(evt);
            }
        });

        txtten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttenMouseClicked(evt);
            }
        });
        txtten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttenActionPerformed(evt);
            }
        });

        jLabel141.setText("Cmnd");

        txtcmnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcmndMouseClicked(evt);
            }
        });
        txtcmnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcmndActionPerformed(evt);
            }
        });

        jLabel142.setText("Địa Chỉ");

        buttonGroup2.add(nhanvien);
        nhanvien.setSelected(true);
        nhanvien.setText("Nhân Viên");
        nhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhanvienActionPerformed(evt);
            }
        });

        buttonGroup2.add(quanly);
        quanly.setText("Quản Lý");
        quanly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanlyActionPerformed(evt);
            }
        });

        dcngay.setEnabled(false);

        txtdiachi.setColumns(20);
        txtdiachi.setRows(5);
        jScrollPane1.setViewportView(txtdiachi);

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnnew.setText("Mới");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(cbnchon, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel136, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel140, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel141, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                        .addComponent(btnthem)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dcngay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtmatkau, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtdangnhap, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtten)
                        .addComponent(txtcmnd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnsua)
                        .addGap(48, 48, 48)
                        .addComponent(btnxoa)))
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel40Layout.createSequentialGroup()
                                        .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addComponent(jLabel135, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel138, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel40Layout.createSequentialGroup()
                                        .addComponent(nam)
                                        .addGap(46, 46, 46)
                                        .addComponent(nu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtsdt1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel40Layout.createSequentialGroup()
                                        .addComponent(nhanvien)
                                        .addGap(18, 18, 18)
                                        .addComponent(quanly, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(936, 936, 936))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnnew)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(hinh, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbnchon))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmatkau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsdt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel140, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nam)
                            .addComponent(nu))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(dcngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(quanly)
                                .addComponent(nhanvien))
                            .addComponent(jLabel135, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtcmnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel141)
                                    .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnnew))
                .addGap(56, 56, 56))
        );

        jDesktopPane1.setLayer(jPanel40, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Thêm Nhân Viên", jDesktopPane1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Danh Sách Sinh Viên", jPanel1);

        jTabbedPane1.addTab("Quản Lý Nhân Viên", jTabbedPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtemailMouseClicked
        txtemail.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtemailMouseClicked

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed

    }//GEN-LAST:event_txtemailActionPerformed

    private void txtdangnhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdangnhapMouseClicked
        txtdangnhap.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtdangnhapMouseClicked

    private void txtdangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdangnhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdangnhapActionPerformed

    private void namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namActionPerformed

    private void nuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuActionPerformed

    private void txtsdt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsdt1MouseClicked
        txtsdt1.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtsdt1MouseClicked

    private void txtsdt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsdt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsdt1ActionPerformed

    private void cbnchonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnchonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon("D:\\Java 4\\DuAn1\\src\\icon " + filename);
        icon = new ImageIcon(new ImageIcon(filename).getImage().
            getScaledInstance(hinh.getWidth(), hinh.getHeight(), Image.SCALE_SMOOTH));
        hinh.setIcon(icon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            byte[] bs = new byte[1024];
            for (int i; (i = fis.read(bs)) != -1;) {
                baos.write(bs, 0, i);
            }
            preson_image = baos.toByteArray();
        } catch (Exception e) {
            System.out.println("loi he thong");
        }
    }//GEN-LAST:event_cbnchonActionPerformed

    private void txttenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txttenMouseClicked

    private void txttenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttenActionPerformed

    private void txtcmndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcmndMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcmndMouseClicked

    private void txtcmndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcmndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcmndActionPerformed

    private void nhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhanvienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nhanvienActionPerformed

    private void quanlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanlyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quanlyActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        if (check()) {

            try {
                Connection con = hd.getconection();
                String b = "insert into nhanvien(username,passwords,hovaten,email,ngaysinh,gioitinh,sdt,cmnd,diachi,lv,hinh)values (?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(b);
                pst.setString(1, txtdangnhap.getText());
                pst.setString(2, txtmatkau.getText());
                pst.setString(3, txtten.getText());
                pst.setString(4, txtemail.getText());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(dcngay.getDate());
                pst.setString(5, date);
                if (nam.isSelected()) {
                    a = "Nam";
                }
                if (nu.isSelected()) {
                    a = "Nữ";
                }
                pst.setString(6, a);
                pst.setString(7, txtsdt1.getText());
                pst.setString(8, txtcmnd.getText());

                pst.setString(9, txtdiachi.getText());
                if (nam.isSelected()) {
                    c = "1";
                }
                if (nu.isSelected()) {
                    c = "2";
                }
                pst.setString(10, c);
                pst.setBytes(11, preson_image);
                pst.executeUpdate();
                model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                loaddata();
                neww();
                JOptionPane.showMessageDialog(null, "thành công");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
               if (check()) {
            try {
                Connection conn = hd.getconection();
                int row = table.getSelectedRow();
                String value = (table.getModel().getValueAt(row, 0).toString());
                String b = "update nhanvien set username=?,passwords=?,hovaten=?, email=?, ngaysinh=?, gioitinh=?, sdt=?,cmnd =?,diachi=?,lv=?,hinh=? where id=" + value;
                PreparedStatement pst = conn.prepareStatement(b);
                pst.setString(1, txtdangnhap.getText());
                pst.setString(2, txtmatkau.getText());
                pst.setString(3, txtten.getText());
                pst.setString(4, txtemail.getText());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(dcngay.getDate());
                pst.setString(5, date);
                if (nam.isSelected()) {
                    a = "Nam";
                }
                if (nu.isSelected()) {
                    a = "Nữ";
                }
                pst.setString(6, a);
                pst.setString(7, txtsdt1.getText());
                pst.setString(8, txtcmnd.getText());

                pst.setString(9, txtdiachi.getText());
                if (nam.isSelected()) {
                    c = "1";
                }
                if (nu.isSelected()) {
                    c = "2";
                }
                pst.setString(10, c);
                pst.setBytes(11, preson_image);
                pst.executeUpdate();
                model = (DefaultTableModel) table.getModel();
                model.setRowCount(0);
                loaddata();
                JOptionPane.showMessageDialog(null, "thành công");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
       try {
            Connection conn = hd.getconection();
            int row = table.getSelectedRow();
            String value = (table.getModel().getValueAt(row, 0).toString());
            String query = "delete from nhanvien where id=" + value;
            PreparedStatement st = conn.prepareStatement(query);
            st.executeUpdate();
            model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            loaddata();
            JOptionPane.showMessageDialog(null, "Xóa thành công !");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnxoaActionPerformed
public void neww(){
             txtdiachi.setText("");
        txtdangnhap.setText("");
        txtemail.setText("");
        txtsdt1.setText("");
        txtmatkau.setText("");
        txtten.setText("");
        hinh.setIcon(null);
        txtcmnd.setText("");
}
    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        neww();
    }//GEN-LAST:event_btnnewActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       try {

            Connection conn = hd.getconection();
            int i = table.getSelectedRow();
            TableModel model = table.getModel();
            txtdangnhap.setText(model.getValueAt(i, 1).toString());
            txtmatkau.setText(model.getValueAt(i, 2).toString());
            txtten.setText(model.getValueAt(i, 3).toString());
            txtemail.setText(model.getValueAt(i, 4).toString());
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(i, 5));
                dcngay.setDate(date);

            } catch (Exception e) {

            }
            String gioitinh = (model.getValueAt(i, 6).toString());
            if (gioitinh.equals("Nam")) {
                nam.setSelected(true);

            } else {
                nu.setSelected(true);

            }
            txtsdt1.setText(model.getValueAt(i, 7).toString());

            txtcmnd.setText(model.getValueAt(i, 8).toString());
            txtdiachi.setText(model.getValueAt(i, 9).toString());
            String trangthai = (model.getValueAt(i, 10).toString());
            if (trangthai.equals("1")) {
                nhanvien.setSelected(true);

            } else {
                quanly.setSelected(true);

            }

            try {

                byte[] img = (getlist().get(i).getHinh());
                ImageIcon icon = new ImageIcon(new ImageIcon(img).getImage().
                        getScaledInstance(hinh.getWidth(), hinh.getHeight(), Image.SCALE_SMOOTH));
                hinh.setIcon(icon);
            } catch (Exception e) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cbnchon;
    private com.toedter.calendar.JDateChooser dcngay;
    private javax.swing.JLabel hinh;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JRadioButton nam;
    private javax.swing.JRadioButton nhanvien;
    private javax.swing.JRadioButton nu;
    private javax.swing.JRadioButton quanly;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtcmnd;
    private javax.swing.JTextField txtdangnhap;
    private javax.swing.JTextArea txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtmatkau;
    private javax.swing.JTextField txtsdt1;
    private javax.swing.JTextField txtten;
    // End of variables declaration//GEN-END:variables
}
