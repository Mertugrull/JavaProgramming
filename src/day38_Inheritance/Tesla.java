package day38_Inheritance;

public class Tesla extends Car{

    public Tesla(String brand, String model, int year, double price, String color, double miles) {
        super(brand, model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(getBrand()+" " +getModel()+" has auto pilot");
    }
}
