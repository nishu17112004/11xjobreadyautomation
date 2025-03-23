package ex_08_Loop_statement;

public class L004_Break_condition {
    public static void main(String[] args) {
        int i=0;
        for(;i<=20;i++){
            if(i==13){
                break;

            }
            System.out.println(i);
        }
    }
}
