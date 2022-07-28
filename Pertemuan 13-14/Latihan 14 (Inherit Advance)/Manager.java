public class Manager extends Pegawai{
    private double bonus;
    
    public Manager(){

    }
    public Manager(int id, String name, String departement, double gaji, double bonus){
        super(id, name, departement, gaji);
        this.bonus = bonus;
        //setBonus(bonus);
    }

    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double computeSel(){
        return getGaji()+bonus;
    }
    
    
    public void accept(int id, String name, String departement, double gaji, double bonus){
        setId(id);
        setName(name);
        setDepartement(departement);
        setGaji(gaji);
        setBonus(bonus);
    }

    public void display(){
        super.display();
        System.out.println("Bonus\t = "+ bonus);
    }

}
