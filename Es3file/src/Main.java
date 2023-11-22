import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("src/testo.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String nome, cognome;
        double voto;

        nome = br.readLine();
        cognome = br.readLine();
        voto = Double.parseDouble(br.readLine());
        Studenti stud1 = new Studenti(nome, cognome, voto);
        System.out.println(stud1.toString());
        //andrebbe fatto anche per gli altri due studenti



    }
}