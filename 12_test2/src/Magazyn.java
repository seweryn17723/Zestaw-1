import java.util.*;

class Magazyn implements IMagazyn{
    private List<Produkt> listaProduktow;

    // Konstruktor
    public Magazyn() {
        this.listaProduktow = new ArrayList<>();
    }

    // Metoda do dodawania produktu do magazynu
    public void dodajProdukt(Produkt produkt) {
        if (produkt != null) {
            listaProduktow.add(produkt);
            System.out.println("Dodano produkt: " + produkt);
        } else {
            System.out.println("Nie można dodać pustego produktu.");
        }
    }

    // Metoda do usuwania produktu z magazynu
    public void usunProdukt(Produkt produkt) {
        if (listaProduktow.contains(produkt)) {
            listaProduktow.remove(produkt);
            System.out.println("Usunięto produkt: " + produkt);
        } else {
            System.out.println("Nie znaleziono produktu w magazynie.");
        }
    }

    // Metoda do wyświetlenia zawartości magazynu
    public void wyswietlMagazyn() {
        if (listaProduktow.isEmpty()) {
            System.out.println("Magazyn jest pusty.");
        } else {
            System.out.println("Zawartość magazynu:");
            for (Produkt produkt : listaProduktow) {
                System.out.println(produkt);
            }
        }
    }
}

interface IMagazyn {
    void dodajProdukt(Produkt produkt);
    void usunProdukt(Produkt produkt);
    void wyswietlMagazyn();
}