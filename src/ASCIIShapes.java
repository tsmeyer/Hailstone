/*
ASCIIShapes is a program that draws several geometric figures
using ASCII characters
Author: Owen Coyle
Last Updated: 09/13/2020
*/

import edu.princeton.cs.introcs.*;

public class ASCIIShapes {
    public static void main(String[] args) {
        /*
         * Print an ASCII rectangle and triangle
         */

         // draw the rectangle
        drawRect();

        // draw the triangle
        drawTri();
    }

    public static void drawRect() {
        /*
         * Print an ASCII rectangle
         */
        StdOut.println("*****");
        StdOut.println("*   *");
        StdOut.println("*   *");
        StdOut.println("*****");
    }

    public static void drawTri() {
        /*
         * Print an ASCII triangle
         */
        StdOut.println("  *  ");
        StdOut.println(" * * ");
        StdOut.println("*****");
    }
}
