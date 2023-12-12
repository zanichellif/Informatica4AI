public class Lavasciuga extends Lavatrici{

    private double consumo_asciugatura;

    public Lavasciuga(double prezzo, double consumo_lavaggio, double consumo_asciugatura) {
        super(prezzo, consumo_lavaggio);
        this.consumo_asciugatura = consumo_asciugatura;
    }

    public double getConsumo_asciugatura() {
        return consumo_asciugatura;
    }

    public void setConsumo_asciugatura(double consumo_asciugatura) {
        this.consumo_asciugatura = consumo_asciugatura;
    }

    @Override
    public String toString() {
        return "Lavasciuga{" +
                "consumo_asciugatura=" + consumo_asciugatura +
                "} " + super.toString();
    }

    @Override
    public String toFile(){
        return super.toFile() + Double.toString(this.consumo_asciugatura) + '\n';
    }
}
