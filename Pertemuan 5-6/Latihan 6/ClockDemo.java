public class ClockDemo {
    public static void main(String[]args){
        ClockDisplay cd = new ClockDisplay();
        //constructor pertama, limit 24 ja, menit 60
        System.out.println(cd.displayString);
        //memanggil var. displayString
        cd.setTime(11, 56);
        System.out.println("After setTime = " + cd.displayString);
        cd.timeTick(); //tambah 1 detik
        System.out.println("After setTime = " + cd.displayString);
        System.out.println("");
        
        ClockDisplay cd1 = new ClockDisplay();
        //konstruktor kedua, limit sesuai inputan jam 12, menit 60
        System.out.println(cd1.displayString);
        System.out.println("After setTime = " + cd.displayString);
        cd.timeTick(); //tambah 1 detik
        System.out.println("After setTime #1 = " + cd.displayString);
        cd.timeTick(); //tambah 1 detik
        System.out.println("After setTime #2 = " + cd.displayString);
        System.out.println("");

    }
}
