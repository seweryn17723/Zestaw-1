public class Vehicle implements Comparable<Vehicle>{
    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Vehicle other) {
        //Porównanie na podstawie prędkości
        return Integer.compare(this.speed, other.speed);
    }

    @Override
    public String toString() {
        return "Vehicle{" + "model = " + model + ", speed = " + speed + '}';
    }
}
