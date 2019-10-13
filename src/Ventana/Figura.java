package Ventana;

//Relación de herencia
public abstract class Figura {  //clase abstracta figura, que hereda a rectángulo, cuadrado, circunferencia y cuadrado

    //algunos atributos y métodos protegidos utilizados por las subclases
    protected float perimetro, superficie, base, altura, diagonal, diametro, x, y;

    public abstract float CalcularSuperficie(float base, float altura) throws ExcepcionPropia;

}
//Subclases, que heredean de Figura

class Rectangulo extends Figura {

    protected float volumen;    //Se implementan sus propios atributos y métodos

    public Rectangulo() {
    }

    public float CalcularPeri(float base, float altura) throws ExcepcionPropia {

        if (base == 0 && altura == 0) {
            throw new ExcepcionPropia();
        } else //Todos los métodos son definidos mediante fórmulas matemáticas
        {
            perimetro = (base + altura) * 2;

            return perimetro;
        }
    }

    @Override   //throws Excepcion se lo coloca en la cabecera del método para saber que en el mismo puede arrojar una excep.
    public float CalcularSuperficie(float base, float altura) throws ExcepcionPropia {

        if (base == 0 && altura == 0) {
            throw new ExcepcionPropia();    //se dirige al try catch y ejecuta la excepcion
        } else {
            superficie = base * altura;

            return superficie;
        }
    }

    public float CalcularVolumen(float base, float altura, float profundidad) throws ExcepcionPropia {

        if (base == 0 & altura == 0 & profundidad == 0) {
            throw new ExcepcionPropia();
        } else {
            volumen = (base * altura * profundidad);

            return volumen;
        }
    }

    public float CalcularDiagonal(float base, float altura) throws ExcepcionPropia {

        if (base == 0 & altura == 0) {
            throw new ExcepcionPropia();
        } else {
            diagonal = (float) (Math.pow(base, 2) + Math.pow(altura, 2));

            diagonal = (float) Math.sqrt(diagonal);

            return diagonal;
        }
    }

}

class Triangulo extends Figura {

    protected float angulo;

    public Triangulo() {
    }

    public float CalcularAngulo(String ang, float lado1, float lado2, float lado3) throws ExcepcionPropia {

        if (lado1 == 0 & lado2 == 0 & lado3 == 0) {
            throw new ExcepcionPropia();
        } else {
            if (ang == "AnguloA") { //Según el ángulo seleccionado, realiza el cálculo adecuado
                angulo = (((lado2 * lado2) + (lado3 * lado3) - (lado1 * lado1)) / (2 * lado2 * lado3));
            } else if (ang == "AnguloB") {
                angulo = ((lado1 * lado1) + (lado3 * lado3) - (lado2 * lado2)) / (2 * lado1 * lado3);   //Teorema del coseno
            } else if (ang == "AnguloC") {
                angulo = ((lado1 * lado1) + (lado2 * lado2) - (lado3 * lado3)) / (2 * lado1 * lado2);
            }

            angulo = (float) Math.toDegrees(Math.acos(angulo));   //se pasa de arco coseno a grados

            return angulo;
        }
    }

    public float CalcularPeri(float lado1, float lado2, float lado3) throws ExcepcionPropia {

        if (lado1 == 0 && lado2 == 0 & lado3 == 0) {
            throw new ExcepcionPropia();
        } else {
            perimetro = lado1 + lado2 + lado3;

            return perimetro;
        }
    }

    @Override
    public float CalcularSuperficie(float base, float altura) throws ExcepcionPropia {

        if (base == 0 && altura == 0) {
            throw new ExcepcionPropia();
        } else {
            superficie = (base * altura) * 1 / 2;
        }
        return superficie;
    }

}

class Cuadrado extends Figura {

    public Cuadrado() {
    }

    @Override
    public float CalcularSuperficie(float base, float altura) {
        return 0;
    }

    public float CalcularPeri(float lado) throws ExcepcionPropia {

        if (lado == 0) {
            throw new ExcepcionPropia();
        } else {
            perimetro = lado * 4;

            return perimetro;
        }
    }

    public float CalcularSuperficie(float lado) throws ExcepcionPropia {

        if (lado == 0) {
            throw new ExcepcionPropia();
        } else {
            superficie = lado * lado;

            return superficie;
        }
    }

    public float CalcularDiagonal(float base) throws ExcepcionPropia {

        if (base == 0) {
            throw new ExcepcionPropia();
        } else {
            diagonal = (float) (Math.sqrt(2) * base);

            return diagonal;
        }
    }

    public void CalcularCentro(float base) throws ExcepcionPropia {

        if (base == 0) {
            throw new ExcepcionPropia();
        }
        x = base / 2;
        y = base / 2;
    }

}

class Circunferencia extends Figura {

    protected float radio, centro;

    public Circunferencia() {
    }

    @Override
    public float CalcularSuperficie(float base, float altura) {
        return 0;
    }

    public float CalcularRadio(float perimetro) throws ExcepcionPropia {

        if (perimetro == 0) {
            throw new ExcepcionPropia();
        } else {
            radio = (float) (perimetro / (2 * Math.PI));

            return radio;
        }
    }

    public float CalcularPeri(float radio) throws ExcepcionPropia {    //distancia alrededor del circulo

        if (radio == 0) {
            throw new ExcepcionPropia();
        } else {
            perimetro = (float) (2 * Math.PI * (radio));

            return perimetro;
        }
    }

    public float CalcularSuperficie(float radio) throws ExcepcionPropia {

        if (radio == 0) {
            throw new ExcepcionPropia();
        } else {
            superficie = (float) ((Math.pow(radio, 2)) * Math.PI);

            return superficie;
        }
    }

    public float CalcularDiametro(float radio) throws ExcepcionPropia {

        if (radio == 0) {
            throw new ExcepcionPropia();
        } else {
            diametro = radio * 2;

            return diametro;
        }
    }

    public void CalcularCentro(float d, float e) throws ExcepcionPropia {

        if (d == 0 && e == 0) {
            throw new ExcepcionPropia();
        } else {
            x = -(d / 2);
            y = -(e / 2);
        }

    }

}
