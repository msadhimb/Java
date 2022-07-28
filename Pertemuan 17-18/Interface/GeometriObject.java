package Interface;

public abstract class GeometriObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometriObject() {
        dateCreated = new java.util.Date();
    }

    protected GeometriObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public String toString() {
        return "Created on " + dateCreated + "\nColor : " + color + " and filled : " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
