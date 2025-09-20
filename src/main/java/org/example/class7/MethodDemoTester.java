package org.example.class7;

import org.example.class6.Cat;

public class MethodDemoTester {
    public static void main(String[] args) {

        Cat c=new Cat();
        MethodDemo md=new MethodDemo();
        md.printCatInfo(c);

        String[] names={"James","Jon","Adam"};
        md.print(names);

    }
}
