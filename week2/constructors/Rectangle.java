package week2.constructors;

public class Rectangle {
    int length;
    int width;
    int area;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.area = length * width;
    }

    public int getArea() {
        return area;
    }
}
