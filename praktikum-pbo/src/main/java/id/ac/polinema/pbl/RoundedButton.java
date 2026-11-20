package id.ac.polinema.pbl;
//JButton

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JButton;

public class RoundedButton extends JButton {
    private final Color bg;
    private final Color stroke;

    public RoundedButton(String text, Color bg, Color fg, Color stroke) {
        super(text);
        this.bg = bg;
        this.stroke = stroke;
        setForeground(fg);
        setFont(Theme.BOLD);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setOpaque(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setPreferredSize(new Dimension(100, 46));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getModel().isRollover() ? bg.brighter() : bg);
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 14, 14);
        if (stroke != null) {
            g2.setColor(stroke);
            g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 14, 14);
        }
        g2.dispose();
        super.paintComponent(g);
    }
}
