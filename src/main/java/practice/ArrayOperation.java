package practice;

public class ArrayOperation {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,1,5,9,11};
        int min = arr[0];
        int max = arr[0];
        int odd = 0;
        int even = 0;
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]%2!=0){
                odd++;
            }
            else {
                even++;
            }
        }
        System.out.println();
        System.out.println("Min " + min + " Max " + max + " Even "+ even + "  Odd " + odd);
    }
}
