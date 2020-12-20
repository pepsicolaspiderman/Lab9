package Var4;

public class Izd {
    private String firm;
    private int yfoun;
    public void setFirm(String firma){
        firm=firma;
    }
    public void setYearFound(int year){
        yfoun = year;
    }
    public int getYearFound(){
        return yfoun;
    }
    public String getFirm(){ return firm; }
    public Izd(){
        firm = "Без названия";
        yfoun = 0;
    }
    public Izd(String firma, int year){
        firm = firma;
        yfoun = year;
    }
}
