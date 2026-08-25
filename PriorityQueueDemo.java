import java.util.PriorityQueue;

public class PriorityQueueDemo {
    
    public static void main(String[] args) {
        PriorityQueue<String>names = new PriorityQueue<>();
        names.add("Rahul");
        names.add("Aman");
        names.add("Pallav");
        names.add("Rohit");
        
        System.out.println(names.peek());
        System.out.println(names.poll());
        System.out.println(names);
    }
}
