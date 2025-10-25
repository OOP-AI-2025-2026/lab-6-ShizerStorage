public class Main {
    public static void main(String[] args) {
        Smartphone s = new Smartphone("Olena", 50.4501, 30.5234); // приклад координат (Київ)
        System.out.println(s);
        double[] coords = s.getCoordinates();
        System.out.println("Координати: lat=" + coords[0] + ", lon=" + coords[1]);
        s.makeCall();
        s.receiveCall();

    }
}