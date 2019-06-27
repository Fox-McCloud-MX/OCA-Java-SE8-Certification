package edu.oca.java.se8.certification._1Z0_808.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayOfPrimitives {

    public static void main(String[] args) {
        ArrayOfPrimitives arrayOfPrimitives = new ArrayOfPrimitives();

        //arrayOfPrimitives.instance();
        //arrayOfPrimitives.ArrayWithReferenceVariables();
        arrayOfPrimitives.castingArrays();
    }

    public void instance() {

        int[] numbers1 = new int[3]; //values: {0,0,0} index: {0,1,2}

        int[] numbers2 = new int[]{42, 55, 99}; //values: {42,55,99} index: {0,1,2}

        //This approach is called an anonymous array. 
        //It is anonymous because you don’t specify the type and size.
        int[] numbers3 = {42, 55, 99};

        //diferents [] position
        int[] numAnimals;
        int[] numAnimals2;
        int numAnimals3[];
        int numAnimals4[];

        //multiple declarations
        //int[] ids
        //int[] types
        int[] ids, types;

        //int[] ids
        //int types
        int ids2[], types2;

        //int[] ids
        //int[] types
        int ids3[], types3[];

        //int[] (ids4, types5); //ERROR
    }

    public void ArrayWithReferenceVariables() {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0

        //java.util.Arrays.toString(String[]) since Java 5.
        System.out.println(Arrays.toString(bugs));
    }

    public void castingArrays() {
        String[] strings = {"stringValue"};
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE

        objects[0] = new StringBuilder(); // careful! an ArrayStoreException.
    }

    public void sortingPrimitives() {
        int[] numbers = {10, 100, 9};
        Arrays.sort(numbers);
        
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " "); //9 10 100
    }
    
    public void sortingStrings() {
        String[] strings = { "10", "9", "100" }; 
        Arrays.sort(strings); //String sorts in alphabetic order
        
        for (String string : strings)
            System.out.print(string + " "); //10 100 9
    }
    
    /*
    java.util.Arrays.binatySearch:
    
    Target element found in sorted array    -> Index of match
    Target element not found in sorted array-> Negative value showing one smaller than 
                                                the negative of index, where a match 
                                                needs to be inserted to preserve sorted order
    Unsorted array A surprise               -> This result isn’t predictable
    */
    public void binarySearchWithSortedArray() {
        int[] numbers = {2,4,6,8}; //sorted array
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0 index
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1 index
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1 (1-1 = 0 index to preserve the sorted order)
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2 (3-2 = 1 index to preserve the sorted order)
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5 (9-5 = 4 index to preserve the sorted order)
    }
    
    public void binarySearchWithUnsortedArray() {
        int numbers[] = new int[] {3,2,1};
        System.out.println(Arrays.binarySearch(numbers, 2)); //correctly gave 1 as the output
        System.out.println(Arrays.binarySearch(numbers, 3)); //gave the wrong answer, unpredictable output.
    }
    
    public void multidimensionalArray() {
        int[][] vars1; // 2D array
        int vars2 [][]; // 2D array
        int[] vars3[]; // 2D array
        int[] vars4 [], space [][]; // a 2D AND a 3D array
        String [][] rectangle = new String[3][2];
    }
    
    
}
