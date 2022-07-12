import javax.swing.JOptionPane;

public class test
{
    //Método principal
    public static void main(String[] args)
    {
        //Entrada de datos
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la base del rectángulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura del rectángulo: "));
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio del círculo: "));

        //Creación de un objeto Rectángulo
        Rectangulo miRectangulo = new Rectangulo(base, altura);
        miRectangulo.calcularAreaPerimetro(base, altura);
        JOptionPane.showMessageDialog(null, miRectangulo);

        //Creación de un objeto Circulo
        Circulo miCirculo = new Circulo(radio);
        miCirculo.calcularAreaPerimetro(radio);
        JOptionPane.showMessageDialog(null, miCirculo);
    }
    
}