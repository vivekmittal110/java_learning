package arrays;

public class DoubletArr {
    public static void main(String[] args) {
        int x = 90;
        int[] arr = {10,30,80,56,23,67};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+ " " +arr[j]);
                }
            }
        }
    }


}
