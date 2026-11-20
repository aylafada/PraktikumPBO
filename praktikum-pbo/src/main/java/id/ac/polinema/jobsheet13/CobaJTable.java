
package id.ac.polinema.jobsheet13;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class CobaJTable {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(400, 300);
        frame.setTitle("Aplikasi Database Java");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

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

        // Button CRUD
        JButton btnCreate = new JButton("Create");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");

        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);

        btnCreate.setBounds(30, 110, 90, 30);
        btnUpdate.setBounds(130, 110, 90, 30);
        btnDelete.setBounds(230, 110, 90, 30);

        frame.add(btnCreate);
        frame.add(btnUpdate);
        frame.add(btnDelete);

        // Membuat Model Tabel
        String[] kolom = {"NIM", "Nama"};
        DefaultTableModel model = new DefaultTableModel(kolom, 0);

        // Membuat JTable
        JTable tabel = new JTable(model);

        // Menambahkan JScrollPane
        JScrollPane scrollPane = new JScrollPane(tabel);
        scrollPane.setBounds(30, 170, 210, 75);
        frame.add(scrollPane);

        // Button Edit
        JButton btnEdit = new JButton("Edit");
        btnEdit.setBounds(250, 170, 100, 30);
        frame.add(btnEdit);

        // Button View
        JButton btnView = new JButton("View");
        btnView.setBounds(250, 210, 100, 30);
        frame.add(btnView);

        frame.setVisible(true);
    }
}
