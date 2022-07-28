public class persegiPanjangDemo{
    //main method 
    public static void main(String[] args){
        System.out.println("\nSebelum membuat objek \n Jumlah object = "+ persegiPanjang.jumlahObjek); // memanggil variabel static jumlahObjeck
        //memanggil dari class

        //object
        persegiPanjang persegiPanjang1 = new persegiPanjang();
        persegiPanjang persegiPanjang2 = new persegiPanjang(8, 5);

        System.out.println("\nLuas persegi panjang 1 = " + persegiPanjang1.panjang + " x " + persegiPanjang1.lebar + " = " + persegiPanjang1.getLuas() + "\n");

        System.out.println("Luas persegi panjang 2 = " + persegiPanjang2.panjang + " x " + persegiPanjang2.lebar + " = " + persegiPanjang2.getLuas() + "\n");

        System.out.println("Sebelum membuat objek \n Jumlah object = "+ persegiPanjang.getJumlahObjek()+ "\n");
    }
}