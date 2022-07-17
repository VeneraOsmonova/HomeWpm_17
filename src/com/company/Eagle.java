package com.company;

public class Eagle extends Animal{
    public void fly(){
        System.out.println("Eagle: "+ "flies in the sky"); // орел
    }

    @Override
    public void voice() {
        System.out.println("Chiik -Chiik");
    }
}
