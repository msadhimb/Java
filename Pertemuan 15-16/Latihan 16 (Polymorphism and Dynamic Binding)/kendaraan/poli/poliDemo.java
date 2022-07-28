package poli;

import kendaraan.*;

public class poliDemo {
    public static void printName(Kendaraan ken){
        System.out.println("\n======" + ken.getNama() + "======\n");
    }

    public static void printToString(Kendaraan ken){
        ken.cetak();
    }

    public static void main(String[] args) {
        Kapal k = new Kapal("Kapal Titanic", 1990, true, 2224);
        Pesawat p = new Pesawat("Garuda Boeing 777", 1990, true, 305);

        printName(k);
        printToString(k);
        printName(p);
        printToString(p);
    }
}
