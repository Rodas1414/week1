package week2.constructors;

public class House {
    Room room;

    public House(Room room) {
        this.room = room;
    }

    public void describe() {
        System.out.println("This house has a room called: " + room.name);
    }
}
