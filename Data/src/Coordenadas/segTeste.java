package Coordenadas;

public class segTeste {
    public static void main(String[] args) {
        Ponto pA = new Ponto (1,2);
        Ponto pB = new Ponto (1,3);
        SegmentoReta seg = new SegmentoReta(pA, pB);
        System.out.println(seg.imprimeSegmentoReta());
    }
}
