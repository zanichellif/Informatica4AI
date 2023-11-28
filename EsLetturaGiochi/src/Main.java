import java.io.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("src"+File.separator+"testo.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        ArrayList<Giochi> elenco = new ArrayList<>();

        String nome, tipo;
        double prezzo;
        int num_pubblicita;
        Giochi g = null;
        while((nome = br.readLine()) != null){
            tipo = br.readLine();
            if(tipo.equals("pagamento")){
                prezzo = Double.parseDouble(br.readLine());
                g = new Pagamento(nome, prezzo);
            }
            if(tipo.equals("ftp")){
                num_pubblicita = Integer.parseInt(br.readLine());
                g = new Ftp(nome, num_pubblicita);
            }
            elenco.add(g);
        }

        for (Giochi gioco:elenco) {
            System.out.println(gioco.toString());


        }

    }
}