public class Lingkaran {
    double r = 21;
    double phi = 3.14;
    static int jumlahLingkaran = 0;

    Lingkaran(){
        jumlahLingkaran++;
    }
    Lingkaran(double r){
        this.r = r;
        jumlahLingkaran++;
    }

    // void setJari(double newR){
    //     r = newR;
    // }
    // double getJari(){
    //     return r;
    // }
    
    double getKeliling(){
        double keliling;
        keliling = 2 * phi * r;
        return keliling;
    }
    double getLuas(){
        double luas;
        luas = phi * r * r ;
        return luas;
    }

    static int getJumlahLingkaran(){
        return jumlahLingkaran;
    }
}
