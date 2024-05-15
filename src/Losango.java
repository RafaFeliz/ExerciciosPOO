public class Losango {
    double DiametroMaior = 10;
    double DiametroMenor = 6;
    double Lado = 5;
    String nome = "Losango";
    public double obterArea(){ return (DiametroMaior * DiametroMenor) / 2;}
    public double obterPerimetro() { return 4 * Lado ;}
    public void imprimirDetalhes(){
        System.out.println("Nome do objeto = "+nome);
        System.out.println("Area = "+obterArea());
        System.out.println("Perimetro = "+obterPerimetro());
    }
}
