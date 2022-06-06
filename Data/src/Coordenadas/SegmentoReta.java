package Coordenadas;

public class SegmentoReta {
    private Ponto pntA, pntB;
    private double dimesao;

    public SegmentoReta(Ponto P1, Ponto P2){
        this.pntA = P1;
        this.pntB = P2;
        this.dimesao = this.calculaDimensao();
    }

    public String imprimeSegmentoReta(){
        return "Inicio - " +pntA.imprimePonto()+ "\tFinal - " +pntB.imprimePonto()+"\nDimensao - "+ this.calculaDimensao();
    }

    public double calculaDimensao(){
        double dx = Math.pow(pntA.getX() - pntB.getX(),2);
        double dy = Math.pow(pntA.getY() - pntB.getY(),2);;
        return Math.sqrt(dx + dy);
    }
}
