//Zadanie 29

public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Plant [name = " + name + "]";
    }
}
