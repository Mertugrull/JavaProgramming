package day38_Inheritance.car;

public class BMW extends Car {
    public BMW(String brand, String model, int year, double price, String color, double miles) {
        super(brand, model, year, price, color, miles);
    }

    public void breaksDown(){
        System.out.println(getBrand()+" "+getModel()+" has breaks down");
    }

    public void racing(){
        System.out.println(getBrand()+" "+getModel()+" is racing");
    }

    public void start(){
        System.out.println("call engine to start");
    }
}
