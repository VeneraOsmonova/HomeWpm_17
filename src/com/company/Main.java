package com.company;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(),
                            new Eagle(),
                            new Turtle()};






        for (Animal av : animals) {
            if (av instanceof Turtle) {
                ((Turtle) av).swim();
            }
        }
        for (Animal av : animals) {
            if (av instanceof Eagle) {
                ((Eagle) av).fly();
            }
        }
        for (Animal av : animals) {
            if (av instanceof Shark) {
                ((Shark) av).attack();
            }
        }




        for (Animal av : animals) {
            if (av.getClass().getName().equals("com.company.Turtle")) {
                av.voice();
            }
        }
        for (Animal av : animals) {
            if (av.getClass().getName().equals("com.company.Eagle")) {
                av.voice();
            }
        }
        for (Animal av : animals) {
            if (av.getClass().getName().equals("com.company.Shark")) {
                av.voice();
            }
        }
    }
}




















//   animalMethod(new Shark());
//   animalMethod(new Eagle());
//   animalMethod(new Turtle());
//   animalMethod(new Animal());
//
//    }
//
//    public static void animalMethod(Animal animal){
//       animal.voice();

