package practice;
import java.util.Scanner;
public class LoopCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0) {
                continue;
            } else if (i > 50) {
                break;
            }
            System.out.println(i);
        }

    }

}
