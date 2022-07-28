import java.util.ArrayList;

public class ArrayListDemo{
    public static void main(String[]args) {
        ArrayList a1= new ArrayList();
        System.out.println("\nUkuran awal a1: " + a1.size());
        a1.add(3.14);
        a1.add('D');
        a1.add(4);
        a1.add(1, "A2");
        System.out.println("Ukuran a1 setelah penambahan: "+ a1.size());
        System.out.println("Isi dari a1: "+ a1);
        a1.remove(3);
        System.out.println("Ukuran a1 setelah pengurangan: "+ a1.size());
        System.out.println("Isi dari a1: "+ a1 +"\n");
    }
}