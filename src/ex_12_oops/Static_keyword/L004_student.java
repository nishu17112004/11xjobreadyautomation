package ex_12_oops.Static_keyword;

public class L004_student {
    public static void main(String[] args) {
        ATB nishu=new ATB();
        nishu.setName("nishu");
        nishu.setPhone("95667860");
        ATB ankit=new ATB();
        ankit.setPhone("97883379");
        ankit.setName("ankit");
        System.out.println(ATB.mentorName);
        System.out.println(ATB.courseName);
        ATB.doAssignment();
       // ATB.howTheyAssignment();
    }
}class ATB{
    static {
        System.out.println("load the class?,i will execute");
    }{
        System.out.println("IIB-this is called when object is created");
    }
    private String name;
    private String phone;
    static String courseName="ATB11x";
    static String mentorName="Pramod";

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    static  void doAssignment(){
        System.out.println("Do Assignment");
    } void howTheyAssignment(){
        System.out.println("It is different");
    }
}
