public class Adres {
    private String ulica;
    private int numerDomu;
    private Integer numerMieszkania;
    private String miasto;
    private String kodPocztowy;

    public Adres(String ulica, int numerDomu, int numerMieszkania, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        numerMieszkania = null;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public boolean przed(Adres innyAdres){
        return this.kodPocztowy.compareTo(innyAdres.kodPocztowy) < 0;
    }

    public void pokaz(){
        String adres =  "Kod pocztowy: " + kodPocztowy + ", miasto: " + miasto + "\nulica: " + ulica + ", numer domu: : " + numerDomu;
        if(numerMieszkania != null){
            adres += "/" + numerMieszkania;
        }
         System.out.println(adres);
    }

    @Override
    public String toString(){
        return "Kod pocztowy: " + kodPocztowy + ", miasto: " + miasto + ", ulica: " + ulica + ", numer domu: " + numerDomu + (numerMieszkania != null ?"/" + numerMieszkania : "");
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(int numerDomu) {
        if (numerDomu <= 0) {
            throw new IllegalArgumentException("Numer domu musi być większy od zera.");
        }
        this.numerDomu = numerDomu;
    }

    public Integer getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(Integer numerMieszkania) {
        if (numerMieszkania != null && numerMieszkania <= 0) {
            throw new IllegalArgumentException("Numer mieszkania musi być większy od zera.");
        }
        this.numerMieszkania = numerMieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if (miasto == null || miasto.trim().isEmpty()) {
            throw new IllegalArgumentException("Miasto nie może być nullem ani puste.");
        }
        this.miasto = miasto;
    }

    public String getKodPocztowy() {
        if (kodPocztowy == null || kodPocztowy.trim().isEmpty()) {
            throw new IllegalArgumentException("Kod pocztowy nie może być nullem ani pusty.");
        }
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getClassName(){
        return "Cześć, jestem klasą " + this.getClass().getSimpleName();
    }
}