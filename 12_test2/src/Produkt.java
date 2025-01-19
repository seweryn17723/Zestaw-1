class Produkt implements IProdukt{
    private String nazwa;
    private double cena;

    // Konstruktor
    public Produkt(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    // Gettery
    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    // Setter dla nazwy
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    // Setter dla ceny
    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}

interface IProdukt {
    String getNazwa();
    double getCena();
    void setNazwa(String nazwa);
    void setCena(double cena);
}