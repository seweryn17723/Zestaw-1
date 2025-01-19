public class Main {

    public static void main(String[] args) {

        //Zadanie 1
        Magazyn magazyn = new Magazyn();

        // Tworzenie produktów
        Produkt produkt1 = new Produkt("Jabłko", 1.5);
        Produkt produkt2 = new Produkt("Marchewka", 0.8);
        Produkt produkt3 = new Produkt("Chleb", 3.2);

        // Dodawanie produktów do magazynu
        magazyn.dodajProdukt(produkt1);
        magazyn.dodajProdukt(produkt2);
        magazyn.dodajProdukt(produkt3);

        // Wyświetlanie magazynu
        magazyn.wyswietlMagazyn();

        // Usuwanie produktu
        magazyn.usunProdukt(produkt2);

        // Wyświetlanie magazynu po usunięciu
        magazyn.wyswietlMagazyn();

        // Próba usunięcia produktu, którego nie ma
        magazyn.usunProdukt(produkt2);

        //Zadanie 2

        Klient klient = new Klient("Jan", "Kowalski", 35);
        System.out.println(klient);

        // Tworzenie obiektu Osoba
        Osoba osoba = new Osoba("Anna", "Nowak", 28);
        osoba.przedstawSie();
        System.out.println(osoba);

        //Zadanie 3

        // Tworzenie klienta firmowego
        KlientFirmowy firma = new KlientFirmowy("Jan", "Kowalski", 40, "1234567890", "987654321");
        System.out.println(firma);

        // Tworzenie klienta indywidualnego
        KlientIndywidualny czlowiek = new KlientIndywidualny("Anna", "Nowak", 30, "95040356789");
        System.out.println(czlowiek);

        // Próba błędnego NIP
        try {
            KlientFirmowy firmaNiepoprawna = new KlientFirmowy("Piotr", "Zalewski", 50, "12345678", "987654321");
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }

        //Zadanie 4
//        KlientFirmowy firma1 = new KlientFirmowy("Jan", "Kowalski", 45, "1234567890", "987654321");
//        System.out.println(firma1.opisFirmy());
//        System.out.println("Czy poprawny NIP? " + firma1.czyPoprawnyNIP());
//        System.out.println("Czy poprawny REGON? " + firma1.czyPoprawnyREGON());
//
//        IKlientIndywidualny osoba1 = new KlientIndywidualny("Anna", "Nowak", 29, "12345678901");
//        System.out.println(osoba1.opisKlienta());
//        System.out.println("Czy pełnoletni? " + osoba1.czyPelnoletni());
//        System.out.println("Czy poprawny PESEL? " + osoba1.czyPoprawnyPESEL());


        //Zadanie 6; Klasy: Owoc, Jablko, Pomidor, Warzywo
        System.out.println("\nZadanie 6\n");

        Jablko mojeJablko = new Jablko();
        System.out.println(mojeJablko.smak());
        mojeJablko.umyj();
        mojeJablko.zjedz();

        //Zadanie 7; Klasy: Laptop, Koszula, UrzadzenieElektroniczne, Ubrania
        System.out.println("\nZadanie 7\n");

        UrzadzenieElektroniczne mojLaptop = new Laptop();

        mojLaptop.wlacz();
        mojLaptop.zepsuj();
        mojLaptop.napraw();
        mojLaptop.wlacz();
        mojLaptop.uzyj();
        mojLaptop.wylacz();

        //Zadanie

        // Utworzenie obiektu klasy Owoc
        Owoc apple = new Jablko("Jabłko", "Czerwony", 0.2);
        apple.zapakuj();
        apple.przechowuj();
        apple.smak();
        apple.umyj();
        apple.zjedz();

        // Utworzenie obiektu klasy Warzywo
        Warzywo marchew = new Marchew("Marchewka", "Pomarańczowy", 0.1);
        marchew.zapakuj();
        marchew.przechowuj();
        marchew.smak();
        marchew.umyj();
        marchew.zjedz();

        // Utworzenie obiektu klasy Ubrania
        Ubrania koszula = new Koszula("L", "Bawełna", "Biały");
        koszula.wypierz();
        koszula.zaloz();
        koszula.wyprasuj();
        koszula.wysusz();
        koszula.zniszcz();

        // Utworzenie obiektu klasy UrządzenieElektroniczne
        UrzadzenieElektroniczne laptop = new Laptop("Dell", "XPS 15", 65.0);
        laptop.napraw();
        laptop.uzyj();
        laptop.wlacz();
        laptop.wylacz();
    }
    }
}
