
public class Bicycle {

    int speed = 0;
    int gear = 0;

    void changeGear(int newValue){
        gear += newValue;
        System.out.println("Gear = "+ gear);
    }

    void speedUp(int increament){
        speed += increament;
        System.out.println("Speed = "+ speed);
    }
    
}
