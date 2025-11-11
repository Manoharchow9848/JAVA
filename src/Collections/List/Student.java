package Collections.List;

public class Student {
    String name;
    int age;
    String id;
    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String toString() {
        return "Collections.List.Student{name='" + name + "', age=" + age + ", id='" + id + "'}";
    }
}
