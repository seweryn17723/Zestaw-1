public class Zamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia, Platnosc platnosc) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = platnosc;
    }

    public void finalizujZamowienie(){
        if(platnosc.getStatusPlatnosci().equals("Opłacone")){
            this.statusZamowienia = "Gotowe do wysyłki";
        }else{
            System.out.println("Zamówienie nie może być finalizowane, płatność nie jest wykonana.");
        }
    }

    public void zwrocProdukt(Produkt produkt, int ilosc, Magazyn magazyn){
        if(koszykZakupowy.getProdukty().containsKey(produkt) && koszykZakupowy.getProdukty().get(produkt) >= ilosc){
            koszykZakupowy.getProdukty().put(produkt, koszykZakupowy.getProdukty().get(produkt) - ilosc);
            magazyn.dodajProdukt(produkt, ilosc);
            platnosc.setKwota(platnosc.getKwota() - (produkt.getCena() * ilosc));
            if(koszykZakupowy.getProdukty().get(produkt) == 0){
                koszykZakupowy.getProdukty().remove(produkt);
            }
            System.out.println("Zwrócono " + ilosc + " sztuk produktu: " + produkt.getNazwa() + "\n");
        }else{
            System.out.println("Nie można zwrócić " + ilosc + " sztuk produktu: " + produkt.getNazwa() + "\n");
        }
    }

    //Wyświetlanie zamówienia
    public void wyswietlZamowienie(){
        System.out.println("Zamówienie: ");
        System.out.println("Status zamówienia: " + statusZamowienia);
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("Status płatności: " + platnosc.getStatusPlatnosci());
        System.out.println("Kwota do zapłaty: " + platnosc.getKwota() + " zł");
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Zamówienie: \n");
        sb.append("Status zamówienia: " ).append(statusZamowienia).append("\n");

        sb.append("Zawartość koszyka: \n");
        //Wywołanie toString() z KoszykaZakupowego
        sb.append(koszykZakupowy.toString());

        sb.append("\nStatus płatności: ").append(platnosc.getStatusPlatnosci()).append("\n");

        sb.append("Kwota do zapłaty: ").append(platnosc.getKwota()).append(" zł\n");

        return sb.toString();
    }

    public String getClassName(){
        return "Cześć, jestem klasą " + this.getClass().getSimpleName();
    }

    public KoszykZakupowy getKoszykZakupowy() {
        return koszykZakupowy;
    }

    public void setKoszykZakupowy(KoszykZakupowy koszykZakupowy) {
        this.koszykZakupowy = koszykZakupowy;
    }

    public String getStatusZamowienia(){
        return statusZamowienia;
    }

    public void setStatusZamowienia(String statusZamowienia){
        this.statusZamowienia = statusZamowienia;
    }

    public Platnosc getPlatnosc() {
        return platnosc;
    }

    public void setPlatnosc(Platnosc platnosc) {
        this.platnosc = platnosc;
    }

    //Metoda do zmiany statusu zamowienia
    public void ustawStatus(String nowyStatusZamowienia) {
        this.statusZamowienia = nowyStatusZamowienia;
    }


}