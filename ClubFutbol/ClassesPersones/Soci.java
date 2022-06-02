package ClassesPersones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Soci extends Persona {
    private int numsoci;
    private int numlocalitat;
    private static int contSoci=0;
    private static int contLocalitat=500;

    private int quotaanual;


    public Soci() {

    }

    public Soci(String dni) {
        super(dni);
    }

    public Soci(int quotaanual, String dni, String nom, String cognoms, LocalDate datanaixement, int telefon,
            String email) {
        super(dni, nom, cognoms, datanaixement, telefon, email);
        this.quotaanual = quotaanual;

        this.numsoci = contSoci++;
        this.numlocalitat = contLocalitat++;
    }

    public int getNumsoci() {
        return numsoci;
    }

    public static void setNumsoci(int numsoci2) {
        contSoci = numsoci2;
    }

    public int getNumlocalitat() {
        return numlocalitat;
    }

    public static void setNumlocalitat(int numlocalitat2) {
        contLocalitat = numlocalitat2;
    }

    public int getQuotaanual() {
        return quotaanual;
    }

    public void setQuotaanual(int quotaanual) {
        this.quotaanual = quotaanual;
    }

    @Override
    public String toString() {
        return "Soci [" + super.toString() + "numlocalitat=" + numlocalitat + ", numsoci=" + numsoci + ", quotaanual="
                + quotaanual + "]";
    }

    

}
