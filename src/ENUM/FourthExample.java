package ENUM;

import java.util.*;
enum CofeeSize {
    LARGE(4.5),
    MEDIUM(3.5),
    SMALL(2.5);
    private double price;
    private CofeeSize(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}

public class FourthExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input=input.toUpperCase();
        CofeeSize value = CofeeSize.valueOf(input);
        System.out.println(value.getPrice());
    }

}

