package conditions;
import java.util.Scanner;
public class CorOnCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int r = sc.nextInt();
        int a1 = r*r;
        int x = 0;
        int y = 0;
        System.out.println("Enter coordinates : ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int oa = (x - x1) + (y - y1);
        int a2 = oa*oa;
        if (a1 == a2) {
            System.out.println("lies on circumference");
        }
        else if(a1>a2){
            System.out.println("coordinate lies within circle");
        }
        else{
            System.out.println("Lies out side");
        }
    }
}
