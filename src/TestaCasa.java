public class TestaCasa {
    public static void main (String args[]){
         
        Casa casa1= new Casa("Salmão",false,true,false,3);
        
        
        casa1.pinta("Salmão");
        System.out.println("A quantidade de portas abertas é: " + casa1.quantasPortasEstaoAbertas());        
    }
    
}
