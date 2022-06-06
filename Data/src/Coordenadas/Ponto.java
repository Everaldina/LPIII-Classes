package Coordenadas;

public class Ponto {
    private double x;
    private double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ponto(){
        this.x = 0;
        this.y = 0;
    }

    public String imprimePonto(){
        return  "(" + this.x + ", " + this.y + ")";
    }

    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
}
