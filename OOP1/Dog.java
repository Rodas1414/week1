package OOP1;

public class Dog {
    static String latinName = "Canis lupus familiaris";
    String name;
    String breed;
    int age;
    boolean isGoodBoy;

    public void bark() {
        System.out.println(name + " says: Woof! (Breed: " + breed + ")");
    }
}
