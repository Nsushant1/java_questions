package Lab1;

class Rectangle {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea() {
        return length * breadth;
    }

    double getPerimeter() {
        return 2 * (length + breadth);
    }
}

class Square {
    double side;

    Square(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }

    double getPerimeter() {
        return 4 * side;
    }
}

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}

public class AreaPer {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle(4, 5);
        Square sq = new Square(8);
        Circle cr = new Circle(7);

        System.out.println("Rectangle: Area = " + rc.getArea() + ", Perimeter = " + rc.getPerimeter());
        System.out.println("Square: Area = " + sq.getArea() + ", Perimeter = " + sq.getPerimeter());
        System.out.println("Circle: Area = " + cr.getArea() + ", Perimeter = " + cr.getPerimeter());

    }
}
