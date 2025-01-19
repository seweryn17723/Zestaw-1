class KlientFirmowy extends Klient implements IKlientFirmowy{
    private String NIP;
    private String REGON;

    // Konstruktor
    public KlientFirmowy(String imie, String nazwisko, int wiek, String NIP, String REGON) {
        super(imie, nazwisko, wiek);
        // Walidacja długości NIP i REGON
        if (NIP.length() != 10) {
            throw new IllegalArgumentException("NIP musi mieć dokładnie 10 cyfr.");
        }
        if (REGON.length() != 9) {
            throw new IllegalArgumentException("REGON musi mieć dokładnie 9 cyfr.");
        }
        this.NIP = NIP;
        this.REGON = REGON;
    }

    // Gettery
    @Override
    public String getNIP() {
        return NIP;
    }

    @Override
    public String getREGON() {
        return REGON;
    }

    // Settery
    @Override
    public void setNIP(String NIP) {
        if (NIP.length() != 10) {
            throw new IllegalArgumentException("NIP musi mieć dokładnie 10 cyfr.");
        }
        this.NIP = NIP;
    }

    @Override
    public void setREGON(String REGON) {
        if (REGON.length() != 9) {
            throw new IllegalArgumentException("REGON musi mieć dokładnie 9 cyfr.");
        }
        this.REGON = REGON;
    }

    // Metoda toString
    @Override
    public String toString() {
        return "KlientFirmowy{" +
                "imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", wiek=" + getWiek() +
                ", NIP='" + NIP + '\'' +
                ", REGON='" + REGON + '\'' +
                '}';
    }
}

interface IKlientFirmowy extends IKlient {
    String getNIP();
    String getREGON();

    void setNIP(String nip);
    void setREGON(String regon);

    // Metoda domyślna do sprawdzenia poprawności NIP
    default boolean czyPoprawnyNIP() {
        return getNIP().length() == 10;
    }

    // Metoda domyślna do sprawdzenia poprawności REGON
    default boolean czyPoprawnyREGON() {
        return getREGON().length() == 9;
    }

    // Metoda domyślna do pobierania opisu firmy
    default String opisFirmy() {
        return "Firma: " + getImie() + " " + getNazwisko() + ", NIP: " + getNIP() + ", REGON: " + getREGON();
    }
}