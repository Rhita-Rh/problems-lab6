package problem3;

public class Textbook extends Book{
    public String level;

    public Textbook(String title, String author, int nbrPages, String level){
        super(title, author, nbrPages);
        this.level = level;
    }


    @Override
    public String toString(){
        return "Textbook title " + this.title +", its record number is: " + this.numRec+ ", Author: "
                + this.author + ", number of pages: " + nbrPages + ", level: " + this.level;
    }
}
