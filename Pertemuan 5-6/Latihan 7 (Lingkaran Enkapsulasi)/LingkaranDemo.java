public class LingkaranDemo {
    public static void main(String[]args){
        System.out.println("\nJumlah Lingkaran = " + Lingkaran.getJumlahLingkaran());
        
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("\nTanpa inisialisasi");
        System.out.println("\tLuas Lingkaran = "+ lingkaran.getLuas());
        System.out.println("\tKeliling Lingkaran = "+ lingkaran.getKeliling());

        Lingkaran lingkaran1 = new Lingkaran();
        System.out.println("\nJari-jari diinisialisasi melalui property (21)");
        System.out.println("\tLuas Lingkaran-1 = "+ lingkaran1.getLuas());
        System.out.println("\tKeliling Lingkaran-1 = "+ lingkaran1.getKeliling());

        
        Lingkaran lingkaran2 = new Lingkaran(14);
        System.out.println("\nJari jari diinisialisasi melalui konstruktor (14)");
        System.out.println("\tLuas Lingkaran-2 = "+ lingkaran2.getLuas());
        System.out.println("\tKeliling Lingkaran-2 = "+ lingkaran2.getKeliling());
        
        System.out.println("\nJumlah Lingkaran = " + Lingkaran.getJumlahLingkaran() + "\n");
        
    }
}
