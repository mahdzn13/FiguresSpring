package figures;

import java.awt.*;
import java.util.Objects;


public class Cuadrat extends FiguraGeometrica {
    int x,y,ancho;
    Color color;
    String omple;


    public void visualitzar(Graphics g) {
        g.setColor (color);
        if (Objects.equals(omple, "S")){
            g.fillRect(x,y,ancho,ancho);
        }
        g.drawRect(x,y,ancho,ancho);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public void setOmple(String omple) {
        this.omple = omple;
    }
}
