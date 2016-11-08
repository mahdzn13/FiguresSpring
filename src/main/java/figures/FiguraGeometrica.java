package figures;

import java.awt.*;

public abstract class FiguraGeometrica implements Figura {
   protected int codi=0;
   protected Color color=Color.white;

   public FiguraGeometrica (int ncodi, Color ncolor) {
      if (ncodi>0) codi = ncodi;

      color = ncolor;
   }

   public FiguraGeometrica(FiguraGeometrica f)  {
      this (f.codi, f.color);
   }

   public FiguraGeometrica () {}

   public void setCodi(int nouCodi)  {
      if (nouCodi>=0) codi = nouCodi;
   }

   public void setColor (Color nouColor) {
      color = nouColor;
   }   

   public int getCodi () {
      return codi;
   }

   public Color getColor () {
      return color;
   }


   public boolean equals(Object f) {

      return f.equals(getCodi());
   }

}