package week2.constructors;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        if (age < 0) {
            System.out.println("Age cannot be negative, setting to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }
}
