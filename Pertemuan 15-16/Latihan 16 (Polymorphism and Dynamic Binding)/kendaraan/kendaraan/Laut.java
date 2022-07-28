package kendaraan;

public class Laut extends Kendaraan{
    private boolean mesin;

    public boolean getMesin(){
        return mesin;
    }

    public void setMesin(boolean mesin){
        this.mesin = mesin;
    }

    public Laut(){

    }

    public Laut(String nama, int tahunProduksi, boolean mesin){
        super(nama, tahunProduksi);
        setMesin(mesin);
    }

    public void cetak(){
        super.cetak();
        System.out.print("Mesin\t\t = ");
        if(mesin == true){
            System.out.println("Ada");
        }else System.out.println("Tidak Ada");
    }
}
