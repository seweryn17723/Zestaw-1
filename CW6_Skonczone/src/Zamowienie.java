public class Zamowienie {
    private KoszykZakupowy koszykZakupowy;
    private String statusZamowienia;

    //Zadanie 6, dodatkowe pole platnosc
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia, Platnosc platnosc) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = platnosc;
    }

    //Metoda do zmiany statusu zamowienia
    public void ustawStatus(String nowyStatusZamowienia) {
        this.statusZamowienia = nowyStatusZamowienia;
    }

    //Wyświetlanie zamówienia
    public void wyswietlZamowienie(){
        System.out.println("Status zamówienia: " + statusZamowienia);
        koszykZakupowy.wyswietlZawartoscKoszyka();
        System.out.println("Status płatności: " + platnosc.getStatusPlatnosci());
        System.out.println("Kwota do zapłaty: " + platnosc.getKwota() + " zł");
    }

    //Zadanie 6

    public void finalizujZamowienie(){
        if(platnosc.getStatusPlatnosci().equals("Opłacone")){
            this.statusZamowienia = "Gotowe do wysyłki";
        }else{
            System.out.println("Zamówienie nie może być finalizowane, płatność nie jest wykonana.");
        }
    }

    public void zwrocProdukt(Produkt produkt, int ilosc){
        if(koszykZakupowy.getProdukty().containsKey(produkt) && koszykZakupowy.getProdukty().get(produkt) >= ilosc){
            koszykZakupowy.getProdukty().put(produkt, koszykZakupowy.getProdukty().get(produkt) - ilosc);
            produkt.dodajDoMagazynu(ilosc);
            platnosc.kwota -= produkt.getCena() * ilosc;
            if(koszykZakupowy.getProdukty().get(produkt) == 0){
                koszykZakupowy.getProdukty().remove(produkt);
            }
            System.out.println("Zwrócono " + ilosc + " sztuk produktu: " + produkt.getNazwa());
        }else{
            System.out.println("Nie można zwrócić " + ilosc + " sztuk produktu: " + produkt.getNazwa());
        }
    }

    public KoszykZakupowy getKoszykZakupowy() {
        return koszykZakupowy;
    }
}