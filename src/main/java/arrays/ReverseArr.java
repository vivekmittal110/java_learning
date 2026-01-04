package arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,6,8,34,2,367,76};
        int size = arr.length;
        int[] rev = new int[size];
        for (int i = 0; i < size; i++) {
            rev[size-i-1] = arr[i];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(rev[i]+" ");
        }
    }
}
