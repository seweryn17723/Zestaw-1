//Zadanie 21
//Utwórz dwie klasy: Animal (Zwierzę) i Dog (Pies), gdzie Dog dziedziczy po Animal.
// Następnie napisz statyczną metodę generyczną findMax, która przyjmuje dwa argumenty:
//element1 i element2 typu extends Animal. Metoda powinna zwracać element większy według własnie
// zdefiniowanego kryterium porównania. W implementacji porównaj
//elementy bazując na wybranym przez siebie atrybucie, na przykład wieku

public class Animal {

    int age;

    public Animal(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Animal [age = " + age + "]";
    }
}
