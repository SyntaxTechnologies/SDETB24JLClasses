package org.example.project1;

/*
Create a 2D array of integer type where you will store odd and even numbers. Develop a
program that will identify/print the even numbers only.
 */


public class Q3 {
    public static void main(String[] args) {

        int [][] numbers={
            {10,5,6,2,8},
            {9,5,6,3,8,1},
            {25,5,2,5,9}
        };

      for(int [] row:numbers){

          for(int num:row){
             if(num%2==0){
                 System.out.print(num+" ");
             }
          }
          System.out.println();
      }


    }
}
