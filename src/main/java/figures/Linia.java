package figures;

import java.awt.*;

/**
 * Created by Marco on 15/10/2016.
 */
public class Linia extends FiguraGeometrica{
    int x,y,x1,y1;
    Color color;

    public Linia(int x, int y,int x1, int y1, Color color) {
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.color = color;
    }


    public void visualitzar(Graphics g) {
        g.setColor (color);
        g.drawLine(x, y, x1, y1);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
