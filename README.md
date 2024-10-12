# Zestaw-1

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        //Zadanie 1

        String imie= "Seweryn";
        String nazwisko = "Zbikowski";

        System.out.println(imie + " " + nazwisko );   //Wypisanie ciagu znakow

        int length = imie.length() + nazwisko.length(); //Zliczenie ilosci znakow

        //Zadanie 2

        System.out.println("Ilosc liter: " + length);

        //Zadanie 3

        String w1 = "Ala "; String w2 = "ma "; String w3 = "kota";

        System.out.println(w1 + w2 + w3);

        //Zadanie 4

        System.out.println("                    *        \n                    * *      \n                    * * *    \n* * * * * * * * * * * * * *  \n* * * * * * * * * * * * * * *\n* * * * * * * * * * * * * *\n                    * * *    \n                    * *      \n                    *        ");

        System.out.println("     *\n    * *    \n   * * *   \n  * * * *  \n * * * * * \n* * * * * *\n * * * * * \n  * * * *  \n   * * *   \n    * *    \n     *");

        //Zadanie 5

        String zdanie = w1 + w2 + w3;

        System.out.println(zdanie.replace('a', 'e'));

        //Zadanie 6

        System.out.println("A".toLowerCase() + "la ma kota.".toUpperCase());

        //Zadanie 7

        System.out.println("A = "+(int)'A');
        System.out.println("! = "+(int)'!');
        System.out.println("@ = "+(int)'@');
        System.out.println("> = "+(int)'>');
        System.out.println("~ = "+(int)'~');
        System.out.println("\\n = "+(int)'\n');
        System.out.println("\\b = "+(int)'\b');

        //Zadanie 8

        System.out.println(("Duze litery w ASCII znajduja sie w przedzialach A = "+(int)'A') + (" Z = "+(int)'Z'));
        System.out.println(("Male litery w ASCII znajduja sie w przedzialach a = "+(int)'a') + (" z = "+(int)'z'));

        //Zadanie 9

        String Grzesiek = "Grzesiek nie wiedział dlaczego ... jest tak drapieżnym ... mimo, że jego ... na to nie wskazuje.".replace("...", "dylizans rozpusty" );
        System.out.println(Grzesiek);

        //Zadanie 10

        String regex = "...";
        String ksiazka = ("... to najlepsza ksiazka napisana przez ...".replaceFirst(regex, "Akademia Pana Kleksa")).replace("...", "Andrzeja Grabowskiego");

        System.out.println(ksiazka);

        //Zadanie 11

        String zadanie11 = "wodrze";

        for(int i = 0; i < 4; i++){
            zadanie11 += "wodrze";
        }

        System.out.println(zadanie11);

        //Zadanie 12

        LocalDate Data = LocalDate.now();
        LocalTime Time = LocalTime.now();

        System.out.println("Dzisiaj jest "+Data+" godzina "+Time);

        //Zadanie 13

        System.out.println("54 = "+(char)54);
        System.out.println("103 = "+(char)103);
        System.out.println("241 = "+(char)241);
        System.out.println("67 = "+(char)67);
        System.out.println("999 = "+(char)999);
        System.out.println(length+" = "+(char)length);
        System.out.println("175236 = "+(char)175236);
    }
}

// for (int i = 1; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }

//        for (int i = 0; i < len; i++){
//            char c = zdanie7.charAt(i);
//
//            if(c >= 65 && c <= 95){
//                c=+32;
//            }
//            if(c >= 97 && c <= 122){
//                c-=32;
//
//            }
//        }
