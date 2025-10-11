package org.example.class14;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class E4AdvanceDS {
    public static void main(String[] args) {

        ArrayList<Integer> ages=new ArrayList<>();
        ages.add(10);
        ages.add(20);
        ages.add(30);
        ages.add(99);
        ages.add(5);

        ArrayList<Integer> salaries=new ArrayList<>();
        salaries.add(100000);
        salaries.add(120000);
        salaries.add(90000);
        salaries.add(80000);
        salaries.add(110000);

        HashMap<String,ArrayList<Integer>> numbersMap=new HashMap();
        numbersMap.put("AgesList",ages);
        numbersMap.put("SalariesList",salaries);
        System.out.println(numbersMap);




    }
}
