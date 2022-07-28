/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author adhim
 */
public class Percobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");

		byte a = 100;
		short b = 10000;
		int c = 1000000; int c2 = 123456; int c3;
		c3 = c + c2;
		float f = 234.5f;
		double d = 123.4;
		char letterA = 'A';
		String pbo = "pbo";

		System.out.println("int c = "+c+"\ndouble d = "+d);
		System.out.print(letterA+" - "+pbo+"\n");
		System.out.println(c +" + "+ c2 +" + "+ c3);
		// harus disave

		float IPK = 3.8f;
		//jika if 1 line maka tidak perlu kurung kurawal
		if(IPK >= 3.5 && IPK <= 4){
			System.out.println("Cumlaude");
		}else if(IPK >= 3 && IPK <3.5){
			String kategori = "Sugoi";
			System.out.println("kategori");
		}else if(IPK >= 0 && IPK <3){
			System.out.println("Belajar lagi ya");
		}else{
			System.out.println("Salah itu berat, kamu akan kuat. Coba lagi aja!");
		}

		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.print(j+" ");
			}
			System.out.println(i);
		}
    }
    
}
