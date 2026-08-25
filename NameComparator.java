import java.util.Comparator;

public class NameComparator implements Comparator<student>{

    @Override
    public int compare(student s1 ,student s2){
        return
        s1.name.compareTo(s2.name);
    }

    
}