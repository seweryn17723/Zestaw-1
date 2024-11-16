//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Zadanie 1
    public static int[] ciagArytmeycznyRodzajuM(int n, int m, int a1, int r){
        int[] tablica = new int[n];

        if(m == 1){
            tablica[0] = a1;
            for(int i = 1; i < n; i++){
                tablica[i] = tablica[i-1] + r;
            }

//            for(int i = 0; i < n; i++){
//                System.out.print(tablica[i] + ", ");
//            }
        }

     return tablica;
    }

    //Zadanie 2

    //Zadanie 3

    public static boolean czyCiagArytmetycznyRodzajuM(int[] tab, int m){

        int r = tab[1] -  tab[0];
        int ilosc = tab.length;
        int temp = 1; //bo [zaczynamy od indeksu 1]

        for(int i = 1; i < tab.length; i++){
            if(tab[i] == tab[i-1] + r){
                temp++;
            }
        }

        if(temp == ilosc){
            return true;
        }else{
            return false;
        }
    }

    //Zadanie 4
    public static void podciag(int [] tab){

        //1, 0, 2, 5, 8, 9, 1, 4

        int aktualnaDlugosc = 1;
        int maxDlugosc = 0;
        int maxWartosc = tab[0];


        for(int i = 1; i < tab.length; i++){

            if(tab[i] > maxWartosc){

                maxWartosc = tab[i];
                aktualnaDlugosc++;

                if(aktualnaDlugosc > maxDlugosc){
                    maxDlugosc = aktualnaDlugosc;
                }
            }else if (tab[i] < maxDlugosc){
                aktualnaDlugosc = 1;
                maxWartosc = tab[i];

            }
        }

        System.out.println("Najdłuższy podciąg , który tworzy rosnący ciąg jest długości = " + maxDlugosc);
    }

    //Zadanie 5


    //Zadanie 6
    public static void sekwencjaCollatza(int n, int c){

        for(int i = c; i <= n; i++){
            if(i % 2 == 0){
                System.out.print(i / 2+ ", ");
            }else{
                System.out.print((3 * i + 1) + ", ");
            }
        }
        System.out.println(" ");
    }

    //Zadanie 7
    public static void minMaxSekwencjaCollatza(int n, int c){

        int[] tablica = new int[n+1];

        for(int i = c; i <= n; i++){
            if(i % 2 == 0){
                tablica[i] = i / 2;
            }else{
                tablica[i] = 3 * i + 1;
            }
        }
        int min = tablica[c]; int max = tablica[c];

        for(int i = c; i <= n; i++){
            if(tablica[i] > max){
                max = tablica[i];
            }
            if(tablica[i] < min){
                min = tablica[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println(" ");
    }


    public static void main(String[] args) {

        //Zadanie 1
        int n = 6; int m = 1; int a1 = 12; int r = 5;

        System.out.println("Zadanie 1");
        int[] tablica = ciagArytmeycznyRodzajuM(n, m, a1, r);

        for(int i = 0; i < tablica.length; i++){
            System.out.print(tablica[i] + ", ");
        }

        System.out.println(" ");

        //Zadanie 2

        //Zadanie 3
        System.out.println(" ");
        System.out.println("Zadanie 3");
        System.out.println(czyCiagArytmetycznyRodzajuM(tablica, m));

        //Zadanie 4
        int[] tab = {1, 0, 2, 5, 8, 9, 1, 4, 5, 6, 7, 8 ,9, 10, 11};

        System.out.println(" ");
        System.out.println("Zadanie 4");
        podciag(tab);
        System.out.println(" ");

        //Zadanie 5


        //Zadanie 6
        int n_6_7 = 15; int c_6_7 = 7;

        System.out.println(" ");
        System.out.println("Zadanie 6");
        sekwencjaCollatza(n_6_7, c_6_7);

        //Zadanie 7
        System.out.println(" ");
        System.out.println("Zadanie 7");
        minMaxSekwencjaCollatza(n_6_7, c_6_7);
    }
}