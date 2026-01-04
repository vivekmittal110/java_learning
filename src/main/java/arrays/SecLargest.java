package arrays;

public class SecLargest {
    public static void main(String[] args){
        int[] arr = {2,4,6,3,6,3,32,85,56,7,4,34};
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(sec<arr[i] && arr[i]!=max){
                sec = arr[i];
            }
        }
        System.out.println(sec);

    }
}
