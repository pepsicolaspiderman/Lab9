import java.util.Scanner;

public class testGarage {
    public static void main(String[] args) {
        GarageCar myGarage=new GarageCar();
        Car myCar1=new Car("Ford", "Mustang", 200, 2, false, "б222бб");
        myGarage.addCar(myCar1); //
        myGarage.addCar(new Car("LADA", "Kalina", 140, 4, false, "в333вв"));
        Truck myTruck=new Truck("Dove", 160, "DTS", 700, true, "г444гг");
        myGarage.addCar(myTruck);
        myGarage.printGarage();
        if (myGarage.findCar(myCar1)) {
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }
        System.out.print("Введите номер машины, которую хотите удалить: ");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        myGarage.delete(--index);
        System.out.println("Машина номер " + ++index +" была удалена");
        myGarage.printGarage();
}}
