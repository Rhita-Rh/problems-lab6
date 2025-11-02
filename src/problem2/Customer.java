package problem2;
import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name){
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addTransaction(double transaction){
        if(transaction != 0){
            transactions.add((Double) transaction);
        }
    }

    public ArrayList<Double> getTransactions(){
        return transactions;
    }

}
