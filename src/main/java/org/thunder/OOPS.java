package org.thunder;

/**
 * Object-Oriented Programming Concepts - helps to model real world problems in more intuitive ways
 *
 * Objects - have certain behaviour and states
 * Class - Blueprint/Template to create objects
 * Data Abstraction - Hide the implementation details and expose the functionality
 *          - Interfaces and abstract classes
 * Data Encapsulation - Packaging all the states and behaviour together inside a class
 * Inheritance - Inherit properties and behaviour from parent class instead of rewriting again.
 *          - extends for same type(class to class, interface to interface) & implements for different type (class to interface)
 *          - Multiple inheritance with classes is not possible, possible with interfaces.
 *          - IS-A relationship : Inheritance ex pit-bull is a dog, sparrow is a bird
 *          - HAS-A relationship : One class contains another class as its data member
 *                  - Aggregation : if one object is dead, another object survive, (School and Students) Weak Coupling
 *                  - Composition : if one object is dead, another object is also dead, (School and Rooms) Tight Coupling
 * Polymorphism - same thing taking multiple forms
 *          - Method Overloading/Static polymorphism/compile time polymorphism [method_name(T a, T b)], return type doesn't matter,decision will be based on
 *            param data type.
 *          - Method Overriding/Dynamic Polymorphism/run time polymorphism
 */
public class OOPS
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

class Student {
    private int roll;
    private String name;
    private byte age;
    private char section;

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public char getSection() {
        return section;
    }

    public void setSection(char section) {
        this.section = section;
    }
}