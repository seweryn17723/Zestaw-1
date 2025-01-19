abstract class Owoc extends ProduktSpozywczy {
    // Pola klasy Owoc
    private String nazwa;       // Nazwa owocu
    private double waga;        // Waga owocu
    private String kategoria;   // Kategoria owocu (np. cytrusy, jagody)

    // Metoda abstrakcyjna smak
    public abstract String smak();

    // Metoda abstrakcyjna umyj
    public abstract void umyj();

    // Metoda abstrakcyjna zjedz
    public abstract void zjedz();

    // Konstruktor
    public Owoc(String nazwa, double waga, String kategoria) {
        this.nazwa = nazwa;
        this.waga = waga;
        this.kategoria = kategoria;
    }

    // Gettery i Settery dla pól
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public void zapakuj() {
        System.out.println("Owoc zapakowany w folię");
    }

    @Override
    public void spozyj() {
        System.out.println("Owoc został zjedzony");
    }

    @Override
    public void przechowuj() {
        System.out.println("Owoc przechowywany w lodówce");
    }
}
