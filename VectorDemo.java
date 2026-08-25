import java.util.Vector;

public class VectorDemo {
    
    public static void main(String[] args) {
        
    Vector<String>names = new Vector<>();

names.add("Rahul");
names.add("Aman");
names.add("Pallav");

names.remove(1);
System.out.println(names.size());
System.out.println(names);
   }
}
