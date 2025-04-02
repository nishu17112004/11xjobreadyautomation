package ex_11_Array;

public class L004_Array_Max_Value {
    public static void main(String[] args) {
        int[] marks={76,85,99,56,100,55,60,32,79};
        int max_output=given_max(marks);
        System.out.println(max_output);
    }
    static int given_max(int[]marks){
        int max=marks[0];
        for (int i=0;i<marks.length;i++){
            if(marks[i]>max){

            max=marks[i];}
        }
        return max;
    }

}
