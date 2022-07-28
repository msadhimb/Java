/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author adhim
 */
public class Library {

    /**
     * @param <Date>
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Absolut -25 = " + Math.abs(-25));
        System.out.println("Sin 0 = " + Math.sin(0) + ", cos 0 = " + Math.cos(0) +", tan 0 = " + Math.tan(0));
        System.out.println("9 pangka 3 = "+ Math.pow(9, 3));
        System.out.println("Floor 3.14 = " + Math.floor(3.14));

        System.out.println("\nClass Libraries");
        Date tanggal = new Date();
        System.out.println("Original = "+ tanggal);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMM YYYY");
        System.out.println("Format 1 = "+ sdf1.format(tanggal));
        System.out.println("Format 2 = "+ sdf2.format(tanggal));

        System.out.println("\nLibrary Calender");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 3);
        Date tigaHariLagi = cal.getTime();
        System.out.println("3 hari lagi = "+ sdf2.format(tigaHariLagi));

    }
    
}
