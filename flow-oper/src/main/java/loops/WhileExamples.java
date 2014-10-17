package loops;

/**
 * Created by jvp on 10/4/14.
 */
public class WhileExamples {

    public static void main(String[] args) {
        while (true) {
            break;
        }
        do {
            break;
        }while (true);

        do {

        } while(false);

        for (int i = 0; i < 5; i++) {
            System.out.println("In for:"+i);
            continue;
        }

        for (int i =0, j = 0; i != j ; i++, j++) {

        }

    }


}
