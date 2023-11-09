import java.util.Scanner;

class Shape {
    String shape;

    Shape() {
        // Default constructor
    }

    void getArea() {
        System.out.println("Enter the shape (circle/rectangle/triangle) to calculate the area:");
        Scanner input = new Scanner(System.in);
        shape = input.nextLine();

        if (shape.equals("circle")) {
            double pi = 3.14;
            System.out.println("Enter the radius to calculate the area:");
            double r = input.nextDouble();
            double area = pi * r * r;
            System.out.println("This is the area of the circle: " + area);
        } else if (shape.equals("rectangle")) {
            System.out.println("Enter the length to calculate the area:");
            double l = input.nextDouble();
            System.out.println("Enter the width to calculate the area:");
            double w = input.nextDouble();
            double area = l * w;
            System.out.println("This is the area of the rectangle: " + area);
        } else if (shape.equals("triangle")) {
            System.out.println("Enter the base length to calculate the area:");
            double base = input.nextDouble();
            System.out.println("Enter the height to calculate the area:");
            double height = input.nextDouble();
            double area = 0.5 * base * height;
            System.out.println("This is the area of the triangle: " + area);
        } else {
            System.out.println("Invalid shape entered. Please enter circle, rectangle, or triangle.");
        }
    }
}

class Circle extends Shape {
    Circle() {
        super(); // Call the constructor of the superclass (Shape)
    }

    // You can add additional methods specific to the Circle class here if needed
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getArea();
    }
}
