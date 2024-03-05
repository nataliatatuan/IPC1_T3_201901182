/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea3ipc1;

/**
 *
 * @author Natalia Ixmatul 201901182
 */

public class Tarea3Ipc1 {

    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(4, 9);
        Cuadrado cuadrado = new Cuadrado(5);
        Circulo circulo = new Circulo(8);

        Figura[] figuras = { triangulo, cuadrado, circulo };

        for (Figura figura : figuras) {
            String nombreFigura = figura.getClass().getSimpleName();
            double areaCalculada = figura.calcularArea();
            System.out.println(nombreFigura + ": Área = " + areaCalculada);
        }
    }
}

abstract class Figura {
    int numLados;

    public Figura(int numLados) {
        this.numLados = numLados;
    }

    abstract double calcularArea();
}

class Triangulo extends Figura {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return 0.5 * base * altura;
    }
}

class Cuadrado extends Figura {
    double lado;

    public Cuadrado(double lado) {
        super(4);
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }
}

class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        // El círculo no tiene lados
        super(0); 
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return 3.14159 * radio * radio;
    }
}


