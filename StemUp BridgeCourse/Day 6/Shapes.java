
abstract class Shape {
    
    abstract double getArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }
}

public class Shapes {
    public static void main(String[] args) {
       
        Shape[] shapes = {
            new Circle(5),
            new Square(8),
            new Circle(9)
        };

       
        System.out.println("Areas of Shapes:");
        for (Shape s : shapes) {
            System.out.println(s.getClass().getSimpleName() + ": " + s.getArea());
        }
    }
}

