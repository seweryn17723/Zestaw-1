//Zadanie 29

//Stwórz klasę generyczną Pair<T>, która przechowuje dwa obiekty tego samego typu.
//Następnie utwórz dwie klasy: Plant i Tree, gdzie Tree dziedziczy po Plant. Klasa Tree
//powinna posiadać prywatne pole height, którego nie posiada klasa Plant. Następnie
//napisz statyczną metodę generyczną findMinMaxHeight, która przyjmuje jako argument
//tablicę obiektów typu Tree oraz Pair<? super Tree> result. Metoda powinna zapisać
//(jako obiekty typu Tree) najniższe i najwyższe (pod kątem wysokości) drzewo z tablicy
//w drugim argumencie metody. Wykorzystaj też generyczny interfejs Comparable.

// Klasa Tree, która dziedziczy po Plant i implementuje Comparable<Tree>
class Tree extends Plant implements Comparable<Tree> {
    private int height;

    public Tree(String name, int height){
        super(name);
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    @Override
    public int compareTo(Tree other) {
        return Integer.compare(height, other.height);
    }

    @Override
    public String toString(){
        return "Tree [name = " + getName() + ", height = " + height + "]";
    }
}
