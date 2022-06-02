package ClassesPersones;

import java.io.Serializable;
import java.time.LocalDate;

public class Defensa extends Jugador implements Serializable{
    private int atacsAturats;
    private int balonsRec;
    private static double incentiuAtacsAt = 0.10;
    private static double incentiuBalonsRec = 0.10;


    public Defensa(String dni, String nom, String cognoms, LocalDate datanaixement, int telefon, String email, int nss, int soubase, boolean esTitular, int atacsAturats, int balonsRec) {
        super(dni, nom, cognoms, datanaixement, telefon, email, nss, soubase, esTitular);
        this.atacsAturats = atacsAturats;
        this.balonsRec = balonsRec;
        getSouFinal();
    }

    public Defensa(){
        
    }

    public int getAtacsAturats() {
        return atacsAturats;
    }

    public void setAtacsAturats(int atacsAturats) {
        this.atacsAturats = atacsAturats;
    }

    public int getBalonsRec() {
        return balonsRec;
    }

    public void setBalonsRec(int balonsRec) {
        this.balonsRec = balonsRec;
    }

    public static double getIncentiuAtacsAt() {
        return incentiuAtacsAt;
    }

    public static void setIncentiuAtacsAt(double incentiuAtacsAt) {
        Defensa.incentiuAtacsAt = incentiuAtacsAt;
    }

    public static double getIncentiuBalonsRec() {
        return incentiuBalonsRec;
    }

    public static void setIncentiuBalonsRec(double incentiuBalonsRec) {
        Defensa.incentiuBalonsRec = incentiuBalonsRec;
    }

    public void setSouFinal(double souFinal) {
        this.souFinal = souFinal;
    }

    @Override
    public double getSouFinal(){
        this.souFinal = getSoubase() + (getAtacsAturats() / incentiuAtacsAt) + (getBalonsRec() / incentiuBalonsRec);
        return this.souFinal;
    }

    @Override
    public String toString() {
        return "Defensa [" + super.toString() + "atacsAturats=" + atacsAturats + ", balonsRec=" + balonsRec + ", Sou Total=" + getSouFinal() + "]";
    }

    
}
