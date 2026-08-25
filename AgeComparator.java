import java.util.Comparator;

public class AgeComparator implements Comparator<student> {
    

    @Override
    public int compare(student s1,student s2){
        return s2.age - s1.age;
    }
}
