package lesson13;

import java.util.HashSet;

public class page02 {
    public static void main(String[] args) {

        // cointains metodu
        HashSet<String> myset = new HashSet<>();
        myset.add("osman");
        myset.add("ali");
        myset.add("kazım");
        myset.add("mehmet");
        boolean myset_mehmet_iceriyormu = myset.contains("osman");
        boolean myset_selim_iceriyormu = myset.contains("ali");
        System.out.println("myset_mehmet_iceriyormu:" + myset_mehmet_iceriyormu);
        System.out.println("myset_selim_iceriyormu:" + myset_selim_iceriyormu);
    }
}
