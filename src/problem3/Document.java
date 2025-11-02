package problem3;

public class Document {
    public static int nextNumRec = 1;

    protected int numRec;
    protected String title;
    public Document(String title){
        this.numRec = nextNumRec;
        nextNumRec ++;
        this.title = title;
    }

    public int getNumRec() {
        return numRec;
    }

    public void setNumRec(int numRec) {
        this.numRec = numRec;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Book title " + this.title + ", its record number is: " + this.numRec;
    }
}
