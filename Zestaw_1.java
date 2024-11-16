import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        //Zestaw 1

            //Zadanie 1
            System.out.println("Seweryn Żbikowski");

            //Zadanie 2
            String word = "Ciąg znaków";
            System.out.println(word + " składa się z: " + word.length() + " znaków");

            //Zadanie 3
            System.out.println("Ala, " + "ma " + "kota" );

            //Zadanie 4
            //Rysowanie strzałek, etc. Warto zwrócić uwagę na "/n"

            //Zadanie 5
            String zdanie = "Ala ma kota";
            String replacedLetter = zdanie.replace("a", "e");

            System.out.println("Zdanie przed zamianą liter: " + zdanie + "\n" + "Zdanie po zmianie litery a na literę e: " +replacedLetter);

            //Zadanie 6
            System.out.println("A".toLowerCase() + "la ma kota.".toUpperCase());

            //Zadanie 7
            char litera = 'A'; char wykrzyknik = '!'; char malpa = '@';
            char znak_wiekszosci = '>'; char tylda = '~'; char new_line = '\n';
            char back_space = '\b';

            System.out.println(litera + " kod w ASCII: " + (int)litera);
            System.out.println(wykrzyknik + " kod w ASCII: " + (int)wykrzyknik);
            System.out.println(malpa + " kod w ASCII: " + (int)malpa);
            System.out.println(znak_wiekszosci + " kod w ASCII: " + (int)znak_wiekszosci);
            System.out.println(tylda + " kod w ASCII: " + (int)tylda);
            System.out.println("\\n" + " kod w ASCII: " + (int)new_line);
            System.out.println("\\b" + " kod w ASCII: " + (int)back_space);

            //Zadanie 8
            System.out.println("Małe litery w ASCII znajdują się w przedziałach: " + ((int)'a') + " : " + (int)'z');
            System.out.println("Duże litery w ASCII znajdują się w przedziałach: " + ((int)'A') + " : " + (int)'Z');

            //Zadanie 9
            String zdanie_z9 = ("Grzesiek nie wiedział dlaczego ... jest tak drapieżnym ... mimo, że jego ... na to nie wskazuje.");
            String replaced_zdanie_z8 = zdanie_z9.replace("...", "kiwi");

            System.out.println("Zdanie przed zmianą: " + zdanie_z9 + "\nZdanie po zmianie: " + replaced_zdanie_z8);

            //Zadanie 10
            String regex = "...";
            String zdanie_z10 = ("... to najelpsza książka napisana przez ...");
            String changed_zdanie_z10 = (zdanie_z10.replaceFirst(regex, "Akademia Pana Kleksa").replace("...", "Andrzeja Grabowskiego"));

            System.out.println("Zdanie przed zmianami: " + zdanie_z10);
            System.out.println("Zdanie po zmianach: " + changed_zdanie_z10);

            //Zdanie 11

            String slowo_z11 = "wodrze";
            System.out.println("String przed zmianami: " + slowo_z11);

            for(int i = 0; i < 3; i ++){      // 0 1 2 3 == 4 iteracje
                slowo_z11 +=  slowo_z11;
            }

            System.out.println("String po zmianach: " + slowo_z11);

            //Zadanie 12
            LocalDate Data = LocalDate.now();
            LocalTime Czas = LocalTime.now();

            System.out.println("Dziś jest " + Data + ", godzina: " + Czas);

            //Zadanie 13
            System.out.println("Liczba 54 kryje pod sobą znak: " + (char)54);
            System.out.println("Liczba 103 kryje pod sobą znak: " + (char)103);
            System.out.println("Liczba 241 kryje pod sobą znak: " + (char)241);
            System.out.println("Liczba 67 kryje pod sobą znak: " + (char)67);
            System.out.println("Liczba 9999 kryje pod sobą znak: " + (char)9999);
            String imie = "Seweryn"; String nazwisko = "Żbikowski"; int ilosc_liter = imie.length() + nazwisko.length();
            System.out.println("Ilosc liter w imieniu i nazwisku " + imie + " " + nazwisko + " " + "kryje pod sobą znak: " + (char)ilosc_liter);
            System.out.println("Liczba 54 kryje pod sobą znak: " + (char)54);
            System.out.println("Numer indeksu 1752364 kryje pod sobą znak: " + (char)1752364);
    }
}