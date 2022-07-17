package com.company;

public class Shark extends Animal{
    public void attack(){
        System.out.println("Shark: "+ "shark attacks fish"); //акула
    }

    @Override
    public void voice() {
        System.out.println("Ynsyz");
    }
}

