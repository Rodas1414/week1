package week2.OOP1;

public class App {
    public static void main(String[] args) {
        // Print the static latin names
        System.out.println("Cat Latin Name: " + Cat.latinName);
        System.out.println("Dog Latin Name: " + Dog.latinName);

        // Create and set up a Cat
        Cat zia = new Cat();
        zia.name = "Zia";
        zia.color = "white";
        zia.age = 2;
        zia.isFluffy = true;

        // Create and set up a Dog
        Dog wiesje = new Dog();
        wiesje.name = "Wiesje";
        wiesje.breed = "Dachshund";
        wiesje.age = 4;
        wiesje.isGoodBoy = false;

        // Let them speak
        zia.meow();
        wiesje.bark();

        // Demonstrate object references
        Cat anotherZia = zia;
        anotherZia.color = "gray";
        System.out.println("Zia's new color? " + zia.color);
    }
}

