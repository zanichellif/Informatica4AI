import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Prodotti> elenco = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String nome, tipo, scelta;
        double prezzo;

        do{
            System.out.println("Inserire il nome del prodotto: ");
            nome = in.next();
            System.out.println("Inserire il prezzo del prodotto: ");
            prezzo = in.nextInt();
            System.out.println("a o n? ");
            tipo = in.next();
            if(tipo.equals("a")){
                String data_di_scadenza;
                System.out.println("Inserire la data di scadenza: ");
                data_di_scadenza=in.next();
                ProdottiAlimentari pa = new ProdottiAlimentari(nome, prezzo, data_di_scadenza);
                elenco.add(pa);
            } else if (tipo.equals("n")){
                String materiale;
                System.out.println("Inserire il materiale: ");
                materiale=in.next();
                ProdottiNonAlimentari pn = new ProdottiNonAlimentari(nome, prezzo, materiale);
                elenco.add(pn);
            } else
                System.out.println("Sei particolare! :) ");
            System.out.println("Vuoi continuare? Inserire s ");
            scelta=in.next().toLowerCase();
        }while(scelta.equals("s"));

        //Stampo ArrayList
        for (Prodotti p: elenco) {
            System.out.println(p.toString());
        }

        //Applico inflazione del 20%
        for (Prodotti p: elenco) {
            p.setPrezzo(p.getPrezzo()*1.20);
        }
        System.out.println("HO APPLICATOP L'INFLAZIONE!");
        //Stampo ArrayList dopo inflazione
        for (Prodotti p: elenco) {
            System.out.println(p.toString());
        }
    }
}