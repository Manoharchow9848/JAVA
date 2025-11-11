package ENUM;

import java.util.*;
enum TrafficLight {
    RED(30), YELLOW(5), GREEN(25);
    int time;
    TrafficLight(int time) { this.time = time; }
    public int getTime(){
        return time;
    }
}

public class SecondExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        input=input.toUpperCase();
        TrafficLight value = TrafficLight.valueOf(input);
        System.out.println(value+" light stays on for "+ value.getTime()+ " seconds.");
    }

}
