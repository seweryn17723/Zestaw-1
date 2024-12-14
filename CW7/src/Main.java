import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //Utworzenie magazynu sklepu
        Magazyn magazynSklepu = new Magazyn();

        //Utworzenie produktów
        Produkt Denaturat = new Produkt("Denaturat", 9.5);
        Produkt Chleb = new Produkt("Chleb", 4.5);
        Produkt WitaminaC = new Produkt("WitaminaC", 7);

        //Wyświetlenie produktów
        System.out.println(Denaturat.toString());
        System.out.println(Chleb.toString());
        System.out.println(WitaminaC.toString());

        //Dodanie produktów do magazynu
        magazynSklepu.dodajProdukt(Denaturat, 15);
        magazynSklepu.dodajProdukt(Chleb, 7);
        magazynSklepu.dodajProdukt(WitaminaC, 13);


        //Wyświetlenie stanu magazynu sklepu po dodaniu do niego produktów
        System.out.println();
        magazynSklepu.wyswietlMagazyn();

        //Usunięcie 5 butelek Denaturatu ze sklepu
        System.out.println("\nUsunięcie 5 butelek denaturatu z magazynu.");
        magazynSklepu.usunZMagazynu(Denaturat, 5);

        //Wyświetlenie stanu magazynu po zmianie
        System.out.println();
        magazynSklepu.wyswietlMagazyn();

        //Utworzenie koszyka zakupowego
        KoszykZakupowy koszykZakupowy = new KoszykZakupowy();

        System.out.println("\nDodanie 5 butelek denaturatu do koszyka.");
        koszykZakupowy.dodajProdukt(Denaturat, 5, magazynSklepu);

        System.out.println();
        koszykZakupowy.wyswietlZawartoscKoszyka();

        System.out.println("\nWartość koszyka jest równa: " + koszykZakupowy.obliczCalkowitaWartosc() + " zł.\n");

        //Utworzenie płatności dla zamówienia na podstawie obliczenia wartości koszyka
        Platnosc platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());

        //Utworzenie zamówienia na podstawie koszyka i obliczonej kwoty do zapłaty
        Zamowienie zamowienie = new Zamowienie(koszykZakupowy, "W trakcie", platnosc);

        //Wyświetlenie zamówienia
        zamowienie.wyswietlZamowienie();

        //Zmiana statusu zamówienia
        zamowienie.ustawStatus("W oczekiwaniu");

        //Zwrot jednej butelki denaturatu
        System.out.println("\nZwrot jednej butelki denaturatu do magazynu.\n");
        zamowienie.zwrocProdukt(Denaturat, 1, magazynSklepu);

        //Wyświetlenie zamówienia po zwrocie butelki denaturatu
        zamowienie.wyswietlZamowienie();

        //Opłacenie i finalizowanie zamówienia
        platnosc.zaplac();
        zamowienie.finalizujZamowienie();

        //Wyświetlenie zamówienia po wykonanej płatności
        System.out.println("\nOpłacenie i finalizowanie zamówienia, status po opłaceniu: \n");
        zamowienie.wyswietlZamowienie();

        //Zainicjalizowanie adresu
        Adres adres = new Adres("Jana pawła II", 21, 37, "Wadowice", "11041");

        //Wyświetlenie adresu
        System.out.println();
        adres.pokaz();

        //Utworzenie klienta
        Klient klient = new Klient("Bronisław", "Matejko", adres);

        //Wyświetlenie adresu klienta
        System.out.println();
        klient.wyswietlAdresKlienta();

        //Dodanie zamówienia do klienta
        klient.dodajZamowienie(zamowienie);

        //Historia zamówień klienta
        System.out.println();
        klient.wyswietlHistorieZamowien();

        //Obliczenie łącznego kosztu zamówień klienta
        klient.obliczLacznyKosztZamowien();

        Sklep sklep = new Sklep(magazynSklepu, "Sklep u Zbyszka", "2024-12-07");

        //Dodanie produktów do sklepu
        sklep.dodajProdukt(Denaturat);
        sklep.dodajProdukt(Chleb);
        sklep.dodajProdukt(WitaminaC);

        //Wyświetlenie oferty sklepu, ?????????????????? a ilość
        sklep.wyswietlOferte();

        //Wyszukiwanie produktu w ofercie sklepu
        System.out.println("\nWyszukiwany produkt w ofercie sklepu: " + sklep.wyszukajProduktu("Denaturat") + "\n");

        KoszykZakupowy nowyKoszyk = new KoszykZakupowy();

        //Dodanie do koszyka witaminy C z oferty sklepu, usunięcie witaminy C ze sklepu
        sklep.zakupy(nowyKoszyk, "WitaminaC", 1);

        //Wyświetlenie zawartości koszyka po dodaniu witaminy C z oferty sklepowej do koszyka
        nowyKoszyk.wyswietlZawartoscKoszyka();

        System.out.println("\ntoString -> KoszykZakupowy");
        System.out.println(koszykZakupowy.toString());

        System.out.println("\ntoString -> Zamowienie");
        System.out.println(zamowienie.toString());

        System.out.println("\ntoString -> Magazyn");
        System.out.println(magazynSklepu.toString());

        System.out.println("\ntoString -> adres");
        System.out.println(adres.toString());

        System.out.println("\ntoString -> Klient(Historia zamówień");
        System.out.println(klient.toString());

        System.out.println("toString -> Sklep(Oferta sklepu)");
        System.out.println(sklep.toString());

        //Nadpisany getClass, nie można nadpisać, ponieważ metoda getClass() jest oznaczona jako final w klasie Object
        System.out.println(Denaturat.getClassName());
        System.out.println(koszykZakupowy.getClassName());
        System.out.println(zamowienie.getClassName());
        System.out.println(sklep.getClassName());
        System.out.println(klient.getClassName());
        System.out.println(platnosc.getClassName());
        System.out.println(magazynSklepu.getClassName());
        System.out.println(adres.getClassName());

        System.out.println("\nHashCode produktu Denaturat: "  + Denaturat.hashCode());
        System.out.println("\nHashCode płatności i statusu płatności: " + platnosc.hashCode());
        System.out.println("\nHashCode imienia, nazwiska, adresu Klienta: "  + klient.hashCode());

        System.out.println();
        Produkt Mandarynka = new Produkt("Mandarynka", 3.4);

        Mandarynka.setNazwa("Pomarańcza");
        Mandarynka.setCena(1.4);

        System.out.println("Użycie settera, na produkcie: Mandarynka -> " + Mandarynka.toString());

        System.out.println();
        Magazyn nowyMagazyn1 = new Magazyn();

        nowyMagazyn1.dodajProdukt(Mandarynka, 15);

        Map<Produkt, Integer> nowaMapa = new HashMap<>();
        Produkt Cytryna = new Produkt("Cytryna", 2.0);
        nowaMapa.put(Cytryna, 5);

        System.out.println("Użycie settera na nowyMagazyn, w którym jest Pomarańcza, zmieniamy na Cytrynę -> ");
        nowyMagazyn1.setProdukty(nowaMapa);

        System.out.println(nowyMagazyn1.toString());

        System.out.println();
        System.out.println("Zawartość koszykZakupowy");
        koszykZakupowy.wyswietlZawartoscKoszyka();

        KoszykZakupowy nowyKoszyk1 = new KoszykZakupowy();
        nowyKoszyk1.setProdukty(new HashMap<>(koszykZakupowy.getProdukty()));

        //Zawartość nowego koszyka, po ustawieniu setterem
        System.out.println("Zawartość nowyKoszyk1, po ustawieniu setterem");
        nowyKoszyk1.wyswietlZawartoscKoszyka();

        System.out.println();

    }
}