import java.util.HashMap;
import java.util.Map;

public class KoszykZakupowy {

    private Map<Produkt, Integer> produkty;

    //Konstruktor koszyka zakupowego
    public KoszykZakupowy() {
        this.produkty = new HashMap<>();
    }

    //Dodanie produktu do koszyka i usunięcie go z magazynu
    public void dodajProdukt(Produkt produkt, int ilosc, Magazyn magazyn) {
        if(ilosc <= magazyn.getIloscProduktuZMagazynu(produkt)){
            if(produkty.containsKey(produkt)){
                produkty.put(produkt, produkty.get(produkt) + ilosc);
            }else{
                produkty.put(produkt, ilosc);
            }
            magazyn.usunZMagazynu(produkt, ilosc);
        }else{
            System.out.print("Nie można dodać tylu produktów do koszyka, nie wystarczająca ilość na magazynie!\n");
        }
    }

    public double obliczCalkowitaWartosc(){
        double suma = 0.0;

        for(Map.Entry<Produkt, Integer> entry : produkty.entrySet()){
            Produkt produkt = entry.getKey();
            int ilosc = entry.getValue();

            suma += produkt.getCena() * ilosc;
        }

        return suma;
    }

    public void wyswietlZawartoscKoszyka(){
        if(produkty.isEmpty()){
            System.out.println("Koszyk jest pusty.");
        }else{
            System.out.println("Zawartość koszyka: ");
            for(Map.Entry<Produkt, Integer> entry : produkty.entrySet()){
                Produkt produkt = entry.getKey();
                int ilosc = entry.getValue();
                System.out.println("Produkt : " + produkt.getNazwa() + ", Ilość w koszyku: " + ilosc);
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Produkt, Integer> entry : produkty.entrySet()){
            sb.append(entry.getKey().getNazwa() + ", " + entry.getValue() + ", ");
        }
        return sb.toString();
    }

    public String getClassName(){
        return "Cześć, jestem klasą " + this.getClass().getSimpleName();
    }

    public Map<Produkt, Integer> getProdukty() {
        return produkty;
    }

    public void setProdukty(Map<Produkt, Integer> produkty) {
        this.produkty = produkty;
    }
}
