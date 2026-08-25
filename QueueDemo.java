import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String>names = new LinkedList<>();
        names.add("Rahul");
                names.add("Aman");
                        names.add("Pallav");
                    //    System.out.println(names.remove());
                       // System.out.println(names);
                       System.out.println(names.peek());
                       System.out.println(names);

    }
}
