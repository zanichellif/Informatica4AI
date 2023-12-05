public class Hardware extends Dispositivi{

    private double peso_kg;

    public Hardware(String nome, double prezzo, double peso_kg) {
        super(nome, prezzo);
        this.peso_kg = peso_kg;
    }

    public double getPeso_kg() {
        return peso_kg;
    }

    public void setPeso_kg(double peso_kg) {
        this.peso_kg = peso_kg;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "peso_kg=" + peso_kg +
                "} " + super.toString();
    }

    @Override
    public String to_file() {
        return super.to_file()+"Hardware"+'\n'+this.peso_kg+'\n';
    }
}
