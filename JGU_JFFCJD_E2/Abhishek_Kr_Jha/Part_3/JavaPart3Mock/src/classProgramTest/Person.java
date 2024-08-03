package classProgramTest;

//public class Person {
//
//}


public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Override toString() method for easy printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
