public class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public Circle() {
        radius = 10.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double g) {
        radius = g;
    }
    
    public double getArea() {
        return (Math.PI) * (Math.pow(radius, 2)) * 0.5;
    }
}