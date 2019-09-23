public class TestaProduto {
    public static void main (String[] args){
        
        Produto produto1 = new Produto("Feijão",3.99);
        
        System.out.println("Produto vendido: " +produto1.getNome());
        
        double valorCalculado = produto1.diminuir10(produto1.getPreco());
        
        System.out.println("Valor com desconto: "+valorCalculado);
        
        
        double valorCalculado1=produto1.aumenta25(produto1.getPreco());
        
        System.out.println("Valor com acréscimo: "+valorCalculado1);
        
    }
    
}