public class Acqua {
    private String marca;
    private double prezzo, residuo_fisso;

    public Acqua(String marca, double prezzo, double residuo_fisso) {
        this.marca = marca;
        this.prezzo = prezzo;
        this.residuo_fisso = residuo_fisso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getResiduo_fisso() {
        return residuo_fisso;
    }

    public void setResiduo_fisso(double residuo_fisso) {
        this.residuo_fisso = residuo_fisso;
    }

    @Override
    public String toString() {
        return "Acqua{" +
                "marca='" + marca + '\'' +
                ", prezzo=" + prezzo +
                ", residuo_fisso=" + residuo_fisso +
                '}';
    }
}
