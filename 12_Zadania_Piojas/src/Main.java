import java.time.format.SignStyle;
import java.util.*;

public class Main {

    //Zadanie 2
    //Napisz generyczną metodę isEqual, która przyjmuje dwa dowolne obiekty tego samego
    //typu i zwraca true, jeśli są one równe, w przeciwnym razie false.
    public static <T> boolean isEqual(T obj1, T obj2){
        return obj1.equals(obj2);
    }

    //Zadanie 4
    //Napisz statyczną metodę generyczną swap, która przyjmuje tablicę dowolnego typu i
    //dwa indeksy, a następnie zamienia miejscami elementy w tej tablicy pod wskazanymi
    //indeksami. Metoda powinna działać dla tablicy każdego typu. Przykładowe wywołanie
    //metody: swap(myArray, 0, 2);, gdzie myArray to tablica typu Integer[] lub dowolnego innego typu.
    //Zabezpiecz metodę tak, aby nie można było jej wywołać z indeksami
    //spoza zakresu tablicy
    public static <T> void swap(T[] array, int index1, int index2){
        if(array == null){
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }

        if(index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length){
            throw new IllegalArgumentException("Indeksy poza zakresem");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    //Metoda do wypisania tablicy
    public static <T> void printArray(T[] array){

        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if(i < array.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    //Zadanie 14
    //Napisz statyczną metodę generyczną minValue, która przyjmuje tablicę elementów typu
    //generycznego T, gdzie T rozszerza Comparable<T>. Metoda powinna zwracać najmniejszy
    //element z tablicy. Przetestuj tę metodę na tablicach zawierających różne typy porównywalnych obiektów,
    //takie jak Integer, Double, czy String. Zabezpiecz metodę tak, aby
    //nie można było jej wywołać z tablicą o zerowej liczbie elementów. Dodaj klasę Person z
    //polami name i age i przetestuj metodę minValue na tablicy obiektów Person.

    public static <T extends Comparable<T>> T minValue(T[] array){

        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Tablica nie może być pusta");
        }

        T min = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i].compareTo(min) < 0){
                min = array[i];
            }
        }

        return min;
    }



    //Zadanie 15
    //Napisz statyczną metodę generyczną maxValue, która przyjmuje tablicę elementów typu
    //generycznego T, gdzie T rozszerza Comparable<T>. Metoda powinna zwracać największy
    //element z tablicy. Upewnij się, że metoda nie akceptuje pustej tablicy (o zerowej liczbie
    //elementów). Przetestuj metodę na tablicach zawierających różne typy porównywalnych
    //obiektów, jak Integer, Float, czy String. Stwórz klasę Vehicle z polami model i
    //speed, implementującą generyczny Comparable, i przetestuj metodę maxValue na tablicy
    //obiektów Vehicle.
    public static <T extends Comparable<T>> T maxValue(T[] array){

        if(array == null || array.length == 0){
            throw new IllegalArgumentException("Tablica nie może być pusta.");
        }

        T max = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i].compareTo(max) > 0){
                max = array[i];
            }
        }

        return max;

        //compareTo(T o)
        //zwraca:
        //liczbę ujemną, jeśli obiekt(this) jest mniejszy niż obiekt o
        //liczbę zerową, jeśli obiekt jest równy obiekotwi o
        //liczbę dodatnią, jeśli obiekt jest większy niż obiekt o
    }
        //Zadanie 21
        public static <T extends Animal> T findMax(T element1, T element2){
            return (element1.getAge() > element2.getAge()) ? element1 : element2;
        }

        //Zadanie 22
        public static <T extends Car> boolean compareObjects(T object1, T object2) {
            return object1.getClass().equals(object2.getClass());
        }

        //Zadanie 23
        public static <T extends Animal> T findMax(Pair<? extends Animal> pair) {
            Animal first = pair.getFirst();
            Animal second = pair.getSecond();

            return (first.getAge() > second.getAge()) ? (T) first : (T) second;
        }

        //Zadanie 24
        public static <T extends Bird> T findMin(Triple<? extends T, ? extends T, ? extends T> triple) {
            Bird first = triple.getFirst();
            Bird second = triple.getSecond();
            Bird third = triple.getThird();

            Bird min = first;
            if (second.getAge() < min.getAge()) {
                min = second;
            }
            if (third.getAge() < min.getAge()) {
                min = third;
            }

            return (T) min;
        }

        //Zadanie 28
        //Stwórz klasę generyczną Pair<T> która przechowuje dwa obiekty tego samego typu.
        //Utwórz dwie klasy: Animal (Zwierzę) i Dog (Pies), gdzie Dog dziedziczy po Animal.
        //Klasa Dog ma posiadać prywatne pole age, które nie posiada klasa Animal. Następnie
        //napisz statyczną metodę generyczną findMinMaxAge, która przyjmuje jako argument tablicę obiektów typu Dog oraz Pair<?super Dog> result. Metoda powinna ma zapisać
        //(jako obiekty typu Dog) najmniejszy i najmniejszy (pod kątem wieku) psa z tablicy w
        //drugim argumencie metody. Zrób to bezpośrednio bez używania interfejsów Comparable
        //czy Comparator
        public static void findMinMaxAge(Dog[] dogs, Pair<? super Dog> result){
            if(dogs == null || dogs.length == 0){
                throw new IllegalArgumentException("Tablica nie może być pusta.");
            }

            Dog minDog = dogs[0];
            Dog maxDog = dogs[0];

            for(Dog dog : dogs){
                if(dog.getAge() < minDog.getAge()){
                    minDog = dog;
                }
                if(dog.getAge() > maxDog.getAge()){
                    maxDog = dog;
                }
            }

            result.setFirst(minDog);
            result.setSecond(maxDog);
        }

        //Zadanie 29
        public static void findMinMaxHeight(Tree[] trees, Pair<? super Tree> result){
            if(trees == null || trees.length == 0){
                throw new IllegalArgumentException("Tablica nie może być pusta");
            }

            Tree minTree = trees[0];
            Tree maxTree = trees[0];

            for(Tree tree : trees){
                if(tree.compareTo(minTree) < 0){
                    minTree = tree;
                }
                if(tree.compareTo(maxTree) > 0){
                    maxTree = tree;
                }
            }

            result.setFirst(minTree);
            result.setSecond(maxTree);
        }

    public static void main(String[] args) {

        //Zadanie 1 - tworzenie objektów dowolnych typów
        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();
        Box<Double> box3 = new Box<>();

        box1.setObjekt("slowo");
        box2.setObjekt(1);
        box3.setObjekt(3.3);

        //Zadanie 2
        System.out.println(isEqual(box1.getObjekt(), box2.getObjekt()));
        System.out.println(isEqual(box1.getObjekt(), box3.getObjekt()));

        //Zadanie 3
        Counter<String> stringCounter = new Counter<>();

        stringCounter.add(box1.getObjekt());
        stringCounter.add("slowo_2");
        stringCounter.add("slowo_3");

        System.out.println(stringCounter.getCount());

        //Zadanie 4
        Triple<String, Integer, Double> triple = new Triple<>("Janek", 33, 5.5);

        System.out.println(triple.getFirst() + ", " + triple.getSecond() + ", " + triple.getThird());

        //Zadanie 12
        Integer[] intArray = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        String[] stringArray = new String[]{"A", "B", "C", "D", "G", "WŁODZIMIERZ"};

        System.out.println("\nTablica przed zamianą: ");
        printArray(intArray);
        swap(intArray, 2, 3);
        System.out.println("Tablica po zamianie: ");
        printArray(intArray);

        System.out.println("\nTablica przed zamianą: ");
        printArray(stringArray);
        swap(stringArray, 1, 5);
        System.out.println("Tablica po zamianie: ");
        printArray(stringArray);
        System.out.println();

        //Zadanie 14
        Integer[] intArray2 = new Integer[]{1, 2, 3, 15, 5, 6, 7};
        Double[] doubleArray = new Double[]{3.3, 9.5, 5.6};
        String[] stringArray2 = new String[]{"A", "B", "C", "D", "E", "A"};

        System.out.println("Min Integer: " + minValue(intArray2));
        System.out.println("Min Double: " + minValue(doubleArray));
        System.out.println("Max String: " + maxValue(stringArray2));

        Person[] persons = {
                new Person("Wiesław", 77),
                new Person("Brzęczyszczykiewicz", 19),
                new Person("Janisław", 22),
        };

        System.out.println("Min Person: " + minValue(persons));

        //Zadanie 15
        System.out.println("Max Integer: " + maxValue(intArray2));
        System.out.println("Max Double: " + maxValue(doubleArray));
        System.out.println("Max String: " + maxValue(stringArray2));

        Vehicle[] vehicles = {
                new Vehicle("Fiat Albea", 300),
                new Vehicle("BMW f32", 250),
                new Vehicle("Dodge Charger", 255),
        };

        System.out.println("Max Vehicle: " + maxValue(vehicles));

        //Zadanie 21
        Dog dog1 = new Dog("Shepard", 15);
        Dog dog2 = new Dog("Dachshund", 11);

        Dog olderDog = findMax(dog1, dog2);
        System.out.println("Oldest dog: " + olderDog);

        Animal animal1 = new Animal(11);
        Animal animal2 = new Animal(22);

        Animal olderAnimal = findMax(animal1, animal2);
        System.out.println("Oldest animal: " + olderAnimal);

        //Zadanie 22
        Car car1 = new Car("Fiat");
        Car car2 = new Car("KIA");

        ElectricCar electricCar1 = new ElectricCar("Ford", 50);
        ElectricCar electricCar2 = new ElectricCar("Skoda", 45);

        //Zadanie 23
        Animal animal3 = new Animal(3);
        Animal animal4 = new Animal(6);

        Pair<Animal> animalPair = new Pair<>(animal3, animal4);
        Animal olderAnimalZ23 = findMax(animalPair);

        System.out.println("Oldest animal: " + olderAnimalZ23);

        Dog dog3 = new Dog("Poodle", 2);
        Dog dog4 = new Dog("Labrador", 1);

        Pair<Dog> dogPair = new Pair<>(dog3, dog4);
        Dog olderDogZ23 = findMax(dogPair);

        System.out.println("Oldest dog: " + olderDogZ23);

        //Zadanie 24
        Triple<Bird, Bird, Bird> birds = new Triple<>(
                new Bird("Sparrow", 3),
                new Bird("Robin", 1),
                new Bird("Crow", 4)
        );

        Bird youngestBird = findMin(birds);
        System.out.println("Youngest bird: " + youngestBird);

        //Zadanie 28
        Dog[] dogs = {
                new Dog("Jamnnik", 5),
                new Dog("Doberman", 2),
                new Dog("Kangal", 6),
                new Dog("Malinos", 3)
        };

        Pair<Dog> result = new Pair<>();

        findMinMaxAge(dogs, result);

        System.out.println("Najmłodszy pies: " + result.getFirst());
        System.out.println("Najstarszy pies: " + result.getSecond());

        //Zadanie 29
        Tree[] trees = {
                new Tree("Oak", 15),
                new Tree("Pine", 11),
                new Tree("Maple", 2)
        };

        Pair<Tree> result1 = new Pair<>();

        findMinMaxHeight(trees, result1);

        System.out.println("Najniższe drzewo: " + result1.getFirst());
        System.out.println("Najwyższe drzewo: " + result1.getSecond());
    }
}