public class Main {
    public static void main(String[] args) {

        //Zadanie 1
        System.out.println("Zadanie 1 \n");

        //Utworzenie obiektu/instancji, klasy Produkt
        Produkt Denaturat = new Produkt("Denaturat", 8.5, 7);
        Produkt Chleb = new Produkt("Chleb", 4.5, 7);

        //Wyświetlenie informacji o produkcie
        System.out.println("Inicjalizacja produktu: Denaturat.");
        System.out.println(Denaturat.wyswietlInformacje());

        //Dodanie butelek denaturatu do magazynu
        Denaturat.dodajDoMagazynu(15);
        System.out.println("\nDodanie 15 butelek denaturatu.");

        //Sprawdzenie informacji o produkcie po dodanu 15 flaszek denaturatu
        System.out.println(Denaturat.wyswietlInformacje());

        //Usunięcie 10 butelek denaturatu z magazynu
        Denaturat.usunZMagazynu(10);
        System.out.println("\nUsunięcie 15 butelek denaturatu.");

        //Wyświetlenie informacji po usunięciu 10 butelek denaturatu
        System.out.println(Denaturat.wyswietlInformacje());

        //Zadanie 2
        System.out.println("\nZadanie 2 \n");

        KoszykZakupowy koszyk = new KoszykZakupowy();

        System.out.println("Dodajemy do koszyka 6 butelek denaturatu i 2 bochenki chleba.");
        koszyk.dodajProdukt(Denaturat, 6);
        koszyk.dodajProdukt(Chleb, 2);

        //Wyświetlenie zawartości koszyka
        koszyk.wyswietlZawartoscKoszyka();

        //Obliczenie ceny produktów z koszyka
        System.out.println("Całkowita wartość koszyka: " + koszyk.obliczCalkowitaWartosc() + " zł");

        //Zadanie 3
        System.out.println("\nZadanie 3\n");

        //Część z zadania 6
        Platnosc platnosc = new Platnosc(koszyk.obliczCalkowitaWartosc());

        //inicjalizacja zamowienia z utworzonym koszykiem, przypisanie statusu zamowienia
        Zamowienie zamowienie = new Zamowienie(koszyk, "przyjęte do realizacji", platnosc);

        //Wyświetlenie zamówienia
        System.out.println("Wyświetlenie utworzonego zamówienia:");
        zamowienie.wyswietlZamowienie();

        //Zmiana statusu zamówienia
        zamowienie.ustawStatus("oczekiwanie na dostawę");

        //Wyświetlenie zamówienia po zmianie statusu
        System.out.println("\nZamówienie po zmianie statusu:");
        zamowienie.wyswietlZamowienie();

        //Zadanie 4
        System.out.println("\nZadanie 4\n");

        Klient klient = new Klient("Zbigniew", "Półtorak");

        klient.dodajZamowienie(zamowienie);

        klient.wyswietlHistorieZamowien();

        //Łączny koszt zamówień klienta
        klient.obliczLacznyKosztZamowien();

        //Zadanie 5
        System.out.println("\nZadanie 5\n");

        //Inicjalizacja nowej instancji/obiektu sklep.
        Sklep sklep = new Sklep();

        //Dodanie do sklepu produktów
        sklep.dodajProdukt(Denaturat);
        sklep.dodajProdukt(Chleb);

        //Wyświetlenie oferty sklepowej
        sklep.wyswietlOferte();

        //Wyszukanie produktu
        System.out.println("\nWyszukiwanie produktu: Denaturat. ");
        Produkt znalezionyProdukt = sklep.wyszukajProduktu("Denaturat");
        if(znalezionyProdukt != null) {
            System.out.println("Znaleziony produkt " + znalezionyProdukt);
        }

        //Dodanie produktów z oferty sklepowej do koszyka klienta
        sklep.zakupy(koszyk, "Denaturat", 2);

        //Wyświetlenie koszyka klienta po dodaniu produktów ze sklepu
        System.out.println("\nZawartość koszyka klienta po dodaniu dwóch butelek denaturatu z oferty sklepowej.");
        zamowienie.wyswietlZamowienie();

        //Zadanie 6
        System.out.println("\nZadanie 6\n");

        //Opłacenie zamówienia
        System.out.println("Opłacenie zamówienia");
        platnosc.zaplac();
        //Finalizacja zamówienia, sprawdza czy jest opłacone. Jeśli tak, to ustawia status zamówienia na "gotowe do wysyłki"
        zamowienie.finalizujZamowienie();

        //Wyświetlenie danych zamówienia po płatności
        zamowienie.wyswietlZamowienie();
    }
}