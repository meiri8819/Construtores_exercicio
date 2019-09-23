public class TestaEsfera {
    public static void main (String[] args){
        Esfera esf1 = new Esfera (0.83);
   
        
        double calculoVolume= esf1.vol(esf1.getRaio());
        
        System.out.println ("Volume:"+calculoVolume);
    }
    
}
