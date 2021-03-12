package lesson13;

import java.util.HashSet;
import java.util.Iterator;

public class page12 {
    public static void main(String[] args) {
            // baska bir metod la toplama
        HashSet<Integer> sayı = new HashSet<>();
        sayı.add(1);
        sayı.add(2);
        sayı.add(3);
        sayı.add(4);
        sayı.add(5);
        int toplam = 0;
        Iterator<Integer> ıterator = sayı.iterator();
        while (ıterator.hasNext()) {
            toplam += ıterator.next();
        }
        System.out.println(toplam);

    }
}
