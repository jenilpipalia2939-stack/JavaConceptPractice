package Constructor;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }

    public int getX() {return x;}
    public int getY() {return y;}

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3.5, 4.5);
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p2.getX());
        System.out.println(p2.getY());
    }
}