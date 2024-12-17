
class Shape {
    public String getName() {
        return "Shape";
    }

    public void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }

    @Override
    public String getName() {
        return "Circle";
    }
}

class Square extends Shape {
    protected double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square with side length " + sideLength);
    }

    @Override
    public String getName() {
        return "Square";
    }
}

class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Sphere with radius " + radius);
    }

    @Override
    public String getName() {
        return "Sphere";
    }
}

class Cube extends Square {
    public Cube(double sideLength) {
        super(sideLength);
    }

    public double getVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Cube with side length " + sideLength);
    }

    @Override
    public String getName() {
        return "Cube";
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Cylinder with radius " + radius + " and height " + height);
    }

    @Override
    public String getName() {
        return "Cylinder";
    }
}

class Glome extends Circle {
    public Glome(double radius) {
        super(radius);
    }

    public double getVolume() {
        return (0.5 * Math.PI * Math.PI) * Math.pow(radius, 4);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Glome with radius " + radius);
    }

    @Override
    public String getName() {
        return "Glome";
    }
}


public class ShapesApp {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        Sphere sphere = new Sphere(3.0);
        Cube cube = new Cube(2.0);
        Cylinder cylinder = new Cylinder(2.5, 7.0);
        Glome glome = new Glome(6.0);

        // Drawing shapes and displaying areas/volumes
        circle.draw();
        System.out.println("Area: " + circle.getArea());

        square.draw();
        System.out.println("Area: " + square.getArea());

        sphere.draw();
        System.out.println("Volume: " + sphere.getVolume());

        cube.draw();
        System.out.println("Volume: " + cube.getVolume());

        cylinder.draw();
        System.out.println("Volume: " + cylinder.getVolume());

        glome.draw();
        System.out.println("Volume: " + glome.getVolume());
    }
}
