package lesson13;

import java.util.HashSet;

public class page03 {
    public static void main(String[] args) {
        // remove metodu  HashSet<String> myset = new HashSet<>();
        HashSet<String> myset = new HashSet<>();

        myset.add("osman");
        myset.add("ali");
        myset.add("kazım");
        myset.add("mehmet");
        myset.remove("mehmet");
        System.out.println(myset);
    }
}
