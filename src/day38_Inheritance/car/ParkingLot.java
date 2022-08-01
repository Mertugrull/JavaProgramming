package day38_Inheritance.car;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota=new Toyota("Toyota","Crollo",2021,20000,"white",125);

        Tesla tesla=new Tesla("Tesla","model1",2022,52000,"black",21000);

        BMW bmw=new BMW("BMW","320",2022,32000,"white",12000);

        System.out.println(toyota);

    }
}
