import java.util.*;

//Zadanie 3
//Stwórz klasę generyczną Counter<T>, która będzie zliczać ilość dodanych elementów
//określonego typu. Klasa powinna mieć metodę add(T element), która dodaje element
//do wewnętrznej struktury, oraz metodę getCount(), która zwraca liczbę dodanych elementów.

public class Counter <T>{
    List<T> lista;

    public Counter(){
        lista = new ArrayList<T>();
    }

    public void add(T objekt){
        lista.add(objekt);
    }

    public int getCount(){
        return lista.size();
    }
}
