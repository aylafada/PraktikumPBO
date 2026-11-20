package id.ac.polinema.pbl;
//ActionListener

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginAction implements ActionListener {
    private final LoginFrame frame;

    public LoginAction(LoginFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("LOGIN")) {
            if (frame.getUsername().isEmpty() || frame.getPassword().isEmpty()) {
                JOptionPane.showMessageDialog(frame,
                        "Username dan password wajib diisi!",
                        "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }
            // TODO: nanti cek ke database di sini
            JOptionPane.showMessageDialog(frame,
                    "Login berhasil sebagai " + frame.getRole()
                            + " (" + frame.getUsername() + ")");
        } else if (cmd.equals("GUEST")) {
            JOptionPane.showMessageDialog(frame, "Masuk sebagai Tamu (halaman menu menyusul)");
        } else if (cmd.equals("REGISTER")) {
            JOptionPane.showMessageDialog(frame, "Halaman daftar menyusul");
        }
    }
}
