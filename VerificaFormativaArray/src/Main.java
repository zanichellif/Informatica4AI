import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String menu= """
                -----------------
                Premere 1 per inserire una nuova marca
                Premere 2 per vedere tutti le acque disponibili
                Premere 3 per la rescissione del contratto
                Premere 4 per stampare le medie
                Premere 5 per ordinare in ordine decrescente di prezzo
                Premere 6 per uscire dal programma\s""";
        int scelta;

        ArrayList<Acqua> elenco = new ArrayList<>();

        Scanner in = new Scanner(System.in);


        while (true) {
            String marca, tipo;
            double residuo_fisso, prezzo, co2;
            System.out.println(menu);
            System.out.println("Inserire un numero: ");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Inserire la marca");
                    marca = in.next();
                    System.out.println("Inserire il prezzo: ");
                    prezzo = in.nextDouble();
                    System.out.println("Inserire il residuo fisso: ");
                    residuo_fisso = in.nextDouble();
                    System.out.println("n o f? ");
                    tipo = in.next();
                    if (tipo.equalsIgnoreCase("n")) {
                        Acqua ac = new Acqua(marca, prezzo, residuo_fisso);
                        elenco.add(ac);
                    } else if (tipo.equalsIgnoreCase("f")) {
                        System.out.println("Inserire la co2: ");
                        co2 = in.nextDouble();
                        AcquaFrizzante fr = new AcquaFrizzante(marca, prezzo, residuo_fisso, co2);
                        elenco.add(fr);
                    } else {
                        System.out.println("Tipo non valido");
                    }
                    break;

                case 2:
                {
                    for (Acqua ac: elenco) {
                        System.out.println(ac.toString());
                    }
                }
                    break;
                case 3: {
                    String marca2;
                    System.out.println("Inserire la marca da rimuovere: ");
                    marca2 = in.next();
                    for (Acqua ac : elenco) {
                        if (ac.getMarca().equals(marca2)) {
                            elenco.remove(ac);
                            break;
                        }
                    }
                }
                    break;
                case 4:{
                    double somma_nat = 0, somma_fr = 0;
                    int c_nat = 0, c_fr = 0;
                    for (Acqua ac: elenco) {
                        /*
                        ATTENZIONE QUI
                        Se non mettessi la seconda condizione, tutte le acque frizzanti sarebbero anche acque
                        Quindi le medie sarebbero sballate
                        Normalmente non avevamo questo problema perchè la classe padre era astratta
                         */
                        if (ac != null && !(ac instanceof AcquaFrizzante)){
                            somma_nat += ac.getPrezzo();
                            c_nat++;
                        }
                        if (ac instanceof AcquaFrizzante){
                            somma_fr += ac.getPrezzo();
                            c_fr++;
                        }
                    }

                    //Controllo che il contatore non sia zero perchè sennò dividerei per zero
                    if (c_nat != 0)
                        System.out.println("Media prezzi acqua naturale: " + somma_nat/c_nat);
                    if (c_fr != 0)
                    System.out.println("Media prezzi acqua frizzanti: " + somma_fr/c_fr);
                }
                    break;
                case 5:
                    //Ordine decrescente
                    elenco.sort(new AcquaComparator().reversed());
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