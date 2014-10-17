package operators;

import java.util.Arrays;

/**
 * Created by prekezes on 14/1/2014.
 */
public class ArrayDemo {


    public static void main(String[] args) {
        int multi[][] = new int[2][3];
        int[][][] arr3d = new int[3][3][3];

        System.out.println(Arrays.deepToString(arr3d));

//Doesn't work
        int rco = 1;
        for (int[] r : multi) {
            int cco = 1;
            for ( int v : r){
                 v = rco * 10 + cco++;
            }
            rco++;
        }
        System.out.println(Arrays.deepToString(multi));

        // A Way to populate a multi dim array
        int rc = 0;
        for ( int i = 0; i < multi.length; i++) {
            int cc = 0;
            for (int j = 0; j < multi[0].length; j++) {

                multi[i][j] = rc * 10 + cc++;
            }
            rc++;
        }

        System.out.println(Arrays.deepToString(multi));

        // A way to iterate a multi dimensional array
        for (int[] r : multi) {
            for ( int v : r)
               System.out.print(v + ", ");
            System.out.println();
        }


        // USe System.arraycopy

        int[][] multi2 = new int[multi.length][multi[0].length];
        System.arraycopy(multi,0, multi2, 0, multi.length);

        // Demos deepEquals
        assert ( Arrays.deepEquals(multi, multi2));
        System.out.println(Arrays.deepToString(multi2));

        //String[4][3][2]
        String[][][] ms = { { {"a","b"},  {"c","d"},  {"e","f"}  },
                            { {"g","h"},  {"i","j"},  {"k","l"}  },
                            { {"m","n"},  {"o","p"},  {"q","r"}  },
                            { {"s","t"},  {"u","v"},  {"w","x"}  }
        };

        assert ( ms[3][2][1].equals("x"));

    }
}
