package arrays;
import java.util.Scanner;

public class OutputArr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[7];
        for (int i = 0; i <= 6; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int j = 0; j <= 6; j++) {
            System.out.print(arr1[j]+" ");
        }
    }
}
