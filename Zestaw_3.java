import java.util.Scanner;

public class Main {

    //Zadanie 1
    public static void trojkiPitagorejskie(int n){

        for(int a = 1; a <= n; a++){
            for(int b = a; b <= n; b++){
                for(int c = b; c <= n; c++){
                    if(a * a + b * b == c * c){
                        System.out.println("[" + a + "," + b + "," + c + "]");
                    }
                }
            }
        }

    }

    //Zadanie 2
    public static void funKwaRozwiazania(int n){

        for(int a = 1; a <= n; a++){
            for(int b = 0; b <= n; b++){
                for(int c = b; c <= n; c++){
                    double delta = b * b - 4 * a * c;

                    if(delta >= 0){
                        System.out.println("[" + a + "," + b + "," + c + "]");
                    }
                }
            }
        }

    }

    //Zadanie 3
    public static void funKwaDelta(int n){

        for(int a = 1; a <= n; a++){
            for(int b = 0; b <= n; b++){
                for(int c = b; c <= n; c++){
                    double delta = b * b - 4 * a * c;

                    if(delta >= 0){
                        double pierwiastek_z_delty = Math.sqrt(delta);
                        if(pierwiastek_z_delty == (int)pierwiastek_z_delty){
                            System.out.println("[" + a + "," + b + "," + c + "]");
                        }
                    }
                }
            }
        }
    }

    //Zadanie 4
    public static void liczbyPierwsze(int n){
        System.out.println("Liczby pierwsze od 2 do n " + n + " :");

        for(int i = 2; i <= n; i++){
            if(czyPierwsza(i)){
                System.out.print(i + ", ");
            }
        }

    }
    // + Zadanie 17
    public static boolean czyPierwsza(int liczba){
        if(liczba <= 1){
            return false;
        }

        for(int i = 2; i * i <= liczba; i++){
            if(liczba % i == 0){
                return false;
            }
        }
        return true;
    }

    //Zadanie 5
    public static void liczbyPodzielne(int n, int m){

        double poczatek_zakresu = Math.pow(10, m - 1);
        double koniec_zakresu = Math.pow(10, m) - 1;

        System.out.print("Liczby " + m + " cyfrowe podzielne przez " + n + ": ");

        for(int i = (int)poczatek_zakresu; i <= (int)koniec_zakresu; i++){
            if(i % n == 0){
                System.out.print(i + ", ");
            }
        }

    }

    //Zadanie 6
    public static void piramida(int n, int variant) {
        if (variant == 1) {
            // Rysowanie trójkąta prostokątnego o wysokości n
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (variant == 2) {
            // Rysowanie trójkąta równoramiennego o wysokości n
            for (int i = 1; i <= n; i++) {
                // Drukowanie spacji
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                // Drukowanie gwiazdek
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Niepoprawny wariant. Użyj 1 dla trójkąta prostokątnego, 2 dla trójkąta równoramiennego.");
        }
    }

    //Zadanie 7
    public static int silnia(int n){
        int result = 1;

        if(n > 0){
            for(int i = 1; i <= n; i++){
                result *= i;
            }
        }else if(n == 0){
            return 0;
        }

        return result;
    }

    //Zadanie 8
    public static int podwojnaSilnia(int n){
        int result = 1;

        for(int i = n; i > 0; i -= 2){
            result *= i;
        }

        return result;
    }

    //Zadanie 9
    public static int silnia(int n, int m){

        int result = 1;

        for(int i = n; i > 0; i -= m){
            result *= i;
        }

        return result;
    }

    //Zadanie 10
    public static void dwumianNewtona(int n, int k){
        double result = ((silnia(n)) / (silnia(k) * silnia(n - k)));

        System.out.println("Dwumian Newtona n = " + n + ", k = " + k + ", wynik = " + result);
    }

    //Zadanie 11
    public static int[] ciagFibonacciego(int n){
       if(n < 0){
           throw new IllegalArgumentException("n nie może być mniejsze niż 0");
       }

       if(n == 0 ){
           return new int[]{0};
       }
       if(n == 1){
           return new int[]{0, 1};
       }

       int[] fibonacci = new int[n + 1];
       fibonacci[0] = 0;
       fibonacci[1] = 1;

       for(int i = 2; i <= n; i++){
           fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
       }

       return fibonacci;
    }

    //Zadanie 12
    public static void sumaNaturalnych(int n){
        int result = 0;

        for(int i = 0; i <= n; i++){
            result += i;
        }

        System.out.println("Suma n : " + n + " liczb naturalnych = " + result);
    }

    public static void sumaParzystych(int n){
        int result = 0;

        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                result += i;
            }
        }

        System.out.println("Suma n : " + n + " liczb parzystych = " + result);
    }

    public static void sumaNieparzystych(int n){
        int result = 0;

        for(int i = 0; i <= n; i++){
            if(i % 2 != 0){
                result += i;
            }
        }

        System.out.println("Suma n : " + n + " liczb nieparzystych = " + result);
    }

    public static void sumaKwaNaturalnych(int n){
        int result = 0;

        for(int i = 0; i <= n; i++){
            result += i * i;
        }

        System.out.println("Suma n : " + n + " kwadratów liczb = " + result);
    }

    public static void sumaSzeNaturlanych(int n){
        int result = 0;

        for(int i = 0; i <= n; i++){
            result += i * i * i;
        }

        System.out.println("Suma n : " + n + " sześcianów liczb = " + result);
    }
    public static void sumaOdwNaturalnych(int n){
        double result = 0;

        for(int i = 1; i <= n; i++){
            result += (1.0 / i);
        }

        System.out.println("Suma n : " + n + " odwrotności liczb = " + result);
    }

    //Zadanie 13
    public static boolean czyPalindrom(String wyraz){
        String poprawny_wyraz = wyraz.toLowerCase();

        int dlugosc = poprawny_wyraz.length();

        for(int i = 0; i < dlugosc / 2; i++){
            if(poprawny_wyraz.charAt(i) != poprawny_wyraz.charAt(dlugosc - i - 1)){
                return false;
            }
        }
        return true;
    }

    //Zadanie 14
    public static void trojkatPascala(int n){

        int[][] trojkat = new int[n][];

        for(int i = 0; i < n; i++){
            trojkat[i] = new int[i + 1];
            trojkat[i][0] = 1;
            trojkat[i][i] = 1;
            for(int j = 1; j < i; j++){
                trojkat[i][j] = trojkat[i - 1][j - 1] + trojkat[i - 1][j];
            }
        }

        for(int i = 0; i < n; i++){
            for(int k = 0; k < n - i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print(trojkat[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Zadanie 15
    public static boolean czyPalindrom(int n){
        int original = n;
        int reversed = 0;

        //Odwracanie liczby
        while(n != 0){
            int ostatnia_cyfra = n % 10;
            reversed = reversed * 10 + ostatnia_cyfra;
            n = n / 10;
        }
        return original == reversed;
    }

    public static boolean czyDoskonala(int n){

        if(n <= 0){
            return false;
        }

        int sumaDzielnikow = 0;

        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                sumaDzielnikow += i;
            }
        }

        return sumaDzielnikow == n;
    }

    //Zadanie 18

    public static int NWD(int a, int b){
        while(b != 0){
            int reszta = a % b;
            a = b;
            b = reszta;
        }
        return a;
    }

    //Zadanie 19
    public static int[] wczytajTablice(int n){
        int[] tab = new int[n];

        Scanner element = new Scanner(System.in);

        System.out.println("Podaj " + n + " liczb: ");

        for(int i = 0; i < n; i++){
            System.out.println("Element " + (i + 1) + ": ");
            tab[i] = element.nextInt();
        }

        return tab;
    }
    public static void podzbiory(int[] tab){
        int n = tab.length;
        int liczbaPodzbiorow = (int)Math.pow(2, n);

        System.out.println("Wszystkie podzbiory tablicy: ");

        for(int i = 0; i < liczbaPodzbiorow; i++){
            System.out.print("{ ");
            for(int j = 0; j < n; j++){
                if((i & (1 << j)) != 0){
                    System.out.print(tab[j] + ", ");
                }
            }
            System.out.println(" }");
        }
    }

    public static void main(String[] args) {

    //Zestaw 3


        //Zadanie 1
        int n = 5;

        System.out.println("Trójki pitagorejskie z zakresu 1 do " + n);
        trojkiPitagorejskie(n);

        //Zadanie 2
        System.out.println();
        System.out.println("Możliwe zestawy współczynników będącymi rozwiązaniami funkcji kwadratowej, współczynniki z zakresu od 0 do " + n + ", natomiast a musi pozostać z zakresu od 1");
        funKwaRozwiazania(n);

        //Zadanie 3
        System.out.println();
        System.out.println("Możliwe zestawy współczynników z przedziału 0 do " + n + ", jedynie a pozostaje w przedziale od 1, dla których pierwiastek z delty jest kwadratem liczby naturalnej");
        funKwaDelta(n);

        //Zadanie 4
        System.out.println();
        liczbyPierwsze(n);
        System.out.println();

        //Zadanie 5
        System.out.println();
        int m = 2;
        liczbyPodzielne(n, m);
        System.out.println();

        //Zadanie 6
        System.out.println();
        int variant = 1;   //1 lub 2
        piramida(n, variant);
        System.out.println();

        //Zadanie 7
        System.out.println("Silnia z n : " + n + " = " + silnia(n));
        System.out.println();

        //Zadanie 8
        System.out.print("Podwójna silnia z n : " + n + " = " + podwojnaSilnia(n));
        System.out.println();

        //Zadanie 9
        int m_z9 = 3;
        System.out.println("M-ta : " + m_z9 + ", silnia z n : " + n + " = " + silnia(n, m_z9));
        System.out.println();

        //Zadanie 10
        int k = 2;
        dwumianNewtona(n, k);
        System.out.println();

        //Zadanie 11
        int[] fibonacci = ciagFibonacciego(n);

        System.out.println("Ciąg Fibonacciego do " + n + " -tego elementu: ");
        for(int i : fibonacci){
            System.out.print(i + ", ");
        }
        System.out.println();

        //Zadanie 12
        System.out.println();
        sumaNaturalnych(n);
        sumaParzystych(n);
        sumaNieparzystych(n);
        sumaKwaNaturalnych(n);
        sumaSzeNaturlanych(n);
        sumaOdwNaturalnych(n);
        System.out.println();

        //Zadanie 13
        String wyraz = "kajak";
        System.out.println("Czy wyraz: " + wyraz + ", jest palindromem? " + czyPalindrom(wyraz));
        System.out.println();

        //Zadanie 14
        trojkatPascala(n);
        System.out.println();

        //Zadanie 15
        int liczba = 333;
        System.out.println("Czy liczba " + liczba + " jest palindromem? " + czyPalindrom(liczba));
        System.out.println();

        //Zadanie 16
        System.out.println("Czy liczba n: " + n + " jest liczbą doskonałą: " + czyDoskonala(n));
        System.out.println();

        //Zadanie 17
        System.out.println("Czy liczba n: " + n + " jest liczbą pierwszą? " + czyPierwsza(n));
        System.out.println();

        //Zadanie 18
        int a = 55; int b = 14;
        System.out.println("Największy wspólny dzielnik liczb a: " + a + ", b: " + b + " to: " + NWD(a, b));
        System.out.println();

        //Zadanie 19
        int[] tablica = wczytajTablice(n);

        System.out.println("Wczytana tablica: ");
        for(int i = 0; i < tablica.length; i++){
            System.out.print(tablica[i] + ", ");
        }
        System.out.println();

        //Zadanie 20
        System.out.println();
        podzbiory(tablica);
    }
}