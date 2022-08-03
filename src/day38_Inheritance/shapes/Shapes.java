package day38_Inheritance.shapes;

public class Shapes {

    public String name;

    public Shapes(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                "area='" + area() +
                '}';
    }
}
