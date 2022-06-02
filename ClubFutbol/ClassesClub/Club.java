package ClassesClub;

import ClassesPersones.Davanter;
import ClassesPersones.Defensa;
import ClassesPersones.Entrenador;
import ClassesPersones.Jugador;
import ClassesPersones.Migcampista;
import ClassesPersones.Porter;
import ClassesPersones.PreparadorFisic;
import ClassesPersones.Soci;
import ClassesPersones.Treballador;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Club implements Serializable {

  private String nom = "Cervera CF";
  private String cif = "F23561289";
  private String adreça = "Av/ Catalunya 50, Cervera 25200";
  private int telefon = 629344356;
  private String email = "cerveracf@fcf.cat";
  private String web = "cerveracf.cat";
  private static String opt;
  // private double ingressos;
  // private double despeses;

  private HashMap<String, Soci> socis = new HashMap<>();
  private HashMap<String, Treballador> treballadors = new HashMap<>();

  public Club() {}

  public Club(
    String nom,
    String cif,
    String adreça,
    int telefon,
    String email,
    String web
  ) {
    this.nom = nom;
    this.cif = cif;
    this.adreça = adreça;
    this.telefon = telefon;
    this.email = email;
    this.web = web;
  }

  public String getNom() {
    return nom;
  }

  public String getCif() {
    return cif;
  }

  public String getAdreça() {
    return adreça;
  }

  public int getTelefon() {
    return telefon;
  }

  public String getEmail() {
    return email;
  }

  public String getWeb() {
    return web;
  }

  public Map<String, Soci> getSocis() {
    return socis;
  }

  public void setSocis(HashMap<String, Soci> socis) {
    this.socis = socis;
  }

  public Map<String, Treballador> getTreballadors() {
    return treballadors;
  }

  public void setTreballadors(HashMap<String, Treballador> treballadors) {
    this.treballadors = treballadors;
  }

  public void gestioClub() throws IOException {
    Scanner teclat = new Scanner(System.in);
    boolean sortir = false;
    // llegirArxiu();

    // altaSocis();
    // altaTreballadors();

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
          gestioTreballadors();
          break;
        case 4:
          visualitzarDadesEco();
          break;
        case 5:
          escriureDades();
          sortir = true;
          break;
        default:
          System.out.println("\n" + opcio + " NO ÉS UNA OPCIÓ NO VÀLIDA");
      }
    } while (!sortir);
  }

  public void gestionarSocis() {
    Scanner teclat = new Scanner(System.in);
    boolean sortir = false;

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
          altaSoci();
          break;
        case 2:
          modificaSoci();
          break;
        case 3:
          baixaSoci();
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

  public void gestioTreballadors() {
    Scanner teclat = new Scanner(System.in);
    boolean sortir = false;

    do {
      System.out.println("__________________________________________________");
      System.out.println("|          GESTIONAR PLANTILLA DEL CLUB          |");
      System.out.println("|          1. Alta d'un treballador              |");
      System.out.println("|          2. Modifica un treballador            |");
      System.out.println("|          3. Baixa un treballador               |");
      System.out.println("|          4. Visualitzar treballadors           |");
      System.out.println("|          5. Sortir                             |");
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
          altaTreballador();
          break;
        case 2:
          modificaTreballadors();
          break;
        case 3:
          baixaTreballadors();
          break;
        case 4:
          visualitzaTreballadors();
          break;
        case 5:
          sortir = true;
          break;
        default:
          System.out.println("\n" + opcio + " NO ÉS UNA OPCIÓ NO VÀLIDA");
      }
    } while (!sortir);
  }

  public void altaTreballador() {
    Scanner teclat = new Scanner(System.in);
    boolean sortir = false;

    do {
      System.out.println("__________________________________________________");
      System.out.println("|          DONAR D'ALTA TREBALLADOR DEL CLUB     |");
      System.out.println("|          1. Entrenador                         |");
      System.out.println("|          2. Preparador físic                   |");
      System.out.println("|          3. Porter                             |");
      System.out.println("|          4. Defensa                            |");
      System.out.println("|          5. Migcampista                        |");
      System.out.println("|          6. Davanter                           |");
      System.out.println("|          7. Sortir                             |");
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
          altaEntrenador();
          break;
        case 2:
          altaPreparadorFisic();
          break;
        case 3:
          altaPorter();
          break;
        case 4:
          altaDefensa();
          break;
        case 5:
          altaMigcampista();
          break;
        case 6:
          altaDavanter();
          break;
        case 7:
          sortir = true;
          break;
        default:
          System.out.println("\n" + opcio + " NO ÉS UNA OPCIÓ NO VÀLIDA");
      }
    } while (!sortir);
  }

  public void modificaTreballadors() {
    Scanner teclat = new Scanner(System.in);
    boolean sortir = false;

    do {
      System.out.println("__________________________________________________");
      System.out.println("|          MODIFICAR TREBALLADOR DEL CLUB        |");
      System.out.println("|          1. Tècnic                             |");
      System.out.println("|          2. Jugador                            |");
      System.out.println("|          3. Sortir                             |");
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
          modificaTecnic();
          break;
        case 2:
          modificaJugador();
          break;
        case 3:
          sortir = true;
          break;
        default:
          System.out.println("\n" + opcio + " NO ÉS UNA OPCIÓ NO VÀLIDA");
      }
    } while (!sortir);
  }

  public void altaPersones() {
    altaSocis();
    altaTreballadors();
  }

  private void altaSocis() {
    socis.put(
      "19115704J",
      new Soci(
        175,
        "19115704J",
        "Bruno",
        "Tomé Arias",
        LocalDate.parse("2003-08-09"),
        605211935,
        "bruno@soci.com"
      )
    );
    socis.put(
      "57051958K",
      new Soci(
        175,
        "57051958K",
        "Jose",
        "Carlos Olivé",
        LocalDate.parse("1987-03-02"),
        642020235,
        "jose@soci.com"
      )
    );
    socis.put(
      "51657121H",
      new Soci(
        175,
        "51657121H",
        "soci3",
        "soci3 soci3",
        LocalDate.parse("1987-03-02"),
        642020234,
        "soci3@soci.com"
      )
    );
  }

  private void altaTreballadors() {
    treballadors.put(
      "94433211H",
      new Entrenador("94433211H", "Daniel", "Alcobé Orellana", LocalDate.parse("2003-11-20"), 649271955, "danielentrenador@cfc.cat",288759584, 2100, 2, 1)
    );
    treballadors.put(
      "41666300Y",
      new PreparadorFisic("41666300Y", "Paulino", "Belmonte Zamora", LocalDate.parse("1990-04-17"), 713443829, "paulinopf@cfc.cat", 257225265, 1950, 11)
    );
    treballadors.put(
      "54626390X",
      new Porter(
        "54626390X",
        "Ivan",
        "Martin Bertrán",
        LocalDate.parse("2001-08-16"),
        718554744,
        "ivan.cfc@jugador.com",
        367188840,
        300,
        true,
        20,
        18
      )
    );
    treballadors.put(
      "94591124J",
      new Porter(
        "94591124J",
        "Nicolás",
        "Agustín Manuel",
        LocalDate.parse("2001-02-18"),
        629545729,
        "nicolas.cfc@jugador.com",
        471503102,
        300,
        false,
        5,
        7
      )
    );
    treballadors.put(
      "23760831Z",
      new Porter(
        "23760831Z",
        "Mateo",
        "Novoa Carrasco",
        LocalDate.parse("2003-08-23"),
        619939493,
        "nicolas.cfc@jugador.com",
        471503102,
        250,
        false,
        3,
        4
      )
    );
    treballadors.put(
      "86291928E",
      new Defensa(
        "86291928E",
        "Lucas",
        "Amorós Rius",
        LocalDate.parse("1998-06-02"),
        603071725,
        "lucas.cfc@jugador.com",
        2033134388,
        300,
        true,
        14,
        15
      )
    );
    treballadors.put(
      "83623949C",
      new Defensa(
        "83623949C",
        "Narcís",
        "Llamas Roman",
        LocalDate.parse("1997-12-11"),
        691692975,
        "narcis.cfc@jugador.com",
        412231435,
        300,
        true,
        10,
        14
      )
    );
    treballadors.put(
      "62052188M",
      new Defensa(
        "62052188M",
        "Joan",
        "Luis Casals",
        LocalDate.parse("2001-04-25"),
        657841833,
        "joan.cfc@jugador.com",
        419399157,
        250,
        true,
        4,
        5
      )
    );
    treballadors.put(
      "23160566A",
      new Defensa(
        "23160566A",
        "Edgar",
        "Gilbert Pinto",
        LocalDate.parse("2000-01-02"),
        629577404,
        "edgar.cfc@jugador.com",
        491443000,
        250,
        true,
        3,
        6
      )
    );
    treballadors.put(
      "34455223G",
      new Migcampista(
        "34455223G",
        "Mario",
        "Gomez Figueroa",
        LocalDate.parse("2000-03-04"),
        616213640,
        "mario.cfc@jugador.com",
        393309922,
        300,
        true,
        6,
        17
      )
    );
    treballadors.put(
      "81104116K",
      new Migcampista(
        "81104116K",
        "Eric",
        "Artigas Castejón",
        LocalDate.parse("2002-06-11"),
        772215855,
        "eric.cfc@jugador.com",
        430999205,
        275,
        true,
        2,
        15
      )
    );
    treballadors.put(
      "89772228P",
      new Migcampista(
        "89772228P",
        "Nico",
        "Farré Villena",
        LocalDate.parse("2003-04-22"),
        615419269,
        "nico.cfc@jugador.com",
        204471304,
        270,
        true,
        3,
        11
      )
    );
    treballadors.put(
      "34876039N",
      new Migcampista(
        "34876039N",
        "Josep",
        "Maria Castro",
        LocalDate.parse("2000-07-02"),
        649999886,
        "josep.cfc@jugador.com",
        249899907,
        270,
        false,
        1,
        8
      )
    );
    treballadors.put(
      "98943818A",
      new Migcampista(
        "98943818A",
        "Adrià",
        "Batlle Quintana",
        LocalDate.parse("2001-08-25"),
        687994803,
        "adria.cfc@jugador.com",
        506872201,
        265,
        false,
        2,
        11
      )
    );
    treballadors.put(
      "33612642M",
      new Davanter(
        "33612642M",
        "Marc",
        "Vives Boix",
        LocalDate.parse("2000-10-23"),
        792480800,
        "marc.cfc@jugador.com",
        319805677,
        300,
        true,
        15,
        11
      )
    );
    treballadors.put(
      "61552813Y",
      new Davanter(
        "61552813Y",
        "Javi",
        "Mur Molins",
        LocalDate.parse("1999-06-30"),
        723584180,
        "javi.cfc@jugador.com",
        154548184,
        300,
        true,
        7,
        10
      )
    );
    treballadors.put(
      "31999152B",
      new Davanter(
        "31999152B",
        "Ramon",
        "Gracés Pi",
        LocalDate.parse("1998-07-29"),
        717408237,
        "ramon.cfc@jugador.com",
        358914586,
        300,
        true,
        8,
        11
      )
    );
    treballadors.put(
      "27600907X",
      new Davanter(
        "27600907X",
        "Abel",
        "Lloret Palau",
        LocalDate.parse("2000-03-17"),
        666816065,
        "abel.cfc@jugador.com",
        309089972,
        250,
        false,
        4,
        5
      )
    );
  }

  private void altaEntrenador() {
    Scanner teclat = new Scanner(System.in);
    System.out.println("*Donar d'alta un entrenador*\n");

    try {
      System.out.println("\nIntrodueixi el DNI:");
      String dni = teclat.nextLine();

      System.out.println("\nIntrodueixi el nom:");
      String nom = teclat.nextLine();

      System.out.println("\nIntrodueixi els cognoms:");
      String cognoms = teclat.nextLine();

      System.out.println(
        "\nIntrodueixi la data naixement en el següent format (AAAA-MM-DD):"
      );
      String datanaix = teclat.nextLine();

      System.out.println("\nIntrodueixi el número de telèfon:");
      int telefon = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el email:");
      String email = teclat.nextLine();

      System.out.println("\nIntrodueixi el numero de la Seguretat Social:");
      int nss = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el sou base:");
      int soubase = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi els anys d'experiència:");
      int anysexperiencia = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el numero de trofeus:");
      int numTrofeus = teclat.nextInt();
      teclat.nextLine();

      treballadors.put(
        dni,
        new Entrenador(
          dni,
          nom,
          cognoms,
          LocalDate.parse(datanaix),
          telefon,
          email,
          nss,
          soubase,
          anysexperiencia,
          numTrofeus
        )
      );

      System.out.println("\nEntrenador donat d'alta amb èxit");
    } catch (Exception e) {
      System.out.println("No s'ha pogut donar d'alta aquest tècnic");
    }
  }

  private void altaPreparadorFisic() {
    Scanner teclat = new Scanner(System.in);
    System.out.println("*Donar d'alta un preparador físic*\n");

    try {
      System.out.println("\nIntrodueixi el DNI:");
      String dni = teclat.nextLine();

      System.out.println("\nIntrodueixi el nom:");
      String nom = teclat.nextLine();

      System.out.println("\nIntrodueixi els cognoms:");
      String cognoms = teclat.nextLine();

      System.out.println(
        "\nIntrodueixi la data naixement en el següent format (AAAA-MM-DD):"
      );
      String datanaix = teclat.nextLine();

      System.out.println("\nIntrodueixi el número de telèfon:");
      int telefon = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el email:");
      String email = teclat.nextLine();

      System.out.println("\nIntrodueixi el numero de la Seguretat Social:");
      int nss = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el sou base:");
      int soubase = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi els anys d'experiència:");
      int anysexperiencia = teclat.nextInt();
      teclat.nextLine();

      treballadors.put(
        dni,
        new PreparadorFisic(
          dni,
          nom,
          cognoms,
          LocalDate.parse(datanaix),
          telefon,
          email,
          nss,
          soubase,
          anysexperiencia
        )
      );

      System.out.println("\nPreparador físic donat d'alta amb èxit");
    } catch (Exception e) {
      System.out.println("No s'ha pogut donar d'alta aquest tècnic");
    }
  }

  private void altaPorter() {
    Scanner teclat = new Scanner(System.in);
    System.out.println("*Donar d'alta un porter*\n");

    try {
      System.out.println("\nIntrodueixi el DNI:");
      String dni = teclat.nextLine();

      System.out.println("\nIntrodueixi el nom:");
      String nom = teclat.nextLine();

      System.out.println("\nIntrodueixi els cognoms:");
      String cognoms = teclat.nextLine();

      System.out.println(
        "\nIntrodueixi la data naixement en el següent format (AAAA-MM-DD):"
      );
      String datanaix = teclat.nextLine();

      System.out.println("\nIntrodueixi el número de telèfon:");
      int telefon = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el email:");
      String email = teclat.nextLine();

      System.out.println("\nIntrodueixi el numero de la Seguretat Social:");
      int nss = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el sou base:");
      int soubase = teclat.nextInt();
      teclat.nextLine();

      Boolean esTitular;
      do {
        System.out.println("\nIntrodueixi si es titular (S/N):");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          esTitular = true;
        } else {
          esTitular = false;
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      System.out.println("\nIntrodueixi el numero de gols aturats:");
      int golsAturats = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el numero de gols rebuts:");
      int golsRebuts = teclat.nextInt();
      teclat.nextLine();

      treballadors.put(
        dni,
        new Porter(
          dni,
          nom,
          cognoms,
          LocalDate.parse(datanaix),
          telefon,
          email,
          nss,
          soubase,
          esTitular,
          golsAturats,
          golsRebuts
        )
      );

      System.out.println("\nPorter donat d'alta amb èxit");
    } catch (Exception e) {
      System.out.println("No s'ha pogut donar d'alta aquest jugador");
    }
  }

  private void altaDefensa() {
    Scanner teclat = new Scanner(System.in);
    System.out.println("*Donar d'alta un defensa*\n");

    try {
      System.out.println("\nIntrodueixi el DNI:");
      String dni = teclat.nextLine();

      System.out.println("\nIntrodueixi el nom:");
      String nom = teclat.nextLine();

      System.out.println("\nIntrodueixi els cognoms:");
      String cognoms = teclat.nextLine();

      System.out.println(
        "\nIntrodueixi la data naixement en el següent format (AAAA-MM-DD):"
      );
      String datanaix = teclat.nextLine();

      System.out.println("\nIntrodueixi el número de telèfon:");
      int telefon = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el email:");
      String email = teclat.nextLine();

      System.out.println("\nIntrodueixi el numero de la Seguretat Social:");
      int nss = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el sou base:");
      int soubase = teclat.nextInt();
      teclat.nextLine();

      Boolean esTitular;
      do {
        System.out.println("\nIntrodueixi si es titular (S/N):");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          esTitular = true;
        } else {
          esTitular = false;
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      System.out.println("\nIntrodueixi el numero de atacs aturats:");
      int atacsAturats = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el numero de balons recuperats:");
      int balonsRec = teclat.nextInt();
      teclat.nextLine();

      treballadors.put(
        dni,
        new Defensa(
          dni,
          nom,
          cognoms,
          LocalDate.parse(datanaix),
          telefon,
          email,
          nss,
          soubase,
          esTitular,
          atacsAturats,
          balonsRec
        )
      );

      System.out.println("\nDefensa donat d'alta amb èxit");
    } catch (Exception e) {
      System.out.println("No s'ha pogut donar d'alta aquest jugador");
    }
  }

  private void altaMigcampista() {
    Scanner teclat = new Scanner(System.in);
    System.out.println("*Donar d'alta un migcampista*\n");

    try {
      System.out.println("\nIntrodueixi el DNI:");
      String dni = teclat.nextLine();

      System.out.println("\nIntrodueixi el nom:");
      String nom = teclat.nextLine();

      System.out.println("\nIntrodueixi els cognoms:");
      String cognoms = teclat.nextLine();

      System.out.println(
        "\nIntrodueixi la data naixement en el següent format (AAAA-MM-DD):"
      );
      String datanaix = teclat.nextLine();

      System.out.println("\nIntrodueixi el número de telèfon:");
      int telefon = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el email:");
      String email = teclat.nextLine();

      System.out.println("\nIntrodueixi el numero de la Seguretat Social:");
      int nss = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el sou base:");
      int soubase = teclat.nextInt();
      teclat.nextLine();

      Boolean esTitular;
      do {
        System.out.println("\nIntrodueixi si es titular (S/N):");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          esTitular = true;
        } else {
          esTitular = false;
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      System.out.println("\nIntrodueixi el numero d'assistències de gol:");
      int assistenciesGol = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el numero de balons recuperats:");
      int balonsRec = teclat.nextInt();
      teclat.nextLine();

      treballadors.put(
        dni,
        new Migcampista(
          dni,
          nom,
          cognoms,
          LocalDate.parse(datanaix),
          telefon,
          email,
          nss,
          soubase,
          esTitular,
          assistenciesGol,
          balonsRec
        )
      );

      System.out.println("\nMigcampista donat d'alta amb èxit");
    } catch (Exception e) {
      System.out.println("No s'ha pogut donar d'alta aquest jugador");
    }
  }

  private void altaDavanter() {
    Scanner teclat = new Scanner(System.in);
    System.out.println("*Donar d'alta un davanter*\n");

    try {
      System.out.println("\nIntrodueixi el DNI:");
      String dni = teclat.nextLine();

      System.out.println("\nIntrodueixi el nom:");
      String nom = teclat.nextLine();

      System.out.println("\nIntrodueixi els cognoms:");
      String cognoms = teclat.nextLine();

      System.out.println(
        "\nIntrodueixi la data naixement en el següent format (AAAA-MM-DD):"
      );
      String datanaix = teclat.nextLine();

      System.out.println("\nIntrodueixi el número de telèfon:");
      int telefon = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el email:");
      String email = teclat.nextLine();

      System.out.println("\nIntrodueixi el numero de la Seguretat Social:");
      int nss = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el sou base:");
      int soubase = teclat.nextInt();
      teclat.nextLine();

      Boolean esTitular;
      do {
        System.out.println("\nIntrodueixi si es titular (S/N):");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          esTitular = true;
        } else {
          esTitular = false;
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      System.out.println("\nIntrodueixi el numero de gols marcats:");
      int gols = teclat.nextInt();
      teclat.nextLine();

      System.out.println("\nIntrodueixi el numero de balons recuperats:");
      int balonsRec = teclat.nextInt();
      teclat.nextLine();

      treballadors.put(
        dni,
        new Davanter(
          dni,
          nom,
          cognoms,
          LocalDate.parse(datanaix),
          telefon,
          email,
          nss,
          soubase,
          esTitular,
          gols,
          balonsRec
        )
      );

      System.out.println("\nDavanter donat d'alta amb èxit");
    } catch (Exception e) {
      System.out.println("No s'ha pogut donar d'alta aquest jugador");
    }
  }

  public void modificaTecnic() {
    Scanner teclat = new Scanner(System.in);
    System.out.println("\nModificar les dades d'un entrenador");

    System.out.println("\nIntrodueixi el DNI de l'entrenador a modificar");
    String dni = teclat.nextLine();
    if (treballadors.containsKey(dni)) {
      do {
        System.out.println("\nVol modificar el nom? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi el nom:");
          teclat.nextLine();
          String nom = teclat.nextLine();
          treballadors.get(dni).setNom(nom);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        System.out.println("\nVol modificar els cognoms? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi els cognoms:");
          teclat.nextLine();
          String cognoms = teclat.nextLine();
          treballadors.get(dni).setCognoms(cognoms);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        System.out.println("\nVol modificar el número de telèfon? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi el número de telèfon:");
          teclat.nextLine();
          int telefon = teclat.nextInt();
          treballadors.get(dni).setTelefon(telefon);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        System.out.println("\nVol modificar el correu electrònic? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi un correu electrònic:");
          teclat.nextLine();
          String email = teclat.nextLine();
          treballadors.get(dni).setEmail(email);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        System.out.println("\nVol modificar el sou base? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi el sou base:");
          teclat.nextLine();
          int soubase = teclat.nextInt();
          treballadors.get(dni).setSoubase(soubase);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      System.out.println("S'ha modificat el tècnic amb DNI: " + dni);
    } else {
      System.out.println("No s'ha trobat tècnic amb DNI: " + dni);
    }
  }

  public void modificaJugador() {
    Scanner teclat = new Scanner(System.in);
    System.out.println("\nModificar les dades d'un porter");

    System.out.println("\nIntrodueixi el DNI del porter a modificar");
    String dni = teclat.nextLine();
    if (treballadors.containsKey(dni)) {
      do {
        System.out.println("\nVol modificar el nom? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi el nom:");
          teclat.nextLine();
          String nom = teclat.nextLine();
          treballadors.get(dni).setNom(nom);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        System.out.println("\nVol modificar els cognoms? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi els cognoms:");
          teclat.nextLine();
          String cognoms = teclat.nextLine();
          treballadors.get(dni).setCognoms(cognoms);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        System.out.println("\nVol modificar el número de telèfon? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi el número de telèfon:");
          teclat.nextLine();
          int telefon = teclat.nextInt();
          treballadors.get(dni).setTelefon(telefon);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        System.out.println("\nVol modificar el correu electrònic? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi un correu electrònic:");
          teclat.nextLine();
          String email = teclat.nextLine();
          treballadors.get(dni).setEmail(email);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        System.out.println("\nVol modificar el sou base? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi el sou base:");
          teclat.nextLine();
          int soubase = teclat.nextInt();
          treballadors.get(dni).setSoubase(soubase);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        String opt2;
        System.out.println(
          "\nVol modificar la titularitat d'aquest jugador? (S/N)"
        );
        opt = teclat.next();
        Boolean esTitular;
        if (opt.toUpperCase().equals("S")) {
          do {
            System.out.println("\nIntrodueixi si vol que sigui titular(S/N):");
            opt2 = teclat.next();
            if (opt2.toUpperCase().equals("S")) {
              esTitular = true;
              ((Jugador) treballadors.get(dni)).setEsTitular(esTitular);
            }
            if (opt2.toUpperCase().equals("N")) {
              esTitular = false;
              ((Jugador) treballadors.get(dni)).setEsTitular(esTitular);
            }
          } while (
            (
              !(opt2.toUpperCase().equals("N")) &&
              (!(opt2.toUpperCase().equals("S")))
            )
          );
          teclat.nextLine();
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      System.out.println("S'ha modificat el porter amb DNI: " + dni);
    } else {
      System.out.println("No s'ha trobat el porter amb DNI: " + dni);
    }
  }

  public void baixaTreballadors() {
    Scanner teclat = new Scanner(System.in);
    System.out.println("\n*Donar de baixa un treballador del club*");

    System.out.print(
      "\nEscriu el dni del treballador que vols donar de baixa:\n"
    );
    String dni = teclat.nextLine();
    if (treballadors.containsKey(dni)) {
      treballadors.remove(dni);
      System.out.println(
        "\nEl treballador amb DNI: " + dni + " ha sigut donat de baixa"
      );
    } else {
      System.out.println("\nNo s'ha trobat el treballador amb DNI: " + dni);
    }
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

  public void altaSoci() {
    Scanner teclat = new Scanner(System.in);
    System.out.println("*Donar d'alta un soci*");

    System.out.println("\nIntrodueixi el DNI:");
    String dni = teclat.nextLine();

    System.out.println("\nIntrodueixi el nom:");
    String nom = teclat.nextLine();

    System.out.println("\nIntrodueixi els cognoms:");
    String cognoms = teclat.nextLine();

    System.out.println(
      "\nIntrodueixi la data naixement en el següent format (AAAA-MM-DD):"
    );
    String datanaix = teclat.nextLine();

    System.out.println("\nIntrodueixi el número de telèfon:");
    int telefon = teclat.nextInt();
    teclat.nextLine();

    System.out.println("\nIntrodueixi el email:");
    String email = teclat.nextLine();

    System.out.println("\nIntrodueixi la quota anual:");
    int quotaanual = teclat.nextInt();

    socis.put(
      dni,
      new Soci(
        quotaanual,
        dni,
        nom,
        cognoms,
        LocalDate.parse(datanaix),
        telefon,
        email
      )
    );

    System.out.println(
      "El soci amb DNI: " + dni + " Ha sigut donat d'alta amb èxit"
    );
  }

  public void modificaSoci() {
    Scanner teclat = new Scanner(System.in);
    System.out.println("\nModificar les dades d'un soci");

    System.out.println("\nIntrodueixi el DNI del soci a modificar");
    String dni = teclat.nextLine();
    if (socis.containsKey(dni)) {
      do {
        System.out.println("\nVol modificar el nom? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi el nom:");
          teclat.nextLine();
          String nom = teclat.nextLine();
          socis.get(dni).setNom(nom);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        System.out.println("\nVol modificar els cognoms? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi els cognoms:");
          teclat.nextLine();
          String cognoms = teclat.nextLine();
          socis.get(dni).setCognoms(cognoms);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        System.out.println("\nVol modificar el número de telèfon? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi el número de telèfon:");
          teclat.nextLine();
          int telefon = teclat.nextInt();
          socis.get(dni).setTelefon(telefon);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        System.out.println("\nVol modificar el correu electrònic? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi un correu electrònic:");
          teclat.nextLine();
          String email = teclat.nextLine();
          socis.get(dni).setEmail(email);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );

      do {
        System.out.println("\nVol modificar la quota anual? (S/N)");
        opt = teclat.next();
        if (opt.toUpperCase().equals("S")) {
          System.out.println("\nIntrodueixi la quota anual:");
          teclat.nextLine();
          int quotaanual = teclat.nextInt();
          socis.get(dni).setQuotaanual(quotaanual);
        }
      } while (
        (!(opt.toUpperCase().equals("N")) && (!(opt.toUpperCase().equals("S"))))
      );
    } else {
      System.out.println("No s'ha trobat el soci amb DNI: " + dni);
    }
  }

  private void baixaSoci() {
    Scanner teclat = new Scanner(System.in);
    System.out.println("\n*Donar de baixa un soci*");

    System.out.print("\nEscriu el dni del soci que vols donar de baixa:\n");
    String dni = teclat.nextLine();
    if (socis.containsKey(dni)) {
      socis.remove(dni);
      System.out.println(
        "\nEl soci amb DNI: " + dni + " ha sigut donat de baixa"
      );
    } else {
      System.out.println("\nNo s'ha trobat el soci amb DNI: " + dni);
    }
  }

  private void visualitzarSoci() {
    Scanner teclat = new Scanner(System.in);
    boolean sortir = false;

    do {
      System.out.println("_________________________________________________");
      System.out.println("|       CRITERI PER ORDENAR ELS RESULTATS       |");
      System.out.println("|                                               |");
      System.out.println("|       1. Ordenar per cognoms i nom            |");
      System.out.println("|       2. Ordenar per número de localitat      |");
      System.out.println("|       3. Ordenar per quota anual              |");
      System.out.println("|       4. Sortir                               |");
      System.out.println("|_______________________________________________|");

      int opcio = teclat.nextInt();

      switch (opcio) {
        case 1:
          ordenarCognomNom();
          break;
        case 2:
          ordenarLocalitat();
          break;
        case 3:
          ordenarQuotaAnual();
          break;
        case 4:
          sortir = true;
          break;
        default:
          System.out.println("Opcio no valida");
      }
    } while (!sortir);
  }

  private void ordenarCognomNom() {
    System.out.println("\nLlista de socis ordenats per cognoms i nom:\n");

    ArrayList<Soci> alSocis = new ArrayList<Soci>();

    for (Soci s : socis.values()) {
      alSocis.add(s);
    }

    Collections.sort(
      alSocis,
      new Comparator<Soci>() {
        public int compare(Soci s1, Soci s2) {
          int num = s1.getCognoms().compareTo(s2.getCognoms());
          if (num == 0) {
            return s1.getNom().compareTo(s2.getNom());
          }
          return num;
        }
      }
    );

    for (Soci s : alSocis) {
      System.out.println(
        "-Cognoms: " +
        s.getCognoms() +
        "  -Nom: " +
        s.getNom() +
        "   -DNI:  " +
        s.getDni() +
        "  -Tel:   " +
        s.getTelefon() +
        "  -Email:   " +
        s.getEmail() +
        "  -Data naix:  " +
        s.getDatanaixement() +
        "   -Localitat: " +
        s.getNumlocalitat()
      );
    }

    System.out.println("");
  }

  private void ordenarLocalitat() {
    System.out.println("\nLlista de socis ordenats per número de localitat:\n");

    ArrayList<Soci> alSocis = new ArrayList<Soci>();

    for (Soci s : socis.values()) {
      alSocis.add(s);
    }

    Collections.sort(
      alSocis,
      new Comparator<Soci>() {
        public int compare(Soci s1, Soci s2) {
          return s1.getNumlocalitat() - s2.getNumlocalitat();
        }
      }
    );

    for (Soci s : alSocis) {
      System.out.println(
        "-Localitat: " +
        s.getNumlocalitat() +
        " -Nom: " +
        s.getNom() +
        "  -Cognoms: " +
        s.getCognoms() +
        "   -DNI:  " +
        s.getDni() +
        "  -Tel:   " +
        s.getTelefon() +
        "  -Email:   " +
        s.getEmail() +
        "  -Data naix:  " +
        s.getDatanaixement()
      );
    }

    System.out.println("");
  }

  private void ordenarQuotaAnual() {
    System.out.println("\nLlista de socis ordenats per quota anual:\n");

    ArrayList<Soci> alSocis = new ArrayList<Soci>();

    for (Soci s : socis.values()) {
      alSocis.add(s);
    }

    Collections.sort(
      alSocis,
      new Comparator<Soci>() {
        public int compare(Soci s1, Soci s2) {
          return s1.getQuotaanual() - s2.getQuotaanual();
        }
      }
    );

    for (Soci s : alSocis) {
      System.out.println(
        "-Quota anual  " +
        s.getQuotaanual() +
        "  -Nom: " +
        s.getNom() +
        "  -Cognoms: " +
        s.getCognoms() +
        "   -DNI:  " +
        s.getDni() +
        "  -Tel:   " +
        s.getTelefon() +
        "  -Email:   " +
        s.getEmail() +
        "  -Data naix:  " +
        s.getDatanaixement() +
        "   -Localitat: " +
        s.getNumlocalitat()
      );
    }
    System.out.println("");
  }

  public void visualitzaTreballadors() {
    // treballadors
    //   .entrySet()
    //   .forEach(
    //     entry -> {
    //       System.out.println("");
    //       System.out.println(entry.getValue());
    //     }
    //   );
    Scanner teclat = new Scanner(System.in);
    boolean sortir = false;

    do {
        System.out.println("__________________________________________________");
        System.out.println("|          VISUALITZA PLANTILLA PER CRITERIS     |");
        System.out.println("|          1. Ordenat per tipus de rol           |");
        System.out.println("|          2. Ordenat per sou incentivat         |");
        System.out.println("|          3. Sortir                             |");
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
                ordenarRol();
                break;
            case 2:
                ordenarSou();
                break;
            case 3:
                sortir = true;
                break;
            default:
                System.out.println("\n" + opcio + " NO ÉS UNA OPCIÓ NO VÀLIDA");
        }
    } while (!sortir);

  }

  private void ordenarRol(){
    System.out.println("\nLlista de treballadors ordenats per rol en la plantilla:\n");

    ArrayList<Treballador> alTreballadors = new ArrayList<Treballador>();

    for (Treballador t : treballadors.values()) {
      alTreballadors.add(t);
    }

    Collections.sort(
      alTreballadors,
      new Comparator<Treballador>() {
        public int compare(Treballador t1, Treballador t2) {
          return (t1.getClass().getName().compareTo(t2.getClass().getName()));
        }
      }
    );


    for (Treballador t : alTreballadors) {
      System.out.println(
        " -Rol: " +
        t.getClass().getName().substring(16, t.getClass().getName().length()) +
        "  -Nom: " +
        t.getNom() +
        "  -Cognoms: " +
        t.getCognoms() +
        "   -DNI:  " +
        t.getDni() +
        "  -Tel:   " +
        t.getTelefon() +
        "  -Email:   " +
        t.getEmail() +
        "  -Data naix:  " +
        t.getDatanaixement() +
        " -Sou incentivat: " +
        String.valueOf(t.getSouFinal() - t.getSoubase()).format("%.2f", t.getSouFinal() - t.getSoubase()) + " EUR"
      );
    }

    System.out.println("");
  }


  private void ordenarSou(){
    System.out.println("\nLlista de treballadors ordenats per sou incentivat:\n");

    ArrayList<Treballador> alTreballadors = new ArrayList<Treballador>();

    for (Treballador t : treballadors.values()) {
      alTreballadors.add(t);
    }

    Collections.sort(
      alTreballadors,
      new Comparator<Treballador>() {
        public int compare(Treballador t1, Treballador t2) {
          return (int) ((t1.getSouFinal()-t1.getSoubase()) - (t2.getSouFinal()-t2.getSoubase()));
        }
      }
    );

    for (Treballador t : alTreballadors) {
      System.out.println(
        " -Sou incentivat: " +
        String.valueOf(t.getSouFinal() - t.getSoubase()).format("%.2f", t.getSouFinal() - t.getSoubase()) + " EUR" +
        " -Nom: " +
        t.getNom() +
        "  -Cognoms: " +
        t.getCognoms() +
        "   -DNI:  " +
        t.getDni() +
        "  -Tel:   " +
        t.getTelefon() +
        "  -Email:   " +
        t.getEmail() +
        "  -Data naix:  " +
        t.getDatanaixement()
      );
    }

    System.out.println("");
  }



  public void visualitzarDadesEco() {
    double sous = 0;
    int quotes = 0;

    for (Treballador t : treballadors.values()) {
      sous += t.getSouFinal();
    }

    for (Soci s : socis.values()) {
      quotes += s.getQuotaanual();
    }

    System.out.println("---------------------------");
    System.out.println("Dades econòmiques\n");
    System.out.println("\nTotal d'ingressos:\n" + quotes + " euros");
    System.out.println("Total de gastos:\n" + sous + " euros");
    System.out.println("Total de beneficis:\n" + (quotes - sous) + " euros");
    System.out.println("---------------------------");
  }

  private void escriureDades() throws IOException {
    Club club = new Club();
    FileOutputStream out = new FileOutputStream("dades/dades.dat");
    File f = new File("dades/dades.dat");
    f.createNewFile();
    ObjectOutputStream oo = new ObjectOutputStream(out);
    oo.writeObject(club);
    oo.close();
  }
}
