package conditions;
import java.util.Scanner;
public class CordLies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x == 0){
            if(y == 0) {
                System.out.println("Lies on origin");
            }
            else{
                System.out.println("lies on y axiz");
            }
        }
        else if(y == 0){
            System.out.println("lies on x axis");
        }
        else{
            System.out.println("lies on a graph");
        }
    }
}
