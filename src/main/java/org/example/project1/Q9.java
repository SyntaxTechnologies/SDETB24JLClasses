package org.example.project1;

/*
rite a program to print out duplicate elements from an Array of Strings
 */

public class Q9 {
    public static void main(String[] args) {

        String[] animals={"Cat","Dog","Lion","Cat"};
        for(int i=0;i<animals.length;i++){
            for (int j = i+1; j < animals.length; j++) {
                if(animals[i].equals(animals[j])){
                    System.out.println(animals[i]);
                }
            }
        }


    }
}
