import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Obtiene la entrada del usuario de los dialogos de entrada de JOptionPane
    String primerNumero = JOptionPane.showInputDialog("Ingrese el primer numero entero");
    String segundoNumero = JOptionPane.showInputDialog("Ingrese el segundo numero entero");
    //Convierte las entradas String en valores int para usuario en un calculo
    int numero = Integer.parseInt(primerNumero);
    int numero2 = Integer.parseInt(segundoNumero);
    int suma = numero + numero2; //suma números
    //muestra los resultados en un dialogo de mensajes de JOptionPane
        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "La suma es", JOptionPane.PLAIN_MESSAGE);

    }
}