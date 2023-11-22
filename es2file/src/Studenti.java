public class Studenti {
    private String nome, cognome;
    private double media_voti;

    public Studenti(String nome, String cognome, double media_voti) {
        this.nome = nome;
        this.cognome = cognome;
        this.media_voti = media_voti;
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

    public double getMedia_voti() {
        return media_voti;
    }

    public void setMedia_voti(double media_voti) {
        this.media_voti = media_voti;
    }

    @Override
    public String toString() {
        return "Studenti{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", media_voti=" + media_voti +
                '}';
    }
}
