package loops;

public class Factor {
    public static void main(String[] args) {
        int hf = 1;
        int n = 64;
        for (int i = n-1; i >=1; i--) {
            if (n%i==0){
                hf = i;
                break;
            }
        }
        System.out.println(hf);
    }
}
