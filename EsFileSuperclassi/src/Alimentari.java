public class Alimentari extends Prodotti{
    private String data_di_scadenza;

    public Alimentari(String nome, double prezzo, String data_di_scadenza) {
        super(nome, prezzo);
        this.data_di_scadenza = data_di_scadenza;
    }

    public String getData_di_scadenza() {
        return data_di_scadenza;
    }

    public void setData_di_scadenza(String data_di_scadenza) {
        this.data_di_scadenza = data_di_scadenza;
    }

    @Override
    public String toString() {
        return "Alimentari{" +
                "data_di_scadenza='" + data_di_scadenza + '\'' +
                "} " + super.toString();
    }
}
