import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        final String menu= """
                -----------------
                Premere 1 per inserire un nuovo modello
                Premere 2 per salvare su file di testo
                Premere 3 per stampare la lista di tutti i dispositivi
                Premere 4 per stampare ripristinare da file di testo
                Premere 5 per trovare la più conveniente per la combo prezzo+consumi
                Premere 6 per uscire dal programma\s""";
        int scelta;

        Scanner in = new Scanner(System.in);

        File f = new File("src" + File.separator + "testo.txt");

        FileReader fr = new FileReader(f);
        FileWriter fw;
        BufferedWriter bw;
        BufferedReader br = new BufferedReader(fr);

        ArrayList<Lavatrici> elenco = new ArrayList<>();
        String tipo, prezzo_stringa;
        double consumo_lavaggio, consumo_asciugatura, prezzo;
        Lavatrici l;

        while (true) {

            System.out.println(menu);
            System.out.println("Inserire un numero: ");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Inserire il prezzo: ");
                    prezzo = in.nextDouble();
                    System.out.println("Inserire il consumo lavaggio: " );
                    consumo_lavaggio = in.nextDouble();
                    System.out.println("È una lavasciuga? s/n ");
                    tipo = in.next();
                    if(tipo.equals("s")){
                        System.out.println("Inserire consumo asciugatura: ");
                        consumo_asciugatura = in.nextDouble();
                        l = new Lavasciuga(prezzo, consumo_lavaggio, consumo_asciugatura);
                    } else{
                        l = new Lavatrici(prezzo, consumo_lavaggio);
                    }
                    elenco.add(l);
                    break;
                case 2:
                    fw = new FileWriter(f);
                    bw = new BufferedWriter(fw);

                    for (Lavatrici lav : elenco) {
                        if(lav instanceof Lavasciuga)
                            bw.write("Lavasciuga\n");
                        else
                            bw.write("Lavatrice\n");
                        bw.write(lav.toFile());
                    }
                    bw.flush();
                    break;
                case 3:
                    for (Lavatrici lav: elenco) {
                        System.out.println(lav.toString());
                    }
                    break;
                case 4:
                    if (!f.exists())
                        break;
                    Lavatrici.setContatore(0);
                    elenco.clear();
                    while ((tipo = br.readLine()) != null){
                        prezzo = Double.parseDouble(br.readLine());
                        consumo_lavaggio = Double.parseDouble(br.readLine());
                        if (tipo.equals("Lavasciuga")){
                            consumo_asciugatura = Double.parseDouble(br.readLine());
                            l = new Lavasciuga(prezzo, consumo_lavaggio, consumo_asciugatura);
                        } else if (tipo.equals("Lavatrice")){
                            l = new Lavatrici(prezzo, consumo_lavaggio);
                        } else{
                            System.out.println("QUALCOSA NON VA");
                            return;
                        }
                        elenco.add(l);
                    }

                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Grazie per aver utilizzato questo gestionale!");
                    return;
                default:
                    System.out.println("Scelta non valida");
            }

        }

    }
}