public class Lavatrici {

    private final int codice;
    private static int contatore = 0;
    private double prezzo, consumo_lavaggio;


    public Lavatrici(double prezzo, double consumo_lavaggio) {
        this.codice = contatore;
        contatore++;
        this.prezzo = prezzo;
        this.consumo_lavaggio = consumo_lavaggio;
    }

    public int getCodice() {
        return codice;
    }

    public static int getContatore() {
        return contatore;
    }

    public static void setContatore(int contatore) {
        Lavatrici.contatore = contatore;
    }

    public double getConsumo_lavaggio() {
        return consumo_lavaggio;
    }

    public void setConsumo_lavaggio(double consumo_lavaggio) {
        this.consumo_lavaggio = consumo_lavaggio;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Lavatrici{" +
                "codice=" + codice +
                ", prezzo=" + prezzo +
                ", consumo_lavaggio=" + consumo_lavaggio +
                '}';
    }

    public String toFile(){
        return Double.toString(this.prezzo) + '\n' + Double.toString(this.consumo_lavaggio) + '\n';
    }
}
