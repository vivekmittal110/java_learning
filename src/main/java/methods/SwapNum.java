package methods;

public class SwapNum {
    public static void main(String[] args) {
        int a = 7, b = 9;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a+" "+b);
    }
}
