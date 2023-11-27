public class Pagamento extends Giochi{
    private double prezzo;

    public Pagamento(String nome, double prezzo) {
        super(nome);
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
