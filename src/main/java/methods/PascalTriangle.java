package methods;
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int k = n; k>= i+1;k--){
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                int ncr = factorial(i)/(factorial(j)*factorial(i-j));
                System.out.print(ncr+"   ");
            }
            System.out.println();
        }
    }
    public static int factorial(int x){
        int facto = 1;
        for(int i = 1; i <= x; i++){
            facto*=i;
        }
        return facto;
    }
}
