package Ventana;

import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class DatosUsuario {

    private String nombre;
    private int puntaje = 0, aciertos = 0, i = 0;   //Atributos que corresponden al usuario

    public DatosUsuario(String nombre) {    //Constructor donde recibe el nombre del jugador
        this.nombre = nombre;
    }

    public DatosUsuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {   //Se hacen set y get de algunos atributos, para poder manipuarlos en otra clase
        return puntaje;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    //Método estático porque no se necesita instanciar un objeto, ya que no se va a guardar nada en dicho objeto   
    public static void MostrarHistorial(LinkedList historial, int i, DefaultTableModel tabla, JScrollPane panel) {
        String figura = "", tipo = "";  //Atributos locales utilizados solo en dicho método
        float resultado = 0;
        boolean flag;

        if (historial.isEmpty()) {  //Si la cola está vacía
            JOptionPane.showMessageDialog(null, "No hay datos para mostrar.", " Aviso ", JOptionPane.WARNING_MESSAGE);

        } else if (historial.size() > 0) {

            if (i == historial.size()) {    //Condicion necesaria para detener la recursión

                if (!panel.isVisible()) {   //Si se oculta el panel, se pregunta si desea borrar el historial
                    BorrarHistorial(historial, tabla, panel);
                }

            } else {
                flag = false;

                if (historial.get(i) instanceof Rectangulo) {   //Si el objeto es una instancia Rectángulo, entonces
                    figura = "El usuario seleccionó el Rectángulo";
                    //Si el resultado es diferente de cero, entonces quiere decir que se ha calculado (posible error)
                    if (((Rectangulo) historial.get(i)).diagonal != 0) {
                        tipo = "El usuario calculó la Diagonal";
                        resultado = ((Rectangulo) historial.get(i)).diagonal;
                    } else if (((Rectangulo) historial.get(i)).diametro != 0) {
                        tipo = "El usuario calculó el Diámetro";
                        resultado = ((Rectangulo) historial.get(i)).diametro;
                    } else if (((Rectangulo) historial.get(i)).perimetro != 0) {
                        tipo = "El usuario calculó el Perimetro";
                        resultado = ((Rectangulo) historial.get(i)).perimetro;
                    } else if (((Rectangulo) historial.get(i)).superficie != 0) {
                        tipo = "El usuario calculó la Superficie";
                        resultado = ((Rectangulo) historial.get(i)).superficie;

                    } else if (((Rectangulo) historial.get(i)).volumen != 0) {
                        tipo = "El usuario calculó el Volumen";
                        resultado = ((Rectangulo) historial.get(i)).volumen;
                    }

                    //Se agregan filas a la tabla con la figura, el tipo seleccionado y el resultado obtenido
                    tabla.addRow(new Object[]{figura});
                    tabla.addRow(new Object[]{tipo});
                    tabla.addRow(new Object[]{"El resultado fue " + resultado});
                    tabla.addRow(new Object[]{" "});    //Espacio entre filas

                } else if (historial.get(i) instanceof Triangulo) {

                    figura = "El usuario seleccionó el Triángulo";

                    if (((Triangulo) historial.get(i)).superficie != 0) {
                        tipo = "El usuario calculó la Superficie";
                        resultado = ((Triangulo) historial.get(i)).superficie;
                    } else if (((Triangulo) historial.get(i)).perimetro != 0) {
                        tipo = "El usuario calculó el Perímetro";
                        resultado = ((Triangulo) historial.get(i)).perimetro;
                    } else if (((Triangulo) historial.get(i)).angulo != 0) {
                        tipo = "El usuario calculó el Ángulo";
                        resultado = ((Triangulo) historial.get(i)).angulo;
                    }

                    tabla.addRow(new Object[]{figura});
                    tabla.addRow(new Object[]{tipo});
                    tabla.addRow(new Object[]{"El resultado fue " + resultado});
                    tabla.addRow(new Object[]{" "});

                } else if (historial.get(i) instanceof Cuadrado) {
                    figura = "El usuario seleccionó el Cuadrado";

                    if (((Cuadrado) historial.get(i)).superficie != 0) {
                        tipo = "El usuario calculó la Superficie";
                        resultado = ((Cuadrado) historial.get(i)).superficie;
                    } else if (((Cuadrado) historial.get(i)).perimetro != 0) {
                        tipo = "El usuario calculó el Perímetro";
                        resultado = ((Cuadrado) historial.get(i)).perimetro;
                    } else if (((Cuadrado) historial.get(i)).diagonal != 0) {
                        tipo = "El usuario calculó la Diagonal";
                        resultado = ((Cuadrado) historial.get(i)).diagonal;
                    } else if (((Cuadrado) historial.get(i)).x != 0) {
                        flag = true;
                        tipo = "El usuario calculó el Centro";  //El centro se muestra de forma diferente, con dos valores
                    }

                    tabla.addRow(new Object[]{figura});
                    tabla.addRow(new Object[]{tipo}); //Se muestra figura y tipo, pero el resultado se muestra de forma diferente

                    if (flag != true) {
                        tabla.addRow(new Object[]{"El resultado fue " + resultado});
                    } else {    //Si se ha calculado el centro entonces se muestra de esta forma
                        tabla.addRow(new Object[]{"El resultado fue (" + (((Cuadrado) historial.get(i)).x) + ", " + (((Cuadrado) historial.get(i)).y) + ")"});
                    }
                    tabla.addRow(new Object[]{" "});

                } else if (historial.get(i) instanceof Circunferencia) {
                    figura = "El usuario seleccionó la Circunferencia";

                    if (((Circunferencia) historial.get(i)).superficie != 0) {
                        tipo = "El usuario calculó la Superficie";
                        resultado = ((Circunferencia) historial.get(i)).superficie;
                    } else if (((Circunferencia) historial.get(i)).perimetro != 0) {
                        tipo = "El usuario calculó el Perímetro";
                        resultado = ((Circunferencia) historial.get(i)).perimetro;
                    } else if (((Circunferencia) historial.get(i)).diametro != 0) {
                        tipo = "El usuario calculó el Diámetro";
                        resultado = ((Circunferencia) historial.get(i)).diametro;
                    } else if (((Circunferencia) historial.get(i)).radio != 0) {
                        tipo = "El usuario calculó el Radio";
                        resultado = ((Circunferencia) historial.get(i)).radio;
                    } else if (((Circunferencia) historial.get(i)).x != 0) {
                        flag = true;
                        tipo = "El usuario calculó el Centro";
                    }

                    tabla.addRow(new Object[]{figura});
                    tabla.addRow(new Object[]{tipo});

                    if (flag != true) {
                        tabla.addRow(new Object[]{"El resultado fue " + resultado});
                    } else {
                        tabla.addRow(new Object[]{"El resultado fue (" + (((Circunferencia) historial.get(i)).x) + ", " + (((Circunferencia) historial.get(i)).y) + ")"});
                    }
                    tabla.addRow(new Object[]{" "});
                }
                i++;    //Se reccore la cola incrementando el ínidice y mediante recursividad

                MostrarHistorial(historial, i, tabla, panel);
            }
        }

    }

    //Método estático porque no se necesita instanciar un objeto, ya que no se va a guardar nada en dicho objeto   
    public static void BorrarHistorial(LinkedList historial, DefaultTableModel tabla, JScrollPane panel) {

        int confirmar;

        confirmar = JOptionPane.showConfirmDialog(null, "¿Desea borrar el historial?", " ", 0);

        if (confirmar == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "    Historial borrado.", " Mensaje", JOptionPane.INFORMATION_MESSAGE);
            Interfaz i = new Interfaz();    //Se instancia un objeto de la clase Interfaz, para utilizar un método
            i.RemoverFilas();   //Si se decide borrar el historial, se borran las filas y la cola 
            historial.clear();
        }

    }

    public void MostrarPuntaje(Stack p, int mayor, String nombrem) {

        if (p.isEmpty()) {  //Si la pila está vacia
            JOptionPane.showMessageDialog(null, " Todavia no se ha jugado.", " Puntajes", JOptionPane.WARNING_MESSAGE);

        } else {    //Se muestra el puntaje mayor, junto con el nombre y el último puntaje
            JOptionPane.showMessageDialog(null, "Puntaje mas alto: " + mayor + " de " + nombrem + "\nUltimo puntaje: " + ((DatosUsuario) p.peek()).puntaje + " de " + ((DatosUsuario) p.peek()).nombre, " Puntajes", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
