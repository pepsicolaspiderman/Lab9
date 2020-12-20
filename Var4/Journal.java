package Var4;

public class Journal extends Izd{
    private String name;
    private String genre;
    private int year;
    private int month;

    public Journal(){
        super();
        name = "";
        genre = "";
        year = 2000;
        month = 01;
    }
    public Journal(String firm, int yfoun, String name, String g, int y, int m){
        super(firm, yfoun);
        name = name;
        genre = g;
        year = y;
        month = m;
    }
    public void setName(String name){ name = name;}
    public String getName(){ return name;}
    public void setGenre(String g){ genre =g;}
    public String getGenre(){ return genre;}
    public void setYear(int y){ year = y;}
    public int getYear(){ return year;}
    public void setMonth(int m){ month = m;}
    public int getMonth(){ return month;}

    public String toString(){
        return "\n\tЖурнал"+"\n\t"+"Издатель: "+getFirm()+"\n\t"+"Год создания издаетельства: "
                +getYearFound()+"\n\t"+"Название: "+name+"\n\t"+"Жанр: "+genre+"\n\t"+
                "Год выпуска: "+year+"\n\t"+"Месяц выпуска: "+month;
    }
}
