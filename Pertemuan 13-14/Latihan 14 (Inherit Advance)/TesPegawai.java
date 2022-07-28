public class TesPegawai {
    public static boolean isNamaSama(Manager p1, Manager p2){
        String namaP1 = p1.getName().toLowerCase();
        String namaP2 = p2.getName().toLowerCase();
        if(namaP1.equals(namaP2)){
            return true;
        }else return false;
    }

    public static double max2(double a, double b){
        if(a > b){
            return a;
        }else return b;
    }

    public static void main(String[]args) {
        Manager e[] = new Manager[3];
        e[0] = new Manager();
        e[1] = new Manager(2, "Widodo", "IS", 1300.50, 300.00);
        e[2] = new Manager(2, "Joko", "Accounting", 1250.00, 100.50);
        e[0].accept(1, "Joko", "R/D", 1250.0, 20.5);

        //buat loop
        for(int i = 0; i <= 2; i++){
            e[i].display();System.out.println("");
        }

        System.out.print("Manager 1 dan Manager 3 memiliki nama yang ");
        if(isNamaSama(e[0], e[2])){
            System.out.println("sama");
        }else System.out.println("tidak sama");

        if(e[0].computeSel() > max2(e[1].computeSel(), e[2].computeSel())){
            System.out.println("Maximum Salary : "+ e[0].computeSel());
        }else if(e[1].computeSel() > max2(e[0].computeSel(), e[2].computeSel())){
            System.out.println("Maximum Salary : "+ e[1].computeSel());
        }else System.out.println("Maximum Salary : "+ e[2].computeSel());

    }
}
