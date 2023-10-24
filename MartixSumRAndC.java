public class MartixSumRAndC {
    public static void main(String []argus){
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row=a.length;
        int col=a[0].length;
        for(int i=0;i<row;i++){
            int sumrow=0;
            for(int j=0;j<col;j++){

               sumrow=sumrow+a[i][j];
            }
            System.out.println("Sum of "+(i+1)+" row "+sumrow);
        }
        for(int i=0;i<row;i++){
            int sumcol=0;
            for(int j=0;j<col;j++){
                sumcol=sumcol+a[j][i];
            }
            System.out.println("Sum of "+(i+1)+" col "+sumcol);
        }
    }
}
