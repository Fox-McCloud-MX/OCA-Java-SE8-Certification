package edu.oca.java.se8.certification._1Z0_808.chapter4.lambdas;

import java.util.ArrayList;
import java.util.List;

/*
This code uses a concept called deferred execution. 
Deferred execution means that code is specified now but will run later. 
In this case, later is when the print() method calls it.
*/
public class LambdaSearchPredicate {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, a -> a.canHop()); // use lambda expression
        print(animals, a -> a.canSwim()); //can use swim
        print(animals, a -> !a.canSwim()); //can't swim
        
        boolean wantWhetherCanHop = true;
        print(animals, a -> a.canHop() == wantWhetherCanHop);
    }
    
    private static void print(List<Animal> animals, Predicate<Animal> predicate) {
        for (Animal animal : animals) {
            if (predicate.test(animal)) // the general check
            {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}
