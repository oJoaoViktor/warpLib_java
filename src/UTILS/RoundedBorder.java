package UTILS;

import java.awt.*;
import javax.swing.border.Border;

public class RoundedBorder implements Border {

    private int radius;
    private Color borderColor;
    private int thickness;
    private Color fillColor;

    public RoundedBorder(int radius, Color borderColor, int thickness, Color fillColor) {
        this.radius = radius;
        this.borderColor = borderColor;
        this.thickness = thickness;
        this.fillColor = fillColor;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + this.thickness, this.radius + this.thickness, this.radius + this.thickness, this.radius + this.thickness);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g;

        // Preenchendo o interior
        if (fillColor != null) {
            g2.setColor(fillColor);
            g2.fillRoundRect(x + thickness / 2, y + thickness / 2, width - thickness, height - thickness, radius, radius);
        }

        // Desenhando a borda
        g2.setColor(borderColor);
        g2.setStroke(new BasicStroke(thickness));
        g2.drawRoundRect(x + thickness / 2, y + thickness / 2, width - thickness, height - thickness, radius, radius);
    }
}
