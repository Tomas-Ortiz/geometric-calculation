package Ventana;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PosibleError {   //Subclase que deriva de la superclase Exception

    //se declaran atributos estáticos, para contabilizar los errores en esta clase y otras
    public static int error_vacio, error_for;

    public PosibleError() {
    }

    //Método estático porque no se necesita instanciar un objeto, ya que no se va a guardar nada en dicho objeto   
    public static void ControlarExcepcion(JTextField texto, String tipo) { //Recibe como parámetro el texto, y su tipo de dato
        float resultado = 0;    //variable local, solo utilizada en este método
        if (texto.getText().isEmpty()) {    //Si el texto está vacio, entonces se advierte con un color naranja
            texto.setBackground(Color.orange);
            error_vacio++;  //error vacio incrementa en 1
        } else {    //si no está vacio

            switch (tipo) {
                case "Float":

                    try {

                        resultado = Float.parseFloat(texto.getText());  //se intenta convertir el texto
                        texto.setBackground(Color.white);

                    } catch (NumberFormatException e) { //Si no se puede convertir, entonces se captura el error
                        error_for++;    //el error de formato incrementa en 1
                        texto.setBackground(Color.red); //Se advierte el error de formato con un color en rojo
                    } catch (Exception e) { //Otra excepcion, más general
                        texto.setBackground(Color.red);
                        JOptionPane.showMessageDialog(null, "  Se produjo un error desconocido.", " Advertencia", JOptionPane.WARNING_MESSAGE);
                    }

                    break;

            }
        }

    }

}

class ExcepcionPropia extends Exception {

    public ExcepcionPropia() {
        super();    //se invoca el constructor de la clase padre
    }

    public void mostrarMensaje() {  //se muestra el mensaje del error
        JOptionPane.showMessageDialog(null, "Si ingresa todos valores en cero, el resultado siempre es cero.", " Advertencia", JOptionPane.WARNING_MESSAGE);
    }

}
