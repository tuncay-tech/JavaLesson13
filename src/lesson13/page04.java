package lesson13;

import java.util.HashSet;
import java.util.Iterator;

public class page04 {
    public static void main(String[] args) {
        // hash set elemanlarına iterator(scanner gibi bir sınıftır) ile ulaşma
        HashSet<String> myset = new HashSet<>();

        myset.add("osman");
        myset.add("ali");
        myset.add("kazım");
        myset.add("mehmet");
        Iterator<String> iterator = myset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
