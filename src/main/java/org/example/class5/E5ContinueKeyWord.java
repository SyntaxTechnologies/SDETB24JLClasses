package org.example.class5;

public class E5ContinueKeyWord {
    public static void main(String[] args) {

        int[] ages = {10, 25, 30, 58, 65, 25};

        for(int age:ages){

            if(age<30){
                continue;
            }
            System.out.println(age);
        }
    }
}
