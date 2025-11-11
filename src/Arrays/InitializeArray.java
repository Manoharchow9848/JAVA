package Arrays;

import  java.util.*;
public class InitializeArray {
    public static void main(String[] args) {
        // Initializing an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Printing the elements of the array
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        //size of array is fixed
        //arrays can store multiple values of same data type
        // find length of array using array.length
        System.out.println("Length of the array: " + numbers.length);

        //populating array using loop
        int[] squares = new int[5];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;
        }
        System.out.println("Squares array elements:");
        for (int square : squares) {
            System.out.println(square);
        }

        //sorting an array
        Arrays.sort(numbers);
        System.out.println("Sorted array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }
        //filling an array with a specific value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled array elements:");
        for (int value : filledArray) {
            System.out.println(value);
        }
        //copying an array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array elements:");
        for (int number : copiedArray) {
            System.out.println(number);
        }

        // 2 arrays are equal or not
        int[] anotherArray = {10, 20, 30, 40, 50};
        boolean areEqual = Arrays.equals(numbers, anotherArray);
        System.out.println("Are the two arrays equal? " + areEqual);
        //convert array to list using Arrays.asList()
        List<Integer> numberList = Arrays.asList(10, 20, 30, 40, 50);

        // binary search using Arrays.binarySearch()
        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("Index of 30 in the array: " + index);

        // descending sort using custom comparator
        Integer[] descArray = {50, 20, 40, 10, 30};
        Arrays.sort(descArray, Collections.reverseOrder());

        boolean [] boolArray = new boolean[5];
        System.out.println("Boolean array elements:");
        for (boolean b : boolArray) {
            System.out.println(b);
        }
        for(String arg : args){
            System.out.println("Command line argument: " + arg);
        }
    }
    }
