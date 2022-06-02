package ClassesClub;

import ClassesPersones.Jugador;
import ClassesPersones.Soci;
import ClassesPersones.Treballador;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class ClubApp {

  public static void main(String[] args)
    throws IOException, ClassNotFoundException {
    Club club = new Club(
      "Cervera CF",
      "F23561289",
      "Av/ Catalunya 50, Cervera 25200",
      629344356,
      "cerveracf@fcf.cat",
      "cerveracf.cat"
    );

    // if (new File("dades/dades.dat").exists()) {

    //   FileInputStream in = new FileInputStream("dades/dades.dat");
    //   ObjectInputStream o = new ObjectInputStream(in);

    //   club = (Club) o.readObject();

    //   Soci.setNumsoci((int) o.readObject());

    //   Soci.setNumlocalitat((int) o.readObject());

    //   Treballador.setNumempleat((int) o.readObject());

    //   Jugador.setDorsal((int) o.readObject());

    // } else {
      club.altaPersones();
    // }

    club.gestioClub();
  }
}
