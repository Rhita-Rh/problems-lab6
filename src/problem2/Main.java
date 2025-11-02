package problem2;

public class Main {
    public static void main(String[] args){
        Bank bmce = new Bank("BMCE");
        Customer c1 = new Customer("Rita");
        Customer c2 = new Customer("salma");

        c1.addTransaction(-100);
        c1.addTransaction(200);
        c1.addTransaction(300);

        c2.addTransaction(-200);
        c2.addTransaction(400);
        c2.addTransaction(500);

        bmce.addCustomer(c1);
        bmce.addCustomer(c2);
        bmce.addCustomer(c1);

        bmce.printTransactions();

    }
}
