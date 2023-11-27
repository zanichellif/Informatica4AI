import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("src" + File.separator +"testo.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);

        ArrayList<Giochi> elenco = new ArrayList<>();

        Giochi g1 = new Pagamento("Geometry Dash", 5);
        Giochi g2 = new Ftp("Geoguessr", 5);
        Giochi g3 = new Ftp("Hay Day", 0);
        Giochi g4 = new Ftp("Candy crush soda", 100);

        elenco.add(g1);
        elenco.add(g2);
        elenco.add(g3);
        elenco.add(g4);

        for (Giochi g:elenco) {
            bw.write(g.getNome());
            bw.newLine();
            if (g instanceof Pagamento){
                bw.write("pagamento");
                bw.newLine();
                bw.write(Double.toString(((Pagamento) g).getPrezzo()));
                bw.newLine();
            }
            if (g instanceof Ftp){
                bw.write("ftp");
                bw.newLine();
                bw.write(Integer.toString(((Ftp) g).getNum_pubblicita()));
                bw.newLine();
            }
        }
        bw.flush();
    }
}