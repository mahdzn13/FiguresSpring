package figures;

import java.awt.*;
import java.util.Objects;

public class Cercle extends FiguraGeometrica {
   int x,y,ample,altura;
   Color color;
   String omple;



    public void visualitzar(Graphics g) {
       g.setColor (color);
       if (Objects.equals(omple, "S")){
          g.fillOval(x,y,ample,altura);
       }

       g.drawOval(x,y,ample,altura);
    }

   public void setX(int x) {
      this.x = x;
   }

   public void setY(int y) {
      this.y = y;
   }

   public void setAmple(int ample) {
      this.ample = ample;
   }

   public void setAltura(int altura) {
      this.altura = altura;
   }

   @Override
   public void setColor(Color color) {
      this.color = color;
   }

   public void setOmple(String omple) {
      this.omple = omple;
   }
}