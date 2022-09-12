package com.Java.Funciones2;

public class ejercicioTema2 {


    public static void main(String[] args) {


        double precio = 250;
        double iva = (precio / 100) * 21;
        double resultado = precio + iva;

        System.out.println("El precio del producto con el iva es: " + resultado + " euros");
    }

    static double getPrice(double precio, double iva, double resultado) {
        return resultado;

    }
}
