package conditions;
import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 3 == 0 || num % 5 == 0) {
            if (num % 15 != 0) {
                System.out.println("done");
            } else {
                System.out.println("divisible by 15");
            }
        } else {
            System.out.println("Not divisible by any 3 or 5");
        }
    }

}
