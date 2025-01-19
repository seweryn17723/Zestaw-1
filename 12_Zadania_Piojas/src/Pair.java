//Zadanie 23

//Stwórz klasę generyczną Pair<T> która przechowuje dwa obiekty tego samego typu.
//Utwórz dwie klasy: Animal (Zwierzę) i Dog (Pies), gdzie Dog dziedziczy po Animal. Następnie napisz statyczną metodę generyczną findMax, która przyjmuje Pair<? extends
//Animal>. Metoda powinna zwracać element większy według własnie zdefiniowanego kryterium porównania.

//Zadanie 28

//Zadanie 29

public class Pair <T>{
    private T first; //pierwszy obiekt
    private T second; //drugi obiekt

    public Pair(){
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair [first = " + first + ", second = " + second + "]";
    }
}
