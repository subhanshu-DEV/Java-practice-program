import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String>names = new ArrayDeque<>();
        names.add("Aman");
        names.add("Pallav");
        names.add("Rahul");
        names.add("Rohit");
        
names.addFirst("Sumit");
names.addLast("Vikas");


names.removeFirst();
names.removeLast();
        System.out.println(names);
    }
}
