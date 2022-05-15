package ClubFutbol;

import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.File;

public class ClubApp {
    public static void main(String[] args) {
        Club club = new Club();

        // if (new File("DadesClub.dat").exists()) {
        //     ObjectInputStream in = new ObjectInputStream(new FileInputStream("DadesClub.dat"));
        //     club = (Club) in.readObject();

        //     Soci.setNumlocalitat((int) in.readObject());

        //     Treballador.setNumempleat((int) in.readObject());

        //     Jugador.setDorsal((int) in.readObject());
        // } else {
        //     club.crearClubFutbol();
        // }

        club.gestioClub();
    }



    // private static void crearArxiu() throws IOException {
    //     List<Person> persons = createPersons();
    //     savePersons(persons);
    // }

}
