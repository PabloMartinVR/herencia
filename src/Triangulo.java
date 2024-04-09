public class Triangulo extends Poligono { // que yo cojo lo de la clase padre y es mio
    public Triangulo(float longitud){
        super(longitud);
        this.numLados = 3;
    }

    public Triangulo(float longitud, boolean relleno){
        // Llamo al constructor de la clase padre con un parámetro que es longitud
        super(longitud);
        // Inicializo lo especifico o lo que no ha hecho
        // el constructor de la clase padre
        this.estaRelleno = relleno;
        this.numLados = 3;
    }

    public Triangulo(float longitud, int color){
        // Llamo al constructor padre que
        super(longitud, color);
        // ETC
    }

    public float calculaSuperficie(){
        float lado1 = longitud;
        float mitad = longitud/2;
        float lado2 = mitad;

        float valor1    = (float) Math.pow(lado1,2);
        float valor2    = (float) Math.pow(lado2, 2);
        float resta     = valor1-valor2;
        float resultado = (float) Math.sqrt(resta);
        return resultado;
    }

}
