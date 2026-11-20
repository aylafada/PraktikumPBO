package id.ac.polinema.pbl;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class LoginFrame extends JFrame {
    private final JTextField txtUsername = new JTextField();
    private final JPasswordField txtPassword = new JPasswordField();
    private final JComboBox<String> cmbRole =
            new JComboBox<>(new String[]{"Pembeli", "Penjual"});

    private JPanel card;
    private int row = 0;

    public LoginFrame() {
        setTitle("Brawijaya Street Food");
        setSize(520, 820);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel background = new JPanel(new GridBagLayout());
        background.setBackground(Theme.BG);
        setContentPane(background);

        card = new RoundedPanel(24, Theme.CARD, Theme.BORDER);
        card.setLayout(new GridBagLayout());
        card.setBorder(new EmptyBorder(32, 32, 32, 32));
        card.setPreferredSize(new Dimension(440, 720));
        background.add(card);

        LoginAction action = new LoginAction(this);

        // Logo
        JLabel logo = new JLabel("", SwingConstants.CENTER);
        java.net.URL url = getClass().getResource("/images/logo.png");
        if (url != null) {
            Image img = new ImageIcon(url).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
            logo.setIcon(new ImageIcon(img));
            addRow(logo, 0);
        }

        // Judul + deskripsi
        addRow(label("Selamat Datang!", Theme.TITLE, Theme.TEXT), 20);
        addRow(label("<html><div style='text-align:center;width:300px'>"
                + "Masuk ke akunmu untuk mengakses layanan Brawijaya Street Food."
                + "</div></html>", Theme.NORMAL, Theme.MUTED), 10);

        // Username
        addRow(label("Username", Theme.BOLD, Theme.TEXT, SwingConstants.LEFT), 24);
        txtUsername.setCaretColor(Theme.TEXT);
        addRow(new InputField(txtUsername, null), 8);

        // Password + tombol mata
        addRow(label("Password", Theme.BOLD, Theme.TEXT, SwingConstants.LEFT), 18);
        txtPassword.setCaretColor(Theme.TEXT);
        JButton btnEye = new JButton("\uD83D\uDC41");
        btnEye.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 14));
        btnEye.setForeground(Theme.MUTED);
        btnEye.setContentAreaFilled(false);
        btnEye.setBorderPainted(false);
        btnEye.setFocusPainted(false);
        btnEye.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        char defaultEcho = txtPassword.getEchoChar();
        btnEye.addActionListener(e -> txtPassword.setEchoChar(
                txtPassword.getEchoChar() == 0 ? defaultEcho : (char) 0));
        addRow(new InputField(txtPassword, btnEye), 8);

        // Masuk sebagai
        addRow(label("Masuk sebagai", Theme.BOLD, Theme.TEXT, SwingConstants.LEFT), 18);
        cmbRole.setBackground(Theme.FIELD);
        addRow(new InputField(cmbRole, null), 8);

        // Tombol Masuk
        RoundedButton btnLogin = new RoundedButton("Masuk",
                Theme.ORANGE, Color.BLACK, null);
        btnLogin.setActionCommand("LOGIN");
        btnLogin.addActionListener(action);
        addRow(btnLogin, 24);

        // Pemisah "atau"
        JPanel divider = new JPanel(new GridBagLayout());
        divider.setOpaque(false);
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        JSeparator s1 = new JSeparator();
        JSeparator s2 = new JSeparator();
        s1.setForeground(Theme.BORDER);
        s2.setForeground(Theme.BORDER);
        divider.add(s1, c);
        c.weightx = 0;
        c.insets = new Insets(0, 12, 0, 12);
        divider.add(label("atau", Theme.NORMAL, Theme.MUTED), c);
        c.weightx = 1;
        c.insets = new Insets(0, 0, 0, 0);
        divider.add(s2, c);
        addRow(divider, 18);

        // Tombol Tamu
        RoundedButton btnGuest = new RoundedButton("Jelajahi Menu sebagai Tamu",
                Theme.CARD, Theme.TEXT, Theme.BORDER);
        btnGuest.setActionCommand("GUEST");
        btnGuest.addActionListener(action);
        addRow(btnGuest, 18);

        // Link daftar
        JPanel register = new JPanel(new FlowLayout(FlowLayout.CENTER, 4, 0));
        register.setOpaque(false);
        register.add(label("Belum memiliki akun?", Theme.NORMAL, Theme.MUTED));
        JButton btnRegister = new JButton("Daftar sekarang");
        btnRegister.setFont(Theme.BOLD);
        btnRegister.setForeground(Theme.ORANGE);
        btnRegister.setContentAreaFilled(false);
        btnRegister.setBorderPainted(false);
        btnRegister.setFocusPainted(false);
        btnRegister.setMargin(new Insets(0, 0, 0, 0));
        btnRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRegister.setActionCommand("REGISTER");
        btnRegister.addActionListener(action);
        register.add(btnRegister);
        addRow(register, 18);

        // Dorong semua ke atas
        GridBagConstraints filler = new GridBagConstraints();
        filler.gridx = 0;
        filler.gridy = row++;
        filler.weighty = 1;
        card.add(Box.createVerticalGlue(), filler);
    }

    // ---- helper ----
    private void addRow(Component comp, int topGap) {
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = row++;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(topGap, 0, 0, 0);
        card.add(comp, c);
    }

    private JLabel label(String text, Font font, Color color) {
        return label(text, font, color, SwingConstants.CENTER);
    }

    private JLabel label(String text, Font font, Color color, int align) {
        JLabel l = new JLabel(text, align);
        l.setFont(font);
        l.setForeground(color);
        return l;
    }

    // ---- getter untuk dipakai LoginAction ----
    public String getUsername() { return txtUsername.getText().trim(); }
    public String getPassword() { return new String(txtPassword.getPassword()); }
    public String getRole()     { return (String) cmbRole.getSelectedItem(); }
}
