package ClubFutbol;

import java.time.LocalDate;

public class Tecnic extends Treballador{
    private int anysexperiencia;

    public Tecnic(String dni) {
        super(dni);
    }

    public Tecnic(String dni, String nom, String cognoms, LocalDate datanaixement, String telefon, String email,
            int numempleat, int nss, int soubase, int anysexperiencia) {
        super(dni, nom, cognoms, datanaixement, telefon, email, numempleat, nss, soubase);
        this.anysexperiencia = anysexperiencia;
    }

    @Override
    public String toString() {
        return "Tecnic [" + super.toString() + "anysexperiencia=" + anysexperiencia + "]";
    }

    

    
}
