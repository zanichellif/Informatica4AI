import java.io.*;
import java.net.PasswordAuthentication;
import java.net.Socket;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        int goal_casa, goal_trasferta;
        String goal_casa_stringa;
        File f = new File("src" + File.separator + "testo.txt");
        FileWriter fw = new FileWriter(f);
        FileReader fr = new FileReader(f);
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br = new BufferedReader(fr);


        ArrayList<Partite> elenco = new ArrayList<>();

        elenco.add(new Partite(2, 1));
        elenco.add(new Partite(0, 1));
        elenco.add(new Partite(0, 0));


        for (Partite p : elenco) {
            bw.write(p.toFile());
        }
        bw.flush();

        System.out.println("ARRAY INIZIALE");
        for (Partite p : elenco) {
            System.out.println(p.toString());
        }

        elenco.clear();

        while ((goal_casa_stringa=br.readLine()) != null) {
            goal_casa = Integer.parseInt(goal_casa_stringa);
            goal_trasferta = Integer.parseInt(br.readLine());
            elenco.add(new Partite(goal_casa, goal_trasferta));
        }
        System.out.println("ARRRAY DOPO LETTURA:");
        for (Partite p:elenco) {
            System.out.println(p.toString());

        }
    }
}