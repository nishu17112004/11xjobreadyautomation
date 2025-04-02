package ex_11_Array;

public class L0012_2D_Array {
    public static void main(String[] args) {
        int[][] number={{1,3,4},{8,9,10},{2,5,6}};
        for(int i=0;i<number.length;i++){
            for (int j=0;j<number[i].length;j++){
                System.out.println(number[i][j]);
            }
        }
    }
}
