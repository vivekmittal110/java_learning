package conditions;
import java.util.Scanner;
public class ThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if(num>99 && num<1000){
            System.out.println("Entered number is three digit");
        }
        else{
            System.out.println("Entered number is not three digit");
        }
    }
}
