package ex_switch_conditon;

public class L002_Itemcode {
    public static void main(String[] args) {
        int itemcode=006;
        switch (itemcode){
            case 001,002,007:
                System.out.println("all of items are electronic gadgets");
                break;
            case 003,004,006:
                System.out.println("all of items are mechanical");
                break;
            default:
                System.out.println("none");
        }
    }
}
