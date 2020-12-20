package Var4;

public class Books extends Izd{
    private String name;
    private String autor;
    private int pages;
    private int year;

    public Books(){
        super();
        name = "";
        autor = "";
        pages = 100;
        year = 2000;
    }
    public Books(String firm, int yfoun, String name, String a, int p, int y){
        super(firm, yfoun);
        name = name;
        autor = a;
        pages = p;
        year = y;
    }
    public void setName(String name){ name = name; }
    public String getName(){ return name;}
    public void setAutor(String a){ autor = a;}
    public String getAutor(){ return autor;}
    public void setPages(int p){ pages = p;}
    public int getPages(){ return pages;}
    public void setYear(int y){ year = y;}
    public int getYear(){ return year;}

    public String toString(){
        return "\n\tКнига"+"\n\t"+"Издатель: "+getFirm()+"\n\t"+"Год создания издельства: "
                +getYearFound()+"\n\t"+"Название: "+name+"\n\t"+"Автор: "+autor+"\n\t"
                +"Количетсво страниц: "+pages+"\n\t"+"Год издания: "+year;
    }
}
