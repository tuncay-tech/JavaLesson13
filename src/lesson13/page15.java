package lesson13;

import java.util.HashSet;

public class page15 {
    public static void main(String[] args) {
        HashSet<String> name1 = new HashSet<>();
        name1.add("oliva");
        name1.add("mia");
        name1.add("james");
        HashSet<String> name2 = new HashSet<>(name1);
        name2.add("joseph");
        name2.add("mila");
        name2.add("chorlate");
        System.out.println(name2);






    }
}
