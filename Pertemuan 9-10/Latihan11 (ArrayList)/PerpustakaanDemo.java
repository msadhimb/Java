import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PerpustakaanDemo {
    public static void main(String[]args) {
        Set<String> buku = new TreeSet<String>();

        buku.add("Dilan 1990");
        buku.add("Laskar Pelangi");
        buku.add("Mahaguru");
        buku.add("Mengejar Matahari");
        buku.add("Dilan 1991");
        buku.add("Milea");
        buku.add("Perahu Kertas");
        buku.add("Laskar Pelangi");
        buku.add("Perahu Kertas");

        System.out.println("\nDaftar buku secara urut : ");
        int i = 1;
        for(Iterator<String> iterator = buku.iterator(); iterator.hasNext();){
            String string = (String) iterator.next();
            System.out.println(i +". "+ string);
            i++;
        }
        System.out.println("\n");
        
        System.out.println("Daftar buku setelah pengurangan : ");
        int j = 1;
        if(buku.contains("Mahaguru")){
            buku.remove("Mahaguru");
            for(Iterator<String> iterator = buku.iterator(); iterator.hasNext();){
                String string = (String) iterator.next();
                System.out.println(j +". "+ string);
                j++;
            }
        }else{
            for(Iterator<String> iterator = buku.iterator(); iterator.hasNext();){
                String string = (String) iterator.next();
                System.out.println(j +". "+ string);
                j++;
            }      
        }
        System.out.println("\n");
           
    }
}
