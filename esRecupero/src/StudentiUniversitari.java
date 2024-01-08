public class StudentiUniversitari extends Studenti{
    private String matricola;

    public StudentiUniversitari(String nome, String cognome, double voto1, double voto2, String matricola) {
        super(nome, cognome, voto1, voto2);
        this.matricola = matricola;
    }

    public String getMatricola() {
        return matricola;
    }

    @Override
    public double calcola_media() {
        return super.calcola_media()*3;
    }
}
