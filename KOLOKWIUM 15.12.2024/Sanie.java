import java.util.HashMap;
import java.util.Map;

public class Sanie {
    private Map<Renifer, Integer> listaReniferow;

    public Sanie(){
        this.listaReniferow = new HashMap<>();
    }

    public void dodajRenifera(Renifer renifer, int ID){
        if(listaReniferow.containsKey(renifer)){
            System.out.println("Renifer " + renifer + " jest już w zaprzęgu");
        }else{
            listaReniferow.put(renifer, ID);
        }
    }

    public int sumaPredkosci(){
        int result = 0;

        for(Map.Entry<Renifer, Integer> entry: listaReniferow.entrySet()){
            Renifer renifer = entry.getKey();
            int ID = entry.getValue();

            result += renifer.getPredkosc();
        }

        return result;
    }

    @Override
    public String toString(){
        StringBuilder reniferyWZaprzegu = new StringBuilder();

        for(Map.Entry<Renifer, Integer> entry: listaReniferow.entrySet()){
            reniferyWZaprzegu.append(entry.getKey() + "\n");
        }

        return "Lista reniferów w zaprzęgu: \n" + reniferyWZaprzegu.toString();
    }

//    public void najwolniejszyRenifer(){
//        int n = 0;
//
//        for(Map.Entry<Renifer, Integer> entry: listaReniferow.entrySet()){
//            Renifer renifer = entry.getKey();
//            int ID = entry.getValue();
//
//            if(renifer.getPredkosc() < n){
//
//            }
//        }
//
//    }
}
