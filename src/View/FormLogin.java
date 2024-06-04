package View;

import Config.Koneksi;
import Main.MenuUtama;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.UIManager;

public class FormLogin extends javax.swing.JFrame {

    int xx, xy;
    private Connection conn;
    
    public FormLogin() {
        initComponents();
        conn = Koneksi.getConnection();
        setBackground(new Color(0, 0, 0, 0));
        setActionButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        custom_JPanelRounded1 = new Palette.Custom_JPanelRounded();
        welcome = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        eye = new javax.swing.JLabel();
        hideEye = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        custom_JPanelRounded2 = new Palette.Custom_JPanelRounded();
        lb_image = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JLabel();
        t_username = new Palette.Custom_JTextFieldRounded();
        t_password = new Palette.Custom_JPasswordFieldRounded();
        btn_login = new Palette.Custom_ButtonRounded();
        welcome1 = new javax.swing.JLabel();
        cbxLevel = new javax.swing.JComboBox<>();
        password1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        custom_JPanelRounded1.setBackground(new java.awt.Color(255, 255, 255));
        custom_JPanelRounded1.setRoundBottomLeft(50);
        custom_JPanelRounded1.setRoundBottomRight(50);
        custom_JPanelRounded1.setRoundTopLeft(50);
        custom_JPanelRounded1.setRoundTopRight(50);
        custom_JPanelRounded1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                custom_JPanelRounded1MousePressed(evt);
            }
        });
        custom_JPanelRounded1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        welcome.setForeground(new java.awt.Color(102, 102, 102));
        welcome.setText("Welcome To Library");
        custom_JPanelRounded1.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 270, -1));

        password.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        password.setForeground(new java.awt.Color(102, 102, 102));
        password.setText("Role");
        custom_JPanelRounded1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        eye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_eye_20px.png"))); // NOI18N
        custom_JPanelRounded1.add(eye, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 235, 30, 30));

        hideEye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hideEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_hide_20px.png"))); // NOI18N
        custom_JPanelRounded1.add(hideEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 235, 30, 30));

        username1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        username1.setForeground(new java.awt.Color(102, 102, 102));
        username1.setText("Username");
        custom_JPanelRounded1.add(username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        custom_JPanelRounded2.setBackground(new java.awt.Color(246, 255, 250));
        custom_JPanelRounded2.setRoundBottomRight(50);
        custom_JPanelRounded2.setRoundTopRight(50);

        lb_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login Perpustakaan.png"))); // NOI18N

        btn_cancel.setBackground(new java.awt.Color(246, 255, 250));
        btn_cancel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(204, 255, 255));
        btn_cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cancel.setText("X");

        javax.swing.GroupLayout custom_JPanelRounded2Layout = new javax.swing.GroupLayout(custom_JPanelRounded2);
        custom_JPanelRounded2.setLayout(custom_JPanelRounded2Layout);
        custom_JPanelRounded2Layout.setHorizontalGroup(
            custom_JPanelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custom_JPanelRounded2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_image, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        custom_JPanelRounded2Layout.setVerticalGroup(
            custom_JPanelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(custom_JPanelRounded2Layout.createSequentialGroup()
                .addGroup(custom_JPanelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(custom_JPanelRounded2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_cancel))
                    .addGroup(custom_JPanelRounded2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lb_image, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        custom_JPanelRounded1.add(custom_JPanelRounded2, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 0, -1, 520));

        t_username.setBackground(new java.awt.Color(246, 255, 250));
        t_username.setForeground(new java.awt.Color(102, 102, 102));
        t_username.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        t_username.setSelectedTextColor(new java.awt.Color(246, 255, 250));
        t_username.setSelectionColor(new java.awt.Color(188, 254, 217));
        t_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                t_usernameMousePressed(evt);
            }
        });
        custom_JPanelRounded1.add(t_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 270, 40));

        t_password.setForeground(new java.awt.Color(102, 102, 102));
        t_password.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        t_password.setSelectionColor(new java.awt.Color(188, 254, 217));
        t_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_passwordActionPerformed(evt);
            }
        });
        custom_JPanelRounded1.add(t_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 270, 40));

        btn_login.setForeground(new java.awt.Color(102, 102, 102));
        btn_login.setText("LOGIN");
        btn_login.setFillClick(new java.awt.Color(95, 141, 115));
        btn_login.setFillOriginal(new java.awt.Color(188, 254, 217));
        btn_login.setFillOver(new java.awt.Color(124, 254, 182));
        btn_login.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_loginMousePressed(evt);
            }
        });
        custom_JPanelRounded1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 270, 40));

        welcome1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        welcome1.setForeground(new java.awt.Color(102, 102, 102));
        welcome1.setText("Hello,");
        custom_JPanelRounded1.add(welcome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 270, -1));

        cbxLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Petugas" }));
        custom_JPanelRounded1.add(cbxLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 80, 30));

        password1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        password1.setForeground(new java.awt.Color(102, 102, 102));
        password1.setText("Password");
        custom_JPanelRounded1.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(custom_JPanelRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(custom_JPanelRounded1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void t_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_passwordActionPerformed

    private void t_usernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_usernameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_usernameMousePressed

    private void custom_JPanelRounded1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custom_JPanelRounded1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_custom_JPanelRounded1MousePressed

    private void btn_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_loginMousePressed

    public static void main(String args[]) {
        FlatLightLaf.setup();
        UIManager.put( "Component.arc", 15 );

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cancel;
    private Palette.Custom_ButtonRounded btn_login;
    private javax.swing.JComboBox<String> cbxLevel;
    private Palette.Custom_JPanelRounded custom_JPanelRounded1;
    private Palette.Custom_JPanelRounded custom_JPanelRounded2;
    private javax.swing.JLabel eye;
    private javax.swing.JLabel hideEye;
    private javax.swing.JLabel lb_image;
    private javax.swing.JLabel password;
    private javax.swing.JLabel password1;
    private Palette.Custom_JPasswordFieldRounded t_password;
    private Palette.Custom_JTextFieldRounded t_username;
    private javax.swing.JLabel username1;
    private javax.swing.JLabel welcome;
    private javax.swing.JLabel welcome1;
    // End of variables declaration//GEN-END:variables

    private void setActionButton() {
        eye.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                eye.setVisible(false);
                hideEye.setVisible(true);
                t_password.setEchoChar((char)0);
            }
        });
        
        hideEye.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                eye.setVisible(true);
                hideEye.setVisible(false);
                t_password.setEchoChar('*');
            }
        });
        
        btn_login.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                prosesLogin();
            }
        });
        
        btn_cancel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                System.exit(0);
            }
        });
        
        t_password.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    btn_login.doClick();
                }
            }
        });  
    }

    
    public String getMd5java(String message){
        String digest = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(message.getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder( 2 * hash.length);
            for(byte b : hash){
                sb.append(String.format("%02x", b & 0xff));
            }
            digest = sb.toString();
            
        } catch (Exception e) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE,null,e);
        }
        
        return digest;
    }
    
    private boolean validasiInput(){
        boolean valid = false;
        if(t_username.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Username tidak boleh kosong");
        }else if(t_password.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Password tidak boleh kosong");
        }else{
            valid = true;
        }
        return valid;
    }
    
    private boolean checkLogin(String username, String password, String level) {
        if (conn != null) {
            try {
                String sql = "SELECT * FROM user WHERE Username=? AND Password=? AND Level=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, username);
                st.setString(2, password);
                st.setString(3, level);

                ResultSet rs = st.executeQuery();
                System.out.println(username + level);
                return rs.next(); // If there is a match, return true
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private void prosesLogin() {
        if (validasiInput()) {
            String username = t_username.getText();
            String password = new String(t_password.getPassword());
            String hashedPassword = getMd5java(password);
            String level = cbxLevel.getSelectedItem().toString();

            if (checkLogin(username, hashedPassword, level)) {
                // Successful login logic
                if (level.equals("Admin")) {
                    // Handle admin login
                    MenuUtama adminMenu = new MenuUtama();
                    adminMenu.setVisible(true);
                    adminMenu.revalidate();
                    adminMenu.lblUser.setText(username);
                } else if (level.equals("Petugas")) {
                    // Handle petugas login
                    Main.MenuPetugas petugasMenu = new Main.MenuPetugas();
                    petugasMenu.setVisible(true);
                    petugasMenu.revalidate();
                    petugasMenu.lblPetugas.setText(username);
                } else {
                    // Unrecognized role - handle error
                    JOptionPane.showMessageDialog(this, "Invalid Role", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Stop further processing
                }
                
                JOptionPane.showMessageDialog(this, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);

                dispose(); 
            } else {
                // Failed login logic
                JOptionPane.showMessageDialog(this, "Cek Kembali Username, Password dan Role Anda", "Login Gagal", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    
    
}
