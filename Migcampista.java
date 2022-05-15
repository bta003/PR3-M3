package ClubFutbol;

import java.time.LocalDate;

public class Migcampista extends Jugador implements Serializable{
    private int assistenciesGol;
    private int balonsRec;
    private static double incentiuAssist = 0.10;
    private static double incentiuBalonsRec = 0.10;


    public Migcampista(String dni) {
        super(dni);
    }

    public Migcampista(String dni, String nom, String cognoms, LocalDate datanaixement, String telefon, String email,
            int numempleat, int nss, int soubase, int dorsal, boolean esTitular, int assistenciesGol, int balonsRec) {
        super(dni, nom, cognoms, datanaixement, telefon, email, numempleat, nss, soubase, dorsal, esTitular);
        this.assistenciesGol = assistenciesGol;
        this.balonsRec = balonsRec;
        obtenirSouFinal();
    }

    @Override
    public String toString() {
        return "Migcampista [" + super.toString() + "assistenciesGol=" + assistenciesGol + ", balonsRec=" + balonsRec + "]";
    }

    

    
    
}
