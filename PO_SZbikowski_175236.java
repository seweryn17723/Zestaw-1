import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //Zadanie 1

    public static void trojkiPitagorejskie(int n) {

        for (int a = 1; a <= n; a++) {

            for (int b = a; b <= n; b++) {

                for (int c = b; c <= n; c++) {

                    if (a * a + b * b == c * c) {

                        System.out.println("(" + a + ", " + b + ", " + c + ")");

                    }
                }
            }
        }
    }

    //Zadanie 2

    public static void funKwaRozwiazania(int n) {

//        for (int a = -n; a <= n; a++) {
//            for (int b = -n; b <= n; b++) {
//                for (int c = -n; c <= n; c++) {
        for (int a = 0; a <= n; a++) {

            for (int b = 0; b <= n; b++) {

                for (int c = 0; c <= n; c++) {

                    // Sprawdzenie delty
                    if (delta(a, b, c)) {
                        System.out.println("a: " + a + ", b: " + b + ", c: " + c);

                    }
                }
            }
        }
    }

    private static boolean delta(int a, int b, int c) {

        int delta = b * b - 4 * a * c;

        return delta >= 0;
    }

    //Zadanie 3

    public static void funKwaDelta(int n) {

        for (int a = 0; a <= n; a++) {

            for (int b = 0; b <= n; b++) {

                for (int c = 0; c <= n; c++) {

                    if (czyJestKwadratemLiczbyNaturalnej(a, b, c)) {
                        System.out.println("a: " + a + ", b: " + b + ", c: " + c);

                    }
                }
            }
        }
    }

    private static boolean czyJestKwadratemLiczbyNaturalnej(int a, int b, int c) {

        int delta = b * b - 4 * a * c;

        // Czy ujemny?
        if (delta < 0) {
            return false;
        }

        // Obliczanie pierwiastka
        double pierwiastekzdelty = Math.sqrt(delta);

        // Sprawdzenie, czy pierwiastek jest liczbą całkowitą
        if (pierwiastekzdelty % 1 != 0) {
            return false;
        }

        // Sprawdzanie, czy pierwiastek jest kwadratem liczby naturalnej
        int pierwiastekInt = (int) pierwiastekzdelty;
        return pierwiastekInt * pierwiastekInt == delta;
    }

    //Zadanie 4


    public static void liczbyPierwsze(int n) {

        boolean[] jestPierwsza = new boolean[n + 1];    //tablica typu bool

        // Inicjalizacja tablicy z zakresu [2 do n]
        for (int i = 2; i <= n; i++) {
            jestPierwsza[i] = true;
        }

        // Sito Eratostenesa
        for (int p = 2; p * p <= n; p++) {
            // Jeśli p jest liczbą pierwszą
            if (jestPierwsza[p]) {
                // Oznaczanie wielokrotności p jako niepierwsze
                for (int i = p * p; i <= n; i += p) {
                    jestPierwsza[i] = false;
                }
            }
        }

        // Wypisywanie liczb pierwszych
        System.out.println("Liczby pierwsze od 2 do " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (jestPierwsza[i]) {
                System.out.println(i + " ");
            }
        }
    }

    //Zadanie 5

    public static void liczbyPodzielne(int m, int n){

        int min = (int) Math.pow(10, m - 1);
        int max = (int) (Math.pow(10, m) - 1);

        System.out.println("Liczby " + m + " cyfrowe podzielne przez " + n + " :" );

        for (int i = min; i <= max; i++){
            if(i % n == 0){
                System.out.println(i + " ");
            }
        }
    }

    //Zadanie 6

    public static void piramida(int n, int variant){


        if (variant == 1) {
            for (int i = 0; i <= n; i++){
                //wypisywane spacje
                for (int j = i; j < n; j++){
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++){
                 System.out.print("*");
                }
                System.out.println();
            }
        } else if (variant == 2) {
            for (int i = 1; i <= n; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    //Zadanie 7

    public static int silnia(int n){

        int result = 1;

        for (int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }

    //Zadanie 8

    public static int silniaPodwojna(int n){

        int result = 1;

        if(n == 1){
            return result;
        }else if(n > 1){
            for(int i = n; i > 0; i -=2){
                result *= i;
            }
        }

        return result;
    }

    //Zadanie 9

    public static int silnia(int m, int n){

        int result = 1;

        for(int i = n; i > 0; i -= m){
            result *= i;
        }

        return result;
    }

    //Zadanie 10

    public static int dwumianNewtona(int n, int k){

        return ((silnia(n))/(silnia(k) * silnia((n-k))));
    }


    //Zadanie 11

    public static void ciagFibonacciego(int n){

        long a = 0, b = 1;

        if (n >= 1){
            System.out.println(a + " ");
        }

        if (n >= 2){
            System.out.println(b + " ");
        }

        for (int i = 3; i <= n; i++){
            long c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }

    public static int sumaNaturalnych(int n){

        int result = 0;

        for (int i = 1; i <= n; i++){
            result += i;
        }

        return result;
    }

    public static int sumaParzystych(int n){

        int result = 0;

        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                result += i;
            }
        }

        return result;
    }

    public static int sumaNieparzystych(int n){

        int result = 0;

        for (int i = 1; i <= n; i++){
            if (i % 2 == 1){
                result += i;
            }
        }

        return result;
    }

    public static int sumaKwaNaturlanych(int n){

        int result = 0;

        for (int i = 0; i <= n; i++){
            result += i * i;
        }

        return result;
    }

    public static int sumaSzeNaturlanych(int n){

        int result = 0;

        for (int i = 1; i <= n; i++){
            result += i * i * i;
        }

        return result;
    }

    public static double sumaOdwNatrualnych(int n){

        double result = 0;

        for (int i = 1; i <= n; i++){
            result += (1.0 / i);
        }

        return result;
    }

    public static boolean czyPalindrom(String wyraz){

        int length = wyraz.length();

        for (int i = 0; i < length / 2; i++){
            if(wyraz.charAt(i) != wyraz.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //Zadanie 14

    public static void trojkatPascala(int n) {
        int[][] trojkat = new int[n][n];   //[][] - deklaracja dwuwymiarowej tablicy

        // Generowanie trójkąta Pascala
        for (int line = 0; line < n; line++) {       //jako line deklaruje linię trójkąta
            // ustalenie wartości w trójkącie Pascala
            for (int i = 0; i <= line; i++) {
                if (i == 0 || i == line) {
                    trojkat[line][i] = 1;  //krawędzie trójkąta zawsze mają wartość 1
                } else {
                    trojkat[line][i] = trojkat[line - 1][i - 1] + trojkat[line - 1][i];  // suma dwóch elementów z poprzedniego wiersza
                }
            }
        }

        // Wyświetlanie trójkąta
        for (int line = 0; line < n; line++) {
            // Spacje przed każdą linią, aby wyświetlić trójkąt w ksztalcie piramidy
            for (int i = 0; i < n - line - 1; i++) {
                System.out.print(" ");
            }

            // Wyświetlenie wartości w wierszu
            for (int i = 0; i <= line; i++) {
                System.out.print(trojkat[line][i] + " ");
            }
            System.out.println();  // nowa linia po kazdym wierszu
        }
    }

    //Zadanie 15

    public static boolean czyPalindromv(int n) {
        if (n < 0) {
            return false;
        }

        int liczba = n;
        int odwrocona_liczba = 0;

        while (n > 0) {
            int cyfra = n % 10;  //ostatnia cyfra liczby
            odwrocona_liczba = odwrocona_liczba * 10 + cyfra;  //konstruowanie odwrotnej liczby
            n /= 10;  //usuwanie ostantiej cyfry z liczby podanej
        }

        return liczba == odwrocona_liczba;
    }

    //Zadanie 16

    public static boolean czyDoskonala(int n){

        if (n <= 0){
            return false;
        }

        int sumaDzielnikow = 0;

        for (int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                sumaDzielnikow += i;
            }
        }

        return sumaDzielnikow == n;
    }


    //Zadanie 17

    public static boolean czyPierwsza(int n) {

        if (n <= 1) {
            return false;
        }

        //Sprawdzenie dzielnikow od 2 do pierwiastka z n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Zadanie 18

    public static int NWD(int a, int b){

        while(b != 0){
            int reszta = a%b;
            a = b;
            b = reszta;
        }
        return a;
    }

    //Zadanie 19

    public static void wczytajTablice(){

        Scanner dlugosc_tab = new Scanner(System.in);

        System.out.println("Podaj długość tablicy");
        int n = dlugosc_tab.nextInt();

        int[] tablica = new int[n];

        System.out.println("Podaj " + n + " elementów tablicy");
        for(int i = 0; i < n; i++){
            Scanner element_tablicy = new Scanner(System.in);
            System.out.println("Element " + i + ": ");
            tablica[i] = element_tablicy.nextInt();
        }

        System.out.println("Tablica: ");
        for (int i = 0; i < n; i++){
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }

    //Zadanie 20

    public static void podzbiory(int[] tablica) {
        int n = tablica.length;
        int liczbaPodzbiorow = (int) Math.pow(2, n); // 2^n podzbiorów

        for (int i = 0; i < liczbaPodzbiorow; i++) {
            List<Integer> podzbior = new ArrayList<>();


            for (int j = 0; j < n; j++) {
                // Jeśli bit na pozycji j jest ustawiony na 1, dodajemy element tablicy do podzbioru
                if ((i & (1 << j)) != 0) {
                    podzbior.add(tablica[j]);
                }
            }
            System.out.println(podzbior);
        }
    }


    public static void main(String[] args) {

//        //Zadanie 1
//
//        Scanner zadanie1 = new Scanner(System.in);
//
//        System.out.println("Podaj n: ");
//        int n_z1 = zadanie1.nextInt();
//
//        System.out.println("Trójki pitagorejskie dla n <= " + n_z1 + ":");
//        trojkiPitagorejskie(n_z1);
//
//        //Zadanie 2
//
//        Scanner zadanie2 = new Scanner(System.in);
//
//        System.out.println("Podaj n: ");
//        int n_z2 = zadanie2.nextInt();
//
//        funKwaRozwiazania(n_z2);
//
//        //Zadanie 3
//
//        Scanner zadanie3 = new Scanner(System.in);
//
//        System.out.println("Podaj n: ");
//        int n_z3 = zadanie3.nextInt();
//
//        funKwaDelta(n_z3);
//
//        //Zadanie 4
//
//        Scanner zadanie4 = new Scanner(System.in);
//
//        System.out.println("Podaj n: ");
//        int n_z4 = zadanie4.nextInt();
//
//        liczbyPierwsze(n_z4);
//
//        //Zadanie 5
//
//        Scanner zadanie5_n = new Scanner(System.in);
//        Scanner zadanie5_m = new Scanner(System.in);
//
//        System.out.println("Podaj dzielnik - n: ");
//        int n_z5 = zadanie5_n.nextInt();
//
//        System.out.println("Podaj liczbę m - (ilość cyfr): ");
//        int m_z5 = zadanie5_m.nextInt();
//
//        liczbyPodzielne(m_z5, n_z5);
//
//        //Zadanie 6
//
//        Scanner zadanie6_variant = new Scanner(System.in);
//        Scanner zadanie6_n = new Scanner(System.in);
//
//        System.out.println("Podaj variant priamidy - (1, 2): ");
//        int variant_z6 = zadanie6_variant.nextInt();
//
//        System.out.println("Podaj wysokość n: ");
//        int n_z6 = zadanie6_n.nextInt();
//
//        piramida(n_z6, variant_z6);
//
//        //Zadanie 7
//
//        Scanner zadanie7_n = new Scanner(System.in);
//
//        System.out.println("Podaj n: ");
//        int n_z7 = zadanie7_n.nextInt();
//
//        System.out.println(silnia(n_z7));
//
//        //Zadanie 8
//
//        Scanner zadanie8_n = new Scanner(System.in);
//
//        System.out.println("Podaj n: ");
//        int n_z8 = zadanie8_n.nextInt();
//
//        System.out.println(silniaPodwojna(n_z8));
//
//        //Zadanie 9
//
//        Scanner zadanie9_n = new Scanner(System.in);
//        Scanner zadanie9_m = new Scanner(System.in);
//
//        System.out.println("Podaj liczbę n: ");
//        int n_z9 = zadanie9_n.nextInt();
//
//        System.out.println("Podaj stopień silni m: ");
//        int m_z9 = zadanie9_m.nextInt();
//
//        System.out.println(silnia(m_z9, n_z9));
//
//        //Zadanie 10
//
//        Scanner zadanie10_n = new Scanner(System.in);
//        Scanner zadanie10_k = new Scanner(System.in);
//
//        System.out.println("Podaj n: ");
//        int n_z10 = zadanie10_n.nextInt();
//
//        System.out.println("Podaj k: ");
//        int k_z10 = zadanie10_k.nextInt();
//
//        if (n_z10 > k_z10){
//            System.out.println(dwumianNewtona(n_z10, k_z10));
//        } else if (k_z10 > n_z10) {
//           System.out.println("k nie może być większe od n!!!!");
//        }
//
//        //Zadanie 11
//
//        Scanner zadanie11_n = new Scanner(System.in);
//
//        System.out.println("Podaj n: ");
//        int n_z11 = zadanie11_n.nextInt();
//
//        ciagFibonacciego(n_z11);
//
//        //Zadanie 12
//
//        Scanner zadanie12_n = new Scanner(System.in);
//
//        System.out.println("Podaj n: ");
//        int n_z12 = zadanie12_n.nextInt();
//
//        System.out.println("Suma liczb naturlanych z n = " + n_z12);
//        System.out.println(sumaNaturalnych(n_z12));
//
//        System.out.println("Suma liczb parzystych z n = " + n_z12);
//        System.out.println(sumaParzystych(n_z12));
//
//        System.out.println("Suma liczb nieparzystych z n = " + n_z12);
//        System.out.println(sumaNieparzystych(n_z12));
//
//        System.out.println("Suma kwadratów liczb z n = " + n_z12);
//        System.out.println(sumaKwaNaturlanych(n_z12));
//
//        System.out.println("Suma sześcianów liczb z n = " + n_z12);
//        System.out.println(sumaSzeNaturlanych(n_z12));
//
//        System.out.println("Suma liczb odwrotności z n = " + n_z12);
//        System.out.println(sumaOdwNatrualnych(n_z12));
//
//
//        //Zadanie 13
//
//        Scanner wyraz = new Scanner(System.in);
//
//        System.out.println("Podaj wyraz: ");
//
//        String wyraz_z13 = wyraz.nextLine();
//
//        boolean isPalindrome = czyPalindrom(wyraz_z13);
//        System.out.println("Czy wyraz " + wyraz_z13 + " jest palindromem? " + isPalindrome);
//
//        //Zadanie 14
//
//        Scanner zadanie14_n = new Scanner(System.in);
//
//        System.out.println("Podaj wyskość trójkąta Pascal: ");
//        int n_z13 = zadanie14_n.nextInt();
//
//        trojkatPascala(n_z13);
//
//    //Zadanie 15
//
//    Scanner zadanie14_n = new Scanner(System.in);
//
//    System.out.println("Podaj liczbę n: ");
//    int n_z14 = zadanie14_n.nextInt();
//
//    if (czyPalindromv(n_z14)) {
//     System.out.println(n_z14 + " jest palindromem");
//    }else{
//        System.out.println(n_z14 + " nie jest palindromem");
//    }
//
//        //Zadanie 16
//
//        Scanner zadanie16_n = new Scanner(System.in);
//
//        System.out.println("Podaj liczbę n: ");
//        int n_z16 = zadanie16_n.nextInt();
//
//        if (czyDoskonala(n_z16)) {
//            System.out.println(n_z16 + " jest liczbą doskonałą");
//        }else{
//            System.out.println(n_z16 + " nie jest liczbą doskonałą");
//        }
//
//        //Zadanie 17
//
//        Scanner zadanie17_n = new Scanner(System.in);
//
//        System.out.println("Podaj liczbe n: ");
//        int n_z17 = zadanie17_n.nextInt();
//
//        System.out.print(czyPierwsza(n_z17));
//
//        //Zadanie 18
//
//        Scanner zadanie18_a = new Scanner(System.in);
//        Scanner zadanie18_b = new Scanner(System.in);
//
//        System.out.println("Podaj a: ");
//        int a_z18 = zadanie18_a.nextInt();
//
//        System.out.println("Podaj a: ");
//        int b_z18 = zadanie18_a.nextInt();
//
//        int result = NWD(a_z18,b_z18);
//
//        System.out.println("NWD z a = " + a_z18 + " i b: " + b_z18 + " to: " + result);
//
//        //Zadanie 19
//
//        wczytajTablice();

        //Zadanie 20

        int[] tablica = {1, 2, 3};

        podzbiory(tablica);
    }
}
