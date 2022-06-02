package ClassesPersones;

import java.io.Serializable;
import java.time.LocalDate;

public class Migcampista extends Jugador implements Serializable{
    private int assistenciesGol;
    private int balonsRec;
    private static double incentiuAssist = 0.10;
    private static double incentiuBalonsRec = 0.10;

    public Migcampista(String dni, String nom, String cognoms, LocalDate datanaixement, int telefon, String email, int nss, int soubase, boolean esTitular, int assistenciesGol, int balonsRec) {
        super(dni, nom, cognoms, datanaixement, telefon, email, nss, soubase, esTitular);
        this.assistenciesGol = assistenciesGol;
        this.balonsRec = balonsRec;
        getSouFinal();

    }

    public Migcampista(){
        
    }

    public int getAssistenciesGol() {
        return assistenciesGol;
    }

    public void setAssistenciesGol(int assistenciesGol) {
        this.assistenciesGol = assistenciesGol;
    }

    public int getBalonsRec() {
        return balonsRec;
    }

    public void setBalonsRec(int balonsRec) {
        this.balonsRec = balonsRec;
    }

    public static double getIncentiuAssist() {
        return incentiuAssist;
    }

    public static void setIncentiuAssist(double incentiuAssist) {
        Migcampista.incentiuAssist = incentiuAssist;
    }

    public static double getIncentiuBalonsRec() {
        return incentiuBalonsRec;
    }

    public static void setIncentiuBalonsRec(double incentiuBalonsRec) {
        Migcampista.incentiuBalonsRec = incentiuBalonsRec;
    }

    public void setSouFinal(double souFinal) {
        this.souFinal = souFinal;
    }

    @Override
    public double getSouFinal(){
        this.souFinal = getSoubase() + (getAssistenciesGol() / incentiuAssist) + (getBalonsRec() / incentiuBalonsRec);
        return this.souFinal;
    }

    @Override
    public String toString() {
        return "Migcampista [" + super.toString() + "assistenciesGol=" + assistenciesGol + ", balonsRec=" + balonsRec + ", Sou Total=" + getSouFinal() + "]";
    }

    

    
    
}
