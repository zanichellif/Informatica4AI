import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Libri> elenco = new ArrayList<>();
        LibriCartacei lbc = new LibriCartacei("Pinocchio", "Collodi", 500, "24/11/2023");
        elenco.add(lbc);
        lbc = new LibriCartacei("Bianca come il latte rossa come il sangue", "D'Avenia", 300, "02/11/2023");
        elenco.add(lbc);
        lbc = new LibriCartacei("L'orlando furioso", "Ariosto", 300, "02/11/2023");
        elenco.add(lbc);
        lbc = new LibriCartacei("Vita nova", "Dante Alighieri", 300, "02/11/2023");
        elenco.add(lbc);
        lbc = new LibriCartacei("Il signor S", "Me contro te", 300, "02/11/2023");
        elenco.add(lbc);
        lbc = new LibriCartacei("Divertiti con luì e sofì", "Me contro te", 300, "02/11/2023");
        elenco.add(lbc);


        for (Libri l: elenco) {
            System.out.println(l.toString());
        }
        System.out.println("-------------------------");
        /*
        System.out.println(elenco.get(0).toString());
        int somma = 0;

        for (Libri l: elenco) {
            System.out.println(l.getData());
            if (l.devo_restituire())
                System.out.println("DEVO RESTITUIRE");
            else
                System.out.println("leggi con calma");

            if (l instanceof LibriCartacei)
                somma += ((LibriCartacei) l).getNumero_pagine();

        }*/

        elenco.sort(new LibriComparator());
        //System.out.println(somma);

        for (Libri l: elenco) {
            System.out.println(l.toString());
        }
    }
}
