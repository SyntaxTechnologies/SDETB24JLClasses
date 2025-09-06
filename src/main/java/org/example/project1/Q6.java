package org.example.project1;


/*
6. Write a Java program to check whether a given number is prime or not
 */
public class Q6 {
    public static void main(String[] args) {

       boolean isPrime=true;

       int number=11;
       if(number<=1){
           isPrime=false;
       }

       for(int i=2;i<number;i++){

           if(number%i==0){
               isPrime=false;
               break;
           }
       }

       if(isPrime){
           System.out.println("The Number "+number+" is prime ");
       }else {
           System.out.println("The Number "+number+" is not prime ");

       }




    }
}
