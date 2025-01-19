public class Main {
    //Zadanie 3
    public interface MediaPlayer{
        void play(String trackname);
        void pause();
        String getCurrentTrack();
    }

    //Zadanie 5
    public interface Authenication{
        boolean login(String username, String password);
        void logout();
        boolean resetPassword(String username, String oldPassword, String newPassword);
    }

    //Zadanie 6

    public static <T extends Comparable<T>> void sortDescending(T[] tablica){

        int j = 0;
        T temp = tablica[j];

        for(int i = 0; i < tablica.length; i++){

        }
    }


    public static void main(String[] args) {

        //Zadanie 1
        Building budynek = new Building(25, "white");
        House dom = new House(15, "yellow", 13);

        //Zadanie 2
        Bitmap z = new Bitmap();

        z.loadFile();
        z.saveFile();

        //Zadanie 3

        AudioPlayer muzyka = new AudioPlayer();
        System.out.println(muzyka.getCurrentTrack());
        muzyka.pause();
        muzyka.play("Utwor");

        VideoPlayer wideo = new VideoPlayer();
        System.out.println(wideo.getCurrentTrack());
        muzyka.pause();
        muzyka.play("Wideo");

        //Zadanie 4
        Storage chleb = new Storage<>("Chleb");
        Storage liczba = new Storage(23);

        System.out.println(chleb.retrive());
        System.out.println(liczba.retrive());

        liczba.store(1.22);
        chleb.store(77);

        System.out.println(chleb.retrive());
        System.out.println(liczba.retrive());

        //Zadanie 5
        //admin
        System.out.println("\nAdmin\n");
        AdminAuthentication admin = new AdminAuthentication();

        System.out.println(admin.login("Terminator", "123Zbyszek"));
        admin.logout();
        System.out.println(admin.login("Terminator", "Zbigniew"));

        admin.resetPassword("Terminator", "123Zbyszek", "Zbyszko3Cytryny");
        System.out.println(admin.login("Terminator", "123Zbyszek"));

        //user
        System.out.println("\nUser\n");
        UserAuthentication user = new UserAuthentication();

        System.out.println(user.login("Joker", "synMłynarza"));
        user.logout();
        System.out.println(user.login("Joker", "synKominiarza"));

        user.resetPassword("Joker", "synMłynarza", "Aligator");
        System.out.println(admin.login("Joker", "synMłynarza"));

        //Zadanie 6


    }
}