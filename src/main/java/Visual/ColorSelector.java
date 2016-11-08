package Visual;

import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

public class ColorSelector {

    public static Color selectColor(){
        Scanner s = new Scanner(System.in);
        colorMenu();
        System.out.println("Que color desea?");
        String colorWord = s.next();
        return getColor(colorWord);
    }

    public static Color getColor(String colorName){
        if (Objects.equals(colorName, "A")){
            return Color.darkGray;
        } else if (Objects.equals(colorName,"B")){
            return Color.red;
        } else if (Objects.equals(colorName,"C")){
            return Color.blue;
        } else if (Objects.equals(colorName,"D")){
            return Color.green;
        } else if (Objects.equals(colorName,"E")){
            return Color.yellow;
        } else if (Objects.equals(colorName,"F")){
            return Color.pink;
        } else if (Objects.equals(colorName,"G")){
            return Color.magenta;
        } else if (Objects.equals(colorName,"H")){
            return Color.cyan;
        } else if (Objects.equals(colorName,"I")){
            return Color.gray;
        } else if (Objects.equals(colorName,"J")){
            return Color.orange;
        }
        return null;
    }
    public static void colorMenu(){
        System.out.println("" +
                "A- Gris oscuro\n" +
                "B- Rojo\n" +
                "C- Blue\n" +
                "D- Green\n" +
                "E- Yellow\n" +
                "F- Pink\n" +
                "G- Magenta\n" +
                "H- Cyan\n" +
                "I- Gray\n" +
                "J- Orange\n" +
                "");
    }
}
