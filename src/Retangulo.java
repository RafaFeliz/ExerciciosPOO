public class Retangulo {
    double altura = 20;
    double largura = 15;
    String nome = "Retangulo";
    public double obterArea(){
        return altura * largura;
    }
    public double obterPerimetro() { return (altura + largura ) * 2 ;}
    public void imprimirDetalhes(){
        System.out.println("Nome do objeto = "+nome);
        System.out.println("Area = "+obterArea());
        System.out.println("Perimetro = "+obterPerimetro());
    }
}
