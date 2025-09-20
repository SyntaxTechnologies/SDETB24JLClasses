package org.example.class6;

public class E22String {
    public static void main(String[] args) {

        String str = "Java is Easy.QAs are great. They Test.";
        String[] strArr = str.split("[.]");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);


    }
}
