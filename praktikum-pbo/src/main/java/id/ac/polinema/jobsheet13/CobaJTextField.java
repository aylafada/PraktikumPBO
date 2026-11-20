
package id.ac.polinema.jobsheet13;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CobaJTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(400, 300);
        frame.setTitle("Aplikasi Database Java");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        JButton btnCreate = new JButton("Create");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");

        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);

        btnCreate.setBounds(30, 120, 100, 30);
        btnUpdate.setBounds(140, 120, 100, 30);
        btnDelete.setBounds(250, 120, 100, 30);

        // Label NIM
        JLabel lblNIM = new JLabel("NIM");
        lblNIM.setBounds(30, 30, 100, 25);
        frame.add(lblNIM);

        // Label Nama
        JLabel lblNama = new JLabel("Nama");
        lblNama.setBounds(30, 65, 100, 25);
        frame.add(lblNama);

        // Input NIM
        JTextField txtNIM = new JTextField();
        txtNIM.setBounds(140, 30, 210, 25);
        frame.add(txtNIM);

        // Input Nama
        JTextField txtNama = new JTextField();
        txtNama.setBounds(140, 65, 210, 25);
        frame.add(txtNama);

        frame.add(btnCreate);
        frame.add(btnUpdate);
        frame.add(btnDelete);

        frame.setVisible(true);
    }
}
