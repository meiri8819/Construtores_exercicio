 public class Porta {

private boolean aberta;
private String cor;
private double dimensaoX;
private double dimensaoY;
private double dimensaoZ;

    //Construtor

    public Porta(boolean aberta, String c, double dimX, double dimY, double dimZ) {
        this.aberta = aberta;
        this.cor = c;
        this.dimensaoX = dimX;
        this.dimensaoY = dimY;
        this.dimensaoZ = dimZ;
    }
    

    public boolean isAberta() {
        return this.aberta;
    }

    public String getCor() {
        return this.cor;
    }

    public double getDimensaoX() {
        return this.dimensaoX;
    }

    public double getDimensaoY() {
        return this.dimensaoY;
    }

    public double getDimensaoZ() {
        return this.dimensaoZ;
    }

    public void setAberta(boolean ab) {
        this.aberta = ab;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void setDimensaoX(double dX) {
        this.dimensaoX = dX;
    }

    public void setDimensaoY(double dY) {
        this.dimensaoY = dY;
    }

    public void setDimensaoZ(double dZ) {
        this.dimensaoZ = dZ;
    }
    

void abre() {
	aberta = true;
}

void fecha() {
	aberta = false;
}

void pinta(String s) {
	this.cor += s;
}

boolean estaAberta() {
	return aberta;

}

}
