package kata3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Histogram<String> histograma = new Histogram<>();
        MailReader dominios = new MailReader("C:\\Users\\usuario\\Desktop\\KATA3\\data\\emailsfilev1.txt");
        ArrayList <String> domis = dominios.getDominiosArray();
        
        for (int i = 0; i < domis.size(); i++) {
            histograma.increment(domis.get(i));
        }    

        HistogramDisplay histo = new HistogramDisplay(histograma);
        histo.execute();
    }
}
