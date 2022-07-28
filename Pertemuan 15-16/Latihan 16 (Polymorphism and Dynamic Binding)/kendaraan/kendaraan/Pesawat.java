package kendaraan;

public class Pesawat extends Udara{
    private int muatan;

    public int getMuatan(){
        return muatan;
    }

    public void setMuatan(int muatan){
        this.muatan = muatan;
    }

    public Pesawat(){

    }

    public Pesawat(String nama, int tahunProduksi, boolean mesin, int muatan){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }

    public void cetak(){
        super.cetak();
        System.out.println("Muatan\t\t = " + muatan + " orang");
    }
}
