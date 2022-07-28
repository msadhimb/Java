public class MahasiswaDemo {
    public static void main(String[]args){
        System.out.println("\nJumlah Mahasiswa = " + Mahasiswa.getJumlahMhs());

        Mahasiswa mahasiswa1 = new Mahasiswa();
        System.out.print("\nTanpa insialisasi dari konstruktor namun terinisialisasi dari property");    
        // mahasiswa1.nama("Muhamad Salman Adhim Baqy");
        // mahasiswa1.setNim("A11.2020.12641");
        // mahasiswa1.setIpk(2.5);
        // mahasiswa1.setAlamat("Salatiga");
        mahasiswa1.cetak();

        Mahasiswa mahasiswa2 = new Mahasiswa("A11.2050.12000");
        System.out.print("Dengan inisialisasi dari konstruktor berupa nim dan inisialisisasi dari properti"); 
        // mahasiswa2.setNama("Irenea Putri Dewana");
        // mahasiswa2.setIpk(3.00);
        // mahasiswa2.setAlamat("Singapore");
        mahasiswa2.cetak();

        Mahasiswa mahasiswa3 = new Mahasiswa("A11.2065.17000", "Tania Putri Dewana", "Singapore", 4.0);
        System.out.print("Dengan inisialisasi dari konstruktor dengan mengganti inisialisasi dari properti dengan inisialisasi di konstruktor"); 
        mahasiswa3.cetak();

        System.out.println("Jumlah Mahasiswa = " + Mahasiswa.getJumlahMhs() + "\n");
    }
}
