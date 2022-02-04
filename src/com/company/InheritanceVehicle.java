/* Java Inheritance
 */
package com.company;

class InheritanceVehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println("Tut, tut!");
    }
}

class Car extends InheritanceVehicle {
    final String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Display the value of the brand attribute (from the *InheritanceVehicle* class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();
    }
}

