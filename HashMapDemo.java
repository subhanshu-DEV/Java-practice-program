import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
    HashMap<Integer , String>student = new HashMap<>();
    student.put(101,"rahul" );
    student.put(102, "Aman");
    student.put(103, "Pallav");
        

    for(Integer key:student.keySet()){
   // System.out.println(key);
// student.remove(102);
// System.out.println(student);
// System.out.println(student.containsKey(102));
// System.out.println(student.containsValue("rahul"));
// System.out.println(student.isEmpty());
// System.out.println(student.size());
// //student.clear();
// //System.out.println(student);
// System.out.println(student.keySet());
//     //System.out.println(student.get(102));
System.out.println(key + '=' + student.get(key));
    }
    }
}
