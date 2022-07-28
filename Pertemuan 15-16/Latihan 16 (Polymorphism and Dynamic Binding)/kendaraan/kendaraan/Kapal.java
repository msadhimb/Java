package kendaraan;

public class Kapal extends Laut{
    private int muatan;

    public int getMuatan(){
        return muatan;
    }

    public void setMuatan(int muatan){
        this.muatan = muatan;
    }

    public Kapal(){

    }

    public Kapal(String nama, int thnProduksi, boolean mesin, int muatan){
        setNama(nama);
        setTahunProduksi(thnProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }

    
    public void cetak(){
        super.cetak();
        System.out.println("Muatan\t\t = " + muatan + " orang");
    }
}
