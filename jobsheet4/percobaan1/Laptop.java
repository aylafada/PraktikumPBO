package jobsheet4.percobaan1;

public class Laptop {
    private String merk;
    private Processor proc;

    // Konstruktor default
    public Laptop() {
    }

    // Konstruktor berparameter
    public Laptop(String merk, Processor proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk(String merk) {
        return merk;
    } 

    public void setProc(Processor proc) {
        this.proc = proc;
    }

    public Processor getProc(Processor proc)  {
        return proc;
    }

    public void info() {
        System.out.println("Merk Laptop = " + merk);
        if (proc != null) {
            proc.info();
        }
    }
}