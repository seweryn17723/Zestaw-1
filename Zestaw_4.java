import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {

    //Zadanie 1
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc){
        Random rand = new Random();

        int[] tablica =  new int[n];

        for(int i = 0; i < n; i++){
            tablica[i] = rand.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }
       return tablica;
    }

    public static void wyswietlTablice(int[] tablica){
        for(int i = 0; i < tablica.length; i++){
            System.out.print(tablica[i] + ", ");
        }
        System.out.println();
    }

    //Zadanie 2
    public static void wypiszTablice(int n, int m, int[] tab) {
        int index = 0;

        // Pętla przez wiersze macierzy
        for (int i = 0; i < n; i++) {
            // Pętla przez kolumny macierzy
            for (int j = 0; j < m; j++) {
                // Jeśli mamy jeszcze elementy w tablicy
                if (index < tab.length) {
                    // Wypisujemy elementy z tablicy z wyrównaniem do prawej (4 znaki)
                    System.out.printf("%4d", tab[index]);
                    index++;
                } else {
                    // Jeśli brakuje elementów, wypisujemy "_", również z wyrównaniem
                    System.out.printf("%4s", "_");
                }
            }
            // Przechodzimy do nowej linii po każdym wierszu
            System.out.println();
        }
    }

    //Zadanie 3
    public static void ileNieparzystych(int[] tab){
        int result = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 != 0){
                result++;
            }
        }

        System.out.println("Jest " + result + " nieparzystych liczb w tablicy");
        System.out.println();
    }

    public static void ileParzystych(int[] tab){
        int result = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] % 2 == 0){
                result++;
            }
        }
        System.out.println("Jest " + result + " parzystych liczb w tablicy");
        System.out.println();
    }

    public static void ileDodatnich(int[] tab){
        int result = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                result++;
            }
        }
        System.out.println("Jest " + result + " dodatnich liczb w tablicy");
        System.out.println();
    }

    public static void ileUjemnych(int[] tab){
        int result = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0){
                result++;
            }
        }
        System.out.println("Jest " + result + " ujemnych liczb w tablicy");
        System.out.println();
    }

    public static void ileZerowych(int[] tab){
        int result = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] == 0){
                result++;
            }
        }
        System.out.println("Jest " + result + " zerowych liczb w tablicy");
        System.out.println();
    }

    public static void ileMaxymalnych(int[] tab, int max){
        int result = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] == max){
                result++;
            }
        }
        System.out.println("Jest " + result + " maxymalnych liczb w tablicy");
        System.out.println();
    }

    public static void ileMinimalnych(int[] tab, int min){
        int result = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] == min){
                result++;
            }
        }
        System.out.println("Jest " + result + " minimalnych liczb w tablicy");
        System.out.println();
    }

    public static void ileUnikalnych(int[] tab){

        Arrays.sort(tab); //Sortowanie tablicy

        int unikalneCount = 0;

        //iterowanie po posortowanej tablicy i zliczanie unikatów
        for(int i = 0; i < tab.length; i++){
            //dla pierwszej liczby lub liczb, ktore roznia sie od poprzedniej
            if(i == 0 || tab[i] != tab[i-1]){
                unikalneCount++;
            }
        }
     System.out.println("Jest " + unikalneCount + " unikalnych liczb w tablicy");
     System.out.println();
    }

    //Zadanie 4

    public static void sumaDodatnich(int[] tab){
        int result = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                result += tab[i];
            }
        }

        System.out.println("Suma dodatnich liczb z tablicy jest równa = " + result);
    }

    public static void sumaUjemnych(int[] tab){
        int result = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0){
                result += tab[i];
            }
        }
        System.out.println("Suma ujemnych liczb z tablicy jest równa = " + result);
    }

    public static void sumaOdwrotnosci(int[] tab){
        double result = 0.0;

        for(int i = 0; i < tab.length; i++){
            result += (1.0 / tab[i]);
        }
        System.out.println("Suma odwrotnosci liczb z tablicy jest równa = " + result);
    }

    public static void sredniaArytmetyczna(int[] tab){
        double result = 0.0;

        for(int i = 0; i < tab.length; i++){
            result += tab[i];
        }

        result = result / tab.length;
        System.out.println("Średnia arytmetyczna liczb z tablicy = " + result);
        System.out.println();
    }

    public static void sredniaGeometryczna(int[] tab){
        double result = 1;

        for(int i = 0; i < tab.length; i++){
            result *= tab[i];
        }
        result = Math.pow(result, 1.0/tab.length);
        System.out.println("Średnia geometryczna liczb z tablicy = " + result);
        System.out.println();
    }

    public static void sredniaHarmoniczna(int[] tab){
        double result = 0.0;

        for(int i = 0; i < tab.length; i++){
            result += (1.0/tab[i]);
        }

        result /= tab.length;
        System.out.println("Średnia harmoniczna liczb z tablicy = " + result);
        System.out.println();
    }

    //Zadanie 5
    public static int[] funkcjaLiniowa(int[] tab, int a, int b){
        int[] result = new int[tab.length];

        for(int i = 0; i < tab.length; i++){
            result[i] = a * tab[i] + b;
        }
        return result;
    }

    public static int[] funkcjaKwadratowa(int[] tab, int a, int b, int c){
        int[] result = new int[tab.length];

        for(int i = 0; i < tab.length; i++ ){
            result[i] = a * tab[i] * tab[i] + b * tab[i]  + c;
        }
        return result;
    }

    public static int[] funkcjaWykladnicza(int[] tab, int a){
        int[] result = new int[tab.length];

        for(int i = 0; i < tab.length; i++ ){
            result[i] = a * tab[i];
        }
        return result;
    }

    public static int[] funkcjaSignum(int[] tab) {
        int[] wynik = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                wynik[i] = 1;
            } else if (tab[i] < 0) {
                wynik[i] = -1;
            } else {
                wynik[i] = 0;
            }
        }
        return wynik;
    }

    //Zadanie 6
    public static int najdluzszyCiagDodatnich(int[] tab){
        int maxDlugosc = 0;
        int aktualnaDlugosc = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] > 0){
                aktualnaDlugosc++;
                if(aktualnaDlugosc > maxDlugosc){
                    maxDlugosc = aktualnaDlugosc;
                }
            }else{
                aktualnaDlugosc = 0;
            }
        }
        return maxDlugosc;
    }

    public static int najdluzszyCiagUjemnych(int[] tab){
        int maxDlugosc = 0;
        int aktualnaDlugosc = 0;

        for(int i = 0; i < tab.length; i++){
            if(tab[i] < 0){
                aktualnaDlugosc++;
                if(aktualnaDlugosc > maxDlugosc){
                    maxDlugosc = aktualnaDlugosc;
                }
            }else{
                aktualnaDlugosc = 0;
            }
        }
        return maxDlugosc;
    }

    public static void odwrocTablice(int[] tab) {
        int left = 0;
        int right = tab.length - 1;

        while (left < right) {
            // Zamiana miejscami
            int temp = tab[left];
            tab[left] = tab[right];
            tab[right] = temp;

            left++;
            right--;
        }
    }

    public static void odwrocTablice(int[] tab, int indexStart, int indexStop){
        //sprawdzenie indeksów, czy są poprawne
        if(indexStart < 0 || indexStop < 0 || indexStart >= tab.length || indexStop >= tab.length){
            System.out.println("Nieprawidłowe indeksy");
            return;
        }

        while(indexStart < indexStop){
            int temp = tab[indexStart];
            tab[indexStart] = tab[indexStop];
            tab[indexStop] = temp;

            indexStart++;
            indexStop--;
        }
    }

    public static int[] generujTablicev2(int n, int minWartosc, int maxWartosc){
        Random rand = new Random();
        int[] tablica = new int[n];

        //Losowanie pierwszej liczby z przedzialu
        tablica[0] = rand.nextInt(maxWartosc - minWartosc + 1) + minWartosc;

        int krok = rand.nextInt(10) + 1;

        for(int i = 1; i < n; i++){
            tablica[i] = tablica[i-1] + krok;
        }
        return tablica;
    }
    
    //Logiczne rozwiazanie, chodzi o zakres wartosci elementow i wyswietlanie kolejnej wartosci aby nie wypadla z zakresu
//    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
//        Random rand = new Random();
//        int[] tablica = new int[n];
//
//        // Losowanie pierwszej liczby w zadanym zakresie
//        tablica[0] = rand.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
//
//        // Losowanie kroku, który nie może spowodować przekroczenia zakresu
//        int krok = rand.nextInt(Math.abs(maxWartosc - minWartosc) / (n - 1)) + 1; // Maksymalny krok, aby nie wyjść poza zakres
//
//        // Generowanie kolejnych liczb w tablicy
//        for (int i = 1; i < n; i++) {
//            int nextValue = tablica[i - 1] + krok;
//            // Sprawdzamy, czy następna liczba mieści się w zakresie
//            if (nextValue > maxWartosc) {
//                nextValue = maxWartosc; // Jeśli przekroczy maxWartosc, ustawiamy na max
//            } else if (nextValue < minWartosc) {
//                nextValue = minWartosc; // Jeśli przekroczy minWartosc, ustawiamy na min
//            }
//            tablica[i] = nextValue;
//        }
//
//        return tablica;
//    }

    public static void main(String[] args) {

    //Zestaw 4

        //Zadanie 1
        int n = 6; int minWartosc = -10; int maxWartosc = 10;

        int[] tablica = generujTablice(n, minWartosc, maxWartosc);
        System.out.println("Wygenerowana tablica z przedziału [ " + minWartosc + ", - " + maxWartosc + " ]");
        wyswietlTablice(tablica);
        System.out.println();

        //Zadanie 2
        int m = 6;
        wypiszTablice(n, m, tablica);
        System.out.println();

        //Zadanie 3
        ileNieparzystych(tablica);
        ileParzystych(tablica);
        ileDodatnich(tablica);
        ileUjemnych(tablica);
        ileZerowych(tablica);
        ileMaxymalnych(tablica, maxWartosc);
        ileMinimalnych(tablica, minWartosc);
        ileUnikalnych(tablica);

        //Zadanie 4
        sumaDodatnich(tablica);
        sumaUjemnych(tablica);
        sumaOdwrotnosci(tablica);
        sredniaArytmetyczna(tablica);
        sredniaGeometryczna(tablica);
        sredniaHarmoniczna(tablica);

        //Zadanie 5
        int a = 2; int b = 3; int c = 4;

        int[] wynikiFunkcjaLiniowa = funkcjaLiniowa(tablica, a, b);
        System.out.println("ax+ b: ");
        wyswietlTablice(wynikiFunkcjaLiniowa);
        System.out.println();

        int[] wynikiFunkcjaKwadratowa = funkcjaKwadratowa(tablica, a, b, c);
        System.out.println("ax^2 + xb + c: ");
        wyswietlTablice(wynikiFunkcjaKwadratowa);
        System.out.println();

        int[] wynikiFunkcjaWykladnicza = funkcjaWykladnicza(tablica, a);
        System.out.println("a^x: ");
        wyswietlTablice(funkcjaWykladnicza(tablica, a));
        System.out.println();

        int[] wynikiFunkcjaSignum = funkcjaSignum(tablica);
        System.out.println("signum: ");
        wyswietlTablice(wynikiFunkcjaSignum);
        System.out.println();

        //Zadanie 6
        int najdluzszyCiagDodatnich = najdluzszyCiagDodatnich(tablica);
        System.out.println("Najdłuższy ciąg dodatnich: " + najdluzszyCiagDodatnich);
        System.out.println();

        int najdluzszyCiagUjemnych = najdluzszyCiagUjemnych(tablica);
        System.out.println("Najdłuższy ciąg liczb ujemnych: " + najdluzszyCiagUjemnych);
        System.out.println();


        System.out.println("Tablica przed odwróceniem:");
        wyswietlTablice(tablica);
        odwrocTablice(tablica);
        System.out.println("Tablica po odwróceniu:");
        wyswietlTablice(tablica);
        System.out.println();

        int indexStart = 2; int indexStop = 4;

        System.out.println("Tablica przed odwróceniem:");
        wyswietlTablice(tablica);
        odwrocTablice(tablica, indexStart, indexStop);
        System.out.println("Tablica po odwróceniu, indexStart: " + indexStart + ", indexStop: " + indexStop + ": ");
        wyswietlTablice(tablica);
        System.out.println();

        //Zadanie 7
        int[] tablicav2 = generujTablicev2(n, minWartosc, maxWartosc);

        System.out.println("Wygenerowana tablica z równymi odstępami:");
        wyswietlTablice(tablicav2);
    }
}