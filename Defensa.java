package ClubFutbol;

import java.time.LocalDate;

public class Defensa extends Jugador implements Serializable{
    private int atacsAturats;
    private int balonsRec;
    private static double incentiuAtacsAt = 0.10;
    private static double incentiuBalonsRec = 0.10;

    public Defensa(String dni) {
        super(dni);
    }

    public Defensa(String dni, String nom, String cognoms, LocalDate datanaixement, String telefon, String email,
            int numempleat, int nss, int soubase, int dorsal, boolean esTitular, int atacsAturats, int balonsRec) {
        super(dni, nom, cognoms, datanaixement, telefon, email, numempleat, nss, soubase, dorsal, esTitular);
        this.atacsAturats = atacsAturats;
        this.balonsRec = balonsRec;
        obtenirSouFinal();
    }

    @Override
    public String toString() {
        return "Defensa [" + super.toString() + "atacsAturats=" + atacsAturats + ", balonsRec=" + balonsRec + "]";
    }

    
    

    
}
