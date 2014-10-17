package foo.ex1;

/**
 * Created with IntelliJ IDEA.
 * User: prekezes
 * Date: 29/7/2013
 * Time: 3:10 μμ
 * To change this template use File | Settings | File Templates.
 */
public class OddPredicate implements UnaryPredicate<Integer> {

    @Override
    public boolean test(Integer object) {
        if ( object == null)
            return false;

        return ( object.intValue() % 2 != 0 );
    }
}
