package problem4;

import java.lang.management.OperatingSystemMXBean;
import java.util.*;

public class ListPerformanceComparison {

    private static final int SIZE = 100_000;        // total elements
    private static final int OPERATIONS = 10_000;   // random operations to test

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        System.out.println("---- Performance Comparison ----");

        System.out.println("---- Populate both lists ----");
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // 2️⃣ Random insertions and deletions
        testRandomInsertDelete(arrayList, "ArrayList");
        testRandomInsertDelete(linkedList, "LinkedList");

        // 3️⃣ Sequential insertions/deletions at beginning and end
        testSequentialInsertDelete(arrayList, "ArrayList");
        testSequentialInsertDelete(linkedList, "LinkedList");

        // 4️⃣ Random access test
        testRandomAccess(arrayList, "ArrayList");
        testRandomAccess(linkedList, "LinkedList");
    }

    // ------------------------------------------------------------

    private static void testRandomInsertDelete(List<Integer> list, String name) {
        Random random = new Random();
        long start = System.nanoTime();

        for(int i=0; i<OPERATIONS; i++){
            int value = random.nextInt(OPERATIONS);

            if(list.isEmpty()){
                list.add(0, value);
            }
            else{
                int index = random.nextInt(SIZE);
                list.add(index, value);
            }
        }

        for(int i=0; i<OPERATIONS; i++){
            if(!list.isEmpty()){
                int index = random.nextInt(SIZE);
                list.remove(index);
            }
        }

        long end = System.nanoTime();
        System.out.printf("%s - Random insert/delete: %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testSequentialInsertDelete(List<Integer> list, String name) {
        long start = System.nanoTime();

        // Insertions at beginning and end

        for(int i=0; i<OPERATIONS; i++){
            list.add(0, i);
        }

        for(int i=0; i<OPERATIONS; i++){
            list.add(i);
        }

        // Deletions at beginning and end

        for(int i=0; i<OPERATIONS && SIZE>0; i++){
            list.remove(0);
        }

        for(int i=0; i<OPERATIONS && SIZE>0; i++){
            list.remove(SIZE-1);
        }

        long end = System.nanoTime();
        System.out.printf("%s - Sequential insert/delete (start/end): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }

    // ------------------------------------------------------------

    private static void testRandomAccess(List<Integer> list, String name) {
        Random random = new Random();
        //ensure the list has elements
        list.clear();
        for(int i=0; i<SIZE; i++){
            list.add(i);
        }
        long start = System.nanoTime();

        long sum = 0;
        // sum of the all elements in the list
        for(int j=0; j<OPERATIONS; j++){
            int index = random.nextInt(SIZE);
            sum += list.get(index);
        }

        long end = System.nanoTime();
        System.out.printf("%s - Random access (get): %.3f ms%n",
                name, (end - start) / 1_000_000.0);
    }
}

