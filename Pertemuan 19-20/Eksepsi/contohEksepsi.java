package Eksepsi;

import java.io.File;
import java.io.FileReader;

public class contohEksepsi {
    public static void main(String[] args) {
        System.out.println("\n");
        // checked
        File file = new File("E://file.txt");
        // FileReader fr = new FileReader(file);

        // unchecked
        int num[] = { 1, 2, 3, 4 };
        // System.out.println(num[5]);

        // try & catch
        System.out.println("try and catch #1");
        try {
            int a[] = new int[2];
            System.out.println("Akses elemen ke-3 : " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Eksepsi : " + e);
        } finally {
            System.out.println("Terima kasih telah menjalankan program");
        }

        System.out.println("try and catch #2");
        try {
            int b = 1 / 0;
            System.out.println(b);
        } catch (NullPointerException e) {
            System.out.println("Eksepsi e : " + e);
        } catch (ArithmeticException f) {
            System.out.println("Eksepsi f : " + f);
        } catch (ArrayIndexOutOfBoundsException g) {
            System.out.println("Eksepsi g : " + g);
        } catch (Exception h) {
            System.out.println("Eksepsi h " + h);
        }

        //
        System.out.println("\n");
    }
}
