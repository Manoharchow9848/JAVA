package ENUM;

import java.util.*;
enum Day {
    MONDAY("Weekday"),
    TUESDAY("Weekday"),
    WEDNESDAY("Weekday"),
    THURSDAY("Weekday"),
    FRIDAY("Weekday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");
    private String description;
    private Day(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}

public class FifthExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        day=day.toUpperCase();
        Day value = Day.valueOf(day);
        System.out.println(value.getDescription());
    }

}
