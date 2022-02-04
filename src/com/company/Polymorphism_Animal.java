package com.company;

class Polymorphism_Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Polymorphism_Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Polymorphism_Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Main {
    public static void main(String[] args) {
        Polymorphism_Animal myAnimal = new Polymorphism_Animal();  // Create a Animal object
        Polymorphism_Animal myPig = new Pig();  // Create a Pig object
        Polymorphism_Animal myDog = new Dog();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}