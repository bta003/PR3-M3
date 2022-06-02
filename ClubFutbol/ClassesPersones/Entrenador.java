package ClassesPersones;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

import ClassesClub.Club;

public class Entrenador extends Tecnic implements Serializable{
    private int numTrofeus;
    private double incentiuTrofeus = 0.03;
    private double souFinal;

    public Entrenador(String dni, String nom, String cognoms, LocalDate datanaixement, int telefon, String email, int nss, int soubase, int anysexperiencia, int numTrofeus) {
        super(dni, nom, cognoms, datanaixement, telefon, email, nss, soubase, anysexperiencia);
        this.numTrofeus = numTrofeus;
        // this.incentiuTrofeus = incentiuTrofeus;
        getSouFinal();
    }

    public Entrenador(){

    }

    

    public int getNumTrofeus() {
        return numTrofeus;
    }

    public void setNumTrofeus(int numTrofeus) {
        this.numTrofeus = numTrofeus;
    }

    public double getIncentiuTrofeus() {
        return incentiuTrofeus;
    }

    public void setIncentiuTrofeus(double incentiuTrofeus) {
        this.incentiuTrofeus = incentiuTrofeus;
    }

    public void setSouFinal(double souFinal) {
        this.souFinal = souFinal;
    }

    @Override
    public double getSouFinal(){
        this.souFinal = getSoubase() + (getNumTrofeus() / incentiuTrofeus);
        return this.souFinal;
    }

    @Override
    public String toString() {
        return "Entrenador [" + super.toString() + "incentiuTrofeus=" + incentiuTrofeus + ", numTrofeus=" + numTrofeus + ", Sou Total=" + getSouFinal() + "]";
    }

    
    
}
