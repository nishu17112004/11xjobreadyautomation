package ex_11_Array;

public class L007_Sum_Array {
    public static void main(String[] args) {
        int [] number={12,56,78,6};
        int sum=0;
        for(int i=0;i<number.length;i++){
            sum=sum+number[i];
        }
        System.out.println(sum);
    }
}
