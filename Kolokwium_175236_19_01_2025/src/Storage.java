public class Storage<T> {
    public T obiekt;

    public Storage(T obiekt){
        this.obiekt = obiekt;
    }

    public void store(T item){
        this.obiekt = item;
    }

    public T retrive(){
        return obiekt;
    }

}
