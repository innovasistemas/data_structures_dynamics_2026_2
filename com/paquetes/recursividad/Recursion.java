package com.paquetes.recursividad;

public class Recursion 
{
    public static long factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }

    public static void mostrarNaturalesRecursivo(int n) {
        if (n > 0) {
            System.out.println(n);
            mostrarNaturalesRecursivo(n - 1);
        }
    }
}
