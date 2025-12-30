package conditions;
import java.util.Scanner;
public class PandL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price : ");
        int cp = sc.nextInt();
        System.out.print("Enter selling price : ");
        int sp = sc.nextInt();

        if(cp<=sp){
            System.out.println("Made a profit of "+(sp-cp));
        }
        else{
            System.out.println("made a loss of "+(sp-cp));
        }

    }
}
