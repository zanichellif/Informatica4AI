import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {


    public static void main (String[] args){

        ArrayList<Persone> anagrafe = new ArrayList<>();
        String nome, cognome, scelta, tipo;
        int ore_lavoro, eta;
        double pensione;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Inserire il nome: ");
            nome = in.next();
            System.out.println("Inserire il cognome: ");
            cognome = in.next();
            System.out.println("Inserire l'età: ");
            eta = in.nextInt();
            System.out.println("p o l? ");
            tipo = in.next();
            if (tipo.equals("p")){
                System.out.println("Inserire la pensione: ");
                pensione = in.nextDouble();
                Pensionati pens = new Pensionati(nome, cognome, eta, pensione);
                anagrafe.add(pens);
            }
            if (tipo.equals("l")){
                System.out.println("Inserire le pre lavorate: ");
                ore_lavoro = in.nextInt();
                Lavoratori lav = new Lavoratori(nome, cognome, eta, ore_lavoro);
                anagrafe.add(lav);
            }
            if(!tipo.equals("p") && !tipo.equals("l"))
                System.out.println("Che fai?");
            System.out.println("Premere S per smettere");
            scelta = in.next();
        }while(!scelta.equalsIgnoreCase("s"));

        for (Persone p: anagrafe) {
            System.out.println(p.toString());
        }

        int max = anagrafe.get(0).getEta();
        int imax = 0;
        for (int i = 1; i < anagrafe.size(); i++) {
            if (anagrafe.get(i).getEta() > max){
                max = anagrafe.get(i).getEta();
                imax = i;
            }
        }
        System.out.println("Persona età massima: ");
        System.out.println(anagrafe.get(imax).toString());

        anagrafe.sort(new PersoneCompataror());
        System.out.println("DOPO ORDINAMENTO: ");
        for (Persone p: anagrafe) {
            System.out.println(p.toString());
        }
    }
}
