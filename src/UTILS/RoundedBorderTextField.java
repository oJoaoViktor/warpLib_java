package UTILS;
import javax.swing.border.Border;
import java.awt.*;

public class RoundedBorderTextField implements Border {
    private int radius;
    private Color borderColor;
    private int thickness;

    // Construtor que aceita valores RGB para a cor da borda
    public RoundedBorderTextField(int radius, int red, int green, int blue, int thickness) {
        this.radius = radius;
        this.borderColor = new Color(red, green, blue); // Define a cor usando RGB
        this.thickness = thickness;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(thickness + 2, thickness + 2, thickness + 2, thickness + 2);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(borderColor);
        g2.setStroke(new BasicStroke(thickness));
        g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}
