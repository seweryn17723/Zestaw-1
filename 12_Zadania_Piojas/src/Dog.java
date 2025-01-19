//Zadanie 21

public class Dog extends Animal {

    public String breed;

    public Dog(String breed, int age){
        super(age);
        this.breed = breed;
    }

    public String toString(){
        return "Dog [breed = " + breed + ", Age = " + age + "]";
    }
}
