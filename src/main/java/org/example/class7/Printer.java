package org.example.class7;

public class Printer {

    void printMessage(){
        System.out.println("Hello batch 24");
        System.out.println("How are you guys doing..");
        System.out.println("you are better than batch 23");
        System.out.println("JK");
    }

    void printerHello(){
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Coding");
        System.out.println("Welcome to Programming");
    }

    void printWord(String word){

        System.out.println("I like "+word);
    }


    void staticAdd(){
        System.out.println("The sum of numbers is 20");
    }

    void PrintManyTimes(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    void printManyTimes(int n){

        for (int i = 0; i <n ; i++) {
            System.out.println("Hello World");
        }
    }

    void printCustomWordManyTimes(String word,int n){

        for (int i = 0; i <n ; i++) {
            System.out.println(word);
        }
    }

    /*void add(int num1,int num2){
        int sum=num1+num2;
        System.out.println("The sum of numbers is "+sum);
    }*/


    int add(int num1,int num2){
        int sum=num1+num2;
        return sum;
    }



}
