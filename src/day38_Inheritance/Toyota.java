package day38_Inheritance;

public class Toyota extends Car{
    public Toyota(String brand, String model, int year, double price, String color, double miles) {
        super(brand, model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(getBrand()+" "+getModel()+" is reliable");
    }
}
