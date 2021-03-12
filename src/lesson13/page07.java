package lesson13;

import java.util.HashSet;

public class page07 {
    public static void main(String[] args) {
        // arraya çevirme yaptık.
        HashSet<String> myset = new HashSet<>();
        myset.add("osman");
        myset.add("ali");
        myset.add("kazım");
        myset.add("mehmet");
        Object[] myarray = myset.toArray();
        for (int i = 0; i < myarray.length; i++) {
            System.out.println((i+1) + ".nci eleman: " + myarray[i]);

        }
    }
}
