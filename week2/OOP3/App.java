package week2.OOP3;

public class App {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alex");
        p.setAge(-5); // Will be handled
        p.setFavoriteColor(null); // Will be handled

        System.out.println(p.getName() + " is " + p.getAge() + " years old and loves " + p.getFavoriteColor());
    }
}
