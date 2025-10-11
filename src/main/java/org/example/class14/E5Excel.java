package org.example.class14;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class E5Excel {
    public static void main(String[] args) {


        int [] arr1={10,20,30};
        int [] arr2={100,19,35};

        LinkedHashMap<String,String> row1=new LinkedHashMap<>();
        row1.put("First Name","John");
        row1.put("Last Name","Smith");
        row1.put("Age","28");
        row1.put("City","New York");
        row1.put("Salary","55000");
        //System.out.println(row1);

        LinkedHashMap<String,String> row2=new LinkedHashMap<>();
        row2.put("First Name","Emily");
        row2.put("Last Name","Johnson");
        row2.put("Age","34");
        row2.put("City","Los Angeles");
        row2.put("Salary","67000");
       // System.out.println(row2);

        ArrayList<LinkedHashMap<String,String>> mapList=new ArrayList();
        mapList.add(row1);
        mapList.add(row2);
        System.out.println(mapList);
    }
}
