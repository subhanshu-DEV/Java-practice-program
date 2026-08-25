public class student implements Comparable<student> {

    String name;
    int age;

    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(student other) {
        return this.age - other.age;
    }
}