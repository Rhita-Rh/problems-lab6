package problem3;

public class Magazine extends Document{
    private String month;
    private int year;

    public Magazine(String title, String month, int year){
        super(title);
        this.month = month;
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "Magazine title " + this.title +", its record number is: " + this.numRec+ ", month: " + this.month + ", year: " + year;
    }
}
