import java.util.HashMap;
import java.util.Map;

public class Magazyn {
    private Map<Produkt, Integer> produkty;

    //Konstruktor
    public Magazyn(){
        this.produkty = new HashMap<>();
    }

    //Metoda do dodawania produktów do magazynu
    public void dodajProdukt(Produkt produkt, int ilosc){
        if(produkty.containsKey(produkt)){
            produkty.put(produkt, produkty.get(produkt) + ilosc);
        }else{
            produkty.put(produkt, ilosc);
        }
    }

    //Metoda do usuwania produktów z magazynu
    public void usunZMagazynu(Produkt produkt, int ilosc){
        if(produkty.containsKey(produkt)){
            int aktualnaIlosc = produkty.get(produkt);
            if(aktualnaIlosc >= ilosc){
                produkty.put(produkt, aktualnaIlosc - ilosc);
            }else{
                System.out.println("Nie ma wystarczającej ilości produktu " + produkt.getNazwa() + " w magazynie.");
            }
        }
    }

    //Metoda do wyświetlania stanu magazynu
    public void wyswietlMagazyn(){
        if(produkty.isEmpty()){
            System.out.println("Magazyn jest pusty");
        }else{
            System.out.println("Stan magazynu: ");
            for(Map.Entry<Produkt, Integer> entry : produkty.entrySet()){
                Produkt produkt = entry.getKey();
                int ilosc = entry.getValue();
                System.out.println("Produkt: " + produkt + ", Ilość: " + ilosc);
            }
        }
    }

    public String toString(){
        return produkty.toString();
    }

    public String getClassName(){
        return "Cześć, jestem klasą " + this.getClass().getSimpleName();
    }

    //Metoda do pobrania ilości produktu z magazynu
    public int getIloscProduktuZMagazynu(Produkt produkt){
        return produkty.getOrDefault(produkt, 0);
    }

    public void setProdukty(Map<Produkt, Integer> produkty){
        this.produkty = produkty;
    }
}
