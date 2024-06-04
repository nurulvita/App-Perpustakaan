package View;

import Config.Koneksi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class MenuPengembalian extends javax.swing.JPanel {

    private int halamanSaatIni = 1;
    private int dataPerHalaman = 14;
    private int totalPages;
    
    private final Connection conn;
    private String idAnggota;
    private String idUser;
    private String idBuku;
    private String idPeminjaman;
    
    public MenuPengembalian() {
        initComponents();
        
        conn = Koneksi.getConnection();
        setTabelModel2();
//        setTabelModel();
        loadDataPengembalian();
//        loadDataPeminjaman();
        loadPeminjaman();
        paginationPengembalian();
    }
    
//    public void setUserId(String userId) {
//        this.idUser = userId;
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        rbJenisKelamin = new javax.swing.ButtonGroup();
        dateChooser2 = new com.raven.datechooser.DateChooser();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new Palette.Custom_JTabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_last = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        cbx_data = new javax.swing.JComboBox<>();
        btn_before = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        lb_halaman = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAdd = new Palette.Custom_ButtonRounded();
        btnDelete = new Palette.Custom_ButtonRounded();
        btnCancel = new Palette.Custom_ButtonRounded();
        txtSearch = new Palette.Custom_JTextFieldRounded();
        panelAdd = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSave = new Palette.Custom_ButtonRounded();
        btnCancel2 = new Palette.Custom_ButtonRounded();
        txtID = new Palette.Custom_JTextFieldRounded();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTglKembali = new Palette.Custom_JTextFieldRounded();
        jLabel14 = new javax.swing.JLabel();
        txtTglTerima = new Palette.Custom_JTextFieldRounded();
        cbxUser = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        txtDenda = new Palette.Custom_JTextFieldRounded();
        txtAnggota = new Palette.Custom_JTextFieldRounded();
        txtBuku = new Palette.Custom_JTextFieldRounded();
        jPanel4 = new javax.swing.JPanel();
        btnHitung = new Palette.Custom_ButtonRounded();
        cbxStatusPengembalian = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jPanelGradient2 = new jpanelgradient.JPanelGradient();

        dateChooser1.setTextRefernce(txtTglKembali);

        dateChooser2.setTextRefernce(txtTglTerima);

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setPreferredSize(new java.awt.Dimension(1133, 690));
        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));
        panelView.setPreferredSize(new java.awt.Dimension(1133, 690));

        tblData.setForeground(new java.awt.Color(255, 51, 51));
        tblData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Data Pengembalian Perpustakaan");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Master Data > Pengembalian");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_tv_30px.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));

        btn_last.setText("Last Page");

        btn_next.setText(">");

        cbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14", "28", "54", "108" }));

        btn_before.setText("<");

        btn_first.setText("First Page");

        lb_halaman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_halaman.setText("Halaman of Total Halaman");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_halaman, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_first)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_before)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_next)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_last)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_halaman, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_before, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_return_book_30px.png"))); // NOI18N

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_add_30px.png"))); // NOI18N
        btnAdd.setText("TAMBAH");
        btnAdd.setFillClick(new java.awt.Color(0, 51, 102));
        btnAdd.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_cancel_30px.png"))); // NOI18N
        btnDelete.setText("HAPUS");
        btnDelete.setFillClick(new java.awt.Color(153, 0, 51));
        btnDelete.setFillOriginal(new java.awt.Color(255, 0, 51));
        btnDelete.setFillOver(new java.awt.Color(204, 0, 51));
        btnDelete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_rollback_30px.png"))); // NOI18N
        btnCancel.setText("BATAL");
        btnCancel.setFillClick(new java.awt.Color(153, 51, 0));
        btnCancel.setFillOriginal(new java.awt.Color(255, 102, 0));
        btnCancel.setFillOver(new java.awt.Color(204, 102, 0));
        btnCancel.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtSearch.setForeground(new java.awt.Color(102, 102, 102));
        txtSearch.setText("Search");
        txtSearch.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelViewLayout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1095, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));
        panelAdd.setPreferredSize(new java.awt.Dimension(1133, 690));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Tambah Data Pengembalian Perpustakaan");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Master Data > Pengembalian");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_tv_30px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_return_book_30px.png"))); // NOI18N

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_save_30px.png"))); // NOI18N
        btnSave.setText("SIMPAN");
        btnSave.setFillClick(new java.awt.Color(0, 51, 102));
        btnSave.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_rollback_30px.png"))); // NOI18N
        btnCancel2.setText("BATAL");
        btnCancel2.setFillClick(new java.awt.Color(153, 51, 0));
        btnCancel2.setFillOriginal(new java.awt.Color(255, 102, 0));
        btnCancel2.setFillOver(new java.awt.Color(204, 102, 0));
        btnCancel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnCancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel2ActionPerformed(evt);
            }
        });

        txtID.setForeground(new java.awt.Color(102, 102, 102));
        txtID.setText("ID");
        txtID.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("ID Pengembalian");

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Tanggal Pengembalian");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Tanggal Diterima");

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Denda Pengembalian");

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Anggota");

        txtTglKembali.setForeground(new java.awt.Color(102, 102, 102));
        txtTglKembali.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtTglKembali.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtTglKembaliComponentAdded(evt);
            }
        });
        txtTglKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglKembaliActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("ID Peminjaman");

        txtTglTerima.setForeground(new java.awt.Color(102, 102, 102));
        txtTglTerima.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txtTglTerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTglTerimaActionPerformed(evt);
            }
        });

        cbxUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUserActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Buku");

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 748, Short.MAX_VALUE)
        );

        btnHitung.setText("HITUNG");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        cbxStatusPengembalian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Status Pengembalian");

        jPanelGradient2.setColorEnd(new java.awt.Color(0, 255, 204));
        jPanelGradient2.setColorStart(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout jPanelGradient2Layout = new javax.swing.GroupLayout(jPanelGradient2);
        jPanelGradient2.setLayout(jPanelGradient2Layout);
        jPanelGradient2Layout.setHorizontalGroup(
            jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelGradient2Layout.setVerticalGroup(
            jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(cbxUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtBuku, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                            .addComponent(txtAnggota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTglKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel19))
                            .addComponent(jLabel10)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxStatusPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtTglTerima, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15))
                        .addContainerGap(182, Short.MAX_VALUE))))
            .addComponent(jPanelGradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(106, 106, 106)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTglTerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(cbxStatusPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelGradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);
        panelMain.repaint();
        panelMain.revalidate();
        
        txtID.setText(setIDPengembalian());
        if(btnAdd.getText().equals("UBAH")){
            dataTabel();
            btnSave.setText("PERBARUI");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(btnSave.getText().equals("TAMBAH"))
            {
                btnSave.setText("SIMPAN");
            }
        else if(btnSave.getText().equals("SIMPAN"))
            {
                insertData();
            }
        else if (btnSave.getText().equals("PERBARUI"))
            {
                updateData();
            }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel2ActionPerformed
        showPanel();
        loadDataPengembalian();
    }//GEN-LAST:event_btnCancel2ActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        if(btnAdd.getText().equals("TAMBAH")){
            btnAdd.setText("UBAH");
            btnDelete.setVisible(true);
            btnCancel.setVisible(true);
        }
            
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        showPanel();
        loadDataPengembalian();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        searchData();
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtTglKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglKembaliActionPerformed

    private void txtTglTerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTglTerimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglTerimaActionPerformed

    private void txtTglKembaliComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtTglKembaliComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTglKembaliComponentAdded
    
    public void loadPeminjaman() {  
        try {

            String sql = "SELECT ID_Peminjaman FROM peminjaman WHERE Status_Peminjaman = 'Dipinjam'";
            try (PreparedStatement st = conn.prepareStatement(sql)){
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                cbxUser.addItem(rs.getString("ID_Peminjaman"));
            }

            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(MenuPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
    }
    
    private void cbxUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUserActionPerformed
                             
        String selectedIDPeminjaman = (String) cbxUser.getSelectedItem();

        // Membuat koneksi dan pernyataan SQL
        String sql = "SELECT Tanggal_Pengembalian, ID_Anggota, ID_Buku FROM peminjaman WHERE ID_Peminjaman = ?";

        try (PreparedStatement st = conn.prepareStatement(sql)) {
            // Set parameter untuk query SQL
            st.setString(1, selectedIDPeminjaman);
//            st.setString(2, selectedIDPeminjaman);

            // Eksekusi query dan dapatkan hasilnya
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                // Isi label-label dengan data dari database
                txtTglKembali.setText(rs.getString("Tanggal_Pengembalian"));
                txtAnggota.setText(rs.getString("ID_Anggota"));
                txtBuku.setText(rs.getString("ID_Buku"));

            }
        } catch (SQLException ex) {
            // Handle eksepsi SQL
            java.util.logging.Logger.getLogger(MenuPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cbxUserActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        hitungtotal();
    }//GEN-LAST:event_btnHitungActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Custom_ButtonRounded btnAdd;
    private Palette.Custom_ButtonRounded btnCancel;
    private Palette.Custom_ButtonRounded btnCancel2;
    private Palette.Custom_ButtonRounded btnDelete;
    private Palette.Custom_ButtonRounded btnHitung;
    private Palette.Custom_ButtonRounded btnSave;
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbxStatusPengembalian;
    private javax.swing.JComboBox<String> cbxUser;
    private javax.swing.JComboBox<String> cbx_data;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private jpanelgradient.JPanelGradient jPanelGradient2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.ButtonGroup rbJenisKelamin;
    private Palette.Custom_JTabel tblData;
    private Palette.Custom_JTextFieldRounded txtAnggota;
    private Palette.Custom_JTextFieldRounded txtBuku;
    private Palette.Custom_JTextFieldRounded txtDenda;
    private Palette.Custom_JTextFieldRounded txtID;
    private Palette.Custom_JTextFieldRounded txtSearch;
    private Palette.Custom_JTextFieldRounded txtTglKembali;
    private Palette.Custom_JTextFieldRounded txtTglTerima;
    // End of variables declaration//GEN-END:variables

    private void paginationPengembalian() {
        btn_first.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                halamanSaatIni = 1;
                loadDataPengembalian();
//                loadData2();
            }
            
        });
        
        btn_before.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (halamanSaatIni > 1)
                {
                    halamanSaatIni--;
                    loadDataPengembalian();
//                    loadData2();
                }
            }
            
        });
        
        cbx_data.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dataPerHalaman = Integer.parseInt(cbx_data.getSelectedItem().toString());
                halamanSaatIni = 1;
//                loadData();
                loadDataPengembalian();
            }
            
        });
        
        btn_next.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (halamanSaatIni < totalPages) {
                    halamanSaatIni++;
                    loadDataPengembalian();
//                    loadData2();
                }
            }
            
        });
        
        btn_last.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                halamanSaatIni = totalPages;
                loadDataPengembalian();
            }
            
        });
    }
    
    private int getTotalData(){
        int totalData = 0;
        
        try {
            String sql = "SELECT COUNT(*) AS total FROM pengembalian";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    totalData = rs.getInt("total");
                }
            } 
        } catch (Exception e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE,null,e);
        }
        
        return totalData;
    }
    
    private void calculateTotalPages(){
        int totalData = getTotalData();
        totalPages = (int) Math.ceil((double) totalData / dataPerHalaman );
    }
    
    private void loadDataPengembalian() {
        status();
        calculateTotalPages();
        int totalData = getTotalData();
        lb_halaman.setText(String.valueOf("Halaman "+ halamanSaatIni + " dari Total Data " + totalData));
        
        int startIndex = (halamanSaatIni - 1) * dataPerHalaman;
        getDataPengembalian(startIndex, dataPerHalaman,(DefaultTableModel) tblData.getModel());
        btnDelete.setVisible(false);
        btnCancel.setVisible(false);
    }
    
    
    private void showPanel(){
        panelMain.removeAll();
        panelMain.add(new MenuPengembalian());
        panelMain.repaint();
        panelMain.revalidate();
    }
    
    private void resetForm() {
        txtID.setText("");
        txtTglKembali.setText("");
        txtTglTerima.setText("");
        txtDenda.setText("");
        cbxStatusPengembalian.setSelectedItem("Pilih Status");

    }
    
    private void setTabelModel2() {
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.addColumn("ID Pengembalian");
        model.addColumn("Tgl Pengembalian");
        model.addColumn("Denda");
        model.addColumn("Status");
        model.addColumn("ID Peminjaman");
        model.addColumn("ID Anggota");
        model.addColumn("Nama Anggota");
        model.addColumn("ID Buku");
        model.addColumn("Judul Buku");
        
    }
   
    
    public void getDataPengembalian(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0);

        try {
            String sql = "SELECT pm.ID_Pengembalian, pm.Tanggal_Pengembalian, pm.Denda_Pengembalian, pm.Status_Pengembalian," +
                         "pmn.ID_Peminjaman, " +
                         "agt.ID_Anggota, agt.Nama_Anggota, " +
                         "bk.ID_Buku, bk.Judul_Buku " +
                         "FROM pengembalian pm " +
                         "INNER JOIN peminjaman pmn ON pmn.ID_Peminjaman = pm.ID_Peminjaman " +
                         "INNER JOIN anggota agt ON agt.ID_Anggota = pm.ID_Anggota " +
                         "INNER JOIN buku bk ON bk.ID_Buku = pm.ID_Buku ORDER BY pm.ID_Pengembalian " ;

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String idPengembalian = rs.getString("ID_Pengembalian");
                    java.sql.Date tglTerima = rs.getDate("Tanggal_Pengembalian");
//                    java.sql.Date tglKembali = rs.getDate("Tanggal_Pengembalian");
                    String denda = rs.getString("Denda_Pengembalian");
                    String status = rs.getString("Status_Pengembalian");
//                    String idUser = rs.getString("ID_User");
                    String idPeminjaman = rs.getString("ID_Peminjaman");
                    String idAnggota = rs.getString("ID_Anggota");
                    String namaAnggota = rs.getString("Nama_Anggota");
                    String idBuku = rs.getString("ID_Buku");
                    String judulBuku = rs.getString("Judul_Buku");

                    // Add data directly to the model
                    Object[] rowData ={idPengembalian, tglTerima, denda, status, idPeminjaman, idAnggota, namaAnggota, idBuku, judulBuku};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
    }   
    

    private String setIDPengembalian(){
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM");
        String no = noFormat.format(now);
        
        String sql = "SELECT RIGHT(ID_Pengembalian, 4) AS Nomor " +
                     "FROM pengembalian " +
                     "WHERE ID_Pengembalian LIKE 'PN" + no + "%' " +
                     "ORDER BY ID_Pengembalian DESC " +
                     "LIMIT 1";
        
        try (PreparedStatement st = conn.prepareStatement(sql)){
                ResultSet rs = st.executeQuery();
                
            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("Nomor")) + 1;
                urutan = "PN" + no + String.format("%04d", nomor);
            }else{
                urutan = "PN" + no + "0001";
            }
            
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return urutan;
    }
    

    public void cekstatus() throws SQLException {
        String peminjaman = cbxUser.getSelectedItem().toString();
        String status1 = "";

        // Memeriksa status mobil
        String sql = "SELECT Status_Peminjaman FROM peminjaman WHERE ID_Peminjaman = ?";
        try(PreparedStatement st = conn.prepareStatement(sql)){
            st.setString(1, peminjaman);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                status1 = rs.getString("Status_Peminjaman");
            }

            if (!status1.equals("Sudah Kembali")) {
                // Mengubah status mobil menjadi "Tidak Tersedia"
                String updateSql = "UPDATE peminjaman SET Status_Peminjaman = 'Sudah Kembali' WHERE ID_Peminjaman = ?";
                try (java.sql.PreparedStatement updatePstmt = conn.prepareStatement(updateSql)) {
                    updatePstmt.setString(1, peminjaman);
                    int rowsAffected = updatePstmt.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println("Status peminjaman berhasil diubah menjadi 'Sudah Kembali'");
                        System.out.println(updateSql);
                    }
                }
            }
        }
    }

    
    private void insertData() {
        String idPeminjaman = (String) cbxUser.getSelectedItem();
        String idPengembalian = txtID.getText();
        String tglTerima = txtTglTerima.getText();
        String status = (String) cbxStatusPengembalian.getSelectedItem();
        String denda = txtDenda.getText();
        String idAnggota = txtAnggota.getText();
        String idBuku = txtBuku.getText();

        if (idPengembalian.isEmpty() || tglTerima.isEmpty()
                || denda.isEmpty() || cbxStatusPengembalian.getSelectedItem().toString().equals("Pilih Status")
                || cbxUser.getSelectedItem().toString().equals("Pilih ID Peminjaman")) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            double dendaValue = Double.parseDouble(denda);

            // Check if denda is greater than 0 but status is "Terlambat"
            if (dendaValue == 0 && status.equals("Terlambat")) {
                JOptionPane.showMessageDialog(this, "Status peminjaman tidak valid!", "Validasi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if denda is 0, then set the status to "Tepat Waktu"
            if (dendaValue == 0) {
                status = "Tepat Waktu";
            }

            String sql = "INSERT INTO pengembalian (ID_Pengembalian, Tanggal_Pengembalian, Denda_Pengembalian, Status_Pengembalian, ID_Peminjaman, ID_Anggota, ID_Buku) VALUES (?,?,?,?,?,?,?)";
            try (PreparedStatement st = conn.prepareStatement(sql)) {
                txtAnggota.setEnabled(false);
                txtBuku.setEnabled(false);
                st.setString(1, idPengembalian);
                st.setString(2, tglTerima);
                st.setString(3, denda);
                st.setString(4, status);
                st.setString(5, idPeminjaman);
                st.setString(6, idAnggota);
                st.setString(7, idBuku);

                int rowInserted = st.executeUpdate();
                if (rowInserted > 0) {
                    cekstatus();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                    resetForm();
                    loadDataPengembalian();
                    showPanel();
                }
            }
        } catch (NumberFormatException e) {
            // Handle the case where parsing denda as a double fails
            JOptionPane.showMessageDialog(this, "Format denda tidak valid!", "Validasi", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
    }


    
    private void status(){
        try {
            DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
            model.addElement("Pilih Status"); 
            model.addElement("Terlambat");
            model.addElement("Tepat Waktu");
            cbxStatusPengembalian.setModel(model);
            
            String select = (String) cbxStatusPengembalian.getSelectedItem();
            
        } catch (Exception e) {
        }
    }
    
    private void dataTabel() {
        panelView.setVisible(false);
        panelAdd.setVisible(true);
        
        int row = tblData.getSelectedRow();
        jLabel5.setText("Perbarui Data Pengembalian Perpustakaan");
        
        txtID.setEnabled(false);
        cbxUser.setEnabled(false);
        txtAnggota.setEnabled(false);
        txtBuku.setEnabled(false);
        txtTglKembali.setEnabled(false);
        
        txtID.setText(tblData.getValueAt(row, 0).toString());
//        txtTglKembali.setText(tblData.getValueAt(row, 1).toString());S
        txtTglTerima.setText(tblData.getValueAt(row, 1).toString());
//        idPeminjaman = tblData.getModel().getValueAt(row, 2).toString();
//        idAnggota = tblData.getModel().getValueAt(row, 3).toString();
//        idBuku = tblData.getModel().getValueAt(row, 4).toString();
        txtDenda.setText(tblData.getValueAt(row, 2).toString());
        cbxStatusPengembalian.setSelectedItem(tblData.getValueAt(row, 3).toString());
        
//        getAnggotaID(idAnggota);
//        getUserID(idUser);
//        getBukuID(idBuku);
        
    }

     
    
    private void updateData() {
        String idPengembalian = txtID.getText();
        String tglTerima = txtTglTerima.getText();
        String denda = txtDenda.getText();
        String status = (String) cbxStatusPengembalian.getSelectedItem();
        String idPeminjaman = (String) cbxUser.getSelectedItem();
        String idAnggota = txtAnggota.getText();
        String idBuku = txtBuku.getText();

        if (idPengembalian.isEmpty() || tglTerima.isEmpty() || denda.isEmpty()
                || cbxStatusPengembalian.getSelectedItem().toString().equals("Pilih Status")) {
            JOptionPane.showMessageDialog(this, "Semua kolom harus dipilih dan diisi !", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        

        try {
            // Validate Denda_Pengembalian
            double dendaValue = Double.parseDouble(denda);
            if (dendaValue == 0 && status.equals("Terlambat")) {
                JOptionPane.showMessageDialog(this, "Status peminjaman tidak valid!", "Validasi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate Status_Pengembalian
            if (dendaValue == 0) {
                status = "Tepat Waktu";
            }

            String sql = "UPDATE pengembalian SET Tanggal_Pengembalian=?, Denda_Pengembalian=?, Status_Pengembalian=?, ID_Peminjaman=?, ID_Anggota=?, ID_Buku=? ";
            sql += "WHERE ID_Pengembalian=?";

            try (PreparedStatement st = conn.prepareStatement(sql)) {
                st.setString(1, tglTerima);
                st.setString(2, denda);
                st.setString(3, status);
                st.setString(4, idPeminjaman);
                st.setString(5, idAnggota);
                st.setString(6, idBuku);
                st.setString(7, idPengembalian);

                int rowUpdated = st.executeUpdate();
                if (rowUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                    resetForm();
                    loadDataPengembalian();
                    showPanel();
                }
            }
        } catch (NumberFormatException e) {
            // Handle the case where parsing denda as a double fails
            JOptionPane.showMessageDialog(this, "Format denda tidak valid!", "Validasi", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    
    private void deleteData() {
        int selectedRow = tblData.getSelectedRow();
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Apakah yakin ingin menghapus data ini ?",
                "Konfirmasi Hapus Data", 
                JOptionPane.YES_NO_OPTION);
        
        if(confirm == JOptionPane.YES_OPTION){
            String id = tblData.getValueAt(selectedRow, 0).toString();
            try {
                String sql =  "DELETE FROM pengembalian WHERE ID_Pengembalian=?";
                try(PreparedStatement st = conn.prepareStatement(sql)){
                    st.setString(1, id);
                    
                    int rowDeleted = st.executeUpdate();
                    if(rowDeleted > 0){
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                    }
                }
            } catch (SQLException e) {
                Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        resetForm();
        loadDataPengembalian();
        showPanel();
    }

    private void searchData() {
        String kataKunci = txtSearch.getText();
        
        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        
        try {
            String sql = "SELECT pm.ID_Peminjaman, pm.Tanggal_Peminjaman, pm.Tanggal_Pengembalian, pm.Status_Peminjaman, usr.ID_User, "
                            + "usr.Nama_User, agt.ID_Anggota, agt.Nama_Anggota\n" +
                            "FROM peminjaman pm \n" +
                            "INNER JOIN user usr ON usr.ID_User = pm.ID_User\n" +
                            "INNER JOIN anggota agt ON agt.ID_Anggota = pm.ID_Anggota\n" +
                            "WHERE pm.ID_Peminjaman LIKE ? OR agt.ID_Anggota LIKE ?";
            try (PreparedStatement st = conn.prepareStatement(sql)){
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%");
                ResultSet rs = st.executeQuery();
                
                while (rs.next()) {
                    String idBuku       = rs.getString("ID_Peminjaman");
                    String judulBuku    = rs.getString("Tanggal_Peminjaman");
                    String pengarangBuku = rs.getString("Tanggal_Pengembalian");
                    String tahunTerbit  = rs.getString("Status_Peminjaman");
                    String idKategori   = rs.getString("ID_User");
                    String idPenerbit   = rs.getString("ID_Anggota");
                    String namaPenerbit   = rs.getString("Nama_Anggota");
                    
                    Object[] rowData = {idBuku, judulBuku, pengarangBuku, tahunTerbit, idKategori, idPenerbit, namaPenerbit};
                    model.addRow(rowData);
                }
            } 
        } catch (SQLException e) {
            Logger.getLogger(MenuPengembalian.class.getName()).log(Level.SEVERE,null,e);
        }
    }
    
    private void hitungtotal() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String strDate1 = txtTglKembali.getText();
            String strDate2 = txtTglTerima.getText();
            Date Tanggal1 = df.parse(strDate1);
            Date Tanggal2 = df.parse(strDate2);

            if (Tanggal2.before(Tanggal1)) {
                JOptionPane.showMessageDialog(this, "Input Tanggal Pengembalian Dengan Benar", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            } else {
                long tglKembali = Tanggal1.getTime();
                long tglTerima = Tanggal2.getTime();
                long selisih = tglTerima - tglKembali;
                long durasiHari = selisih / (24 * 60 * 60 * 1000); // Menggunakan toDays untuk mendapatkan jumlah hari
                // Menampilkan durasi pinjam
                String hasilDurasi = Long.toString(durasiHari);
    //            txtHasil.setText(hasilDurasi);

                // Menambahkan logika denda jika tanggal pengembalian lewat
                int dendaPerHari = 1000; 
                int durasiPinjam = Integer.parseInt(hasilDurasi);

                if (durasiPinjam > 0) {
                    int totalDenda = durasiPinjam * dendaPerHari;
                    String dendaStr = Integer.toString(totalDenda);
                    txtDenda.setText(dendaStr);
                } else {
                    txtDenda.setText("0");
                }
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Masukkan Tanggal Terima dan Tanggal Kembali dengan Format dd-MM-yyyy");
        }
    }


}
