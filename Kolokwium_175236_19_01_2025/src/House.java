public class House extends Building{

    int numberOfRooms;
    public House(int height, String color, int numberOfRooms){
        super(height, color);
        this.numberOfRooms = numberOfRooms;
    }
}
