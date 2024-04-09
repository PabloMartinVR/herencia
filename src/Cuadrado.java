
public class Cuadrado extends Poligono{

    public Cuadrado(float longitud){
        super(longitud);
        this.numLados = 4;
    }

    public Cuadrado(float longitud, boolean relleno){
        // Llamo al constructor de la clase padre con un parámetro que es longitud
        super(longitud);
        // Inicializo lo especifico o lo que no ha hecho
        // el constructor de la clase padre
        this.estaRelleno = relleno;
        this.numLados = 4;
    }

    public Cuadrado(float longitud, int color){
        // Llamo al constructor padre que
        super(longitud, color);
        // ETC
    }



    public float calculaSuperficie(){
        return (float) Math.pow(longitud, 2);
    }


}