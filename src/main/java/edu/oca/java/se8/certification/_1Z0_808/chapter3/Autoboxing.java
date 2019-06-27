package edu.oca.java.se8.certification._1Z0_808.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Autoboxing {

    public static void main(String[] args) {
        Autoboxing autoboxing = new Autoboxing();

        autoboxing.autoboxingInt();
    }

    public void autoboxingDouble() {
        List<Double> weights = new ArrayList<>();

        //autoboxes the double primitive into a Double object and adds that to the List.
        weights.add(50.5); // [50.5]

        //shows that you can still write code the long way and pass in a wrapper object
        weights.add(new Double(60)); // [50.5, 60.0]

        //again autoboxes into the wrapper object and passes it to remove()
        weights.remove(50.5); // [60.0]

        //retrieves the Double and unboxes it into a double primitive
        double first = weights.get(0); // 60.0
    }

    public void autoboxingNull() {
        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        int h = heights.get(0); // NullPointerException
    }

    public void autoboxingInt() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers); //[1,2]

        numbers.remove(1); //remove de index

        System.out.println(numbers); //[1]

        numbers.add(2);
        System.out.println(numbers); //[1,2]

        //If you want to remove the 1
        numbers.remove(new Integer(1)); //to force wrapper class use.
        System.out.println(numbers); //[2]
    }

    public void convertArrayToList() {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length); // 2
    }
    
    public void backedList() {
        String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size()); // 2
        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : array) System.out.print(b + " "); // new test
        list.remove(1); // throws UnsupportedOperation Exception
    } //137
}
