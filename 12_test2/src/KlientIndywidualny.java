class KlientIndywidualny extends Klient implements IKlient{
    private final String PESEL;

    // Konstruktor
    public KlientIndywidualny(String imie, String nazwisko, int wiek, String PESEL) {
        super(imie, nazwisko, wiek);
        // Walidacja długości PESEL
        if (PESEL.length() != 11) {
            throw new IllegalArgumentException("PESEL musi mieć dokładnie 11 cyfr.");
        }
        this.PESEL = PESEL;
    }

    // Getter
    public String getPESEL() {
        return PESEL;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "KlientIndywidualny{" +
                "imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", wiek=" + getWiek() +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }
}

interface IKlientIndywidualny extends IKlient {
    String getPESEL();

    // Metoda domyślna do sprawdzenia poprawności PESEL
    default boolean czyPoprawnyPESEL() {
        return getPESEL().length() == 11;
    }

    // Metoda domyślna do pobierania opisu klienta indywidualnego
    default String opisKlienta() {
        return "Klient indywidualny: " + getImie() + " " + getNazwisko() + ", PESEL: " + getPESEL();
    }
}