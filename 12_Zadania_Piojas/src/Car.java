//Zadanie 22

//Zdefiniuj klasy Car (Samochód) i ElectricCar (Samochód Elektryczny), gdzie
//ElectricCar dziedziczy po Car. Napisz statyczną metodę generyczną compareObjects,
//która przyjmuje dwa argumenty: object1 i object2 typu extends Car. Metoda ma
//zwracać wartość true, jeśli obiekty są tego samego typu, w przeciwnym wypadku false.
//Użyj metody getClass() do porównania klas obiektów.

public class Car {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
