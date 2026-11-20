
package id.ac.polinema.jobsheet13;

import javax.swing.JFrame;
import javax.swing.JButton;

public class CobaJButton {
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

        frame.add(btnCreate);
        frame.add(btnUpdate);
        frame.add(btnDelete);

        frame.setVisible(true);
    }
}
