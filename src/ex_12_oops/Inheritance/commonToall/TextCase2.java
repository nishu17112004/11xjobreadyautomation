package ex_12_oops.Inheritance.commonToall;

public class TextCase2 extends L001_CommonToAll{
    void runningTc2(){
        startBrowser();
        System.out.println("running TC2");
        readExcelFile();
        readDataFile();
        closeBrowser();
        
    }
}
