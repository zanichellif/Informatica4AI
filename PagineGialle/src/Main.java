import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String nome, numero, p_iva;
        int eta;
        char scelta;
        ArrayList<Contatti> elenco = new ArrayList<>();
        Scanner in = new Scanner(System.in);


            System.out.println("Inserire il nome: ");
            nome = in.nextLine();
            System.out.println("Inserire il numero: ");
            numero = in.nextLine();
            System.out.println("Azienda o persona?");
            //scelta = (char) in.nextByte();
            //if (scelta == 'a') {
                System.out.println("Inserire la partita iva");
                p_iva = in.nextLine();
                Aziende az = new Aziende(nome, numero, p_iva);
                elenco.add(az);
            //}
            if (elenco.get(0) instanceof Aziende)
                System.out.println("Fenicottero");

            Aziende azprova = (Aziende) elenco.get(0);
            azprova.getP_iva();









    }
}