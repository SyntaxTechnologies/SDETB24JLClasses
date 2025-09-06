package org.example.project1;

/*
1. Create a program that uses an array to store a list of temperatures for a week, and then
uses a loop to find the highest and lowest temperature for the week.
 */


public class Q1 {
    public static void main(String[] args) {


       // int [] temps={-10,-25,-36,-5,-28,-35,-40};
        int [] temps={10,25,36,5,28,35,40};

        int largest=temps[0];
        int smallest=temps[0];
        for (int temp:temps){

            if(temp>largest){
               largest =temp;
            }

            if(temp<smallest){
                smallest =temp;
            }

        }
        System.out.println(largest);
        System.out.println(smallest);

    }
}
