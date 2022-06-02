package ClassesPersones;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public abstract class Persona implements Serializable{
    private String dni;
    private String nom;
    private String cognoms;
    private LocalDate datanaixement;
    private int telefon;
    private String email;

    public Persona(){
        
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    public Persona(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }


    public Persona(String dni, String nom, String cognoms, LocalDate datanaixement, int telefon, String email) {
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.datanaixement = datanaixement;
        this.telefon = telefon;
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public LocalDate getDatanaixement() {
        return datanaixement;
    }

    public void setDatanaixement(LocalDate datanaixement) {
        this.datanaixement = datanaixement;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona [" + " nom=" + nom + ", cognoms=" + cognoms + ", datanaixement=" + datanaixement + ", email=" + email + ", telefon=" + telefon + ", dni=" + dni + "]";
    }


}
