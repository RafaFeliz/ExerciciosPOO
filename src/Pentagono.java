public class Pentagono {
    double DiametroMaior = 10;
    double DiametroMenor = 6;
    double Lado = 5;
    String nome = "Pentagono";
    public double obterArea(){ return (1.0 / 4.0) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Lado * Lado;}
    public double obterPerimetro() { return 5 * Lado ;}
    public void imprimirDetalhes(){
        System.out.println("Nome do objeto = "+nome);
        System.out.println("Area = "+obterArea());
        System.out.println("Perimetro = "+obterPerimetro());
    }
}
