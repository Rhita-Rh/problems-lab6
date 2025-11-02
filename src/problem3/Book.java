package problem3;

public class Book extends Document{
    protected String author;
    protected int nbrPages;

    public Book(String title, String author, int nbrPages){
        super(title);
        this.author = author;
        this.nbrPages = nbrPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return "Book title " + this.title +", its record number is: " + this.numRec+ ", Author: " + this.author + ", number of pages: " + nbrPages;
    }

}
