public class Ftp extends Giochi{
    private int num_pubblicita;

    public Ftp(String nome, int num_pubblicita) {
        super(nome);
        this.num_pubblicita = num_pubblicita;
    }

    public int getNum_pubblicita() {
        return num_pubblicita;
    }

    public void setNum_pubblicita(int num_pubblicita) {
        this.num_pubblicita = num_pubblicita;
    }

    @Override
    public String toString() {
        return "Ftp{" +
                "num_pubblicita=" + num_pubblicita +
                "} " + super.toString();
    }
}
