package Var4;

import java.util.ArrayList;

public class Magazine {
    private ArrayList<Izd> mag = new ArrayList<Izd>();
    public void addMag(Izd m){ mag.add(m); }
    public Magazine(){}
    public Magazine(ArrayList<Izd> n){ mag = n;}

    public void printMagazine(){
        System.out.println("В магазине: ");
        for (Izd a:mag){
            System.out.println("\t"+a.toString());
        }
    }
    public void kolAll(){
        int b = 0;
        int j = 0;
        for (Izd a:mag){
            if(a instanceof Books){
                b++; }
            else if (a instanceof Journal){
                j++; }
        }
        System.out.println("\nКоличество книг в магазине: "+b
                +"\nКоличество журналов в магазине: "+j);
    }
}
