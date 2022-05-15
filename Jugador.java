package ClubFutbol;

import java.time.LocalDate;

public class Jugador extends Treballador{
    private int dorsal;
    private boolean esTitular;

    public Jugador(String dni) {
        super(dni);
    }

    public Jugador(String dni, String nom, String cognoms, LocalDate datanaixement, String telefon, String email,
            int numempleat, int nss, int soubase, int dorsal, boolean esTitular) {
        super(dni, nom, cognoms, datanaixement, telefon, email, numempleat, nss, soubase);
        this.dorsal = dorsal;
        this.esTitular = esTitular;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Jugador [" + super.toString() + "dorsal=" + dorsal + ", esTitular=" + esTitular + "]";
    }

    
    
    
}
