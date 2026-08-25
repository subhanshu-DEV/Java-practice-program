import java.util.ArrayList;

public class collectionDemo {
    

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("rahul");
        names.add("aman");
        names.add("pallav");
        names.add("amit");

        names.remove(1);
        names.set(1,"rahul");
        names.clear();
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("rohit"));
        System.out.println(names.isEmpty());

       // System.out.println(names.get(2));

    }
}
