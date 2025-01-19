//1 Zadanie
//Stwórz prostą klasę generyczną Box, która może przechowywać obiekt dowolnego typu.
//Klasa powinna zawierać metodę set, aby ustawić obiekt, oraz metodę get, aby go pobrać


public class Box<T>{    //klasa generyczna przechowuje objekt T
    T objekt;

    public void setObjekt(T objekt){
        this.objekt = objekt;
    }

    public T getObjekt(){
        return objekt;
    }
}
