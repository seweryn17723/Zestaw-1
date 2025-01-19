class Laptop extends UrzadzenieElektroniczne{

    @Override
    public void napraw() {
        System.out.println("Laptop jest naprawiany.");
    }

    @Override
    public void uzyj() {
        System.out.println("Laptop jest używany.");
    }

    @Override
    public void zepsuj() {
        System.out.println("Laptop jest zepsuty.");
    }

    @Override
    public void wlacz() {
        System.out.println("Laptop został włączony.");
    }

    @Override
    public void wylacz() {
        System.out.println("Laptop został wyłączony.");
    }
}
