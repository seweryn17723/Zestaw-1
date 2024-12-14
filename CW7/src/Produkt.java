import java.util.Objects;

public class Produkt {

    //Ustawienie pól
    private String nazwa;
    private double cena;

    //Konstruktor produktu
    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    //Gettery
    public String getNazwa() {
        return this.nazwa;
    }

    public double getCena() {
        return this.cena;
    }

    //Settery
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString(){
        return "Produkt: " + nazwa + ", cena: " + cena + " zł";
    }

    public String getClassName(){
        return "Cześć, jestem klasą " + this.getClass().getSimpleName();
    }

    // Nadpisanie metody hashCode
    @Override
    public int hashCode() {
        return Objects.hash(this.nazwa, this.cena);   //Tworzy hash na podstawie nazwa, cena
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produkt produkt = (Produkt) o;
        return Double.compare(produkt.cena, cena) == 0 &&
                Objects.equals(nazwa, produkt.nazwa);
    }

    //Metody equals i hashCode są kluczowymi elementami w języku
    // Java, które pozwalają na poprawne porównywanie obiektów oraz ich
    // efektywne przechowywanie w strukturach danych
}
