import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Fabryka {
    private Map<Elf, Integer> listaPracownikow;
    private double dlGeo;
    private double szGeo;

    public Fabryka(double dlGeo, double szGeo){
        this.listaPracownikow = new HashMap<>();
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
    }

    public void dodajPracownika(Elf elf, int ID){
        if (listaPracownikow.containsKey(elf)) {
            System.out.println("Jest już taki pracownik w fabryce.");
        }else{
            listaPracownikow.put(elf, ID);
        }
    }

    public void usunPracownika(Elf elf, int ID){
        if(listaPracownikow.containsKey(elf)){
            listaPracownikow.put(null, null);
        }else{
            System.out.println("Nie ma takiego pracownika w fabryce.");
        }
    }

    public double getSzGeo(){
        return this.szGeo;
    }

    public void setSzGeo(double szGeo){
        if(szGeo > 90 || szGeo < -90){
            throw new IllegalArgumentException("Szerokość geograficzna jest niepoprawna.");
        }
        this.szGeo = szGeo;
    }

    public double getDlGeo(){
        return this.dlGeo;
    }

    public void setDlGeo(double dlGeo){
        if(dlGeo > 180 || dlGeo < -180){
            throw new IllegalArgumentException("Długość geograficzna jest niepoprawna.");
        }
        this.dlGeo = dlGeo;
    }

    @Override
    public String toString(){
        StringBuilder fabryka = new StringBuilder();

        for(Map.Entry<Elf, Integer> entry: listaPracownikow.entrySet()){
            fabryka.append(entry.getKey() + "\n");
        }

        return "Długość geograficzna fabryki: " + dlGeo + ", szerokość geograficzna: " + szGeo + ",\nLista pracowników" + fabryka.toString();
    }

//    public void najstarszyPracownik(){
//        int n = 0;
//        Elf najstarszyElf;
//
//        for(Map.Entry<Elf, Integer> entry: listaPracownikow.entrySet()){
//            Elf elf = entry.getKey();
//            int ID = entry.getValue();
//
//            if(elf.getWiek() > n){
//                n = elf.getWiek();
//
//            }
//        }
//    }
}
