public class Circulo {
    double raio = 15;
    String nome = "Circulo";
    public double obterArea(){ return Math.PI * (raio * raio);}
    public double obterPerimetro() { return 2 * Math.PI * raio ;}
    public void imprimirDetalhes(){
        System.out.println("Nome do objeto = "+nome);
        System.out.println("Area = "+obterArea());
        System.out.println("Perimetro = "+obterPerimetro());
    }
}