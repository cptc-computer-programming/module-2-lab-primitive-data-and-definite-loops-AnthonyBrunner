package day2.part03_pattern_section;

public class PatternSection {

    public static final int SIZE = 3;

    public static void main(String[] args) {
        // TODO: Call each method below in this order:
        printEdge();
        printDiamondTop();
        printDiamondBottom();
        printEdge();
    }

    // TODO: Print the edge line that fits the width for SIZE.
    // Format: + followed by repeating "=*" and ending with +
    // Example for SIZE=2: +=*=*=*=*+
    public static void printEdge() {
        System.out.print("+");

        for (int i = 0; i < SIZE * 2; i ++) {
            System.out.print("=*");
        }
        System.out.println("+");

    }

    // TODO: Print the top half of the “double-diamond” section.
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots decrease while "/\" pairs increase, then dots again
    // - use SIZE in all loop bounds (no magic numbers except 0/1)
    public static void printDiamondTop() {

        // Loop through total rows
        for (int row = 0; row < SIZE * 2; row ++) {

            // Begin row
            System.out.print("|");
            
            /* When a value is decreasing in a loop, but the loop variable is increasing, you probably need to 
            subtract to get the inverse relationship */

            int dots = (SIZE * 2 - 1) - row;
            // print leading dots
            for (int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            int triangles = row + 1;
            // print triangles
            for(int i = 0; i < triangles; i ++) {
                System.out.print("/\\");
            }

            // print trailing dots
            for (int i = 0; i < dots; i ++) {
                System.out.print(".");
            }

            // close row
            System.out.println("|");
        }
    }

    // TODO: Print the bottom half (mirror/inverse of the top half).
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots increase while "\/" pairs decrease, then dots again
    // - use SIZE in all loop bounds
    public static void printDiamondBottom() {

        // Loop through total rows
        for (int row = 0; row < SIZE * 2; row ++) {

            // Begin row
            System.out.print("|");
 
            // print leading dots
            // increase with every row
            // int dots = (SIZE * 2 - 1) - row;
            for (int i = 0; i < row; i ++) {
                System.out.print(".");
            }
        
            // print triangles
            // decrease by two
            // int triangles = row - 1;
            for(int i = 6; i > row; i --) {
                System.out.print("\\/");
            }

            // print trailing dots
            for (int i = 0; i < row; i ++) {
                System.out.print(".");
            }

            // close row
            System.out.println("|");
        }

    }
    
}

/* 
+=*=*=*=*=*=*+
|...../\.....|
|..../\/\....|
|.../\/\/\...|
|../\/\/\/\..|
|./\/\/\/\/\.|
|/\/\/\/\/\/\|
|\/\/\/\/\/\/|
|.\/\/\/\/\/.|
|..\/\/\/\/..|
|...\/\/\/...|
|....\/\/....|
|.....\/.....|
+=*=*=*=*=*=*+ 
*/