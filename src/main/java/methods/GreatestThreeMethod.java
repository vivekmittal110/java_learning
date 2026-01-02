package methods;

public class GreatestThreeMethod {
    public static void main(String[] args) {
        int a = 3332, b = 3132, c = 932;
//        if((Math.max(a,b))>(Math.max(b,c))){
//            System.out.println(Math.max(a,b));
//        }
//        else{
//            System.out.println(Math.max(b,c));
//        }
        System.out.println(Math.max(a,Math.max(b,c)));
    }
}
