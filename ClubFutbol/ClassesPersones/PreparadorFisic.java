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
        getSouFinal();

    }

    public PreparadorFisic(){
        
    }

    public double getIncentiuAnysExp() {
        return incentiuAnysExp;
    }

    public void setIncentiuAnysExp(double incentiuAnysExp) {
        this.incentiuAnysExp = incentiuAnysExp;
    }

    public void setSouFinal(double souFinal) {
        this.souFinal = souFinal;
    }

    @Override
    public double getSouFinal(){
        this.souFinal = getSoubase() + (getAnysexperiencia() / incentiuAnysExp);
        return this.souFinal;
    }

    @Override
    public String toString() {
        return "PreparadorFisic [" + super.toString() + ", Sou Total=" + getSouFinal() + "]";
    }

    
    
    
}
