package lesson13;

import java.util.HashSet;

public class page11 {
    public static void main(String[] args) {
        HashSet<Integer> sayılar = new HashSet<>();
        sayılar.add(1);
        sayılar.add(3);
        sayılar.add(4);
        sayılar.add(5);
        Object[] myarray = sayılar.toArray();
        int toplam = 0;
        for(Integer sayi : sayılar){
            toplam += sayi;  // toplam = tplam + sayi;  olurdu
        }
        System.out.println(toplam);
    }
}
