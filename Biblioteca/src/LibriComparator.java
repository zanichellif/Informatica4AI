import java.util.Comparator;

public class LibriComparator implements Comparator<Libri> {

    @Override
    public int compare(Libri o1, Libri o2) {
        if (o1.getAutore().compareTo(o2.getAutore()) != 0)
            return o1.getAutore().compareTo(o2.getAutore());
        return o1.getTitolo().compareTo(o2.getTitolo());

    }


}
