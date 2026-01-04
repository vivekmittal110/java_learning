package arrays;
import java.util.Scanner;

public class GreaterThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,6,3,7,9,4,2,5,8,3,2,6,9};
        int count = 0;
        System.out.print("Enter the num x : ");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
}
