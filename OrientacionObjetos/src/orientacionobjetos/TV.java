package orientacionobjetos;

/**
 *
 * @author DAM1
 */
public class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on;

    //constructor
    public TV() {}
    
    public TV(int channel, int volumeLevel, boolean on){
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }
    
    public void turnOn(){
        on = true;
    }
    
    public void turnOff(){
        on = false;
    }

    public void setChannel(int Newchannel) {
    //this hace referencia al objeto que esta instanciado
        if((on)&&(Newchannel>0 && Newchannel<121))
            this.channel = Newchannel;
    }

    public void setVolumeLevel(int volumeLevel) {
    //this hace referencia al objeto que esta instanciado
        if((on)&&(volumeLevel>0 && volumeLevel<8))        
        this.volumeLevel = volumeLevel;
    }
    
    public void channelUp(){
        if(on){
        channel++;
        if(channel > 120) channel=1;}
    }
    
    public void channelDown(){
       channel--;
       if(channel <1) channel=120;
    }
    
    public void volumenUp(){
        if(on){
            if(volumeLevel>7)volumeLevel++;
            else volumeLevel = 1;
        }
     
    }
    
    public void volumenDown(){
    
    }
    
    @Override
    public String toString(){ 
        return "Canal: " + this.channel + 
                " volumen: " + this.volumeLevel; }
}
