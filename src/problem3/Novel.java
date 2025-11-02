package problem3;

public class Novel extends Book{
    public double price;

    public Novel(String title, String author, int nbrPages, double price){
        super(title, author, nbrPages);
        this.price = price;
    }


    @Override
    public String toString(){
        return "Novel title " + this.title +", its record number is: " + this.numRec+ ", Author: "
                + this.author + ", number of pages: " + nbrPages + ", price: " + this.price;
    }
}
