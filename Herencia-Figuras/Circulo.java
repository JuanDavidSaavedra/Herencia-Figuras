import modelo.Figura;

public class Circulo extends Figura
{

    //Atributos
    private double radio;

    //Constructor
    public Circulo(double radio)
    {
        this.radio = radio;
    }
    
    //Metodos
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularAreaPerimetro(double radio)
    {
        perimetro = 2*Math.PI*radio;
        area = Math.PI*Math.pow(radio, 2);
    }

    public String toString()
    {
        return "El perimetro del círculo es: " + perimetro + " y el área es: " + area;
    }
}
