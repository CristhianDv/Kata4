package kata4.main;

import java.util.List;
import kata4.model.*;
import kata4.view.*;
import kata4.view.MailHistogramBuilder;

public class Kata4 {
    public static void main(String[] args) {
        List<Mail> correos = input();
        Histogram<String> histograma = process(correos);
        output(histograma);
    }
    
    private static List<Mail> input(){
        String fileName;
        fileName = "email.txt";
        List<Mail> listaCorreos = MailListReader.read(fileName);
        return listaCorreos;
    }
    
    private static Histogram<String> process(List<Mail> listaCorreos){
        Histogram<String> histogram = MailHistogramBuilder.build(listaCorreos);
        return histogram;
    }
    
    private static void output(Histogram<String> histogram){
        HistogramDisplay histogramaDisplay = new HistogramDisplay("Correos", histogram);
        histogramaDisplay.execute();
    }
    
}