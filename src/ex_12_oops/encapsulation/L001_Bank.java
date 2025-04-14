package ex_12_oops.encapsulation;

public class L001_Bank {
    public static void main(String[] args) {
        ICICIBank amit= new ICICIBank("nishu","100");
      //  long bal=amit.getBalance();
        System.out.println(amit.getBalance());
       // System.out.println(amit.setBalance("300"));



















       // long bal_update=amit.setBalance();
       // amit.
    }
}class ICICIBank{
    private String name;
    private String balance;

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ICICIBank(String name, String balance){
        this.name=name;
        this.balance=balance;

    }
}
