package arrays;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {23,43,54,66,74,24,45,66};
        int x = sc.nextInt();
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}
