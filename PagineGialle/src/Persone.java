public class Persone extends Contatti{

    private int eta;

    public Persone(String nome, String numero_telefonico, int eta) {
        super(nome, numero_telefonico);
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
