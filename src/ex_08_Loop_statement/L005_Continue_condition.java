package ex_08_Loop_statement;

public class L005_Continue_condition {
    public static void main(String[] args) {
        int i=0;
        for(;i<=10;i++){
            if(i==3){
                continue;

            }
            System.out.println(i);
        }
    }
}
