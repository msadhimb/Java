package kendaraan;

public class Kendaraan {
    private String nama;
    private int tahunProduksi;

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getTahunPrroduksi(){
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi){
        this.tahunProduksi = tahunProduksi;
    }

    public Kendaraan(){

    }

    public Kendaraan(String nama, int tahunProduksi){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
    }

    public void cetak(){
        System.out.println("Nama\t\t = " + nama);
        System.out.println("Tahun Produksi\t = " + tahunProduksi);
    }
}
