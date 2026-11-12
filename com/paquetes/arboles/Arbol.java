package com.paquetes.arboles;
import java.util.Scanner;

public class Arbol 
{
    public NodoArbol raiz;
    public static Scanner input = new Scanner(System.in);

    public Arbol() {
        raiz = null;
    }

    public void cargarNodo(NodoArbol nodo) {
        NodoArbol p;
        String opt;
        System.out.print("Ingrese un dato para el nodo: ");
        nodo.info = input.nextInt();
        input.nextLine();
        System.out.print("¿Desea crear nodos por la rama izquiera de "+ nodo.info +"? [S/?]");
        opt = input.next();
        if (opt.toLowerCase().equals("s")) {
            p = new NodoArbol();
            nodo.izquierda = p;
            cargarNodo(nodo.izquierda);
        } else {
            nodo.izquierda = null;
        }

        System.out.print("¿Desea crear nodos por la rama derecha de "+ nodo.info +"? [S/?]");
        opt = input.next();
        if (opt.toLowerCase().equals("s")) {
            p = new NodoArbol();
            nodo.derecha = p;
            cargarNodo(nodo.derecha);
        } else {
            nodo.derecha = null;
        }

    }

    public void preorden(NodoArbol nodo) {
        if (nodo != null) {
            System.out.println("Nodo: " + nodo.info);
            preorden(nodo.izquierda);
            preorden(nodo.derecha);
        } 
    }

    public void inorden(NodoArbol nodo) {
        if (nodo != null) {
            inorden(nodo.izquierda);
            System.out.println("Nodo: " + nodo.info);
            inorden(nodo.derecha);
        } 
    }

    public void postorden(NodoArbol nodo) {
        if (nodo != null) {
            postorden(nodo.izquierda);
            postorden(nodo.derecha);
            System.out.println("Nodo: " + nodo.info);
        } 
    }

    public int contarNodos(NodoArbol nodo) {
        if (nodo != null) {
            return 1 + contarNodos(nodo.izquierda) + contarNodos(nodo.derecha);
        } else {
            return 0;
        }
    }

    public int sumarNodos(NodoArbol nodo) {
        if (nodo != null) {
            return nodo.info + sumarNodos(nodo.izquierda) + sumarNodos(nodo.derecha);
        } else {
            return 0;
        }
    }

    public double promedioArbol() {
        return (double) sumarNodos(raiz) / contarNodos(raiz);
    }

    public int contarHojas(NodoArbol nodo) {
        if (nodo != null) {
            int cantidadHojas = 0;
            if (nodo.izquierda == null && nodo.derecha == null) {
                cantidadHojas++;
            }
            return cantidadHojas + contarHojas(nodo.izquierda) + contarHojas(nodo.derecha);
        } else {
            return 0;
        }
    }
}
