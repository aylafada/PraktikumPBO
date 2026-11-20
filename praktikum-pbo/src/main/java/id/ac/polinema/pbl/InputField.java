package id.ac.polinema.pbl;
// kotak input membulat, isinya bisa JTextField, 
// JPasswodField atau JComboBox

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;

public class InputField extends RoundedPanel {
    public InputField(JComponent main, JComponent trailing) {
        super(14, Theme.FIELD, Theme.BORDER);
        setLayout(new BorderLayout(8, 0));
        setBorder(new EmptyBorder(0, 14, 0, 10));
        setPreferredSize(new Dimension(100, 46));

        main.setOpaque(false);
        main.setBorder(null);
        main.setForeground(Theme.TEXT);
        main.setFont(Theme.NORMAL);
        add(main, BorderLayout.CENTER);

        if (trailing != null) {
            add(trailing, BorderLayout.EAST);
        }
    }
}
