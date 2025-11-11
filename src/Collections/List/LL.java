package Collections.List;

import java.util.*;

public class LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Raj");
        list.add("Vamsi");
        list.add("Manohar");
        list.add("Chowdary");

        System.out.println("LinkedList: " + list);

        // Adding at specific position
        list.add(2, "Teja");
        System.out.println("After adding at index 2: " + list);

        // Accessing elements
        System.out.println("Element at index 1: " + list.get(1));

        // Updating element
        list.set(3, "Rohit");
        System.out.println("After update: " + list);

        // Removing elements
        list.remove("Raj");
        list.remove(2);
        System.out.println("After removal: " + list);


        // LinkedList implements Queue and Deque, so you can use it for queue operations.
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);

        System.out.println("Peek: " + queue.peek()); // head element
        System.out.println("Poll: " + queue.poll()); // removes head

        System.out.println("After poll: " + queue);

        //Using LinkedList as Stack (LIFO Order)
        Deque<String> stack = new LinkedList<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack: " + stack);

        System.out.println("Pop: " + stack.pop());
        //get peak
        System.out.println("Peek: " + stack.peek());
        System.out.println("After pop: " + stack);

        LinkedList<Student> students = new LinkedList<>();

        students.add(new Student( "Raj", 22, "S101"));
        students.add(new Student( "Manohar", 20, "S102"));
        students.add(new Student( "Vamsi", 23, "S103"));

        System.out.println("Before Sorting:");
        students.forEach(System.out::println);

        // Sorting based on age
        Collections.sort(students,(s1,s2)->s1.age-s2.age);
        System.out.println("After Sorting by age:");
        students.forEach(System.out::println);

    }
}
