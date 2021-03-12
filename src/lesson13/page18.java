package lesson13;

import java.util.HashSet;

public class page18 {
    public static void main(String[] args) {
        HashSet<Object> myset = new HashSet<>(4);

        myset.add(3);
        myset.add(4);
        myset.add("mehmet");
        myset.add("ali");
        System.out.println(myset);

    }
}
