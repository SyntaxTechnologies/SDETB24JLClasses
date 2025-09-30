package org.example.class10;

public class ToyotaPrius2015 {

    void drive(){
        System.out.println("Moving forward");
    }

    void applyBrakes(){
        System.out.println("Applying brakes");
    }

    void start(){
        System.out.println("Start with a key");
    }

    void enterInTheCar(){
        System.out.println("Enter using keys");
    }

    void playMusic(){
        System.out.println("Playing music on CD player");
    }
}


class ToyotaPrius2022 extends ToyotaPrius2015{

   void start(){
       super.start();
       System.out.println("Push start");
   }

    void enterInTheCar(){
        System.out.println("KeyLess Entry or fingerprint entery");
    }

    void  playMusic(){
        System.out.println("Playing music on android panel");
    }
}
