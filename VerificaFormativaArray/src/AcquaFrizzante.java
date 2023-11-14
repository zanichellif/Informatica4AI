public class AcquaFrizzante extends Acqua{
    private double co2;

    public AcquaFrizzante(String marca, double prezzo, double residuo_fisso, double co2) {
        super(marca, prezzo, residuo_fisso);
        this.co2 = co2;
    }

    public double getCo2() {
        return co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

    @Override
    public String toString() {
        return "AcquaFrizzante{" +
                "co2=" + co2 +
                "} " + super.toString();
    }
}
