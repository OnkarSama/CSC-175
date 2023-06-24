/**
 * @author Onkar Dhillon
 * @version V2 2/2/2023
 * @purpose the purpose of the program is to take create a library of primitive shapes.
 */
public class PrimitiveFiguresLibrary {

    //draw cone
    public static void drawCone() {
        System.out.println("  /\\ ");
        System.out.println(" /  \\");
    }

    // draw V
    public static void drawV() {
        System.out.println(" \\  /");
        System.out.println("  \\/ ");
    }

    // draw rocket body
    public static void drawBox() {
        System.out.println("+----+");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println("+----+");
    }

    // draw diamond
    public static void drawDiamond() {

        drawCone();
        drawV();
    }

    // draw X
    public static void drawX() {

        drawV();
        drawCone();
    }

    // draw Rocket
    public static void drawRocket(String label, String country) {
        drawCone();
        drawBox();
        System.out.println("| " + country + " |");
        drawBox();
        drawCone();
        System.out.println();
        System.out.println(label);
    }

    // draw house
    public static void drawHouse(){
        drawCone();
        drawBox();
    }
}
