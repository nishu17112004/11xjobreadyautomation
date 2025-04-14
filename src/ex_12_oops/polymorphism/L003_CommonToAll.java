package ex_12_oops.polymorphism;

public class L003_CommonToAll {
    public static void main(String[] args) {
        ChromeTC c1= new ChromeTC();
        c1.openBrowser();
        Firefox f1= new Firefox();
        f1.openBrowser();
        CommonToAll c2 = new CommonToAll();
        c2.openBrowser();
        CommonToAll c3= new ChromeTC();
        c3.openBrowser();
    }
} class CommonToAll{
    void openBrowser(){
        System.out.println(" open the IE Browser");
    }
}class ChromeTC extends CommonToAll{
    void openBrowser(){
        System.out.println("chrome will open now");
    }
}class Firefox extends CommonToAll{
    @Override
    void openBrowser() {
        System.out.println("firefox will start");
    }
}
