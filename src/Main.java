
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String[] student = {"Gianni", "Alice", "Alberto", "Stefania"};
        HashSet class1 = fromArrayToHashSet(student);
        System.out.println(class1);
        String student34 = "Maria";
        class1.add(student34);
        if (class1.contains(student34)) {
            System.out.println(class1);
        } else {
            System.out.println("Student not present");
        }

    }

    public static HashSet<String> fromArrayToHashSet(String[] elements) {
        HashSet<String> temp = new HashSet<>();
        for (String i : elements) {
            temp.add(i);

        }
        return temp;
    }
}