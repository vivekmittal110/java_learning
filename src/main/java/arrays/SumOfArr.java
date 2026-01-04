package arrays;

public class SumOfArr {
    public static void main(String[] args) {
        int[] arr = {23,54,65,3,54,1};
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
