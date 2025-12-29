package javainput;
import java.util.Scanner;
public class SquareByInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = x*x;
        System.out.println("The square of "+x+" is "+y);
    }
}
