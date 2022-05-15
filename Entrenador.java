package ClubFutbol;

import java.time.LocalDate;

public class Entrenador extends Tecnic implements Serializable{
    private int numTrofeus;
    private double incentiuTrofeus = 0.3;

    public Entrenador(String dni) {
        super(dni);
    }

    public Entrenador(String dni, String nom, String cognoms, LocalDate datanaixement, String telefon, String email,
            int numempleat, int nss, int soubase, int anysexperiencia, int numTrofeus, double incentiuTrofeus) {
        super(dni, nom, cognoms, datanaixement, telefon, email, numempleat, nss, soubase, anysexperiencia);
        this.numTrofeus = numTrofeus;
        this.incentiuTrofeus = incentiuTrofeus;
        obtenirSouFinal();
    }

    @Override
    public String toString() {
        return "Entrenador [" + super.toString() + "incentiuTrofeus=" + incentiuTrofeus + ", numTrofeus=" + numTrofeus + "]";
    }

    

    
    
}
