package ex_12_oops.encapsulation;

public class L002_version
{
    public static void main(String[] args) {
        Mobile iphone=new Mobile("iphone","2004");
        Mobile oneplus=new Mobile("oneplus","1998");
        System.out.println(iphone.model_name);
        System.out.println(iphone.launch_year);
        System.out.println(oneplus.model_name);
        oneplus.Display();
    }
}class Mobile{
    String model_name;
    String launch_year;
        Mobile( String model_name,String lanuch_year){
            this.model_name=model_name;
            this.launch_year=lanuch_year;
        }

void Display(){
   System.out.println(model_name+"  "+launch_year);}
}
