package org.example.class7;

public class PrinterTester {
    public static void main(String[] args) {

       // new Printer().printerHello();
        Printer p=new Printer();

       // p.printerHello();

        p.printWord("Java");
        //p.printWord("Python");
       // p.staticAdd();
       /* p.add(10,10);
        p.add(50,10);
        p.add(50,56);*/
       // p.printManyTimes(20);
        p.printCustomWordManyTimes("Hello Java",10);
        p.printCustomWordManyTimes("Hello python",15);

       int sum= p.add(10,20);
       if(sum>10){
           System.out.println("Sum is too large");
       }


       String s=new String("Java");
       char c=s.charAt(2);
        System.out.println(c);

    }
}
