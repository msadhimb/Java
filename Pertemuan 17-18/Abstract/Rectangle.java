package Abstract;

public class Rectangle extends GeometriObject {
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        setWidth(width);
        setHeight(height);
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return width * height;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 2 * (width + height);
    }

}
