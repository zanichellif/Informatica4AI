import java.util.Comparator;

public class AcquaComparator implements Comparator<Acqua> {

    @Override
    public int compare(Acqua o1, Acqua o2) {
        return (int) (o2.getPrezzo() - o1.getPrezzo());
    }
}
