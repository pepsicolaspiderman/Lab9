package Var4;

public class test {
    public static void main(String[]args){
        Magazine newMag = new Magazine();
        Books myBook1 = new Books("ЭКСМО", 1991, "Тайные виды на гору Фудзи", "Виктор Пелевин", 416, 2020);
        newMag.addMag(myBook1);
        newMag.addMag(new Books("АСТ",1990,"Сияние","Стивен Кинг",544,1977));
        newMag.addMag(new Books("РОСМЭН",1992,"Милн А. Винни-Пух и все-все-все","Алан Милн",384,2001));

        Journal myJour = new Journal("дадая",2000,"Журнал","Политика",2020,11);
        newMag.addMag(myJour);
        newMag.addMag(new Journal("hehe",2001,"The Journal", "Садоводство", 2020, 10));
        newMag.printMagazine();
        newMag.kolAll();
    }
}
