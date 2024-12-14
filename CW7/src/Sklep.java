import java.util.HashMap;
import java.util.Map;

public class Sklep {
    private Map<String, Produkt> produkty;
    private Magazyn magazynSklepu;
    private String nazwaSklepu;
    private String dataPowstania;

    //Konstruktor
    public Sklep(Magazyn magazyn, String nazwaSklepu, String dataPowstania) {
        this.produkty = new HashMap<>();
        this.magazynSklepu = magazyn;
        this.nazwaSklepu = nazwaSklepu;
        this.dataPowstania = dataPowstania;
    }

    //Metoda do dodawania produktów do oferty sklepu
    public void dodajProdukt(Produkt produkt) {
        produkty.put(produkt.getNazwa(), produkt);
    }

    //Metoda do wyszukiwania produktu
    public Produkt wyszukajProduktu(String nazwa){
        if(produkty.containsKey(nazwa)){
            return produkty.get(nazwa);
        }else{
            System.out.println("Produktu o nazwie " + nazwa + " nie jest dostępny w sklepie.");
            return null;
        }
    }

    //Metoda do dodania wskazanego produktu i podanej ilości do koszyka klienta i usunięcia odpowiedniej liczby z magazynu
    public void zakupy(KoszykZakupowy koszyk, String nazwaProduktu, int ilosc){
        Produkt produkt = wyszukajProduktu(nazwaProduktu);
        if(produkt != null){
            koszyk.dodajProdukt(produkt, ilosc, magazynSklepu);
        }
    }

    //Metoda do wyświetlania dostępnych produktów w sklepie
    public void wyswietlOferte(){
        if(produkty.isEmpty()){
            System.out.println("Aktualnie oferta sklepowa jest pusta.");
        }else{
            System.out.println("Oferta sklepu: ");
            for(Produkt produkt : produkty.values()){
                System.out.println(produkt.toString() + ", Ilość na stanie: " + magazynSklepu.getIloscProduktuZMagazynu(produkt));
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        if(produkty.isEmpty()){
            sb.append("Oferta sklepu jest pusta.\n");
        }else{
            for(Produkt produkt : produkty.values()){
                int iloscNaMagazynie = magazynSklepu.getIloscProduktuZMagazynu(produkt);
                sb.append(produkt.toString()).append(", Ilość na magazynie: ").append(iloscNaMagazynie).append("\n");
            }
        }
        return sb.toString();
    }

    public Map<String, Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(Map<String, Produkt> produkty) {
        if (produkty == null) {
            throw new IllegalArgumentException("Lista produktów nie może być nullem.");
        }
        this.produkty = produkty;
    }

    public Magazyn getMagazynSklepu() {
        return magazynSklepu;
    }

    public void setMagazynSklepu(Magazyn magazynSklepu) {
        if (magazynSklepu == null) {
            throw new IllegalArgumentException("Magazyn nie może być nullem.");
        }
        this.magazynSklepu = magazynSklepu;
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        if (nazwaSklepu == null || nazwaSklepu.trim().isEmpty()) {
            throw new IllegalArgumentException("Nazwa sklepu nie może być nullem ani pusta.");
        }
        this.nazwaSklepu = nazwaSklepu;
    }

    public String getDataPowstania() {

        return dataPowstania;
    }

    public void setDataPowstania(String dataPowstania) {
        if (dataPowstania == null || dataPowstania.trim().isEmpty()) {
            throw new IllegalArgumentException("Data powstania nie może być nullem ani pusta.");
        }
        this.dataPowstania = dataPowstania;
    }

    public String getClassName(){
        return "Cześć, jestem klasą " + this.getClass().getSimpleName();
    }
}
