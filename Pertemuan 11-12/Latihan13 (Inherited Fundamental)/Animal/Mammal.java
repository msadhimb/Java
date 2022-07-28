package Animal;
public class Mammal extends Animal {
    
    Mammal(){
        super(); // memanggil konstruktor parent, ada atau tidak kode ini akan tetap otomatis memanggil konstruktor parent
        System.out.println("Mammal is created");
    }

    Mammal(String desc){
        System.out.println(desc + " mammal is created");
    }
    //Mammal merupakan method dengan nama sama namun inputan berbeda disebut overloading

    String eat(){
        String e = "Mammal eat ... ";
        return e;
    }
}
