package Week8;

public class Main{
    public static void main(String[] args){
        BankAccount BA = new BankAccount(456789, "Hari", 20000);
        BA.depositFund(100);
        System.out.println("New Fund: "+BA.getBalance());
        BA.withdrawFund(75);
        System.out.println("New Fund: "+BA.getBalance());
    }
}
  