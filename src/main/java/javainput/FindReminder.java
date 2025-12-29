package javainput;
import java.util.Scanner;
public class FindReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int ans = dividend/divisor;
        int rem = dividend - (divisor*ans);

        // by modulo int rem = dividend%divisor;
        System.out.println(rem);
    }
}
