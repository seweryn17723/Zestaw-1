import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Klient {

    private String imie;
    private String nazwisko;
    private Map<Integer, Zamowienie> listaZamowien;
    private int numerZamowienia;
    private Adres adres;

    //Konstruktor Klienta
    public Klient(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new HashMap<>();
        this.numerZamowienia = 1;
        this.adres = adres;
    }

    //Dodawanie zamówienia do klienta
    public void dodajZamowienie(Zamowienie zamowienie){
        listaZamowien.put(numerZamowienia++, zamowienie);
    }

    public void obliczLacznyKosztZamowien(){
        double lacznaSumaZamowien = 0.0;

        for(Map.Entry<Integer, Zamowienie> entry : listaZamowien.entrySet()){
            lacznaSumaZamowien += entry.getValue().getKoszykZakupowy().obliczCalkowitaWartosc();
        }

        System.out.println("\nŁączna wartość zamówień klienta: " + imie + " " + nazwisko + " to: " + lacznaSumaZamowien + " zł\n");
    }

    //Wyświetlanie Historii zamówień i ich zawartości klienta
    public void wyswietlHistorieZamowien(){
        if(listaZamowien.isEmpty()){
            System.out.println("Klient " + imie + " " + nazwisko + " nie posiada zamówień.");
        }else{
            System.out.println("Historia zamówień klienta " + imie + " " + nazwisko + ": ");
            for(Map.Entry<Integer, Zamowienie> entry : listaZamowien.entrySet()){
                Integer numer = entry.getKey();
                Zamowienie zamowienie = entry.getValue();
                System.out.println("Numer zamówienia: " + numer);
                zamowienie.wyswietlZamowienie();
            }
        }
    }

    public void wyswietlAdresKlienta(){
        System.out.println("Adres klienta: " + imie + " " + nazwisko);
        adres.pokaz();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Dane klienta: \n");
        sb.append("Imię: ").append(imie).append("\n");
        sb.append("Nazwisko: ").append(nazwisko).append("\n");
        sb.append("Adres: ").append(adres.toString()).append("\n");

        if(listaZamowien.isEmpty()){
            sb.append("Brak zamówień.\n");
        }else{
            sb.append("Historia zamówień: \n");
            for(Map.Entry<Integer, Zamowienie> entry : listaZamowien.entrySet()){
                Integer numer = entry.getKey();
                Zamowienie zamowienie = entry.getValue();
                sb.append("Numer zamówienia: ").append(numer).append("\n");
                sb.append(zamowienie.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    public String getImie(){
        return imie;
    }

    public void setImie(String imie){
        if (imie == null || imie.trim().isEmpty()) {
            throw new IllegalArgumentException("Imię nie może być nullem ani puste.");
        }
        this.imie = imie;
    }

    public String getNazwisko(){

        return nazwisko;
    }

    public void setNazwisko(String nazwisko){
        if (nazwisko == null || nazwisko.trim().isEmpty()) {
            throw new IllegalArgumentException("Nazwisko nie może być nullem ani puste.");
        }
        this.nazwisko = nazwisko;
    }

    public Map<Integer, Zamowienie> getListaZamowien(){
        return listaZamowien;
    }

    public void setListaZamowien(Map<Integer, Zamowienie> listaZamowien){
        if (listaZamowien == null) {
            throw new IllegalArgumentException("Lista zamówień nie może być nullem.");
        }
        this.listaZamowien = listaZamowien;
    }

    public int getNumerZamowienia(){
        return numerZamowienia;
    }

    public void setNumerZamowienia(int numerZamowienia){
        if (numerZamowienia <= 0) {
            throw new IllegalArgumentException("Numer zamówienia musi być większy od zera.");
        }
        this.numerZamowienia = numerZamowienia;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        if (adres == null) {
            throw new IllegalArgumentException("Adres nie może być nullem.");
        }
        this.adres = adres;
    }

    @Override
    public int hashCode(){
        return Objects.hash(imie, nazwisko, adres);
    }

    public String getClassName(){
        return "Cześć, jestem klasą " + this.getClass().getSimpleName();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klient klient = (Klient) o;
        return Objects.equals(imie, klient.imie) &&
                Objects.equals(nazwisko, klient.nazwisko) &&
                Objects.equals(adres, klient.adres);
    }
}