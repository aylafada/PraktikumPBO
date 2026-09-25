package Kuis1;    

public class Termostat {
    private int suhu;
    public Termostat() {
        suhu=4;
    }
    public int getSuhu() {
        return suhu;
    }
    public void naik() {
        if (suhu<7) {
            suhu++;
        } else {
              System.out.println("Suhu diluar batas aman (1-7 C)");

        }
    }
    public void turun() {
        if(suhu>1) {
            suhu--;
        } else {
        System.out.println("Suhu diluar batas aman (1-7 C)");
        }
    } 
}
