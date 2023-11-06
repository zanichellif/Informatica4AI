public class Contatti {
    private String nome;
    private String numero_telefonico;

    public Contatti(String nome, String numero_telefonico) {
        this.nome = nome;
        this.numero_telefonico = numero_telefonico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero_telefonico() {
        return numero_telefonico;
    }

    public void setNumero_telefonico(String numero_telefonico) {
        this.numero_telefonico = numero_telefonico;
    }
}
