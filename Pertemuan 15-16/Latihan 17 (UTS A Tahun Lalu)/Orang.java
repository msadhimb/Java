public class Orang {
    private String nama;
    private String alamat;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Orang() {

    }

    public Orang(String nama, String alamat) {
        setNama(nama);
        setAlamat(alamat);
    }

    public void cetak() {
        System.out.println("Nama\t\t = " + nama);
        System.out.println("Alamat\t\t = " + alamat);
    }
}
