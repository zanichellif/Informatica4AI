public class Lavoratori extends Persone{

    private int ore_lavoro;

    public Lavoratori(String nome, String cognome, int eta, int ore_lavoro) {
        super(nome, cognome, eta);
        this.ore_lavoro = ore_lavoro;
    }

    public int getOre_lavoro() {
        return ore_lavoro;
    }

    public void setOre_lavoro(int ore_lavoro) {
        this.ore_lavoro = ore_lavoro;
    }

    @Override
    public String toString() {

        return super.toString() +"Lavoratori{" +
                "ore_lavoro=" + ore_lavoro +
                '}';
    }
}
