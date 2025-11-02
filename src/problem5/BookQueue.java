package problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> queue;

   public BookQueue() {
        this.queue = new LinkedList<>();
   }

   public void enqueue(Book book) {
        queue.addLast(book);
   }

   public Book dequeue() {
        Book first_elem = queue.get(0);
        queue.removeFirst();
        System.out.println("Dequeued: " + first_elem);
        return first_elem;
   }

   public Book peek() {
       // code here and don't to test if it's empty
       if(!queue.isEmpty()){
        Book first_elem = queue.get(0);
        System.out.println("Front: " + first_elem);
        return first_elem;
       }
       else{
        System.out.println("The Queue is empty");
        return null;
       }
   }

   public boolean isEmpty() {
       return queue.isEmpty();
   }

   public void display() {
       System.out.println("Queue contents (front to back):");
       for(int i=0; i<queue.size(); i++){
            System.out.println("    - " + queue.get(i));
       }

   }
}
