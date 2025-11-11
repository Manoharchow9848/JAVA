package Collections.List;
import java.util.*;


public class Arraylist{

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, "S001"));
        students.add(new Student("Bob", 22, "S002"));
        students.add(new Student("Charlie", 21, "S003"));
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students,(s1,s2)->s1.age-s2.age);

        Iterator<Student> it = students.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }

    }
}