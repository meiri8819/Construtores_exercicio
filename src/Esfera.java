public class Esfera {
    private double raio;
    
    //Construtor
    public Esfera(double r) {
        this.raio = r;
    }
    
    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double r) {
        this.raio = r;
    }
    
    
    
    double vol (double vol){
        double volumeesfera=((4.0/3.0) * 3.14 *raio *raio* raio);
        return volumeesfera;
    }
    
    
    
}