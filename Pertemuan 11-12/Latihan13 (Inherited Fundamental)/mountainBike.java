public class mountainBike extends Bicycle{
    int seatHeight;

    public void setHeight(int newValue){
        seatHeight = newValue;
        System.out.println("Seat height = "+ seatHeight);
    }
    public static void main(String[]args) {
        mountainBike mb = new mountainBike();
        mb.speedUp(10); // method dari superclass
        mb.changeGear(2); // method dari superclass
        mb.setHeight(20); // method dari dia sendiri atau subclass
    }
}
