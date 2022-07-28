public class PiramidaDemo {
    public static void main(String[]args){
        System.out.println("\nJumlah Piramid = " + Piramida.getJumlahPyramid());

        Piramida piramid1 = new Piramida();
        piramid1.setRincian(24, 24, 9);
        System.out.println("\nLuas Permukaan Piramida 1 = " + piramid1.luasPermukaan());
        System.out.println("Volume Piramida 1 = " + piramid1.volumePiramid());
        
        Piramida piramid2 = new Piramida(24, 12,9);
        System.out.println("\nLuas Permukaan Piramida 2 = " + piramid2.luasPermukaan());
        System.out.println("Volume Piramida 2 = " + piramid2.volumePiramid());
        
        System.out.println("\nJumlah Piramid = " + Piramida.getJumlahPyramid() +"\n");
    }
}
