/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg10.Asosiation;

/**
 *
 * @author adhim
 */
public class Student {
    // atribute
    private String name;
    private Course[] listCourse = new Course[1000];
    private int countCourse;
    
    //method   
    public Student(String name){
        this.name = name;
        //punya class = inputan
    }
    
    public String getNameStudent(){
        return name;
    }
    public void takeCourse(Course c){
        listCourse[countCourse] = c;
        countCourse++;
    }
    public Course[] getListCourse(){
        return listCourse;
    }
    public int getCountCourse(){
        return countCourse;
    }
    
    public static void main(String[]args){
        
    }
}
