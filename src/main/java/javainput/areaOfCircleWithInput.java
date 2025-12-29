package javainput;
import java.util.Scanner;
public class areaOfCircleWithInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        int radius = sc.nextInt();
        double pi = 3.14;
        double area = radius * radius * pi;
        System.out.println("Radius of circle is "+area);
        System.out.println("complete");
    }

}
