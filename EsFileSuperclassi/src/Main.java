import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("src" + File.separator +"testo.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        ArrayList<Prodotti> elenco = new ArrayList<>();

        String tipo, nome, materiale, data_di_scadenza;
        double prezzo;
        Prodotti prod;
        while ((tipo = br.readLine()) != null){
            nome = br.readLine();
            prezzo = Double.parseDouble(br.readLine());

            if (tipo.equals("alimentari")){
                data_di_scadenza = br.readLine();
                prod = new Alimentari(nome, prezzo, data_di_scadenza);
            }else{
                materiale = br.readLine();
                prod = new NonAlimentari(nome, prezzo, materiale);
            }
            elenco.add(prod);
        }

        for (Prodotti p: elenco) {
            System.out.println(p.toString());
        }




    }
}