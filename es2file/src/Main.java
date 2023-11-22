import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File f = new File("Z:\\Informatica4AI\\es2file\\src\\stampa.txt");
        FileWriter fw;
        try {
            fw = new FileWriter(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bw = new BufferedWriter(fw);

        Studenti stud1 = new Studenti("Alfonso", "Signorini", 9);
        Studenti stud2 = new Studenti("Quarantaquattro", "Miao", 6);
        Studenti stud3 = new Studenti("Signor", "Giancarlo", 7.5);

        try {
            bw.write(stud1.toString());
            bw.write(stud2.toString());
            bw.write(stud3.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        bw.close();


    }
}