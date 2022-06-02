package ClassesPersones;

import java.io.Serializable;
import java.time.LocalDate;

public class PreparadorFisic extends Tecnic implements Serializable{
    private double incentiuAnysExp= 0.10;
    private double souFinal;


    public PreparadorFisic(String dni, String nom, String cognoms, LocalDate datanaixement, int telefon,
            String email, int nss, int soubase, int anysexperiencia) {
        super(dni, nom, cognoms, datanaixement, telefon, email, nss, soubase, anysexperiencia);
        // this.incentiuAnysExp = incentiuAnysExp;
        this.souFinal = obtenirSouFinal();

    }

    public PreparadorFisic(){
        
    }

    public double getIncentiuAnysExp() {
        return incentiuAnysExp;
    }

    public void setIncentiuAnysExp(double incentiuAnysExp) {
        this.incentiuAnysExp = incentiuAnysExp;
    }

    public double getSouFinal() {
        return souFinal;
    }

    public void setSouFinal(double souFinal) {
        this.souFinal = souFinal;
    }

    public double obtenirSouFinal(){
        double souInc = getSoubase() + (getAnysexperiencia() / incentiuAnysExp);
        return souInc;
    }

    @Override
    public String toString() {
        return "PreparadorFisic [" + super.toString() + ", Sou Total=" + getSouFinal() + "]";
    }

    
    
    
}
