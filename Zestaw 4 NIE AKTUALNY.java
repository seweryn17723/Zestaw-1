import java.io.Console;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {

        int[] tablica = new int[n];

        Random random = new Random();

        for(int i = 0; i < n; i++) {
            tablica[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }

        return tablica;
    }

    public static void wyswietlTablice(int[] tablica) {
        for(int i = 0; i < tablica.length; i++) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }

    //Zadanie 2

    public static void wypiszTablice(int n, int m, int[] tablica){

        int index = 0; //Zmienna do śledzenia indeksu tablicy z wartościami

        for (int i = 0; i < n; i++) {                           //iteracja po wierszach
            for (int j = 0; j < m; j++) {                       //iteracja po kolumnach
                if (index < tablica.length) {                   //Warunek jeśli mamy jeszcze elementy w tablicy to zostaną wypisane, natomiast gdy dlugosc tablicy bedzie mniejsza niz index to zakonczy sie wypisywanie
                    System.out.printf("%-5d", tablica[index]);      //"%-5d" format w jakim jest wyswietlany element, odstep, d - do intów
                    index++;
                } else {
                    // Jeśli brak elementów, wypisujemy "_"
                    System.out.printf("%-5s", "_");                 //-5 5 miejsc od lewej, s oczekujemy stringa
                }
            }
            // Po zakończeniu wiersza przechodzimy do nowej linii
            System.out.println();
        }
    }

    //Zadanie 3

    public static int ileParzystych(int[] tab){

        int result = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] % 2 == 0){
                result += 1;
            }
        }

        return result;
    }

    public static int ileNieparzystych(int[] tab){

        int result = 0;

        for (int i = 0; i < tab.length; i++) {

            if(tab[i] % 2 != 0){
                result += 1;
            }
        }

        return result;
    }

    public static int ileUjemnych(int[] tab){

        int result = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] < 0){
                result += 1;
            }
        }

        return result;
    }

    public static int ileDodatnich(int[] tab){

        int result = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > 0){
                result += 1;
            }
        }

        return result;
    }

    public static int ileZerowych(int[] tab){

        int result = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == 0){
                result += 1;
            }
        }

        return result;
    }

    public static int ileMaksymalnych(int[] tab, int maxWartosc){

        int result = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == maxWartosc){
                result += 1;
            }
        }

        return result;
    }

    public static int ileMinimalnych(int[] tab, int minWartosc){

        int result = 0;

        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == minWartosc){
                result += 1;
            }
        }

        return result;
    }

    public static int ileUnikalnych(int[] tab){

        if(tab.length == 0){
            return 0;
        }

        //BubbleSort
        for(int i = 0; i < tab.length - 1; i++){
            for(int j = 0; j < tab.length - 1; j++){
                if(tab[j] > tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }

        int result = 1;

        for(int i = 1; i < tab.length; i++){
            if(tab[i] != tab[i-1]){
                result ++;
            }
        }

        return result;
    }

    //Zadanie 4

    public static int sumaDodatnich(int[] tab){

        int result = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0) {
                result += tab[i];
            }
        }

        return result;
    }

    public static int sumaUjemnych(int[] tab){

        int result = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0) {
                result += tab[i];
            }
        }

        return result;
    }

    public static double sumaOdwrotnosci(int[] tab){

        double result = 0.0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] == 0){
                result += 0;
            }else{
                result += (1.0/tab[i]);
            }
        }

        return result;
    }

    //srednia geometryczna, srednia harmoniczna

    public static double sredniaArytmetyczna(int[] tab){
        double result = 0;

        for(int i = 0; i < tab.length; i++){
            result += tab[i];
        }

        result /= tab.length;

        return result;
    }

    public static double sredniaGeometryczna(int[] tab){

        double iloczyn = 1.0;

        boolean zawieraZeroLubUjemnaLiczbe = false;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] <= 0){
                zawieraZeroLubUjemnaLiczbe = true;
                break;
            }
            iloczyn *= tab[i];
        }

        if(zawieraZeroLubUjemnaLiczbe){
            return 0;
        }

        return Math.pow(iloczyn, 1.0 / tab.length);
    }

    public static double sredniaHarmoniczna(int[] tab){

        double suma = 0.0;
        int licznik_dodatnich_liczb = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab [i] > 0){
                suma += 1.0 / tab[i];
                licznik_dodatnich_liczb++;
            }
        }

        if(licznik_dodatnich_liczb == 0){
            return 0;
        }else{
            return licznik_dodatnich_liczb/suma;
        }
    }

    //Zadanie 5

    public static double[] funkcjaLiniowa(int[] tab, double a, double b) {

        double[] result = new double[tab.length];

        for (int i = 0; i < tab.length; i++) {
            result[i] = a * tab[i] + b;
        }

        return result;
    }

    public static double[] funkcjaKwadratowa(int[] tab, double a, double b, double c) {

        double[] result = new double[tab.length];

        for (int i = 0; i < tab.length; i++) {
            result[i] = Math.pow(a * tab[i], 2) + b * tab[i] + c;
        }

        return result;
    }

    public static double[] funkcjaWykladnicza(int[] tab, double a) {

        double[] result = new double[tab.length];

        for (int i = 0; i < tab.length; i++) {
            result[i] = Math.pow(a, tab[i]);
        }

        return result;
    }

//    public static double signum(double x) {
//        if (x > 0) {
//            return 1.0;
//        } else if (x < 0) {
//            return -1.0;
//        } else {
//            return 0.0;
//        }
//    }
//
//    public static double[] funkcjaSignum(double[] tab) {
//        double[] result = new double[tab.length];
//        for (int i = 0; i < tab.length; i++) {
//            result[i] = signum(tab[i]);
//        }
//        return result;
//    }

    //Zadanie 6

    public static void najdluzszyCiagDodatnich(int[] tab) {

        int najdluszyszCiag = 0;
        int ciagSprawdzany = 0;
        int indexkoncowy=0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                for (int j = i; j < tab.length; j++) {
                    if (tab[j] > 0) {
                        ciagSprawdzany++;
                    } else {
                        break;
                    }
                }
                i = i + ciagSprawdzany;
                if (ciagSprawdzany > najdluszyszCiag) {
                    najdluszyszCiag = ciagSprawdzany;
                    indexkoncowy = i - 1;
                }
                ciagSprawdzany = 0;
            }
        }
        System.out.println("Długość najdłuższego ciągu dodatniego: " + najdluszyszCiag);

        int indexpoczatkowy = indexkoncowy - najdluszyszCiag + 1;

        System.out.print("Najdluzszy ciag dodatnich: ");

        for (int i = indexpoczatkowy; i < tab.length; i++) {
            if(tab[i] <= 0){
                break;
            }
            System.out.print(tab[i] + " ");
        }
    }

    public static void najdluzszyCiagUjemnych(int[]tab){

        int najdluzszyCiag = 0;
        int ciagSprawdzany = 0;
        int poczatekCiagu = 0;
        int koniecCiagu = 0;
        int aktualnyPoczatek = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                ciagSprawdzany++;

                if (ciagSprawdzany == 1){
                    aktualnyPoczatek = i;
                }

                if (ciagSprawdzany > najdluzszyCiag) {
                    najdluzszyCiag = ciagSprawdzany;
                    poczatekCiagu = aktualnyPoczatek;
                    koniecCiagu = i;
                }
            } else {
                ciagSprawdzany = 0;
            }
        }

        System.out.println("Długość najdłuższego ciągu liczb ujemnych: " + najdluzszyCiag);
        System.out.print("Najdłuższy ciąg ujemnych: ");

        for (int i = poczatekCiagu; i <= koniecCiagu; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    public static int[] odwrocTablice(int[] tab) {
        int[] odwroconaTablica = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            odwroconaTablica[i] = tab[tab.length - 1 - i];
        }
        return odwroconaTablica;
    }


    public static void main(String[] args) {

//        //Zadanie 1

        int n_1 = 4; int minWartosc_1 = -2; int maxWartosc_1 = 2;

        int[] tablica_1 = generujTablice(n_1, minWartosc_1, maxWartosc_1);

        System.out.println("Wygenerowana tablica: ");
        wyswietlTablice(tablica_1);
        System.out.println();

        //Zadanie 2

        int n_2 = 7; int m_2 = 7;

        System.out.println("Macierz " + n_2 + " x " + m_2);
        wypiszTablice(n_2, m_2, tablica_1);
        System.out.println();

        //Zadanie 3

        System.out.println("Ilość parzystych liczb w tablicy: " + ileParzystych(tablica_1));
        System.out.println("Ilość nieparzystych liczb w tablicy: " + ileNieparzystych(tablica_1));
        System.out.println("Ilość ujemnych liczb w tablicy: " + ileUjemnych(tablica_1));
        System.out.println("Ilość dodatnich liczb w tablicy: " + ileDodatnich(tablica_1));
        System.out.println("Ilość zerwoych liczb w tablicy: " + ileZerowych(tablica_1));
        System.out.println("Ilość minimalnych liczb w tablicy: " + ileMinimalnych(tablica_1, minWartosc_1));
        System.out.println("Ilość maksymalnych liczb w tablicy: " + ileMaksymalnych(tablica_1, maxWartosc_1));
        System.out.println("Ilość uniklanych liczb w tablicy: " + ileUnikalnych(tablica_1));
        System.out.println();

        //Zadanie 4

        System.out.println("Suma dodatnich liczb z tablicy: : " + sumaDodatnich(tablica_1));
        System.out.println("Suma Ujemnych liczb z tablicy: : " + sumaUjemnych(tablica_1));
        System.out.println("Suma odwrotności liczb z tablicy: : " + sumaOdwrotnosci(tablica_1));
        System.out.println("Średnia arytmetyczna liczb z tablicy: " + sredniaArytmetyczna(tablica_1));
        System.out.println("Średnia geometryczna liczb z tablicy: " + sredniaGeometryczna(tablica_1));
        System.out.println("Średnia harmoniczna liczb z tablicy: " + sredniaHarmoniczna(tablica_1));
        System.out.println();

        //Zadanie 5
        //Zadanie 5

        int a = 2; int b = 3; int c = 4;

        System.out.println("Funkcja liniowa: ");
        System.out.println(Arrays.toString(funkcjaLiniowa(tablica_1, a, b)));
        System.out.println();

        System.out.println("Funkcja kwadratowa: ");
        System.out.println(Arrays.toString(funkcjaKwadratowa(tablica_1, a, b,c)));
        System.out.println();

        System.out.println("Funkcja wykladnicza: ");
        System.out.println(Arrays.toString(funkcjaWykladnicza(tablica_1, a)));
        System.out.println();

//        System.out.println("Funkcja signum: ");
//        System.out.println(Arrays.toString(funkcjaSignum(tablica_1)));
//        System.out.println();

        //Zadanie 6

        najdluzszyCiagDodatnich(tablica_1);
        System.out.println();

        najdluzszyCiagUjemnych(tablica_1);
        System.out.println();

        // Odwrócenie i wyświetlenie tablicy
        int[] odwroconaTablica = odwrocTablice(tablica_1);
        System.out.println("Odwrócona tablica: ");
        wyswietlTablice(odwroconaTablica);


    }
}