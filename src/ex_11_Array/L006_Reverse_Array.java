package ex_11_Array;

public class L006_Reverse_Array {
    public static void main(String[] args) {
        int[] array={56,78,98,34,67};
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("******");
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
