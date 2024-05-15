public class Hexagono {
    double DiametroMaior = 10;
    double DiametroMenor = 6;
    double Lado = 5;
    String nome = "Hexagono";
    public double obterArea(){ return ((3 * Math.sqrt(3)) / 2 ) * (Lado * Lado);}
    public double obterPerimetro() { return 6 * Lado ;}
    public void imprimirDetalhes(){
        System.out.println("Nome do objeto = "+nome);
        System.out.println("Area = "+obterArea());
        System.out.println("Perimetro = "+obterPerimetro());
    }
}

