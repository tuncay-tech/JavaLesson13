package lesson13;

import java.util.HashSet;

public class page19 {
    public static void main(String[] args) {

        int baslangıc_sayısı = 1;
        HashSet<Integer> myset = new HashSet<>();
        while (baslangıc_sayısı < 51) {
            myset.add(baslangıc_sayısı);
            baslangıc_sayısı++;
        }
        System.out.println(myset);
    }
}
