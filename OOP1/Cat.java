package OOP1;

public class Cat {
    static String latinName = "Felis catus";
    String name;
    String color;
    int age;
    boolean isFluffy;

    public void meow() {
        System.out.println(name + " says: Meow! (in a " + color + " coat)");
    }
}
