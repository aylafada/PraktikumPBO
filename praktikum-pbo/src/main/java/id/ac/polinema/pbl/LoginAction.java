package id.ac.polinema.pbl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginAction implements ActionListener {

    private LoginFrame frame;

    public LoginAction(LoginFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("LOGIN")) {
            // validator sederhana, sama seperti di jobsheet
            if (frame.getUsername().isEmpty() || frame.getPassword().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Username dan Password harus diisi!");
                return;
            }
            JOptionPane.showMessageDialog(frame,
                    "Login berhasil sebagai " + frame.getRole()
                            + " (" + frame.getUsername() + ")");
        } else if (cmd.equals("GUEST")) {
            JOptionPane.showMessageDialog(frame, "Masuk sebagai Tamu");
        } else if (cmd.equals("REGISTER")) {
            JOptionPane.showMessageDialog(frame, "Halaman daftar menyusul");
        }
    }
}