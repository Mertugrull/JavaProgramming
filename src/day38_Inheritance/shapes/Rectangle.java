package day38_Inheritance.shapes;

public class Rectangle extends Shapes{

    public int width;
    public int length;

    public Rectangle(String name,int width,int length) {
        super(name);
        this.width=width;
        this.length=length;
    }

    public double area(){
        return width*length;
    }

    public double perimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                "area= " + area() +
                "perimeter =" + perimeter() +
                ", length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}
