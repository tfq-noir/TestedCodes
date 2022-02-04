package com.company;

// Interface
    interface Animal {
        public void animalSound(); // interface method (does not have a body)
        public void sleep(); // interface method (does not have a body)
    }

/**
     cat "implements" the Animal interface
*/
    class Cat implements Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The cat says: meow");
        }
        public void sleep() {
            // The body of sleep() is provided here
            System.out.println("Zzz");
        }
    }

    class InterfaceMain {
        public static void main(String[] args) {
            Cat myCat = new Cat();  // Create a Pig object
            myCat.animalSound();
            myCat.sleep();
        }
    }


