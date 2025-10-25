class Smartphone implements GPS, Cellular {
    private double latitude;
    private double longitude;
    private String owner;

    public Smartphone(String owner, double latitude, double longitude) {
        this.owner = owner;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void setCoordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public double[] getCoordinates() {
        return new double[]{latitude, longitude};
    }

    @Override
    public void makeCall() {
        System.out.println(owner + " is making a call...");
    }

    @Override
    public void receiveCall() {
        System.out.println(owner + " received a call.");
    }

    @Override
    public String toString() {
        return "Smartphone(owner=" + owner + ", coords=(" + latitude + ", " + longitude + "))";
    }
}