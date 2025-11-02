package problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> library;

    public Library(int capacity){
        this.capacity = capacity;
        this.library = new ArrayList<>(capacity);
    }

    public void displayDocuments(){
        for(Document doc:library){
            System.out.println(doc.toString());
        }
    }
    public boolean add(Document doc){
        if(library.size() >= this.capacity){
            return false;
        }
        else{
            library.add(doc);
            return true;
        }
    }

    public boolean delete(Document doc){
        if(library.contains(doc)){
            library.remove(doc);
            return true;
        }
        else{
            return false;
        }
    }

    public Document document(int numEnrg){
        for(Document doc: library){
            if(doc.getNumRec() == numEnrg){
                return doc;
            }
        }
        return  null;
    }

    public void displayAuthors(){
    
        for(Document doc:library){
            if(doc instanceof Book){
                Book book = (Book) doc;
                System.out.println("the author of document " +doc.getTitle() + " is " + book.getAuthor());
            }
            else{
                System.out.println("This type of document had no authors.");
            }
        }
    }

    @Override
    public String toString(){
        String result= "This library has " + library.size() + " documents:\n";
        for(Document doc:library){
            result += doc.toString()+"\n";
        }

        return result;
    }

}
