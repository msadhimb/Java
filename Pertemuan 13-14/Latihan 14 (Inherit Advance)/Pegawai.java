public class Pegawai {
    private int id;
    private String name;
    private String departement;
    private double gaji;

    public Pegawai(){
        
    }

    public Pegawai(int id, String name, String departement, double gaji){
        // this.id = id;
        // this.name = name;
        // this.departement = departement;
        // this.gaji = gaji;
        setId(id);
        setName(name);
        setDepartement(departement);
        setGaji(gaji);
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDepartement(){
        return departement;
    }
    public void setDepartement(String departement){
        this.departement = departement;
    }

    public double getGaji(){
        return gaji;
    }
    public void setGaji(double gaji){
        this.gaji = gaji;
    }

    public void display(){
        System.out.println("Id\t = " + id);
        System.out.println("Nama\t = " + name);
        System.out.println("Departement\t = " + departement);
        System.out.println("Gaji\t = " + gaji);
    }
}
