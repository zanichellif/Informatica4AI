import java.io.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File ("src"+ File.separator+"testo.txt");
        FileWriter fw = new FileWriter(f);
        FileReader fr = new FileReader(f);
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br = new BufferedReader(fr);

        ArrayList<Dispositivi> elenco = new ArrayList<>();

        elenco.add(new Software("Intellij", 250.0, 5));
        elenco.add(new Hardware("Switch", 25, 2.5));
        elenco.add(new Software("Gorilla Game Banana", 0, 300));

        for (Dispositivi disp: elenco) {
                bw.write(disp.to_file());
        }

        bw.flush();

        elenco.clear();

        String nome, tipo;
        double prezzo, peso_kg, peso_gb;
        Dispositivi d=null;

        while ((nome = br.readLine()) != null){
            prezzo = Double.parseDouble(br.readLine());
            tipo = br.readLine();
            if(tipo.equals("Hardware")){
                peso_kg = Double.parseDouble(br.readLine());
                d = new Hardware(nome, prezzo, peso_kg);
            }
            if(tipo.equals("Software")){
                peso_gb = Double.parseDouble(br.readLine());
                d = new Software(nome, prezzo, peso_gb);
            }
            elenco.add(d);
        }

        for (Dispositivi disp: elenco) {
            System.out.println(disp.toString());
        }

        double somma_kg=0, somma_gb=0, somma_prezzi_hard=0, somma_prezzi_soft=0;
        for (Dispositivi disp: elenco) {
            if(disp instanceof Hardware){
                somma_prezzi_hard++;
                somma_kg += ((Hardware) disp).getPeso_kg();
            }
            if(disp instanceof Software){
                somma_prezzi_soft++;
                somma_gb += ((Software) disp).getPeso_gb();
            }
        }

        if(somma_kg!=0)
            System.out.println("Prezzo al kg= " + somma_prezzi_hard/somma_kg);
        if(somma_gb!=0)
            System.out.println("Prezzo al GB= " + somma_prezzi_soft/somma_gb);
    }
}