//Zadanie 22

public class ElectricCar extends Car {

    private int batteryCapcity;

    public ElectricCar(String model, int batteryCapacity) {
        super(model);
        this.batteryCapcity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapcity;
    }
}
