public class Casa {
 
    private String cor;
    private Boolean porta1, porta2, porta3;
    private int total;
    // Construtor
    public Casa(String c, Boolean port1, Boolean port2, Boolean port3, int total) {
        this.cor = c;
        this.porta1 = port1;
        this.porta2 = port2;
        this.porta3 = port3;
        this.total = total;
    }
    
    public String getCor() {
        return this.cor;
    }

    public Boolean getPorta1() {
        return this.porta1;
    }

    public Boolean getPorta2() {
        return this.porta2;
    }

    public Boolean getPorta3() {
        return this.porta3;
    }

    public int getTotal() {
        return this.total;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void setPorta1(Boolean p1) {
        this.porta1 = p1;
    }

    public void setPorta2(Boolean p2) {
        this.porta2 = p2;
    }

    public void setPorta3(Boolean p3) {
        this.porta3 = p3;
    }

    public void setTotal(int t) {
        this.total = t;
    }
    
    void pinta(String s) {        
        cor = s;
        System.out.println("A cor da Casa: "+ cor);
    }
    
    int quantasPortasEstaoAbertas() {
       if (porta1 == true) {
           int p1 = 1;
           total = p1;
       }
       if (porta2 == true) {
           int p2 = 1;
           total = total + p2;
       }
       if (porta3 == true) {
           int p3 = 1;
           total = total + p3;
       }       
       return total;       
    }
}
  