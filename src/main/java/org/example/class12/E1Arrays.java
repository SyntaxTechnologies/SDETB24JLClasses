package org.example.class12;



import java.util.ArrayList;

public class E1Arrays {
    public static void main(String[] args) {
        //int [] ages=new int[10];
        ArrayList<Integer> ages=new ArrayList<>();
        ages.add(10);
        ages.add(20);
        ages.add(30);
        ages.add(40);

       /* for(Integer age:ages){
            System.out.println(age);
        }*/

        for(int i=0; i<ages.size();i++){
            System.out.println(ages.get(i));
        }



    }


}
