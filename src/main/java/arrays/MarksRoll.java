package arrays;

public class MarksRoll {


    public static void main(String[] args) {
        int[] arr = {54,65,76,33,67,89,65,43,21};
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<35){
                System.out.println(i);
            }
        }
    }
}
