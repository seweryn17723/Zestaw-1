//Zadanie 24

public class Bird {
    private String species;
    private int age;

    public Bird(String species, int age) {
        this.species = species;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Bird [species = " + species + ", age =  " + age + "]";
    }
}
