package kata3;

public class Main {

    public static void main(String[] args) {
        Histogram<String> histograma = new Histogram<>();
        histograma.increment("gmail.com");
        histograma.increment("gmail.com");
        histograma.increment("gmail.com");
        histograma.increment("gmail.com");
        
        histograma.increment("ulpgc.es");
        histograma.increment("ulpgc.es");
        histograma.increment("ulpgc.es");
        histograma.increment("ulpgc.es");
        histograma.increment("ulpgc.es");
        histograma.increment("ulpgc.es");
        histograma.increment("ulpgc.es");
        
        histograma.increment("hotmail.com");
        histograma.increment("hotmail.com");
        histograma.increment("hotmail.com");
        histograma.increment("hotmail.com");
        histograma.increment("hotmail.com");
        histograma.increment("hotmail.com");
        histograma.increment("hotmail.com");
        
        HistogramDisplay histo = new HistogramDisplay(histograma);
        histo.execute();
    }
}
