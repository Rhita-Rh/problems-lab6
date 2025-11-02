package problem5;

import java.util.LinkedList;

public class BookStack {
   private LinkedList<Book> stack;

   public BookStack() {
        this.stack = new LinkedList<>();
   }

   public void push(Book book) {
        stack.addFirst(book);
   }

   public Book pop() {
        Book first_elem = stack.get(0);
        stack.removeFirst();
        System.out.println("Popped:" + first_elem);
        return first_elem;
   }

   public Book peek() {
       // code here and don't to test if it's empty
       if(!stack.isEmpty()){
        Book first_elem = stack.get(0);
        System.out.println("Top: " + first_elem);
        return first_elem;
       }
       else{
        System.out.println("The stack is empty");
        return null;
       }
   }

   public boolean isEmpty() {
       return stack.isEmpty();
   }

   public void display() {
       System.out.println("Stack contents (top to bottom):");
       for(int i=0; i<stack.size(); i++){
            System.out.println("    - "+stack.get(i));
       }

   }
}

