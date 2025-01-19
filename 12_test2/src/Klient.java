class Klient implements IKlient{
    private String imie;
    private String nazwisko;
    private int wiek;

    // Konstruktor
    public Klient(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    // Gettery
    @Override
    public String getImie() {
        return imie;
    }

    @Override
    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public int getWiek() {
        return wiek;
    }

    // Settery
    @Override
    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}

interface IKlient {
    String getImie();
    String getNazwisko();
    int getWiek();

    void setImie(String imie);
    void setNazwisko(String nazwisko);
    void setWiek(int wiek);

    // Metoda domyślna do sprawdzania, czy klient jest pełnoletni
    default boolean czyPelnoletni() {
        return getWiek() >= 18;
    }

    // Metoda domyślna do przedstawiania się klienta
    default String przedstawSie() {
        return "Cześć! Nazywam się " + getImie() + " " + getNazwisko() + ".";
    }
}