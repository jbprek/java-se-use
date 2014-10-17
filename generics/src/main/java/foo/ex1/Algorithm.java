package foo.ex1;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: prekezes
 * Date: 29/7/2013
 * Time: 3:06 μμ
 * To change this template use File | Settings | File Templates.
 */
public class Algorithm {
    public  static <T> int  checkIf(Collection<T> c, UnaryPredicate<T> p){
        int count = 0;
        for( T e : c)
        if (p.test(e))
            count++;
        return count;
    }
}
