/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4;

/**
 *
 * @author adhim
 */
public class MobilDemo {
    public static void main(String[]args){
        Mobil mobilku = new Mobil(); //object
        //memanggil konstruktor ke 1 tanpa inputan
        Mobil mobilmu = new Mobil("Black Pink", 2020); //object
        //memanggil konstruktor ke 2 dengan 2 inputan
        
        /*mobilku.warna =  "Merah";
        mobilku.tahunProduksi = 2018;*/
        mobilku.setWarna("Merah");//setter
        mobilku.setTahunProduksi(2018);//setter
        /*System.out.println("Mobilku warna = "+ mobilku.warna); //atribut
        System.out.println("Mobilku tahun = "+ mobilku.tahunProduksi); //atribut*/
        System.out.println("Mobilku warna = "+ mobilku.getWarna()); //getter
        System.out.println("Mobilku tahun = "+ mobilku.getTahunProduksi()); //getter
        
        mobilku.tambahGigi(); //method
        mobilku.tambahGigi(); //method
        mobilku.kurangGigi(); //method
        
        
        /*mobilmu.warna = "Black Pink";
        mobilmu.tahunProduksi = 2020;*/
        System.out.println("\n\nMobilku warna = "+ mobilmu.warna); //atribut
        System.out.println("Mobilku tahun = "+ mobilmu.tahunProduksi); //atribut
        mobilmu.tambahGigi(); //method
        
    }
}
