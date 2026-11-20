package id.ac.polinema;

import id.ac.polinema.pbl.LoginFrame;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginFrame().setVisible(true));
    }
}