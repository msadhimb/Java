/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siakad;

/**
 *
 * @author adhim
 */
public class Mhs implements Nilai {
    public String nim, nama;
    double vUts, vUas, vTugas;
    double pUts, pUas, pTugas;
    double nilaiAkhir;
    char nHuruf;
    String predikat;
    
    //konstruktor
    public Mhs(String nim, String nama, double vUts, double vUas, double vTugas){
        this.nim = nim;
        this.nama = nama;
        this.vUts = vUts;
        this.vUas = vUas;
        this.vTugas = vTugas;
    }
    
    public double uts(){
        return vUts * 35/100;
    }
    
    public double uas(){
        return vUas * 35/100;
    }
    
    public double tugas(){
        return vTugas * 30/100;
    }
    
    public double nilaiAkhir(){
        return uts() + uas() + tugas();
    }

    @Override
    public char getNilHuruf(double nilaiAkhir) {
        if(nilaiAkhir >= 85.0){
            nHuruf = 'A';
        }else if(nilaiAkhir >= 70.0 && nilaiAkhir < 85.0){
            nHuruf = 'B';
        }else if(nilaiAkhir >= 60.0 && nilaiAkhir < 70.0){
            nHuruf = 'C';
        }else if(nilaiAkhir >= 40.0 && nilaiAkhir < 60.0){
            nHuruf = 'D';
        }else{
            nHuruf = 'E';
        }
        return nHuruf;
    }

    @Override
    public String getPredikat(char nHuruf) {
      switch(nHuruf){
          case 'A':
              predikat = "Memuaskan";
              break;
          case 'B':
              predikat = "Baik";
              break;
          case 'C':
              predikat = "Cukup";
              break;
          case 'D':
              predikat = "Dongo";
              break;
          case 'E':
              predikat = "Mbolosan";
              break;
      }  
      return predikat;
    }
    
}
