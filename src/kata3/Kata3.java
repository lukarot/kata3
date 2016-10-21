package kata3;
public class Kata3 {
    public static void main(String[] args) {
       Histogram<String> histo=new Histogram<>();
       histo.increment("gmail.com");
       histo.increment("gmail.com");
       histo.increment("ull.es");
       histo.increment("ulpgc.es");
       histo.increment("ulpgc.es.com"); 
       histo.increment("gmail.com");
       histo.increment("ulpgc.es");
       histo.increment("gmail.com");
       new HistogramDisplay(histo).execute();
    }
}
