package BusReservation;

public class Bus {
    private int Busno;
    private boolean Ac;
    private int capacity;
    Bus(int no,boolean ac,int cap){
        this.Busno=no;
        this.Ac=ac;
        this.capacity=cap;
    }
    public int getcap(){
        return capacity;
    }
    public void setcap(int n){
        capacity=n;
    }
    public boolean getAc(){
        return Ac;
    }
    public void setAc(boolean m){
        Ac=m;
    }
    public int getbusno(){
        return Busno;
    }
    public void displayBusInfo(){
        System.out.println("Busno:"+Busno+" Ac:"+Ac+" Capacity:"+capacity);
    }
}
