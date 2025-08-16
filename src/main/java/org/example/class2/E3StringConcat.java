package org.example.class2;

public class E3StringConcat {
    public static void main(String[] args) {

        int num1=10;
        int num2=20;
       // System.out.println("The Sum of above two numbers is "+num1+num2);
        String step1="The Sum of above two numbers is ";
        System.out.println(step1);
        String step2=step1+num1;
        System.out.println(step2);
        String step3=step2+num2;
        System.out.println(step3);

        int n=10;
        int n2=20;
        System.out.println(n+n2);

    }
}
