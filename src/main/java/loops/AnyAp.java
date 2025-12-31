package loops;
import java.util.Scanner;
public class AnyAp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 7, d = 5;
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print(a + " ");
            a += d;
        }
    }
}
