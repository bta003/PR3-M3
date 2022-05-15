package ClubFutbol;

import java.io.Serializable;
import java.time.LocalDate;

public class Porter extends Jugador implements Serializable{
    private int golsAturats;
    private int golsRebuts;
    private static double incentiuGolsAt = 0.10;

    public Porter(String dni) {
        super(dni);
    }

    public Porter(String dni, String nom, String cognoms, LocalDate datanaixement, String telefon, String email,
            int numempleat, int nss, int soubase, int dorsal, boolean esTitular, int golsAturats, int golsRebuts) {
        super(dni, nom, cognoms, datanaixement, telefon, email, numempleat, nss, soubase, dorsal, esTitular);
        this.golsAturats = golsAturats;
        this.golsRebuts = golsRebuts;
        obtenirSouFinal();
    }

    public void setGolsAturats(int golsAturats) {
        this.golsAturats = golsAturats;
        obtenirSouFinal();
    }

    @Override
    public String toString() {
        return "Porter [" + super.toString() + "golsAturats=" + golsAturats + ", golsRebuts=" + golsRebuts + "]";
    }

    

    

}
