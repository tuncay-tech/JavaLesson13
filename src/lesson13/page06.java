package lesson13;

import java.util.HashSet;

public class page06 {
    public static void main(String[] args) {
        // for each metodu
        HashSet<String> myset = new HashSet<>();
        myset.add("osman");
        myset.add("ali");
        myset.add("kazım");
        myset.add("mehmet");
        myset.forEach(item -> System.out.println(item));




    }
}
