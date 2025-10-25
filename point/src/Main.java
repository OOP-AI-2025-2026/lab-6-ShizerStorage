public class Main {
    public static void main(String[] args) {
        Point p = new Point(1.5, 2.5);
        System.out.println("Початково: " + p);
        p.moveTo(10.0, -3.25);
        System.out.println("Після moveTo: " + p);
        p.setX(0);
        p.setY(0);
        System.out.println("Після setX/setY: " + p);

    }
}