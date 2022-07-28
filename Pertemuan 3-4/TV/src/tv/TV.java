/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv;

/**
 *
 * @author adhim
 */
public class TV {

    /**
     * @param args the command line arguments
     */
    boolean on = false;
    int channel = 1;
    int volumeLevel = 1;
    
    public TV(){
    
    }
    
    void turnOn(){
        on = true;
        if(on = true){
        
        }
    }
    void turnOff(){
        on = false;
    }
    
    void setChannel(int newChannel){
        channel = newChannel;
    }
    void setVolume(int newVolume){
        volumeLevel = newVolume;
    }
    
    void channelUp(){
        channel += 1;
    }
    void channelDown(){
        channel -= 1;
    }
    
    void volumeUp(){
        volumeLevel += 1;
    }
    void volumeDown(){
        volumeLevel -= 1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        
        System.out.println("Tv1's channel is "+ tv1.channel +" and volume level is "+ tv1.volumeLevel);
        System.out.println("Tv2's channel is "+ tv2.channel +" and volume level is "+ tv2.volumeLevel);
    }
    
}
