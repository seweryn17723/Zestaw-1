//Zadanie 4
//Stwórz klasę generyczną Triple<T, U, V>, która może przechowywać trzy obiekty różnych typów.
// Zaimplementuj metody getFirst(), getSecond() i getThird()
//do pobierania odpowiednio pierwszego, drugiego i trzeciego elementu.

//Zadanie 24

public class Triple<T, U, V>{       //<T, U, V> - pozwala stworzyć instancję klasy z trzema obiektami

    public T first;
    public U second;
    public V third;

    //Konstruktor tej klasy
    public Triple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public V getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "Triple [first = " + first + ", second = " + second + ", third = " + third + "]";
    }
}
