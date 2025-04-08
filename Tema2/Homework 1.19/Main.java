import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> lista = new ArrayList<>();
        lista.add(new Student(4,"Andrei"));
        lista.add(new Student(6,"Marian"));
        lista.add(new Student(9,"Tudor"));
        lista.add(new Student(7,"Alexandur"));
        lista.sort((s1, s2) -> Integer.compare(s1.nota, s2.nota));
        for(Student it:lista)
        {
            System.out.println(it);
        }
    }
}