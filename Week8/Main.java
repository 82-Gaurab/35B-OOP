package Week8;

public class Main {
    public static void main(String[] args) {
        // Bank Account instance
        BankAccount BA = new BankAccount(456789, "Hari", 20000);
        BA.depositFund(100);
        System.out.println("New Fund: " + BA.getBalance());
        BA.withdrawFund(75);
        System.out.println("New Fund: " + BA.getBalance());
        System.out.println();

        // Book instance
        Book b1 = new Book("Matilda", "Roald dahl", 2014);
        Book b2 = new Book("Charlie and choclate factory", "Roald dahl", 2012);
        System.out.println(b1.isAvailability());
        b1.borrow("Matilda");
        System.out.println(b1.isAvailability());
        System.out.println(b2.isAvailability());
        System.out.println();

        // Student instance
        Student s1 = new Student("Ram", 11, 3.5f);
        System.out.println(s1.getGPA());
        s1.setID(12);
        System.out.println(s1.getID());
    }
}
