import java.util.Scanner;

public class Main {

        //Zadanie 1

        public static void wyswietlTyp(double result, String variableName) {                                    //variableName - wyswietlanie stringa przy wyniku
                System.out.println(variableName + " = " + result + " ------ Typ wyniku: " + ((Object) result).getClass().getSimpleName());
        }

        public static void wyswietlTyp(int result, String variableName) {
                System.out.println(variableName + " = " + result + " ------ Typ wyniku: " + ((Object) result).getClass().getSimpleName());
        }



    public static void main(String[] args) {
        //Zestaw 2

            //Zadanie 1

            double result_z1_1 = 23.0 + 76;
            double result_z1_2 = 41 * 2.0 + 3;
            double result_z1_3 = 5 - 33;
            double result_z1_4 = 109 % 3;
            int result_z1_5 = 50 / 2;
            int result_z1_6 = 4 | 2;         // | to OR
            double result_z1_7 = Math.pow(3, 5);
            int result_z1_8 = 7 & 9;         // & to AND

            wyswietlTyp(result_z1_1, "23.0 + 76");
            wyswietlTyp(result_z1_2, "41 * 2.0 + 3");
            wyswietlTyp(result_z1_3, "5 - 33");
            wyswietlTyp(result_z1_4, "109 % 3");
            wyswietlTyp(result_z1_5, "50 / 2");
            wyswietlTyp(result_z1_6, "4 | 2");
            wyswietlTyp(result_z1_7, "3 ^ 5");
            wyswietlTyp(result_z1_8, "7 & 9");

            //Zadanie 2

            double result_z2_1 = ((((Math.pow(7,0.5)) - 1)/(2)) + Math.pow(3, 3) % 2);

            int rokUrodzenia = 2003, dzienUrodzenia = 17, miesiacUrodzenia = 7;
            int result_z2_2 = (rokUrodzenia/(dzienUrodzenia * miesiacUrodzenia));

            int a = 3; int b = 4; int c = 5;
            double result_z2_3 = a % b % c;

            double result_z2_4 = (((3 + Math.pow(3, 0.5))/(((Math.pow(5, 0.5)/2))/3)) + 1);

            String nazwisko = "Zbikowski", imie = "Seweryn";
            double result_z2_5 = (nazwisko.length() % imie.length() + 1)/(Math.pow(2, 0.25));

            System.out.println("Wynik 1 operacji: " + result_z2_1);
            System.out.println("Wynik 2 operacji: " + result_z2_2);
            System.out.println("Wynik 3 operacji: " + result_z2_3);
            System.out.println("Wynik 4 operacji: " + result_z2_4);
            System.out.println("Wynik 5 operacji: " + result_z2_5);


            //Zadanie 3
            Scanner String_z3_1 = new Scanner(System.in);
            System.out.println("Podaj pierwsze słowo: ");
            String word_z3_1 = String_z3_1.nextLine();

            Scanner String_z3_2 = new Scanner(System.in);
            System.out.println("Podaj drugie słowo: ");
            String word_z3_2 = String_z3_2.nextLine();

            System.out.println("Pierwsze słowo: " + word_z3_1 + ", drugie słowo: " + word_z3_2);

            //Zadanie 4
            Scanner number_z4_1 = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            int num_z4_1 = number_z4_1.nextInt();

            Scanner number_z4_2 = new Scanner(System.in);
            System.out.println("Podaj kolejną liczbę: ");
            int num_z4_2 = number_z4_2.nextInt();

            int suma = num_z4_1 + num_z4_2;
            int roznica = num_z4_1 - num_z4_2;
            int iloczyn = num_z4_1 * num_z4_2;
            double iloraz = (double)num_z4_1 / (double)num_z4_2;

            System.out.println("Suma tych liczb jest równa: " + suma);
            System.out.println("Różnica tych liczb jest równa: " + roznica);
            System.out.println("Iloczyn tych liczb jest równy: " + iloczyn);
            System.out.println("Iloraz tych liczb jest równy: " + iloraz);

            //Zadanie 5

            Scanner number_z5_1 = new Scanner(System.in);
            System.out.println("Podaj liczbę: ");
            int num_z5_1 = number_z5_1.nextInt();

            int result_z5_1 = num_z5_1 + 140;
            int result_z5_2 = num_z5_1 - 31;
            int result_z5_3 = num_z5_1 * 7;
            double result_z5_4 = (double)num_z5_1 / 13;
            int result_z5_5 = num_z5_1 % 7;
            int result_z5_6 = num_z5_1 / 4;
            double result_z5_7 = Math.pow(num_z5_1, 45);
            int result_z5_8 = num_z5_1 & 67;
            int result_z5_9 = num_z5_1 | 59;
            int result_z5_10 = num_z5_1 ^ 23;
            int result_z5_11 = num_z5_1 << 5;
            int result_z5_12 = num_z5_1 >> 6;

            System.out.println(num_z5_1 + " powiększona o 140: " + result_z5_1);
            System.out.println(num_z5_1 + " pomniejszona o 31: " + result_z5_2);
            System.out.println(num_z5_1 + " powiększona 7 razy: " + result_z5_3);
            System.out.println(num_z5_1 + " pomniejszona 13 razy: " + result_z5_4);
            System.out.println(num_z5_1 + " modulo 7: " + result_z5_5);
            System.out.println(num_z5_1 + " część całkowita z dzielenia przez 4: " + (int)result_z5_6);
            System.out.println(num_z5_1 + " podniesiona do potęgi 45: " + result_z5_7);
            System.out.println(num_z5_1 + " iloraz bitowy z 67: " + result_z5_8);       //AND
            System.out.println(num_z5_1 + " suma bitowa z 59: " + result_z5_9);         //OR
            System.out.println(num_z5_1 + " XOR z 23: " + result_z5_10);
            System.out.println(num_z5_1 + " przesunięta o 5 bitów w lewo: " + result_z5_11);
            System.out.println(num_z5_1 + " przesunięta o 6 bitów w prawo: " + result_z5_12);

    }
}