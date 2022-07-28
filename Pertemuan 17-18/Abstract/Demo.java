package Abstract;

public class Demo {
    private static boolean equalArea(GeometriObject geoObj1, GeometriObject geoObj2) {
        return geoObj1.getArea() == geoObj2.getArea();
    }

    private static void displayGeometriObject(GeometriObject geoObj) {
        System.out.println("\nThe area is " + geoObj.getArea());
        System.out.println("The perimeter is " + geoObj.getPerimeter());
        System.out.println("The color is " + geoObj.getColor());
        System.out.println("Created on " + geoObj.getDateCreated());
    }

    public static void main(String[] args) {
        GeometriObject geoObj1 = new Circle(5);
        GeometriObject geoObj2 = new Rectangle(5, 3);

        System.out.println("\nIs the two object have the same area? " + equalArea(geoObj1, geoObj2));

        // Display circle
        displayGeometriObject(geoObj1);

        // Display rectangle
        displayGeometriObject(geoObj2);

        System.out.println("");

    }

}
