package ClassesPersones;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Map;

public abstract class Jugador extends Treballador implements Serializable {
    private int dorsal;
    private boolean esTitular;
    private static int contdorsal;


    public Jugador(String dni, String nom, String cognoms, LocalDate datanaixement, int telefon, String email, int nss, int soubase, boolean esTitular) {
        super(dni, nom, cognoms, datanaixement, telefon, email, nss, soubase);

        this.dorsal= contdorsal++;
        this.esTitular = esTitular;
    }

    public Jugador(){
        
    }

    public int getDorsal() {
        return dorsal;
    }

    public static void setDorsal(int dorsal2) {
        contdorsal = dorsal2;
    }

    public void setEsTitular(boolean esTitular) {
        this.esTitular = esTitular;
    }

    @Override
    public String toString() {
        return "Jugador [" + super.toString() + "Dorsal=" + dorsal + ", Titular=" + esTitular + "]";
    }

}
