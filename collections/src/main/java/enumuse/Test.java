package enumuse;

/**
 * Created with IntelliJ IDEA.
 * User: prekezes
 * Date: 18/6/2013
 * Time: 4:46 μμ
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        Const a = null;
        Const b = Const.A;
        /*
        THIS DOESNT THROW NULL POINTER EXCEPTION
         */
        if ( a == b) {
            System.out.println("equal!");
        }  else {
            System.out.println("not  equal!");

        }
    }
}
