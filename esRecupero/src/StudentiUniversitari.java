public class StudentiUniversitari extends Studenti{
    private String matricola;

    public StudentiUniversitari(String nome, String cognome, double voto1, double voto2, String matricola) {
        super(nome, cognome, voto1, voto2);
        this.matricola = matricola;
    }

    @Override
    public String toString() {
        return "StudentiUniversitari{" +
                "matricola='" + matricola + '\'' +
                "} " + super.toString();
    }

    @Override
    public String toFile (){
        return super.toFile()+this.matricola+'\n';

    }

    public String getMatricola() {
        return matricola;
    }

    @Override
    public double calcola_media() {
        return super.calcola_media()*3;
    }
}
