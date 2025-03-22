package ex_06_if_else_elseif_condition;

public class L002_IF_Esle {
    public static void main(String[] args) {
        int a=100;
        int b=100;
        int sum=a*b;
        System.out.println(sum);
        for(int i=2000;i<=2030;i++){
            if(i%4==0){
                System.out.println("this is leap year");
            }else{
                System.out.println("this is not leap year");
            }
        }
    }
}
