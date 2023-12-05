public abstract class Dispositivi {
    private String nome;
    private double prezzo;

    public Dispositivi(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Dispositivi{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String to_file(){
        return this.nome+'\n'+this.prezzo+'\n';
    }
}
