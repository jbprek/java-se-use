package loops;

/**
 * Created with IntelliJ IDEA.
 * User: prekezes
 * Date: 20/5/2013
 * Time: 8:16 μμ
 * To change this template use File | Settings | File Templates.
 */
public class EnhancedLoop {
    public static void main(String[] args) {
//        int x = 0;
        int[] arr = { 1,2,3};
        for (int x : arr ){
           System.out.println(x);
        }
        for (int x : new int[] { 1,2} ){
            System.out.println(x);
        }
    }
}
