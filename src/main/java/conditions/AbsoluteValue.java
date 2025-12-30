package conditions;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer : ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println(-1*num);
        }
        else{
            System.out.println(num);
        }

    }
}
