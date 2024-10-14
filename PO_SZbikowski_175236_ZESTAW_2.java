import java.awt.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //Zestaw 2

        //Zadanie 1

        System.out.println("Zadanie 1\n");

        double result1 = 23.0 + 76;
        double result2 = 41 * 2.0 + 3;
        double result3 = 5 - 33;
        int result4 = 109 % 3;
        double result5 = 50 * 0.5;
        double result6 = 4 * 0.5;
        double result7 = Math.pow(3, 5);
        double result8 = 7 & 9;

        System.out.println("23.0 + 76 = " + result1);
        System.out.println("41 * 2.0 + 3 = " + result2);
        System.out.println("5 - 33 = " + result3);
        System.out.println("109 % 3 = " + result4);
        System.out.println("50 / 2 = " + result5);
        System.out.println("4 / 2 = " + result6);
        System.out.println("3^5 = " + result7);
        System.out.println("7 & 9 = " + result8);

        //Zadanie 2

        System.out.println("\nZadanie 2\n");

        double wyrazenie1 = (((Math.sqrt(7) - 1) * 0.5) + (Math.pow(3, 3)) % 2);

        System.out.println("Rzutowany wynik (1) = " + (int)wyrazenie1);
 
        int rok_urodzenia = 2003; int dzien_urodzenia = 17; int miesiac_urodzenia = 7;
        double wyrazenie2 = rok_urodzenia/(dzien_urodzenia/miesiac_urodzenia);

        System.out.println("Rzutowany wynik (2) = " + (int)wyrazenie2);

        double wyrazenie3 = ((3 + Math.sqrt(3)) / ((Math.sqrt(5) / 2) / 3)) + 1;

        System.out.println("Rzutowany wynik (3) = " + (int)wyrazenie3);

        int a = 3; int b = 4; int c = 5;
        double wyrazenie4 = a%b%c;

        System.out.println("Rzutowany wynik (4) = " + (int)wyrazenie4);

        String imie = "Seweryn"; String nazwisko = "Zbikowski";

        double wyrazenie5 = ((nazwisko.length() % imie.length()) + 1)/(Math.pow(2, 0.25));

        System.out.println("Rzutowany wynik (5) = " + (int)wyrazenie5);

        //Zadanie 3

        System.out.println("\nZadanie 3\n");

        Scanner pobieranie1 = new Scanner(System.in);

        System.out.println("Podaj pierwsze słowo: ");
        String pierwsze_slowo = pobieranie1.nextLine();

        System.out.println("Podaj drugie słowo: ");
        String drugie_slowo = pobieranie1.nextLine();

        System.out.println("Pierwsze slowo: " + pierwsze_slowo + ", drugie slowo: " + drugie_slowo);

        //Zadanie 4

        System.out.println("\nZadanie 4\n");

        Scanner pobieranie2 = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe calkowita: ");
        int pierwszaliczba = pobieranie2.nextInt();

        System.out.println("Podaj druga liczbe calkowita: ");
        int drugaliczba = pobieranie2.nextInt();

        System.out.println("Suma = " + (pierwszaliczba+drugaliczba));
        System.out.println("Roznica = " + (pierwszaliczba-drugaliczba));
        System.out.println("Iloczyn = " + (pierwszaliczba*drugaliczba));
        System.out.println("Iloraz = " + (double)(pierwszaliczba/drugaliczba));

        pobieranie2.close();

        //Zadanie 5

        System.out.println("\nZadanie 5\n");

        Scanner pobieranie3 = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe calkowita: ");
        double liczbazad5 = pobieranie3.nextDouble();

        System.out.println("Podana liczba: " + liczbazad5);
        System.out.println("Powiekszona o 140: " + (liczbazad5 + 140));
        System.out.println("Pomniejszona o 31: " + (liczbazad5 - 31));
        System.out.println("Powiekszona 7 razy: " + (liczbazad5 * 7));
        System.out.println("Pomniejszona 13 razy: " + (liczbazad5 / 13));
        System.out.println("Modulo 7: " + (liczbazad5 % 7));
        //DOKONCZYC!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //DOKONCZYC!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //DOKONCZYC!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        //DOKONCZYC!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println("Czesc calkowita z dzielenia przez 4: " + (liczbazad5 / 4));
        System.out.println("Podniesona do potegi 45: " + (Math.pow(liczbazad5, 45)));
        System.out.println("Iloraz bitowy z 67: " + "brak informacji");
        System.out.println("Suma bitowa z 59: " + "brak informacji");
        System.out.println("Iloraz bitowy z 67: " + "brak informacji");
        System.out.println("XOR z 23: " + "brak informacji");
        System.out.println("Przesunięta o 5 bitow w lewo" + "brak informacji");
        System.out.println("Przesunieta o 6 bitow w prawo: " + "brak informacji");

        pobieranie3.close();


    }
}