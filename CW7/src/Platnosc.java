import java.util.Objects;

public class Platnosc {
    private double kwota;
    private String statusPlatnosci;

    //Konstruktor
    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone";
    }

    public void zaplac(){
        this.statusPlatnosci = "Opłacone";
        this.kwota = 0.0;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota){
        this.kwota = kwota;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    public void setStatusPlatnosci(String statusPlatnosci) {
        this.statusPlatnosci = statusPlatnosci;
    }

    public String getClassName(){
        return "Cześć, jestem klasą " + this.getClass().getSimpleName();
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.kwota, this.statusPlatnosci);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Platnosc platnosc = (Platnosc) o;
        return Double.compare(platnosc.kwota, kwota) == 0 &&
                Objects.equals(statusPlatnosci, platnosc.statusPlatnosci);
    }
}
