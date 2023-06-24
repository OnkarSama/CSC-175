/**
 * @author Onkar Dhillon
 * @version V1 1/31/2023
 * @purpose the purpose of the program is to use the PrimitiveFiguresLibrary.java to draw shapes that we want.
 */
public class DrawFigures {

    public static void main(String[] args) {

        // draw the diamond using Primitive Figures Library
        PrimitiveFiguresLibrary.drawDiamond();
        System.out.println();

        // draw the x using Primitive Figures Library
        PrimitiveFiguresLibrary.drawX();
        System.out.println();

        // draw the house using Primitive Figures Library
        PrimitiveFiguresLibrary.drawHouse();
        System.out.println();

        // printing first rocket using Primitive Figures Library
        PrimitiveFiguresLibrary.drawRocket("This is the first Rocket", "US");
        System.out.println();

        // printing second rocket using Primitive Figures Library
        PrimitiveFiguresLibrary.drawRocket("This is the second Rocket", "RU");
        System.out.println();

        // printing third rocket using Primitive Figures Library
        PrimitiveFiguresLibrary.drawRocket("This is the third Rocket", "CH");

    }
}
