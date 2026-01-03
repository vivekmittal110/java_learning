package methods;
import java.util.Scanner;
public class Combination {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int com = combi(n)/(combi(n-r)*combi(r));
        System.out.println(com);
    }

    public static int combi(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact*=i;
        }
        return fact;
    }
}
