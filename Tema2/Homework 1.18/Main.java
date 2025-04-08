import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(34);
        lista.add(1);
        lista.add(78);
        lista.add(23);
        lista.add(56);
        lista.add(99);
        lista.add(12);
        lista.add(7);
        lista.add(5);
        Collections.sort(lista);

        System.out.println("Lista sortata: " + lista);
    }
}