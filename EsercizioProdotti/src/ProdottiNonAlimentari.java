public class ProdottiNonAlimentari extends Prodotti{

    private String materiale;

    public ProdottiNonAlimentari(String nome, double prezzo, String materiale) {
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
        return "ProdottiNonAlimentari{" +
                "materiale='" + materiale + '\'' +
                "} " + super.toString();
    }
}
