//// Klasa abstrakcyjna dla produktów spożywczych
//abstract class ProduktSpozywczy {
//    public abstract void smak();
//    public abstract void umyj();
//    public abstract void zjedz();
//}
//
//// Klasa Owoc dziedzicząca po ProduktSpozywczy
//class Owoc extends ProduktSpozywczy {
//    @Override
//    public void smak() {
//        System.out.println("Owoc jest słodki.");
//    }
//
//    @Override
//    public void umyj() {
//        System.out.println("Myję owoc.");
//    }
//
//    @Override
//    public void zjedz() {
//        System.out.println("Zjadam owoc.");
//    }
//}
//
//// Klasa Warzywo dziedzicząca po ProduktSpozywczy
//class Warzywo extends ProduktSpozywczy {
//    @Override
//    public void smak() {
//        System.out.println("Warzywo jest gorzkie.");
//    }
//
//    @Override
//    public void umyj() {
//        System.out.println("Myję warzywo.");
//    }
//
//    @Override
//    public void zjedz() {
//        System.out.println("Zjadam warzywo.");
//    }
//}
//
//// Klasa abstrakcyjna dla produktów przemysłowych
//abstract class ProduktPrzemyslowy {
//    public abstract void napraw();
//    public abstract void uzyj();
//    public abstract void zepsuj();
//    public abstract void wlacz();
//    public abstract void wylacz();
//}
//
//// Klasa UrzadzenieElektroniczne dziedzicząca po ProduktPrzemyslowy
//class UrzadzenieElektroniczne extends ProduktPrzemyslowy {
//    @Override
//    public void napraw() {
//        System.out.println("Naprawiam urządzenie elektroniczne.");
//    }
//
//    @Override
//    public void uzyj() {
//        System.out.println("Używam urządzenia elektronicznego.");
//    }
//
//    @Override
//    public void zepsuj() {
//        System.out.println("Urządzenie elektroniczne się zepsuło.");
//    }
//
//    @Override
//    public void wlacz() {
//        System.out.println("Włączam urządzenie elektroniczne.");
//    }
//
//    @Override
//    public void wylacz() {
//        System.out.println("Wyłączam urządzenie elektroniczne.");
//    }
//}
//
//// Klasa abstrakcyjna Ubranie
//abstract class Ubranie {
//    public abstract void wypierz();
//    public abstract void zaloz();
//    public abstract void wyprasuj();
//    public abstract void wysusz();
//    public abstract void zniszcz();
//}
//
//// Klasa KonkretneUbranie dziedzicząca po Ubranie
//class KonkretneUbranie extends Ubranie {
//    @Override
//    public void wypierz() {
//        System.out.println("Piorę ubranie.");
//    }
//
//    @Override
//    public void zaloz() {
//        System.out.println("Zakładam ubranie.");
//    }
//
//    @Override
//    public void wyprasuj() {
//        System.out.println("Prasuję ubranie.");
//    }
//
//    @Override
//    public void wysusz() {
//        System.out.println("Suszę ubranie.");
//    }
//
//    @Override
//    public void zniszcz() {
//        System.out.println("Zniszczyłem ubranie.");
//    }
//}
//
//// Klasa Main do testowania
//public class Main {
//    public static void main(String[] args) {
//        // Testowanie klasy Owoc
//        ProduktSpozywczy jabłko = new Owoc();
//        jabłko.smak();
//        jabłko.umyj();
//        jabłko.zjedz();
//
//        // Testowanie klasy Warzywo
//        ProduktSpozywczy marchewka = new Warzywo();
//        marchewka.smak();
//        marchewka.umyj();
//        marchewka.zjedz();
//
//        // Testowanie klasy UrzadzenieElektroniczne
//        ProduktPrzemyslowy laptop = new UrzadzenieElektroniczne();
//        laptop.napraw();
//        laptop.uzyj();
//        laptop.zepsuj();
//        laptop.wlacz();
//        laptop.wylacz();
//
//        // Testowanie klasy KonkretneUbranie
//        Ubranie koszula = new KonkretneUbranie();
//        koszula.wypierz();
//        koszula.zaloz();
//        koszula.wyprasuj();
//        koszula.wysusz();
//        koszula.zniszcz();
//    }
//}
