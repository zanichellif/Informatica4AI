public class Ebook extends Libri{

    private double dimensione;

    public Ebook(String titolo, String autore, double dimensione, String data) {
        super(titolo, autore, data);
        this.dimensione = dimensione;
    }

    public double getDimensione() {
        return dimensione;
    }

    public void setDimensione(double dimensione) {
        this.dimensione = dimensione;
    }


}
