import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String>names = new Stack<>();

        names.push("Rahul");
        names.push("Aman");
        names.push("Pallav");

        //System.out.println(names.pop());
        System.out.println(names.peek());
        System.out.println(names);
    }
}
