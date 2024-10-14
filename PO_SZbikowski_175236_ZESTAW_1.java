import java.time.LocalDate; import java.time.LocalTime;

public class Main { public static void main(String[] args) {
    //Zadanie 1

        System.out.println("Zadanie 1\n");

            String imie= "Seweryn";
            String nazwisko = "Zbikowski";

            System.out.println(imie + " " + nazwisko );   //Wypisanie ciagu znakow

            int length = imie.length() + nazwisko.length(); //Zliczenie ilosci znakow

    //Zadanie 2

        System.out.println("\nZadanie 2\n");

            System.out.println("Ilosc liter: " + length);

    //Zadanie 3

        System.out.println("\nZadanie 3\n");

            String w1 = "Ala "; String w2 = "ma "; String w3 = "kota";

            System.out.println(w1 + w2 + w3);

    //Zadanie 4

        System.out.println("\nZadanie 4\n");

            System.out.println("                    *        \n                    * *      \n                    * * *    \n* * * * * * * * * * * * * *  \n* * * * * * * * * * * * * * *\n* * * * * * * * * * * * * *\n                    * * *    \n                    * *      \n                    *        ");

            System.out.println("     *\n    * *    \n   * * *   \n  * * * *  \n * * * * * \n* * * * * *\n * * * * * \n  * * * *  \n   * * *   \n    * *    \n     *");

    //Zadanie 5

        System.out.println("\nZadanie 5\n");

            String zdanie = w1 + w2 + w3;

            System.out.println(zdanie.replace('a', 'e'));

    //Zadanie 6

        System.out.println("\nZadanie 6\n");

            System.out.println("A".toLowerCase() + "la ma kota.".toUpperCase());

    //Zadanie 7

        System.out.println("\nZadanie 7\n");

            System.out.println("A = "+(int)'A');
            System.out.println("! = "+(int)'!');
            System.out.println("@ = "+(int)'@');
            System.out.println("> = "+(int)'>');
            System.out.println("~ = "+(int)'~');
            System.out.println("\\n = "+(int)'\n');
            System.out.println("\\b = "+(int)'\b');

    //Zadanie 8

        System.out.println("\nZadanie 8\n");

            System.out.println(("Duze litery w ASCII znajduja sie w przedzialach A = "+(int)'A') + (" Z = "+(int)'Z'));
            System.out.println(("Male litery w ASCII znajduja sie w przedzialach a = "+(int)'a') + (" z = "+(int)'z'));

    //Zadanie 9

        System.out.println("\nZadanie 9\n");

            String Grzesiek = "Grzesiek nie wiedział dlaczego ... jest tak drapieżnym ... mimo, że jego ... na to nie wskazuje.".replace("...", "dylizans rozpusty" );
            System.out.println(Grzesiek);

    //Zadanie 10

        System.out.println("\nZadanie 10\n");

            String regex = "...";
            String ksiazka = ("... to najlepsza ksiazka napisana przez ...".replaceFirst(regex, "Akademia Pana Kleksa")).replace("...", "Andrzeja Grabowskiego");

            System.out.println(ksiazka);

    //Zadanie 11

        System.out.println("\nZadanie 11\n");

            String zadanie11 = "wodrze";

            for(int i = 0; i < 4; i++){
                zadanie11 += "wodrze";
            }

            System.out.println(zadanie11);

    //Zadanie 12

        System.out.println("\nZadanie 12\n");

            LocalDate Data = LocalDate.now();
            LocalTime Time = LocalTime.now();

            System.out.println("Dzisiaj jest "+Data+" godzina "+Time);

    //Zadanie 13

        System.out.println("\nZadanie 13\n");

            System.out.println("54 = "+(char)54);
            System.out.println("103 = "+(char)103);
            System.out.println("241 = "+(char)241);
            System.out.println("67 = "+(char)67);
            System.out.println("999 = "+(char)999);
            System.out.println(length+" = "+(char)length);
            System.out.println("175236 = "+(char)175236);
    }
}
