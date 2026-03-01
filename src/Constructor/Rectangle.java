package Constructor;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle) {
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        Rectangle rectangle1 = new Rectangle(rectangle);
        System.out.println(rectangle1.getLength());
        System.out.println(rectangle1.getWidth());
    }

}
