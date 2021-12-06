package challenges.week_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Three_Five_Multiples {

    public static void main(String[] args) {
//        int sum = 0;
//
//        for(int i = 0; i < 1000; ++i)
//        {
//            if(i%3==0 || i%5==0)
//                sum += i;
//        }
//
//        System.out.println(sum);

        //Create variables
        // TreeSet
        java.util.Set<String> ts1 = new java.util.TreeSet<String>(Comparator.comparing(String::length));

        // Elements are added using add() method
        ts1.add("Here");
        ts1.add("Is");
        ts1.add("A");
        ts1.add("Sentence");


        // Elements get stored in default natural
        // Sorting Order(Ascending)
        System.out.println(ts1);

//        System.out.println(lengths);
//        System.out.println(hm.entrySet());

    }

}
