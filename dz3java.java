class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            throw new RuntimeException("There is no figure with such parameters.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double perimeter() {
        return a + b + c;
    }
}
public class dz3java {
    public static void main(String[] args) {
        try {
            Rectangle rectangle = new Rectangle(5, 10);
            System.out.println("Rectangle area: " + rectangle.area());
            System.out.println("Rectangle perimeter: " + rectangle.perimeter());

            Circle circle = new Circle(7);
            System.out.println("Circle area: " + circle.area());
            System.out.println("Circle perimeter: " + circle.perimeter());

            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println("Triangle area: " + triangle.area());
            System.out.println("Triangle perimeter: " + triangle.perimeter());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
