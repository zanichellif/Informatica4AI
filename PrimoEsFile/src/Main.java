import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\zanichelli.fabio.INFORMATICA\\IdeaProjects\\Informatica4AI\\PrimoEsFile\\src\\testo.txt");
        FileReader fr;
        FileWriter fw;
        String str = "ciao";
        /*
        Vengono eseguite le istruzioni del try. Se queste generano un'eccezione
        vengono eseguite le istruzioni del relativo catch.
         */
        try {
            /*
            Non viene gestita l'eccezione FileNotFound per il writer perchè se
            non c'è il file viene creato vuoto.
            Per il reader invece c'è bisogno di gestire l'eccezione
             */
            fw = new FileWriter(f);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fr = new FileReader(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        /*
        Buffered writer fa uso di un buffer. Ovvero "accumula" le varie stringhe da
        stampare in un buffer per poi eseguire l'output quando questo è pieno per
        ottimizzare le cose.
        È più o meno lo stesso principio con il quale si riempie la spazzatura di
        casa propria (il buffer) prima di svuotare tutto la pattumiera nei cassonetti
        per strada.
         */
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write(str);
            /*La stringa è molto piccola quindi il buffer non si riempie, quindi non
            avviene l'output su file (la stringa è momentaneamente nel buffer). La
            funzione flush svuota il buffer.
             */
            bw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       try {
            System.out.println(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}