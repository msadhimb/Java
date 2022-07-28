public class Piramida {
    private double panjang;
    private double lebar;
    private double tinggi;
    private static int jumlahPyramid = 0;

    public Piramida(){
        jumlahPyramid++;
    }
    public Piramida(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        jumlahPyramid++;
    }


    public void setRincian(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double getPanjang(){
        return panjang;
    }
    public double getLebar(){
        return lebar;
    }
    public double getTinggi(){
        return tinggi;
    }

    
    public double luasPermukaan(){
        double luasAlas, segitiga1, segitiga2, tinggiSegitiga1, tinggiSegitiga2, luasSegitiga1, luasSegitiga2, luasPermukaan;
        luasAlas = panjang * lebar;
        segitiga1 = panjang/2;
        segitiga2 = lebar/2;
        tinggiSegitiga1 = Math.sqrt((segitiga1*segitiga1)+(tinggi*tinggi));
        tinggiSegitiga2 = Math.sqrt((segitiga2*segitiga2)+(tinggi*tinggi));
        luasSegitiga1 = lebar*tinggiSegitiga1/2;
        luasSegitiga2 = panjang*tinggiSegitiga2/2;
        luasPermukaan = luasAlas + (2*luasSegitiga1) + (2*luasSegitiga2);
        return luasPermukaan;
    }
    public double volumePiramid(){
        return panjang * lebar * tinggi / 3;
    }

    public static int getJumlahPyramid(){
        return jumlahPyramid;
    }
}
