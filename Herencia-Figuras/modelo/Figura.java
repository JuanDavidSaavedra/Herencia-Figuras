package modelo;

public class Figura
{
    //Atributos
    protected double perimetro;
    protected double area;

    //Métodos
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public String toString()
    {
        return "El perimetro es: " + perimetro + " y el área es: " + area;
    }
}