import java.util.HashMap;
import java.util.Map;

public class Klient {
    private String imie;
    private String nazwisko;
    private Map<Integer, Zamowienie> listaZamowien;
    private int numerZamowienia;

    //Konstruktor Klienta
    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = new HashMap<>();
        this.numerZamowienia = 1;
    }

    //Dodawanie zamówienia do klienta
    public void dodajZamowienie(Zamowienie zamowienie){
        listaZamowien.put(numerZamowienia++, zamowienie);
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

    public void obliczLacznyKosztZamowien(){
        double lacznaSumaZamowien = 0.0;

        for(Map.Entry<Integer, Zamowienie> entry : listaZamowien.entrySet()){
            lacznaSumaZamowien += entry.getValue().getKoszykZakupowy().obliczCalkowitaWartosc();
        }

        System.out.println("Łączna wartość zamówień klienta: " + imie + " " + nazwisko + " to: " + lacznaSumaZamowien + " zł");
    }
}