/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4;

/**
 *
 * @author adhim
 */
public class Circle {
    //atribut
    double radius=1;
    
    //method
        //konstruktor
    Circle(){
        
    }
    Circle(double newRadius){
        radius = newRadius;
    }
        //method fungsi
    double getArea(){
        return radius*radius*Math.PI;
    }
    double getPerimeter(){
        return 2*radius*Math.PI;
    }
    void setRadius(double newRadius){
        // prosedur setter
        radius = newRadius;
    }
    
    public static void main(String[]args){
        //object harus didalam method main
        Circle circle1 = new Circle(); //radius 1 sudah default
        Circle circle2 = new Circle(25); //set radius dari konstruktor
        Circle circle3 = new Circle();
        circle3.setRadius(125); //set radius dari prosedur setter
        
        System.out.println("Luas circle = "+ circle1.getArea());
        System.out.println("Keliling circle = "+ circle1.getPerimeter());
        System.out.println("Luas circle 2 = "+ circle2.getArea());
        System.out.println("Keliling circle 2 = "+ circle2.getPerimeter());
        System.out.println("Luas circle 3 = "+ circle3.getArea());
        System.out.println("Keliling circle 3 = "+ circle3.getPerimeter());
    }
}
