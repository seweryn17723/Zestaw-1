class Osoba extends Klient {
    // Konstruktor
    public Osoba(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
    }

    // Nadpisanie metody z interfejsu
    @Override
    public String przedstawSie() {
        return "Cześć, nazywam się " + getImie() + " " + getNazwisko() + " i mam " + getWiek() + " lat.";
    }
}

