public class Mahasiswa {
    public String nim = "A11.2020.12641", nama = "Muhamad Salman Adhim Baqy", alamat = "Salatiga";
    public double ipk = 3.35;
    public static int jumlahMhs = 0;

    public Mahasiswa(){
        jumlahMhs++;
    }
    public Mahasiswa(String nim){
        this.nim = nim;
        jumlahMhs++;
    }
    public Mahasiswa(String nimBaru, String namaBaru, String alamatBaru, double ipkBaru){
        this.nama = namaBaru;
        this.nim = nimBaru;
        this.alamat = alamatBaru;
        this.ipk = ipkBaru;
        jumlahMhs++;
    }

    // public void setNim(String nim){
    //     this.nim = nim;
    // }
    // public String getNim(){
    //     return nim;
    // }
    // public void setNama(String nama){
    //     this.nama = nama;
    // }
    // public String getNama(){
    //     return nama;
    // }
    // public void setAlamat(String alamat){
    //     this.alamat = alamat;
    // }
    // public String getAlamat(){
    //     return alamat;
    // }
    // public void setIpk(double ipk){
    //     this.ipk = ipk;
    // }
    // public double getIpk(){
    //     return ipk;
    // }

    public String predikat(double ipk){
        if(ipk > 2.0 && ipk <= 2.75){
            return "Memuaskan";
        }else if(ipk > 2.75 && ipk <= 3.5){
            return "Sangat Memuaskan";
        }else if(ipk > 3.50 && ipk <= 4.0){
            return "Dengan Pujian";
        }else return "-";
    }
    public void cetak(){
        System.out.println("\nNama\t\t= " + nama);
        System.out.println("Alamat\t\t= " + alamat);
        System.out.println("NIM\t\t= " + nim);
        System.out.println("IPK\t\t= " + ipk);
        System.out.println("Predikat\t= " + predikat(ipk) + "\n");
    }

    public static int getJumlahMhs(){
        return jumlahMhs;
    }
}
