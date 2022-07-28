/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg2.pkg3;

/**
 *
 * @author adhim
 */
public class Latihan23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        float volume = phi * jariJari * jariJari *tinggi;
        System.out.println("Volume\t = "+ volume);
        if(volume >= 1000){
            System.out.println("Besar");
        }else System.out.println("Kecil");
        
    }
    
}
