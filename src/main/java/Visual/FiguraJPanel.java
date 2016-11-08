package Visual;

import figures.Figura;

import javax.swing.*;
import java.awt.*;


public class FiguraJPanel extends JPanel {

    private Figura figura;

    public FiguraJPanel(Figura figura){
        this.figura = figura;
    }

    public void paint(Graphics g){
        super.paint(g);
        figura.visualitzar(g);
    }

    public Figura getFigura(){
        return figura;
    }

    public void setFigura(Figura figura){
        this.figura = figura;
    }

}
