package ex_11_Array;

import java.util.Arrays;

public class L003_For_Array {
    public static void main(String[] args) {
        int[] marks={ 51,100,57,98,66,89};
        System.out.println(marks.length);
        for(int i=0;i< marks.length;i++){
            Arrays.sort(marks);

            System.out.println(marks[i]);
        }

    }
}
