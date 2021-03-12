package lesson13;

import java.util.HashSet;

public class page16 {
    public static void main(String[] args) {
        HashSet<String> group1 = new HashSet<>();
        group1.add("Olivia");
        group1.add("Mia");
        group1.add("Alexandra");
        group1.add("Mason");
        group1.add("James");
        HashSet<String> group2 = new HashSet<>();
        group2.add("Joseph");
        group2.add("Mia");
        group2.add("Mila");
        group2.add("Olivia");
        group2.add("Charlotte");
        HashSet<String> allNames = new HashSet<>();
        for (String item : group1) {
            allNames.add(item);
        }
        for (String item : group2) {
            allNames.add(item);
        }
        System.out.println(allNames);
    }
}
