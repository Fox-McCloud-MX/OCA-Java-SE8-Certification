package edu.oca.java.se8.certification._1Z0_808.chapter3;

import java.util.ArrayList; //import needed
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods {
    
    public static void main(String[] args) {
        ArrayListMethods arrayListMethods = new ArrayListMethods();
        
        //arrayListMethods.constructor();
        //arrayListMethods.remove();
        //arrayListMethods.removeIf();
        arrayListMethods.convertArrayToList();
    }
    
    public void constructor() {
        ArrayList list1 = new ArrayList();      //empty     -> heap memory XAAA
        ArrayList list2 = new ArrayList(10);    //int       -> heap memory XBBB
        ArrayList list3 = new ArrayList(list2); //Collection-> heap memory XCCC
        
        list1.add("some string"); //only add to list1
        list1.add("another string");
        
        System.out.println(list1.toString());
        System.out.println(list2);
        System.out.println(list3);
    }
    
    public void interfaceList() {
        //ArrayList arrayList1 = new List(); //DOESN'T COMPILE
        List list1 = new ArrayList();
    }
    
    public void remove() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        
        System.out.println(birds.remove("cardinal")); // prints false
        System.out.println(birds.remove("hawk")); // prints true
        System.out.println(birds); // prints [hawk]
        
        System.out.println(birds.remove(0)); // prints hawk
        System.out.println(birds); // prints []
        
        birds.remove(100); //throws an IndexOutOfBoundsException. Use removeIf()
    }
    
    public void removeIf(){
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds); //prints [hawk, hawk]
        
        //lambda expression
        birds.removeIf(s -> s.equals("hawk")); //remove all matches
        
        System.out.println(birds); //prints []
    }
    
    public void set() {
        List<String> birds = new ArrayList<>();
        
        birds.add("hawk"); // [hawk]
        System.out.println(birds.size()); // 1
        
        birds.set(0, "robin"); // [robin]
        System.out.println(birds.size()); // 1
        
        birds.set(1, "robin"); // IndexOutOfBoundsException
    }
    
    public void convertArrayToList() {
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length); // 2
        
        String[] stringArray2 = list.toArray(new String[3]);
        System.out.println(stringArray2.length); // 2
    }
    
    public void backedList() {
        String[] array = { "hawk", "robin" }; // [hawk, robin]
        
        List<String> list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size()); // 2
        
        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        
        for (String b : array) 
            System.out.print(b + " "); // new test
        
        //throws an exception because we are not allowed to change the size of the list
        list.remove(1); // throws UnsupportedOperation Exception
    }
    
    public void sorting() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); //[5, 81, 99]
    }
}
