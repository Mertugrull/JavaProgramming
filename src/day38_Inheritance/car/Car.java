package day38_Inheritance.car;

public class Car {

    private String brand,model;
    private int year;
    private double price;
    private String color;
    private double miles;

    public Car(String brand, String model, int year, double price, String color, double miles) {
        setBrand(brand);
        setModel(model);
        setYear(year);
        setPrice(price);
        setColor(color);
        setMiles(miles);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.out.println("invalid price " + price);
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }


    public void start(){
        System.out.println(brand+" "+model+" is starting");
    }

    public void drive(){
        System.out.println(brand+" "+model+" is driving");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
