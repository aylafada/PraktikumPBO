
package id.ac.polinema.jobsheet13;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CobaActionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(400, 350);
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

        DefaultTableModel model = new DefaultTableModel(kolom, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // Membuat JTable
        JTable tabel = new JTable(model);

        // Menambahkan JScrollPane
        JScrollPane scrollPane = new JScrollPane(tabel);
        scrollPane.setBounds(30, 170, 210, 100);
        frame.add(scrollPane);

        // Button Edit
        JButton btnEdit = new JButton("Edit");
        btnEdit.setBounds(250, 170, 100, 30);
        frame.add(btnEdit);

        // Button View
        JButton btnView = new JButton("View");
        btnView.setBounds(250, 210, 100, 30);
        frame.add(btnView);

        int[] selectedRow = {-1};

        // EVENT CREATE
        btnCreate.addActionListener(e -> {
            String nim = txtNIM.getText().trim();
            String nama = txtNama.getText().trim();

            if (nim.isEmpty() || nama.isEmpty()) {
                JOptionPane.showMessageDialog(
                    frame, "NIM dan Nama harus diisi!"
                );
                return;
            }

            try {
                Integer.parseInt(nim);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    frame, "NIM harus berupa angka!"
                );
                return;
            }

            model.addRow(new Object[]{nim, nama});

            txtNIM.setText("");
            txtNama.setText("");
        });

        // EVENT EDIT
        btnEdit.addActionListener(e -> {
            int row = tabel.getSelectedRow();

            if (row == -1) {
                return;
            }

            selectedRow[0] = row;

            txtNIM.setText(
                model.getValueAt(row, 0).toString()
            );

            txtNama.setText(
                model.getValueAt(row, 1).toString()
            );

            btnCreate.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
        });

        // EVENT UPDATE
        btnUpdate.addActionListener(e -> {
            String nim = txtNIM.getText().trim();
            String nama = txtNama.getText().trim();

            if (nim.isEmpty() || nama.isEmpty()) {
                JOptionPane.showMessageDialog(
                    frame, "NIM dan Nama harus diisi!"
                );
                return;
            }

            try {
                Integer.parseInt(nim);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    frame, "NIM harus berupa angka!"
                );
                return;
            }

            if (selectedRow[0] != -1) {
                model.setValueAt(nim, selectedRow[0], 0);
                model.setValueAt(nama, selectedRow[0], 1);
            }

            btnCreate.setEnabled(true);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);

            txtNIM.setText("");
            txtNama.setText("");
            selectedRow[0] = -1;
        });

        // EVENT DELETE
        btnDelete.addActionListener(e -> {
            if (selectedRow[0] != -1) {
                model.removeRow(selectedRow[0]);
            }

            btnCreate.setEnabled(true);
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);

            txtNIM.setText("");
            txtNama.setText("");
            selectedRow[0] = -1;
        });

        // EVENT VIEW
        btnView.addActionListener(e -> {
            int row = tabel.getSelectedRow();

            if (row == -1) {
                return;
            }

            String nim = model.getValueAt(row, 0).toString();
            String nama = model.getValueAt(row, 1).toString();

            JOptionPane.showMessageDialog(
                frame,
                "NIM : " + nim + "\nNama : " + nama,
                "Detail Data",
                JOptionPane.INFORMATION_MESSAGE
            );
        });

        frame.setVisible(true);
    }
}
