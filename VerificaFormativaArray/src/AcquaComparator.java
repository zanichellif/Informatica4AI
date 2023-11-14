import java.util.Comparator;

public class AcquaComparator implements Comparator<Acqua> {

    @Override
    public int compare(Acqua o1, Acqua o2) {
        return (int) (o1.getPrezzo() - o2.getPrezzo());
    }

    @Override
    public Comparator<Acqua> reversed() {
        return Comparator.super.reversed();
    }
}
