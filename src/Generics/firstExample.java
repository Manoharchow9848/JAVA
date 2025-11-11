package Generics;

class  Box<T>{
    T value;
    void set(T value){
        this.value=value;
    }
    T get(){
        return value;
    }
}

public class firstExample {
    public static void main(String[] args) {
        // Create a Box to hold a String
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello");
        System.out.println("Value: " + stringBox.get());

        // Create a Box to hold an Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(50);
        System.out.println("Value: " + intBox.get());
    }
}

