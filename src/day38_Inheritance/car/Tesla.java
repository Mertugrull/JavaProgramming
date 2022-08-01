package day38_Inheritance.car;

import day38_Inheritance.car.Car;

public class Tesla extends Car {

    public Tesla(String brand, String model, int year, double price, String color, double miles) {
        super(brand, model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(getBrand()+" " +getModel()+" has auto pilot");
    }

    public void start(){
        System.out.println("voice control to start " + getBrand());
    }



}
