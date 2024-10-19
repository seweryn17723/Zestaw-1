import java.util.Scanner;

public class Main {

    public static void trojkiPitagorejskie(int n){
        for(int a = 1; a <= n; a++){
            for(int b =a; b <= n; b++){
                for(int c = b; c <= n; c++){
                    if(a * a + b * b == c * c){
                        System.out.println("Trójka pitagorejska: "+ a + ", " + b + ", " + c);
                    }
                }
            }
        }

    }

    //Zadanie 2

    public static void funKwaDelta(int n){
        //
    }

    //Zadanie 7

    public static int silnia(int n){

        int result = 1;

        for(int i = 1; i <= n; i++){
            result*=i;
        }

        return result;
    }

    //Zadanie 10

    public static int dwumianNewtona(int n, int k){

        int wyrazenie_z10 = (silnia(n))/(silnia(k)*(silnia((n-k))));

        return wyrazenie_z10;
    }

    public static void piramida(int n, int variant) {

        String stars_v1 = "*";

        if (variant == 1) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.println(stars_v1);
                stars_v1 += "*";
            }
        } else if (variant == 2) {
            //PIRAMIDA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        }
    }

    //Zadanie 11

    public static void ciagFibonacciego(int n){

        int el0 = 0;
        int el1 = 1;
        int el;

        for(int i = 0; i <= n; i++){

            if(i == 0){
                System.out.println("Element " + i + " : " + 0);
            }else if(i == 1){
                System.out.println("Element " + i + " : " + 1);
            } else if(i>1){

                el = el0 + el1;
                System.out.println("Element " + i + " : " + el);

                el0 = el1;
                el1 = el;
            }

        }


    }

    public static void main(String[] args) {

//        //Zadanie 1, trójka pitagorejska
//
//        Scanner zadanie1 = new Scanner(System.in);
//
//        System.out.println("Podaj zakres n: ");
//        int zakres_z1 = zadanie1.nextInt();
//
//
//        trojkiPitagorejskie(zakres_z1);
//
//        //Zadanie 6, piramida
//
//        Scanner zadanie6 = new Scanner(System.in);
//        System.out.println("Podaj wysokość piramidy: ");
//        int height = zadanie6.nextInt();
//
//        System.out.println("Podaj wariant: ");
//        int variant = zadanie6.nextInt();
//
//        piramida(height, variant);
//
//        //Zadane 7
//
//        System.out.println("Podaj liczbę całkowitą n: ");
//        Scanner zadanie7 = new Scanner(System.in);
//        int n_z7 = zadanie7.nextInt();
//
//        System.out.println(silnia(n_z7));
//
//        //Zadanie 10
//
//        Scanner zadanie10 = new Scanner(System.in);
//        System.out.println("Podaj n: ");
//        int n_z10 = zadanie10.nextInt();
//
//        System.out.println("Podaj k: ");
//        int k_z10 = zadanie10.nextInt();
//
//        System.out.println("Dwumian Newtona: " + dwumianNewtona(n_z10,k_z10));

        //Zadanie 11

        Scanner zadanie11 = new Scanner(System.in);
        System.out.println("Podaj n ilość elementów ciągu Fibonacciego: ");
        int n_z11 = zadanie11.nextInt();

        ciagFibonacciego(n_z11);

    }
}