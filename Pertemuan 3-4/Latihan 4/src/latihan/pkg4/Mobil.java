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
public class Mobil {
    //atribute atau variabel
    String warna;
    int tahunProduksi, gigi = 0;
    
    //constructor
    public Mobil(){
        //tidak melakukan apapun, default, boleh tidak dibuat
    }
    public Mobil(String warna, int tahunProduksi){
        this.warna = warna;
        //variabel warna milik class mobil diisi variabel warna dari inputan
        this.tahunProduksi = tahunProduksi;
    }
    
    //method atau fungsi
    void setWarna(String warnaMobil){ //prosedur settter
        warna = warnaMobil;
    }
    String getWarna(){// method getter
        return warna;
    }
    void setTahunProduksi(int tahunProduksi){ //prosedur setter
        this.tahunProduksi = tahunProduksi;
    }
    int getTahunProduksi(){ //method getter
        return tahunProduksi;
    }
    
    void tambahGigi(){
        gigi += 1;
        System.out.println("Gigi sekarang = "+ gigi);
    }
    
    void kurangGigi(){
        gigi -= 1;
        System.out.println("Gigi sekarang = "+ gigi);
    }
}
