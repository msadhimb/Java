package Abstract;

public class Circle extends GeometriObject {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        setRadius(radius);
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return radius + radius;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * radius * Math.PI;
    }

}
