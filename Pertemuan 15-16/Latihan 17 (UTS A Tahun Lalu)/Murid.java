public class Murid extends Orang {
    private int noInduk;

    public int getNoInduk() {
        return this.noInduk;
    }

    public void setNoInduk(int noInduk) {
        this.noInduk = noInduk;
    }

    public Murid() {

    }

    public Murid(String nama, String alamat, int noInduk) {
        setNama(nama);
        setAlamat(alamat);
        setNoInduk(noInduk);
    }

    public void cetak() {
        super.cetak();
        System.out.println("Nomor Induk\t = " + noInduk);
    }
}
