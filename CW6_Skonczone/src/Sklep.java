import java.util.HashMap;
import java.util.Map;

public class Sklep {
    private Map<String, Produkt> produkty;

    //Konstruktor
    public Sklep() {
        this.produkty = new HashMap<>();
    }

    //Metoda do dodawania produktów do oferty sklepu
    public void dodajProdukt(Produkt produkt) {
        produkty.put(produkt.getNazwa(), produkt);
    }

    //Metoda do wyświetlania dostępnych produktów w sklepie
    public void wyswietlOferte(){
        if(produkty.isEmpty()){
            System.out.println("Aktualnie oferta sklepowa jest pusta.");
        }else{
            System.out.println("Oferta sklepu: ");
            for(Produkt produkt : produkty.values()){
                System.out.println(produkt.wyswietlInformacje());
            }
        }
    }

    //Metoda do wyszukiwania produktu
    public Produkt wyszukajProduktu(String nazwa){
        if(produkty.containsKey(nazwa)){
            return produkty.get(nazwa);
        }else{
            System.out.println("Produktu o nazwie " + nazwa + " nie jest dostępny w sklepie.");
            return null;
        }
    }

    //Metoda do dodania wskazanego produktu i podanej ilości do koszyka klienta i usunięcia odpowiedniej liczby z magazynu
    public void zakupy(KoszykZakupowy koszyk, String nazwaProduktu, int ilosc){
        Produkt produkt = wyszukajProduktu(nazwaProduktu);
        if(produkt != null){
            koszyk.dodajProdukt(produkt, ilosc);
        }
    }
}
