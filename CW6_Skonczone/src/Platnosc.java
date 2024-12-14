public class Platnosc {
    double kwota;
    String statusPlatnosci;

    //Konstruktor
    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone";
    }

//Czy działa?????
//    public void zaplac(double platnoscZaUsluge){
//        this.kwota =- platnoscZaUsluge;
//        if(kwota == 0){
//            this.statusPlatnosci = "Opłacone";
//        }else if(kwota > 0){
//            this.statusPlatnosci = "Nie opłacone, pozostała kwota do zapłaty: " + kwota + " zł";
//        }else{
//            this.statusPlatnosci = "Nadpłacone, nadpłata równa: " + kwota + " zł";
//        }
//    }

    public void zaplac(){
        this.statusPlatnosci = "Opłacone";
        this.kwota = 0.0;
    }

    public double getKwota() {
        return kwota;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }


}
