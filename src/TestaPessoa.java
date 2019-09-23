public class TestaPessoa {
    public static void main(String[] args)
    {     
     Pessoa  pessoa1 = new Pessoa("Meiriane", 28);
       
       
        System.out.println("Idade antes: " +pessoa1.getIdade());
        
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
       
        
        System.out.println("Idade agora: " +pessoa1.getIdade());
        
    }
}
