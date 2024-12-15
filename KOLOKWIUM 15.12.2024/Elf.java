import java.util.Objects;

public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;

    public Elf(String imie, int wiek, String stanowisko){
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public void przedstawSie(){
        System.out.println("Cześć, nazywam się " + imie + ", mam " + wiek + " lat, " + "a moje stanowisko pracy to " + stanowisko + ".");
    }

    public String getImie(){
        return this.imie;
    }

    public void setImie(String imie){
        if(imie == null || imie.trim().isEmpty()){
            throw new IllegalArgumentException("Imie nie może być puste");
        }
        this.imie = imie;
    }

    public int getWiek(){
        return this.wiek;
    }

    public void setWiek(int wiek){
        if(wiek <= 0) {
            throw new IllegalArgumentException("Wiek jest niepoprawny.");
        }
        this.wiek = wiek;
    }

    public String getStanowisko(){
        return this.stanowisko;
    }

    public void setStanowisko(String stanowisko){
        if(stanowisko == null || stanowisko.trim().isEmpty()){
            throw new IllegalArgumentException("Stanowisko nie może być puste.");
        }
        this.stanowisko = stanowisko;
    }

    @Override
    public String toString(){
        return "Elf: " + imie + ", lat: " + wiek + ", stanowisko: " + stanowisko;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.imie + this.wiek + this.stanowisko);
    }
}
