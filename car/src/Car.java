public class Car implements java.lang.Comparable<Car> {
    private int price;
    private int year; // рік виготовлення
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getHorsePower() { return horsePower; }
    public void setHorsePower(int horsePower) { this.horsePower = horsePower; }

    @Override
    public int compareTo(Car o) {
        if (o == null) throw new NullPointerException();
        if (!(o instanceof Car)) {
            throw new ClassCastException("Expected a Car");
        }
        Car other = (Car) o;

        int diff = other.price - this.price;
        if (diff != 0) return diff;

        diff = this.year - other.year;
        if (diff != 0) return diff;

        return this.horsePower - other.horsePower;
    }

    @Override
    public String toString() {
        return "Car(price=" + price + ", year=" + year + ", hp=" + horsePower + ")";
    }
}
