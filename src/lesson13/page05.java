
package lesson13;

import java.util.Arrays;
import java.util.Iterator;

public class page05 {
    public static void main(String[] args) {
        int[] int_dizi = {1,2,3,4,6,8};
        Iterator<Integer> iterator = Arrays.stream(int_dizi).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    }
