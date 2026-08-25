import java.util.LinkedList;

public class linkedlistDemo {
    
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("RAHUL");
        names.add("AMAN");
        names.add("PALLAV");
        names.add("AMIT");
 
        names.set(1, "ROHIT");
       
        //names.get();
      // names.remove("PALLAV");
        System.out.println(names);
       // System.out.println(names.get(2));
        //System.out.println(names.remove(3));
        names.size();
        System.out.println(names.size());
        names.isEmpty();
        System.out.println(names.isEmpty());
        names.contains("ROHIT");
        System.out.println(names.contains(names));
    }
}
