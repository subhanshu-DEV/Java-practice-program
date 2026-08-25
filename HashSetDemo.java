import java.util.HashSet;

public class HashSetDemo {
    

    public static void main(String[] args) {
        
        HashSet<String>names = new HashSet<>();
        names.add("RAHUL");
        names.add("aman");
        names.add("RAHUL");
        names.add("PALLAV");
names.add("Rohit");
       names.add("Amit");
       names.add("Sumit");
       names.remove("RAHUL");

        System.out.println(names);
        names.size();

System.out.println(names.size());
        
    }
}
