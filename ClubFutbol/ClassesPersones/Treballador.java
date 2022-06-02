package ClassesPersones;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Treballador extends Persona implements Serializable{
    private int nss;
    private int soubase;
    protected double souFinal;
    private int numempleat;
    private static int contempleat;

    public Treballador(String dni, String nom, String cognoms, LocalDate datanaixement, int telefon, String email, int nss, int soubase) {
        super(dni, nom, cognoms, datanaixement, telefon, email);
        this.nss = nss;
        this.soubase = soubase;

        this.numempleat = contempleat++;
    }

    public Treballador(){
        
    }

    public int getNumempleat() {
        return numempleat;
    }

    public static void setNumempleat(int numempleat2) {
        contempleat = numempleat2;
    }

    public long getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public int getSoubase() {
        return soubase;
    }

    public void setSoubase(int soubase) {
        this.soubase = soubase;
    }

    public double getSouFinal() {
        return souFinal;
    }

    @Override
    public String toString() {
        return "Treballador [" + super.toString() + "nss=" + nss + ", numempleat=" + numempleat + ", soubase=" + soubase + "]";
    }

    
    

    
    

    
}
