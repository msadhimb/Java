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
public class Faculty {
    //atribute
    private String teacher;
    private Course[] listCourse = new Course[3];
    private int countCourse;
    
    //method
    public Faculty(String teacher){
        this.teacher = teacher;
    }
    public String getNameTeacher(){
        return teacher;
    }
    public void teachCourse(Course c){
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
