package ClubFutbol;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Soci extends Persona {
    private int numsoci;
    private int numlocalitat;
    private int quotaanual;

    // private ArrayList<Soci> socis = new ArrayList<Soci>();

    public Soci() {

    }

    public Soci(String dni) {
        super(dni);
    }

    public Soci(int quotaanual, String dni, String nom, String cognoms, LocalDate datanaixement, String telefon,
            String email, int numsoci, int numlocalitat) {
        super(dni, nom, cognoms, datanaixement, telefon, email);
        this.quotaanual = quotaanual;

        this.numsoci = numsoci;
        this.numlocalitat = numlocalitat;
    }

    public int getNumsoci() {
        return numsoci;
    }

    public void setNumsoci(int numsoci) {
        this.numsoci = numsoci;
    }

    public int getNumlocalitat() {
        return numlocalitat;
    }

    public void setNumlocalitat(int numlocalitat) {
        this.numlocalitat = numlocalitat;
    }


    @Override
    public String toString() {
        return "Soci [" + super.toString() + "numlocalitat=" + numlocalitat + ", numsoci=" + numsoci + ", quotaanual="
                + quotaanual + ", socis="
                + socis + "]";
    }

}
