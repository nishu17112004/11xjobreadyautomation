package ex_08_Loop_statement;

public class L003_For3 {
    public static void main(String[] args) {
        for (int i=0;i<=50;i++)
            if (i%2==0){
                System.out.println("even:"+i);
            }else
            {
                System.out.println("odd:"+i);
            }
    }
}
