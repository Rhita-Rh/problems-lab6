package problem5;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Stack Test ===");
        BookStack stack = new BookStack();

        // Create books
        Book b1 = new Book("Clean Code", "Robert C. Martin", 2008);
        Book b2 = new Book("1984", "George Orwell", 1949);
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);

        // Push books
        stack.push(b1);
        stack.push(b2);
        stack.push(b3);

        // Display all
        stack.display();

        // Pop one
        stack.pop();

        // Peek top
        stack.peek();

        // Display again
        stack.display();

        System.out.println("=== Queue Test ===");
        BookQueue queue = new BookQueue();

        // Enqueue books
        queue.enqueue(b3);
        queue.enqueue(b2);
        queue.enqueue(b1);

        // Display all
        queue.display();

        // Dequeue one
        queue.dequeue();

        // Peek front
        queue.peek();

        // Display again
        queue.display();
    }
}
