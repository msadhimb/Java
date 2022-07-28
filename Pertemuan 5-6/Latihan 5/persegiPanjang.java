public class persegiPanjang{
    //properti atau attribute
    public int panjang;
    public int lebar;
    public static int jumlahObjek = 0;

    //method
    persegiPanjang(){
        jumlahObjek++; //increament
    }
    persegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
        jumlahObjek++;
    }
    //persegiPanjang() disebut konstruktor, dan overloading method dimana nama method sama namun berbeda parameter

    //method static
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
    int getLuas(){
        return panjang * lebar;
    }
    int getKeliling(){
        return 2 * (panjang * lebar);
    }
}