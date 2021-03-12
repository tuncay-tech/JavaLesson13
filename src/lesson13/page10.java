package lesson13;

import java.util.HashSet;

public class page10 {
    public static void main(String[] args) {

        // size ve clear metodu
        HashSet<String> myset = new HashSet<>();
        myset.add("osman");
        myset.add("ali");
        myset.add("kazım");
        myset.add("mehmet");
        int setinelemansayısı = myset.size();
        System.out.println("setinelemansayısı: " + setinelemansayısı);
        myset.clear();
        System.out.println(myset);


    }
}
