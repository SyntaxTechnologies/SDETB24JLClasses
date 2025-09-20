package org.example.class6;

public class E20String {
    public static void main(String[] args) {

        String str = "ksnfj&#$&*t3y783|SDKFNKDFN24";
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[A-z]","#"));
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll("[0-9A-Za-z]",""));



    }
}
