import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Task71 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        // Using constructor reference to create Person objects
        persons.add(new Person("John", 25));
        persons.add(new Person("Jane", 30));
        persons.add(new Person("Mike", 35));

        // Printing the details of each person
        persons.forEach(person -> System.out.println("Name: " + person.getName() + ", Age: " + person.getAge()));
    }
}
