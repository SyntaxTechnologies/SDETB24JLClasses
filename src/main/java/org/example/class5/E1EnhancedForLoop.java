package org.example.class5;

public class E1EnhancedForLoop {
    public static void main(String[] args) {


        int[] ages = {10, 25, 30, 58, 65, 25};

        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }

       /* int i = 0;
        while (i < ages.length) {
            System.out.println(ages[i]);
            i++;
        }*/

        // for looping throw the elements from an array enhanced for loop is the best choice
        // as it is very simple and clean
        for(int age:ages){
            System.out.println(age);
        }



    }
}
