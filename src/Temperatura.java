
public class Temperatura {
    double converterParaCelsius (double g)
    {
        double c = (g-32)/ 1.8;
        return c;  
    }
    double converterParaFahrenheit (double g)
    {
        double f = (g * 1.8) +32;
        return f;
    }
    
}   