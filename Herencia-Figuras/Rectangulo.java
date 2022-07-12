import modelo.Figura;

public class Rectangulo extends Figura
{

    //Atributos
    private double base;
    private double altura;

    //Constructor
    public Rectangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }
    
    //Metodos
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularAreaPerimetro(double base, double altura)
    {
        perimetro = 2*(base+altura);
        area = base*altura;
    }

    public String toString()
    {
        return "El perimetro del rectángulo es: " + perimetro + " y el área es: " + area;
    }
}
