package ClubFutbol;

import java.time.LocalDate;
import java.time.Period;

public abstract class Persona {
    private String dni;
    private String nom;
    private String cognoms;
    private LocalDate datanaixement;
    private String telefon;
    private String email;
    private int edat;

    public Persona(){
        
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    public Persona(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }


    public Persona(String dni, String nom, String cognoms, LocalDate datanaixement, String telefon, String email) {
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.datanaixement = datanaixement;
        this.telefon = telefon;
        this.email = email;
        calculEdat();
    }

    private void calculEdat(){
        LocalDate now = LocalDate.now();
        this.edat=Period.between(this.datanaixement, now).getYears();
    }

    @Override
    public String toString() {
        return "Persona [cognoms=" + cognoms + ", datanaixement=" + datanaixement + ", dni=" + dni + ", edat=" + edat
                + ", email=" + email + ", nom=" + nom + ", telefon=" + telefon + "]";
    }


}
