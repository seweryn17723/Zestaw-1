public class Main {
    public static void main(String[] args) {
      Elf elf1 = new Elf("Jarek", 56, "górnik");
      Elf elf2 = new Elf("Zbigniew", 44, "zdun");
      Elf elf3 = new Elf("Wiesław", 24, "elektryk wysokich napięć");

      elf1.przedstawSie();

      Fabryka fabryka1 = new Fabryka(17, 17);

      fabryka1.dodajPracownika(elf1, 1);
      fabryka1.dodajPracownika(elf2, 2);
      fabryka1.dodajPracownika(elf3, 3);

      fabryka1.usunPracownika(elf2, 2);

      Renifer renifer1 = new Renifer("Kazik", 35);
      Renifer renifer2 = new Renifer("Lech", 15);
      Renifer renifer3 = new Renifer("Piotr", 25);

      System.out.printf("\n" + renifer1.toString());

      renifer1.nakarmRenifera();

      System.out.println("\n" + renifer1.toString());

      Sanie sanie1 = new Sanie();

      sanie1.dodajRenifera(renifer1, 1);
      sanie1.dodajRenifera(renifer2, 2);
      sanie1.dodajRenifera(renifer3, 3);

      System.out.println("\nSuma prędkości reniferów w zaprzęgu: " + sanie1.sumaPredkosci());

      System.out.println(fabryka1.toString());

      System.out.println(sanie1.toString());
    }
}