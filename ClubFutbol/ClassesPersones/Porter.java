package ClassesPersones;

import java.io.Serializable;
import java.time.LocalDate;

import javax.sound.sampled.Port;

public class Porter extends Jugador implements Serializable{
    private int golsAturats;
    private int golsRebuts;
    private static double incentiuGolsAt = 0.10;

    public Porter(String dni, String nom, String cognoms, LocalDate datanaixement, int telefon, String email, int nss, int soubase, boolean esTitular, int golsAturats, int golsRebuts) {
        super(dni, nom, cognoms, datanaixement, telefon, email, nss, soubase, esTitular);
        this.golsAturats = golsAturats;
        this.golsRebuts = golsRebuts;
        getSouFinal();
    }

    public Porter(){
        
    }

    public int getGolsAturats() {
        return golsAturats;
    }

    public void setGolsAturats(int golsAturats) {
        this.golsAturats = golsAturats;
    }

    public int getGolsRebuts() {
        return golsRebuts;
    }

    public void setGolsRebuts(int golsRebuts) {
        this.golsRebuts = golsRebuts;
    }

    public static double getIncentiuGolsAt() {
        return incentiuGolsAt;
    }

    public static void setIncentiuGolsAt(double incentiuGolsAt) {
        Porter.incentiuGolsAt = incentiuGolsAt;
    }


    @Override
    public double getSouFinal(){
        this.souFinal = getSoubase() + (getGolsAturats() / incentiuGolsAt);
        return this.souFinal;
    }

    @Override
    public String toString() {
        return "Porter [" + super.toString() + "golsAturats=" + golsAturats + ", golsRebuts=" + golsRebuts + ", Sou Total=" + getSouFinal() + "]";
    }

    

    

}
