public class MainTemperatura {
    public static void main (String[] args)
    {
        Temperatura celsius= new Temperatura ();
        Temperatura fahrenheit= new Temperatura();
        
        double val= 77.2;
        double result;
        result= celsius.converterParaCelsius(val);
        
        System.out.println("A temperatura em graus Celsius é:"+result);
        
        double val1= 14.9;
        double result1;
        result1= fahrenheit.converterParaFahrenheit(val);
        
        System.out.println("A temperatura em graus Fahrenheit é:"+result1);
    }
    
}