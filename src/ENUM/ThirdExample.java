package ENUM;

import java.util.*;
enum month {
    JANUARY (31),
    FEBRUARY (28),
    MARCH (31), APRIL (30), MAY (31),
    JUNE (30), JULY (31), AUGUST (31), SEPTEMBER (30),
    OCTOBER (31), NOVEMBER (30), DECEMBER (31);
    int days;
    month(int days) { this.days = days; }
    public int getNumberOfDays(){
        return days;
    }
}

public class ThirdExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input=input.toUpperCase();
        month value = month.valueOf(input);
        System.out.println(value.getNumberOfDays());
    }

}

