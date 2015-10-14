package kata3;

import java.util.ArrayList;

public class DominiosHistogramBuilder {

    public static <T> Histogram<String> execute(ArrayList<String> dominios) {
        Histogram<String> histogram = new Histogram<>();
        for (int i = 0; i < dominios.size(); i++) {
            histogram.increment(dominios.get(i));
        }
        return histogram;
    }
}
