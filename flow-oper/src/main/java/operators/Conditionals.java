package operators;

import static java.lang.System.out;

/*
    out.println("");
    out.println();
 */

public class Conditionals {
    public static void main(String[] args) {
        /*  null comparison */
        out.print("(null == null)->");
        out.println(null == null);
        int x5 = 5;
        int x9 = 9;
        int x7 = 7;
        int x2 = 2;

        out.println("");
        out.println();

        out.println((x5 < x9 || x7 > x2));


    }
}
