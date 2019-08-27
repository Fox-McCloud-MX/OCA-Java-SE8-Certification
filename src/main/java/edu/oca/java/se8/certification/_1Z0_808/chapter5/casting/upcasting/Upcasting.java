package edu.oca.java.se8.certification._1Z0_808.chapter5.casting.upcasting;

//Casting from a subclass to a superclass is called upcasting
public class Upcasting {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = new Animal();
        
        animal = cat;           //implicit cast
        animal = (Animal) cat;  //explicit class
        
        //animal.meow(); The method meow() is undefined for the type Animal
        
        //animal IS A cat??
        //right extends to left??
        //cat = animal; //incompatible types: Animal cannot be converted to Cat
        
        cat = (Cat) animal;
        cat.eat(); // called the Cat.eat
        cat.meow();
        
    }
}