package day38_Inheritance.shapes;

public class Circle extends Shapes{

    public int radius;
    public double pi;

    public Circle(String name, int radius, double pi) {
        super(name);
        this.radius=radius;
        this.pi=pi;
    }

    public double area(){
        return radius*radius*pi;
    }

    public double perimeter(){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Square{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", perimeter= " + perimeter() +
                ", area= " + area() +
                ", name='" + name + '\'' +
                '}';
    }
}
