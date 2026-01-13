package practiceset2;

public class MulArray {
    public static void main(String[] args){
        int mul[] [] = new int[4][5];
        int i,j,k=0;
        for (i = 0; i<4;i++){
            if (i<2){
                for (j = 0; j<5; j++){
                    mul[i][j]=k;
                    k++;
                }
            }
            else{
                for (j = 0; j<5; j++){
                    --k;
                    mul[i][j]=k;

                }
            }
        }
        for(i = 0; i<4; i++){
            for (j=0; j<5; j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}
