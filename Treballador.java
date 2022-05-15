package ClubFutbol;

import java.time.LocalDate;

public abstract class Treballador extends Persona{
    private static int numempleat;
    private int nss;
    private int soubase;

    public Treballador(String dni) {
        super(dni);
    }

    public Treballador(String dni, String nom, String cognoms, LocalDate datanaixement, String telefon, String email,
            int numempleat, int nss, int soubase) {
        super(dni, nom, cognoms, datanaixement, telefon, email);
        this.numempleat = numempleat;
        this.nss = nss;
        this.soubase = soubase;
    }

    public static int getNumempleat() {
        return numempleat;
    }

    public static void setNumempleat(int numempleat) {
        Treballador.numempleat = numempleat;
    }

    @Override
    public String toString() {
        return "Treballador [" + super.toString() + "nss=" + nss + ", numempleat=" + numempleat + ", soubase=" + soubase + "]";
    }

    
    

    
    

    
}
