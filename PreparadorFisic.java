package ClubFutbol;

import java.time.LocalDate;

public class PreparadorFisic extends Tecnic implements Serializable{
    private double incentiuAnysExp= 0.10;

    public PreparadorFisic(String dni) {
        super(dni);
    }

    public PreparadorFisic(String dni, String nom, String cognoms, LocalDate datanaixement, String telefon,
            String email, int numempleat, int nss, int soubase, int anysexperiencia, double incentiuAnysExp) {
        super(dni, nom, cognoms, datanaixement, telefon, email, numempleat, nss, soubase, anysexperiencia);
        this.incentiuAnysExp = incentiuAnysExp;
        obtenirSouFinal();
    }

    @Override
    public String toString() {
        return "PreparadorFisic [" + super.toString() + "incentiuAnysExp=" + incentiuAnysExp + "]";
    }

    
    
    
}
