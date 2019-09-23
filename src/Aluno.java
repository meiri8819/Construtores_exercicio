public class Aluno {
    private String nome;
    private String cpf;
    private String dataDeNascimento;
    // Construtor
    public Aluno(String n, String c, String dn) {
        this.nome = n;
        this.cpf = c;
        this.dataDeNascimento = dn;
    }

  
    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataDeNascimento(String dnasc) {
        this.dataDeNascimento = dnasc;
    }
}
  