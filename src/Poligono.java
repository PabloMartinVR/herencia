
public class Poligono{
    public final static int COLOR_NEGRO  = 0;
    public final static int COLOR_VERDE  = 1;
    public final static int COLOR_ROJO   = 2;
    protected int     color;
    protected int     numLados;
    protected boolean estaRelleno;
    protected float   longitud;
    protected boolean estaRotado;
    protected float   grados;



    public Poligono(float longitud){
        this(longitud, COLOR_NEGRO);
    }

    public Poligono(float longitud, int color){
        this.numLados    = 3;
        this.longitud    = longitud;
        this.color       = color;
        this.estaRelleno = false;
        this.estaRotado  = false;
        this.grados      = 0;

    }

    public Poligono() {
    }

    // No puede sobreescribirse el método
    public final float calcularPerimetro(){
        return numLados*longitud;
    }


}