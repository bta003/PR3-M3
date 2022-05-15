package ClubFutbol;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

public class Club {
    private String nom = "Cervera CF";
    private String cif = "F23561289";
    private String adreça = "Av/ Catalunya 50, Cervera 25200";
    private int telefon = 629344356;
    private String email = "cerveracf@fcf.cat";
    private String web = "cerveracf.cat";
    private double ingressos;
    private double despeses;

    HashMap<String, Soci> socis = new HashMap<String, Soci>();

    public Club() {
    }

    public Club(String nom, String cif, String adreça, int telefon, String email, String web) {
        this.nom = nom;
        this.cif = cif;
        this.adreça = adreça;
        this.telefon = telefon;
        this.email = email;
        this.web = web;
    }



    public void gestioClub() {
        Scanner teclat = new Scanner(System.in);
        boolean sortir = false;
        // inicialitzarDades();

        altaSocis();
        altaTreballadors();

        do {
            System.out.println("__________________________________________________");
            System.out.println("|            GESTIONAR CLUB DE FUTBOL            |");
            System.out.println("|             1. Visualitzar dades del club      |");
            System.out.println("|             2. Gestionar socis                 |");
            System.out.println("|             3. Gestionar plantilla             |");
            System.out.println("|             4. Visualitzar dades econòmiques   |");
            System.out.println("|             5. Sortir                          |");
            System.out.println("|________________________________________________|");
            System.out.println("\nTRIA UNA OPCIÓ:");

            while (!teclat.hasNextInt()) {
                System.out.println("Opció no vàlida");
                teclat.next();
                System.out.println("Escriu un numero enter");
            }

            int opcio = teclat.nextInt();

            switch (opcio) {
                case 1:
                    visualitzarDadesClub();
                    break;
                case 2:
                    gestionarSocis();
                    break;
                case 3:
                    // gestionarPlantilla();
                    break;
                case 4:
                    // visualitzarDadesEco();
                    break;
                case 5:
                    sortir = true;
                    break;
                default:
                    System.out.println("\n" + opcio + " NO ÉS UNA OPCIÓ NO VÀLIDA");
            }
        } while (!sortir);

    }

    void visualitzarDadesClub() {
        System.out.println("__________________________________________________");
        System.out.println("|          DADES GENERALS DEL CLUB             ");
        System.out.println("|            -NOM: " + this.nom);
        System.out.println("|            -CIF: " + this.cif);
        System.out.println("|            -ADREÇA: " + this.adreça);
        System.out.println("|            -TELEFON: " + this.telefon);
        System.out.println("|            -EMAIL: " + this.email);
        System.out.println("|            -WEB: " + this.web);
        System.out.println("|________________________________________________");
    }

    public void gestionarSocis() {
        Scanner teclat = new Scanner(System.in);
        boolean sortir = false;

        Soci s = new Soci();

        do {
            System.out.println("_________________________________________________");
            System.out.println("|              MENU GESTIO SOCI                 |");
            System.out.println("|                                               |");
            System.out.println("|           1. Alta                             |");
            System.out.println("|           2. Modificació                      |");
            System.out.println("|           3. Baixa                            |");
            System.out.println("|           4. Visualitzar ordenadament         |");
            System.out.println("|           5. Sortir                           |");
            System.out.println("|_______________________________________________|");
            System.out.println("\nTRIA UNA OPCIÓ:");

            int opcio = teclat.nextInt();

            switch (opcio) {
                case 1:
                    // s.altaSoci();
                    break;
                case 2:
                    // s.modificaSoci();
                    break;
                case 3:
                    // s.baixaSoci();
                    break;
                case 4:
                    visualitzarSoci();
                    break;
                case 5:
                    sortir = true;
                    break;
                default:
                    System.out.println("\n" + opcio + " NO ÉS UNA OPCIÓ NO VÀLIDA");
            }
        } while (!sortir);
    }

    private void altaSocis() {
        socis.put("48131446G", new Soci(1000, "48131446G", "Bruno", "Tomé Arias", LocalDate.parse("2003-08-09"),
                "628093348", "bruno@c.com", 1, 1));

    }

    public void visualitzarSoci(){
        socis.forEach((k,v) -> System.out.println("Key: " + k + ": Value: " + v));
    }

    private void altaTreballadors() {

    }

}
