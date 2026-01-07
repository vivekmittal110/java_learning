package practice;
import java.util.Scanner;
public class NumLogic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("Sum is : "+sum);
        if(sum%2==0){
            System.out.println("Sum is even");
        }
        else{
            System.out.println("Sum is odd");
        }
        if (sum==0){
            System.out.println("Its 0");
        }
        else if(sum<0){
            System.out.println("its negative");
        }
        else{
            System.out.println("Its positive");
        }
    }
}
