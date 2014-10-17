package foo.ex1;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: prekezes
 * Date: 29/7/2013
 * Time: 12:29 μμ
 * To change this template use File | Settings | File Templates.
 */
public class CheckOdd {

    public static void main(String[] args) {

        Collection<Integer> c = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 7, 9});

        System.out.println(Algorithm.checkIf(c, new OddPredicate()));

    }
}
