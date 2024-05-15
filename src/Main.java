public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.imprimirDetalhes();
        System.out.println("---------------");
        Circulo c = new Circulo();
        c.imprimirDetalhes();
        System.out.println("----------------");
        Losango l = new Losango();
        l.imprimirDetalhes();
        System.out.println("----------------");
        Hexagono h = new Hexagono();
        h.imprimirDetalhes();
        System.out.println("-----------------");
        Pentagono p = new Pentagono();
        p.imprimirDetalhes();
    }
}