public class SarjanaDemo {

    public static boolean isAlamatSama(Sarjana a1, Sarjana a2) {
        String A1 = a1.getAlamat().toLowerCase();
        String A2 = a2.getAlamat().toLowerCase();
        if (A1.equals(A2)) {
            return true;
        } else
            return false;
    }

    public static double min2(double a, double b) {
        if (a < b) {
            return a;
        } else {
            b = a;
            return b;
        }
    }

    public static void main(String[] args) {
        Sarjana s[] = new Sarjana[3];
        s[0] = new Sarjana("Adhim", "Salatiga", 21, 2.00);
        s[1] = new Sarjana("Salman", "Salatiga", 23, 3.35);
        s[2] = new Sarjana();
        s[2].reset("Ahmad", "Semarang", 25, 4.00);

        for (int i = 0; i < s.length; i++) {
            s[i].cetak();
            System.out.println("");
        }

        System.out.print("Alamat Adhim dan Salman adalah");
        if (isAlamatSama(s[0], s[1]) == true) {
            System.out.println(" SAMA");
        } else
            System.out.println(" TIDAK SAMA");

        if (min2(s[0].getIpk(), s[1].getIpk()) < s[2].getIpk()) {
            System.out.println("IPK terkecil adalah " + s[0].getIpk() + " milik " + s[0].getNama() + "\n");
        } else if (min2(s[1].getIpk(), s[2].getIpk()) < s[0].getIpk()) {
            System.out.println("IPK terkecil adalah " + s[1].getIpk() + " milik " + s[1].getNama() + "\n");
        } else
            System.out.println("IPK terkecil adalah " + s[2].getIpk() + " milik " + s[2].getNama() + "\n");
    }
}
