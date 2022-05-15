package ClubFutbol;

import java.time.LocalDate;

public class Davanter extends Jugador implements Serializable{
    private int gols;
    private int balonsRec;
    private static double incentiuGols = 0.15;
    private static double incentiuBalonsRec = 0.10;

    public Davanter(String dni) {
        super(dni);
    }

    public Davanter(String dni, String nom, String cognoms, LocalDate datanaixement, String telefon, String email,
            int numempleat, int nss, int soubase, int dorsal, boolean esTitular, int gols, int balonsRec) {
        super(dni, nom, cognoms, datanaixement, telefon, email, numempleat, nss, soubase, dorsal, esTitular);
        this.gols = gols;
        this.balonsRec = balonsRec;
        obtenirSouFinal();
    }

    @Override
    public String toString() {
        return "Davanter [" + super.toString() + "balonsRec=" + balonsRec + ", gols=" + gols + "]";
    }


    

}
