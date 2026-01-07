package practice;
import java.util.Scanner;
public class SearchProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        boolean flag = false;
        for (int j = 0; j < arr.length; j++){
            arr[j] = sc.nextInt();
        }
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++){
            if (num == arr[i]){
                System.out.println("found "+i);
                flag = true;
                break;
            }
        }
        if(flag == false){
            System.out.println("Not Found");
        }
    }
}
