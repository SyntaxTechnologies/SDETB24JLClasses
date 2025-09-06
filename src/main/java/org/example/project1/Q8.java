package org.example.project1;


/*
Write a Java program to find the second-largest number in the array.
 */
public class Q8 {
    public static void main(String[] args) {

        int [] numbers={12,15,88,99,56,23,45};
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:numbers){

            if(num>largest){
                secondLargest=largest;
                largest=num;

            } else if (num>secondLargest&&num!=largest) {
                secondLargest=num;
            }
        }

        System.out.println(largest);
        System.out.println(secondLargest);







    }
}
