public class Sarjana extends Murid {
    private double ipk;

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public void reset(String nama, String alamat, int noInduk, double ipk) {
        setNama(nama);
        setAlamat(alamat);
        setNoInduk(noInduk);
        setIpk(ipk);
    }

    public Sarjana() {

    }

    public Sarjana(String nama, String alamat, int noInduk, double ipk) {
        setNama(nama);
        setAlamat(alamat);
        setNoInduk(noInduk);
        setIpk(ipk);
    }

    public String predikat(double ipk) {
        if (ipk >= 2.0 && ipk < 2.75) {
            return "Memuaskan";
        } else if (ipk >= 2.76 && ipk <= 3.5) {
            return "Sangat Memuaskan";
        } else if (ipk >= 3.51 && ipk <= 4.0) {
            return "Dengan Pujian";
        } else
            return "-";

    }

    public void cetak() {
        super.cetak();
        System.out.println("Ipk\t\t = " + ipk);
        System.out.println("Predikat\t = " + predikat(ipk));
    }

}
