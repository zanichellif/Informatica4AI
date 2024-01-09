import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Studenti> elenco = new ArrayList<>();
        Studenti s1 = new Studenti("Mario", "Rossi", 8.0, 9.0);
        StudentiUniversitari s2 = new StudentiUniversitari("Luigi", "Bianchi", 7, 9, "123456");
        Studenti s3 = new Studenti("Marco", "Verdi");

        elenco.add(s1);
        elenco.add(s2);
        elenco.add(s3);

        for(int i = 0; i<elenco.size(); i++){
            System.out.println(elenco.get(i).toString());
            System.out.println(elenco.get(i).calcola_media());
        }

        System.out.println("La media in decimi è " + s1.calcola_media());
        System.out.println("La media dello studente universitario è " + s2.calcola_media());
        System.out.println("La media del terzo studente è " + s3.calcola_media());
    }
}