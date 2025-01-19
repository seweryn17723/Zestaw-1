//Zadanie 24

public class Eagle extends Bird {

    public Eagle(String species, int age) {
        super(species, age);
    }

    public String toString() {
        return "Eagle [species = " + super.toString() + "]";
    }
}
