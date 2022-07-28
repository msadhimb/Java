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
public class Course {
    // atribute
    private String nameCourse;
    private Student[] listStudent = new Student[60];
    private int countStudent;
    private Faculty[] listFaculty = new Faculty[3];
    private int countFaculty;
    
    //method
    public Course(String nameCourse){
        this.nameCourse = nameCourse;
    }
    public String getNamaCourse(){
        return nameCourse;
    }
    public void addStudent(Student s){
        listStudent[countStudent] = s;
        countStudent++;
    }
    public Student[] getStudent(){
        return listStudent;
    }
    public int getCountStudent(){
        return countStudent;
    }
    public void setFaculty(Faculty f){
        listFaculty[countFaculty] = f;
        countFaculty++;
    }
    public Faculty[] getFaculty(){
        return listFaculty;
    }
    public int getCountFaculty(){
        return countFaculty;
    }
    public void printStudent(){
        for(int i = 0; i < countStudent; i++){
            System.out.print(listStudent[i].getNameStudent() + ", ");
        }
    }
    public void printTeacher(){
        for(int i = 0; i < countFaculty; i++){
            System.out.print(listFaculty[i].getNameTeacher() + ", ");
        }
    }
    
    public static void main(String[]args){
        Course pbo = new Course("PBO"); //konstruktor nya ada inputan nama course
        Course web = new Course("Web");
        
        pbo.setFaculty(new Faculty("Nurul Anisa"));
        pbo.setFaculty(new Faculty("Abas Setiawan"));
        
        web.setFaculty(new Faculty("Nurul Anisa"));
        web.setFaculty(new Faculty("Syaifur Rohman"));
        //teacher adalah objek dari fakulti
        
        //set student
        pbo.addStudent(new Student("Ilham Maulana"));
        pbo.addStudent(new Student("Ikromi Latifano"));
        
        web.addStudent(new Student("Daffa Radhitya"));
        web.addStudent(new Student("Rizqi Akbar"));
        
        //print
        System.out.println("=== Matkul UDINUS ===");
        System.out.println("1. PBO");
        System.out.println("Dosen : ");
        pbo.printTeacher();
        System.out.println("\nMurid sejumlah " + pbo.getCountStudent() + " mahasiswa = ");
        pbo.printStudent();
        System.out.println("\n2. Web");
        System.out.println("Dosen : ");
        web.printTeacher(); // void atau procedur jadi bisa dipanggil langsung
        System.out.println("\nMurid sejumlah " + web.getCountStudent() + " mahasiswa = ");
        //jika fungsi harus dipanggil di sout atau diletakkan dalam variabel
        web.printStudent();
        
    }
}
