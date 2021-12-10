package kata4.main;

import java.util.List;
import kata4.model.*;
import kata4.view.*;
import kata4.view.MailHistogramBuilder;

public class Kata4 {
    public static void main(String[] args) {
        String fileName;
        fileName = "email.txt";
        List<Mail> listaCorreos = MailListReader.read(fileName);
     
        Histogram<String> histogram = MailHistogramBuilder.build(listaCorreos);
        
        HistogramDisplay histogramaDisplay = new HistogramDisplay("Correos", histogram);
        histogramaDisplay.execute();
    }
    
}