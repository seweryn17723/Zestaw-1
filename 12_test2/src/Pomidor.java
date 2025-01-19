//Zadanie 6

public class Pomidor extends Warzywo{

    @Override
    public String smak() {
        return "Pomidor jest kwaśny";
    }

    @Override
    public void umyj() {
        System.out.println("Pomidor został umyty");
    }

    @Override
    public void zjedz() {
        System.out.println("Pomdor został zjedzony");
    }
}
