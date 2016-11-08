package figures;

import java.awt.*;


public class Punt extends FiguraGeometrica {
    private int x,y;
    private Color color;


    public void visualitzar(Graphics g) {
        g.setColor (color);
        g.drawLine(x, y, x, y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
