package arrays;

public class MaxArrVal {
    public static void main(String[] args) {
        int[] arr = {23,54,22,6,78,53,89,53,23,45};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
