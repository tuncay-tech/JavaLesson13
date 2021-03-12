
package lesson13;

import java.util.HashSet;

public class page13 {
    public static void main(String[] args) {
        // metodla yazdık

        HashSet<Integer> sayı = new HashSet<>();
        sayı.add(1);
        sayı.add(2);
        sayı.add(3);
        sayı.add(4);
        sayı.add(5);
        Object[] myarray = getArray(sayı);
    }

    private static Object[] getArray(HashSet<Integer> myset) {
        Object[] myarray = myset.toArray();
        return myarray;
    }
}
