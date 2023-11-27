public class NonAlimentari extends Prodotti{
    private String materiale;

    public NonAlimentari(String nome, double prezzo, String materiale) {
        super(nome, prezzo);
        this.materiale = materiale;
    }

    public String getMateriale() {
        return materiale;
    }
    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }

    @Override
    public String toString() {
        return "NonAlimentari{" +
                "materiale='" + materiale + '\'' +
                "} " + super.toString();
    }
}
