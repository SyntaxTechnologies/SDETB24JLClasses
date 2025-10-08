package org.example.class12;


import java.util.ArrayList;

public class E2Arrays {
    public static void main(String[] args) {
        //int [] ages=new int[10];
        ArrayList<Integer> ages = new ArrayList<>();
        ages.add(10);
        ages.add(20);
        ages.add(30);
        ages.add(40);
        ages.add(33);
        ages.add(99);
        ages.add(2);
        System.out.println(ages);

      /*  for(int x:ages){
            if(x>30){
                ages.remove(x);
            }
        }*/
        ages.removeIf( x -> x > 30);
        System.out.println(ages);


    }


}
