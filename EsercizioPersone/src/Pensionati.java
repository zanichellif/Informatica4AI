public class Pensionati extends Persone{

    private double pensione;

    public Pensionati(String nome, String cognome, int eta, double pensione) {
        super(nome, cognome, eta);
        this.pensione = pensione;
    }

    public double getPensione() {
        return pensione;
    }

    public void setPensione(double pensione) {
        this.pensione = pensione;
    }

    @Override
    public String toString() {
        return "Pensionati{" +
                "pensione=" + pensione +
                "} " + super.toString();
    }
}
