public class AppFiguras {
    public static void main(String[] args) {
        Poligono poli = new Poligono(10);
        System.out.println(poli.calcularPerimetro()+"cm");
        Poligono poli2 = new Poligono(10, Poligono.COLOR_NEGRO);
        System.out.println(poli2.calcularPerimetro()+"cm");
        Cuadrado cubik = new Cuadrado(30);
        System.out.println(cubik.calcularPerimetro()+"cm");


        Triangulo inmovible = new Triangulo(12);
        System.out.printf("El area del triangulo es %.2f cm2%n",inmovible.calculaSuperficie());
    }
}