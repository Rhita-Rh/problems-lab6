package problem2;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;
    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer c){
        if(customers.contains(c)){
            System.out.println(c.getName() + " is already a customer in " + this.name + "Bank");
        }

        else{
            customers.add(c);
        }
    }

    public void printTransactions(){
        for(Customer c: customers){
            String result ="Customer name: " + c.getName()
                    + ", Transactions:";

            ArrayList<Double> transactions = c.getTransactions();
            for(Double amount: transactions){
                result += " " + (double) amount;
            }
            System.out.println(result);
        }
    }

}
