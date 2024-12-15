import java.util.Objects;

public class Renifer {
    private String imie;
    private int predkosc;

    public Renifer(String imie, int predkosc){
        this.imie = imie;
        this.predkosc = predkosc;
    }

    public void nakarmRenifera(){
        this.predkosc += 5;
    }

    @Override
    public String toString(){
        return "Renifer: " + imie + ", prędkość: " + predkosc;
    }

    public int getPredkosc(){
        return this.predkosc;
    }

    public void setPredkosc(int predkosc){
        if(predkosc <= 0){
            throw new IllegalArgumentException("Prędkosć jest niepoprawna.");
        }
        this.predkosc = predkosc;
    }

    public String getImie(){
        return this.imie;
    }

    public void setImie(String imie){
        if(imie == null){
            throw new IllegalArgumentException("Imie nie może być puste");
        }
        this.imie = imie;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.imie + this.predkosc);
    }
}
