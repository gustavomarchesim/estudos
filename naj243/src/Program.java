import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

        // UNIAO
        Set<Integer> c = new TreeSet<>(a); // Recebe tudo que tem em 'a'
        c.addAll(b); // UNE o conjunto 'c' com o 'b'
        System.out.println(c);

        // INTERSEC
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b); // mostra somente os elementos em comum
        System.out.println(d);

        // diff
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b); // Remove tudo que existe em b
        System.out.println(e);
    }

}
