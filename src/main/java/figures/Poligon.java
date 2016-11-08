package figures;

import java.awt.*;
import java.util.Objects;


public class Poligon extends FiguraGeometrica{
    int[] x,y;
    int nodes;
    String omple;
    Color color;

    public void visualitzar(Graphics g) {
        g.setColor (color);
        if (Objects.equals(omple, "S")){
            g.fillPolygon(x,y,nodes);
        }
        g.drawPolygon(x,y,nodes);
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public void setY(int[] y) {
        this.y = y;
    }

    public void setNodes(int nodes) {
        this.nodes = nodes;
    }

    public void setOmple(String omple) {
        this.omple = omple;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
