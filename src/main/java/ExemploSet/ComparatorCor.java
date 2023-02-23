package ExemploSet;

import java.util.Comparator;

public class ComparatorCor implements Comparator<ArcoIris> {

    @Override
    public int compare(ArcoIris a1, ArcoIris a2) {
        return CharSequence.compare(a1.getCor(), a2.getCor());
    }
}
