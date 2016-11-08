package figures;
import java.awt.*;


public class Text extends FiguraGeometrica{
    int x,y;
    private String text;
    private Color color;



    public void visualitzar(Graphics g) {
        g.setColor (color);
        g.drawString(text,x,y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
