package ex_11_Array;

public class L002_integre_Array {
    public static void main(String[] args) {
        int[] marks={1,2,3,4,5,6};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[5]);
        System.out.println(marks[2]);
        System.out.println(marks[4]);
        int[] marks2=new int[3];
        marks2[0]=45;
        marks2[1]=50;
        marks[2]=55;
        System.out.println(marks2[0]);
        System.out.println(marks2[1]);
        System.out.println(marks2[3]);


    }
}
