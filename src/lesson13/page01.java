package lesson13;

import java.util.HashSet;

public class page01 {
    public static void main(String[] args) {
        // hashset dersine başladık

        HashSet<String> myset = new HashSet<>();
        myset.add("osman");
        myset.add("ali");
        myset.add("kazım");
        myset.add("mehmet");
        System.out.println(myset);
        myset.add("mehmet");
        System.out.println(myset);



    }
}
