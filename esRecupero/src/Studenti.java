public class Studenti {
    private String nome;
    private String cognome;
    private double voto1, voto2;

    public Studenti(String nome, String cognome, double voto1, double voto2) {
        this.nome = nome;
        this.cognome = cognome;
        this.voto1 = voto1;
        this.voto2 = voto2;
    }

    public Studenti(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        voto1 = 10.0;
        voto2 = 10.0;
    }



    @Override
    public String toString() {
        return "Studenti{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'';
    }


    public String toFile(){
        return this.nome + '\n' + this.cognome + '\n' + Double.toString(this.voto1)
                + '\n' + Double.toString(this.voto2) + '\n';
    }

    public double calcola_media(){
        return (voto1+voto2)/2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getVoto1() {
        return voto1;
    }

    public void setVoto1(double voto1) {
        this.voto1 = voto1;
    }

    public double getVoto2() {
        return voto2;
    }

    public void setVoto2(double voto2) {
        this.voto2 = voto2;
    }
}
