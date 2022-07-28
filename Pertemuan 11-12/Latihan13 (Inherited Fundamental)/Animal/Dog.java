package Animal;
public class Dog extends Mammal{

  String color = "Black";

  Dog(){
    super("Land");//jika tidak memunculkan super, maka memanggil konstruktor parent yang tidak ada inputan
    System.out.println("Dog is created");
  }  

  void printColor(){
    System.out.println("My parent color is " + super.color); // memanggil variabel color dari parent
    System.out.println("And my color is " + color);
  }

  String eat(){
    return super.eat() + "Dog eat bone";
    //super.eat() memanggil method eat milik parent
  }
}
