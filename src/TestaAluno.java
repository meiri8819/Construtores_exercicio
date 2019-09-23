public class TestaAluno {
    
    public static void main(String[] args){
        
        Aluno aluno1= new Aluno("Meiri","569.789.256-23","13/07/1991");
        

        
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Cpf: "+ aluno1.getCpf());
        System.out.println("Data de Nascimento: "+ aluno1.getDataDeNascimento());

    }
    
     
}
 