package ex_11_Array;

public class L0010_Foreach_loop{
    public static void main(String[] args) {
        int[] number ={45,87,34,96};
        System.out.println(number.length);
        //System.out.println(number.TolowerCase);
        int sum=0;
        for (int n:number){
            sum=sum+n;
            System.out.println(sum);
        }
    }
}
