import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<student> students = new ArrayList<>();

        students.add(new student("Rahul", 25));
        students.add(new student("Aman", 19));
        students.add(new student("Pallav", 22));

        Collections.sort(students,new NameComparator());
        

        for (student s : students) {
            System.out.println(s.name + " " + s.age);
        }
    }
}