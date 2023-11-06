public class Aziende extends Contatti{

    private String p_iva;

    public Aziende(String nome, String numero_telefonico, String p_iva) {
        super(nome, numero_telefonico);
        this.p_iva = p_iva;
    }

    public String getP_iva() {
        return p_iva;
    }

    public void setP_iva(String p_iva) {
        this.p_iva = p_iva;
    }


}
