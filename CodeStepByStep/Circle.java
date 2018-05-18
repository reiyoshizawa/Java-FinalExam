package CodeStepByStep;

public class Circle {

    private double r;
    private final double pi = 3.14159;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        double area = r * r * pi;
        return area;
    }

    public double circumference() {
        double circumference = (r * 2) * pi;
        return circumference;
    }

    public double getRadius() {
        return r;
    }

    public String toString() {
        return "Circle{radius=" + r + "}";
    }
}
