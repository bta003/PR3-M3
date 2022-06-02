package ClassesPersones;

import java.io.Serializable;
import java.time.LocalDate;

public class Tecnic extends Treballador implements Serializable{
    private int anysexperiencia;
    private double souFinal;

    // public Tecnic(String dni) {
    //     super(dni);
    // }

    public Tecnic(String dni, String nom, String cognoms, LocalDate datanaixement, int telefon, String email, int nss, int soubase, int anysexperiencia) {
        super(dni, nom, cognoms, datanaixement, telefon, email, nss, soubase);
        this.anysexperiencia = anysexperiencia;
    }

    public Tecnic(){
        
    }
    

    public int getAnysexperiencia() {
        return anysexperiencia;
    }

    public void setAnysexperiencia(int anysexperiencia) {
        this.anysexperiencia = anysexperiencia;
    }

    

    @Override
    public String toString() {
        return "Tecnic [" + super.toString() + "anysexperiencia=" + anysexperiencia + "]";
    }

    

    
}
