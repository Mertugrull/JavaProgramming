package day38_Inheritance.shapes;

public class Square extends Shapes{

    public int side;

    public Square(String name,int side) {
        super(name);
        this.side=side;
    }

    public double area(){
        return side*side;
    }

    public double perimeter(){
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "area= " + area() +
                "perimeter= " + perimeter() +
                ", name='" + name + '\'' +
                '}';
    }
}
