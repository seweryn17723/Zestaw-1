import java.util.HashMap;
import java.util.Map;

public class KoszykZakupowy {
    //Deklaracja HashMapy, można sprawnie wyszukać produkty, zliczyć ich ilość, działa na zasadzie słownika Key:Values
    //Produkt - jest kluczem w tej mapie, jest to poprzednia klasa Produkt, Integer - wartosc typu int, w tym przypadku ilosc produktów
    private Map<Produkt, Integer> produkty;

    //Konstruktor koszyka z zakupami
    public KoszykZakupowy() {
        this.produkty = new HashMap<>();
    }

    //Metoda dodająca produkt do koszyka
    public void dodajProdukt(Produkt produkt, int ilosc){
        if(produkt.getIloscNaMagazynie() >= ilosc){     //jeśli ilość produktu jest dostępna na magazynie yo:
            if(produkty.containsKey(produkt)){          //jeśli produkt jest w koszyku
                //put dodaje nowy klucz do mapy (produkt, pordukty,get(produkt) - ilosc)
                produkty.put(produkt, produkty.get(produkt) + ilosc);   //aktualizujemy ilość produktu w koszyku
            }else{
                //dodanie produktu do koszyka, jesli nie ma go jeszcze w koszyku
                produkty.put(produkt, ilosc);
            }
            //usuwa dana ilosc produktu z magazynu po dodaniu do koszyka
            produkt.usunZMagazynu(ilosc);
        }else{
            System.out.println("Brak wystarczającej ilości produktu w magazynie!");
        }
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

    public double obliczCalkowitaWartosc(){
        double suma = 0.0;

        for(Map.Entry<Produkt, Integer> entry : produkty.entrySet()){
            Produkt produkt = entry.getKey();
            int ilosc = entry.getValue();

            suma += produkt.getCena() * ilosc;
        }

        return suma;
    }

    public Map<Produkt, Integer> getProdukty() {
        return produkty;
    }
}
