abstract class Warzywo extends ProduktSpozywczy {
    // Pola
    private String nazwa;
    private String kolor;
    private double waga;

    // Metoda abstrakcyjna smak
    public abstract String smak();

    // Metoda abstrakcyjna umyj
    public abstract void umyj();

    // Metoda abstrakcyjna zjedz
    public abstract void zjedz();

    @Override
    public void zapakuj() {
        System.out.println("Warzywo zapakowane w plastikowy pojemnik.");
    }

    @Override
    public void spozyj() {
        System.out.println("Warzywo zostało zjedzone.");
    }

    @Override
    public void przechowuj() {
        System.out.println("Warzywo przechowywane w chłodnym miejscu.");
    }
}
