package org.example.class6;

public class E14String {
    public static void main(String[] args) {

        String str="ajksdhfjkasdhfhjsdbfhjsdbfhjsdbfhjsdfb";

        int counter=0;
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i)=='f'){
                counter++;
            }
        }

        System.out.println("The letter a has appeared "+counter+" Times");




    }
}
