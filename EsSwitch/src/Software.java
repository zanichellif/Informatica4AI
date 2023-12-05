public class Software extends Dispositivi{

    private double peso_gb;

    public Software(String nome, double prezzo, double peso_gb) {
        super(nome, prezzo);
        this.peso_gb = peso_gb;
    }

    public double getPeso_gb() {
        return peso_gb;
    }

    public void setPeso_gb(double peso_gb) {
        this.peso_gb = peso_gb;
    }

    @Override
    public String toString() {
        return "Software{" +
                "peso_gb=" + peso_gb +
                "} " + super.toString();
    }

    @Override
    public String to_file() {
        return super.to_file()+"Software"+'\n'+this.peso_gb+'\n';
    }
}
