package ex_11_Array;

public class L005_Array_Min_Value {
    public static void main(String[] args) {
        int[] marks={76,85,99,56,100,55,60,32,79};
        int min_output=given_min(marks);
        System.out.println(min_output);
    }
    static int given_min(int[]marks){
        int min=marks[0];
        for (int i=0;i<marks.length;i++){
            if(marks[i]>min){

                min=marks[i];}
        }
        return min;
    }
}
