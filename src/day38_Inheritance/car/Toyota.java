package day38_Inheritance.car;

import day38_Inheritance.car.Car;

public class Toyota extends Car {
    public Toyota(String brand, String model, int year, double price, String color, double miles) {
        super(brand, model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(getBrand()+" "+getModel()+" is reliable");
    }

    public void start(){
        System.out.println("You need key to start engine");
    }
}
