package loopquiz;

/**
 * What The followingprogram will print?
 */
public class LoopQuiz1 {
    public static void main(String args[]) {
        int sum = 0;
        for (int i = 0, j = 10; sum > 20; ++i, --j)      // 1
        {
            sum = sum + i + j;

        }
        System.out.println("Sum = " + sum);
    }
}

