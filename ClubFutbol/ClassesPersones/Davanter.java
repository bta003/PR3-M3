package ClassesPersones;

import java.io.Serializable;
import java.time.LocalDate;

public class Davanter extends Jugador implements Serializable{
    private int gols;
    private int balonsRec;
    private static double incentiuGols = 0.15;
    private static double incentiuBalonsRec = 0.10;

    public Davanter(String dni, String nom, String cognoms, LocalDate datanaixement, int telefon, String email, int nss, int soubase, boolean esTitular, int gols, int balonsRec) {
        super(dni, nom, cognoms, datanaixement, telefon, email, nss, soubase, esTitular);
        this.gols = gols;
        this.balonsRec = balonsRec;
        getSouFinal();
    }

    public Davanter(){
        
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getBalonsRec() {
        return balonsRec;
    }

    public void setBalonsRec(int balonsRec) {
        this.balonsRec = balonsRec;
    }

    public static double getIncentiuGols() {
        return incentiuGols;
    }

    public static void setIncentiuGols(double incentiuGols) {
        Davanter.incentiuGols = incentiuGols;
    }

    public static double getIncentiuBalonsRec() {
        return incentiuBalonsRec;
    }

    public static void setIncentiuBalonsRec(double incentiuBalonsRec) {
        Davanter.incentiuBalonsRec = incentiuBalonsRec;
    }
    

    public void setSouFinal(double souFinal) {
        this.souFinal = souFinal;
    }

    @Override
    public double getSouFinal(){
        this.souFinal = getSoubase() + (getGols() / incentiuGols) + (getBalonsRec() / incentiuBalonsRec);
        return this.souFinal;
    }

    @Override
    public String toString() {
        return "Davanter [" + super.toString() + "balonsRec=" + balonsRec + ", gols=" + gols + ", Sou Total=" + getSouFinal() + "]";
    }


    

}
