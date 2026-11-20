package id.ac.polinema.pbl;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginFrame extends JFrame {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JComboBox<String> cmbRole;

    public LoginFrame() {
        setSize(400, 500);
        setTitle("Brawijaya Street Food");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // null untuk set posisi manual

        // Judul
        JLabel lblJudul = new JLabel("Selamat Datang!", SwingConstants.CENTER);
        lblJudul.setBounds(40, 20, 300, 30);
        add(lblJudul);

        // Deskripsi
        JLabel lblDeskripsi = new JLabel(
                "<html><center>Masuk ke akunmu untuk mengakses layanan Brawijaya Street Food.</center></html>",
                SwingConstants.CENTER);
        lblDeskripsi.setBounds(40, 55, 300, 40);
        add(lblDeskripsi);

        // Username
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(40, 110, 300, 25);
        add(lblUsername);

        txtUsername = new JTextField();
        txtUsername.setBounds(40, 135, 300, 25);
        add(txtUsername);

        // Password
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(40, 170, 300, 25);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(40, 195, 300, 25);
        add(txtPassword);

        // Checkbox untuk menampilkan password
        JCheckBox chkLihat = new JCheckBox("Tampilkan password");
        chkLihat.setBounds(40, 225, 300, 20);
        char defaultEcho = txtPassword.getEchoChar();
        chkLihat.addActionListener(e -> {
            if (chkLihat.isSelected()) {
                txtPassword.setEchoChar((char) 0);
            } else {
                txtPassword.setEchoChar(defaultEcho);
            }
        });
        add(chkLihat);

        // Masuk sebagai
        JLabel lblRole = new JLabel("Masuk sebagai");
        lblRole.setBounds(40, 255, 300, 25);
        add(lblRole);

        cmbRole = new JComboBox<>(new String[]{"Pembeli", "Penjual"});
        cmbRole.setBounds(40, 280, 300, 25);
        add(cmbRole);

        // Tombol
        LoginAction action = new LoginAction(this);

        JButton btnMasuk = new JButton("Masuk");
        btnMasuk.setBounds(40, 320, 300, 30);
        btnMasuk.setActionCommand("LOGIN");
        btnMasuk.addActionListener(action);
        add(btnMasuk);

        JLabel lblAtau = new JLabel("atau", SwingConstants.CENTER);
        lblAtau.setBounds(40, 360, 300, 20);
        add(lblAtau);

        JButton btnTamu = new JButton("Jelajahi Menu sebagai Tamu");
        btnTamu.setBounds(40, 385, 300, 30);
        btnTamu.setActionCommand("GUEST");
        btnTamu.addActionListener(action);
        add(btnTamu);

        // Daftar
        JLabel lblDaftar = new JLabel("Belum memiliki akun?");
        lblDaftar.setBounds(60, 425, 150, 25);
        add(lblDaftar);

        JButton btnDaftar = new JButton("Daftar sekarang");
        btnDaftar.setBounds(200, 425, 140, 25);
        btnDaftar.setActionCommand("REGISTER");
        btnDaftar.addActionListener(action);
        add(btnDaftar);
    }

    // getter untuk dipakai LoginAction
    public String getUsername() {
        return txtUsername.getText().trim();
    }

    public String getPassword() {
        return new String(txtPassword.getPassword());
    }

    public String getRole() {
        return (String) cmbRole.getSelectedItem();
    }
}