import java.awt.*;

public class Bitmap extends ComputerGraphic{

    @Override
    public void loadFile(){
        System.out.println("Załadowano plik.");
    }

    @Override
    public void saveFile(){
        System.out.println("Zapisano plik.");
    }
}
