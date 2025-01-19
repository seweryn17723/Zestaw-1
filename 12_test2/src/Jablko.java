//Zadanie 6

class Jablko extends Warzywo {

    @Override
    public String smak(){
        return "Jabłko jest słodkie";
    }

    @Override
    public void umyj(){
        System.out.println("Jabłko zostało umyte");
    }

    @Override
    public void zjedz(){
        System.out.println("Jabłko zostało zjedzone");
    }

}
