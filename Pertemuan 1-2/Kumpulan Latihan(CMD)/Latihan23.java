public class Latihan23 {
    public static void main(String[] args) {
        System.out.println("\n");
        int A = 120; int B = 1000;
        System.out.println("Titik A = "+ A +", titik B = 1000");
        int jarak = B - A;
        System.out.println("Jarak = "+ jarak);
        int perJarak = 500;
        System.out.println("Harga per jarak = Rp."+perJarak+",-");
        System.out.println("Harga jarak = Rp."+ jarak*perJarak+",-");
        
        System.out.println("=================");
        
        float phi = 3.14f;
        float jariJari = 14.0f;
        float tinggi = 10.0f;
        
        System.out.println("Phi\t = "+phi);
        System.out.println("r\t = "+jariJari);
        System.out.println("Tinggi\t = "+tinggi);
        
        float volume = phi* jariJari * jariJari *tinggi;
        System.out.println("Volume\t = "+ volume);
        if(volume >= 1000){
            System.out.println("Besar");
        }else System.out.println("Kecil");
        
    }
    
}
