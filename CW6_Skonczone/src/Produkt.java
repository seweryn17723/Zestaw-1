public class Produkt {

    //Ustawienie pól
    String nazwa;
    double cena;
    int iloscNaMagazynie;

    //Konstruktor produktu
    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    //Metoda do wyświetlania danych o produkcie
    public String wyswietlInformacje(){
        return "Nazwa produktu: " + nazwa + ", Cena: " + cena + " zł, Ilość " + iloscNaMagazynie;
    }

    //Metoda do dodawania produktu na magazyn
    public void dodajDoMagazynu(int ilosc){
        this.iloscNaMagazynie += ilosc;
    }

    public void usunZMagazynu(int ileUsunac){
        if(this.iloscNaMagazynie >= ileUsunac){
            this.iloscNaMagazynie -= ileUsunac;
        }else{
            System.out.println("Nie można usunąć tylu produktów, na magazynie nie ma takiej ilości produktów!");
        }
    }

    //Metoda umożliwająca dostęp do wartości innym klasom
    public String getNazwa() {
        return this.nazwa;
    }

    //Metoda umożliwająca dostęp do wartości innym klasom
    public double getCena() {
        return this.cena;
    }

    //Metoda umożliwająca dostęp do wartości innym klasom
    public int getIloscNaMagazynie() {
        return this.iloscNaMagazynie;
    }

    @Override
    public String toString(){
        return "Produkt: " + nazwa + ", cena: " + cena + ", ilość na magazynie: " + iloscNaMagazynie;
    }
}
