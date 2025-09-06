package org.example.project1;


/*
Write a Java Program to print the first 10 numbers of the Fibonacci series
 */
public class Q7 {
    public static void main(String[] args) {

        // 0 1 1 2 3 5 8 13

        int n=20;
        int first=0;
        int second=1;

        for(int i=0 ;i<n;i++){
            System.out.print(first+" ");
            int next=first+second; // add previous two to get the next one
            first=second; // update the previous second and first
            second=next;

        }


    }
}
