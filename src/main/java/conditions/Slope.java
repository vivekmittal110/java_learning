package conditions;
import java.util.Scanner;
public class Slope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,x2,y1,y2,z1,z2;
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        y1 = sc.nextInt();
        y2 = sc.nextInt();
        z1 = sc.nextInt();
        z2 = sc.nextInt();
        int s1 = (y2-x2)/(y1-x1);
        int s2 = (z2-x2)/(z1-x1);
        if (s1 == s2){
            System.out.println("Its an straight line");
        }
        else{
            System.out.println("Its not an straight line");
        }
    }
}
