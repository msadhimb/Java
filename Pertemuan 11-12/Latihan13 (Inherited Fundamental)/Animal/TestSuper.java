package Animal;
public class TestSuper {
    
    public static void main(String[]args){
        //Mammal m = new Mammal();
        Dog d = new Dog();
        System.out.println("Color = " + d.color);
        d.printColor();
        
        System.out.println(d.eat());
        // jika di test super dipanggil d.eat maka yang keluar adalah method eat dari dog
    }
}
