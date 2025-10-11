package org.example.class14;

public class E11ExceptionHandling {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);

        try {
            int[] arr = {10, 2030};
            System.out.println(arr[10]);
        }
        catch (Exception e){
            System.out.println("This code will be executed whenever we will get index out of bound error");
        }


        System.out.println(1);
        System.out.println(1);
        System.out.println(1);
        System.out.println(1);

    }
}
