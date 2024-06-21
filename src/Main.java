import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*    //Obtiene la entrada del usuario de los dialogos de entrada de JOptionPane
    String primerNumero = JOptionPane.showInputDialog("Ingrese el primer numero entero");
    String segundoNumero = JOptionPane.showInputDialog("Ingrese el segundo numero entero");
    //Convierte las entradas String en valores int para usuario en un calculo
    double numero1 = Double.parseDouble(primerNumero);
    double numero2 = Double.parseDouble(segundoNumero);
    double suma = numero1 + numero2; //suma números
    //muestra los resultados en un dialogo de mensajes de JOptionPane
        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "SUMA", JOptionPane.PLAIN_MESSAGE);
        double resta = numero1 - numero2;
        JOptionPane.showMessageDialog(null, "La resta es: " + resta, "RESTA", JOptionPane.PLAIN_MESSAGE);
        double multiplicacion = numero1 * numero2;
        JOptionPane.showMessageDialog(null, "La multiplicacion es: " + multiplicacion, "MULTIPLICACION", JOptionPane.PLAIN_MESSAGE);
        double division = numero1 / numero2;
        JOptionPane.showMessageDialog(null, "La division es: " + division, "MULTIPLICACION", JOptionPane.PLAIN_MESSAGE);
    */
        JFrame menu = new JFrame("mi primera aplicacion");
        menu.setContentPane(new Form1().Menu);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//mata todos los procesos, se muestra como un boton x
        menu.pack();
        menu.setVisible(true);
    }
}