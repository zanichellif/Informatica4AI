import java.util.Comparator;

public class PersoneCompataror implements Comparator<Persone> {

    @Override
    public int compare(Persone o1, Persone o2) {
        if (o1.getCognome().compareTo(o2.getCognome()) != 0)
            return o1.getCognome().compareTo(o2.getCognome());
        else if (o1.getNome().compareTo(o2.getNome()) != 0)
            return o1.getNome().compareTo(o2.getNome());
        else
            return o1.getEta()- o2.getEta();
    }
}
